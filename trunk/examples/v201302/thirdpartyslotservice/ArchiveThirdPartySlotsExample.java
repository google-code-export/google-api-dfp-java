// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201302.thirdpartyslotservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.v201302.ArchiveThirdPartySlots;
import com.google.api.ads.dfp.v201302.Statement;
import com.google.api.ads.dfp.v201302.ThirdPartySlot;
import com.google.api.ads.dfp.v201302.ThirdPartySlotPage;
import com.google.api.ads.dfp.v201302.ThirdPartySlotServiceInterface;
import com.google.api.ads.dfp.v201302.ThirdPartySlotStatus;
import com.google.api.ads.dfp.v201302.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example archives all active third party slots for a company. To
 * determine which third party slots exist, 
 * run GetAllThirdPartySlotsExample.java.
 * 
 * Tags: ThirdPartSlotService.getThirdPartySlotsByStatement
 * Tags: ThirdPartSlotService.performThirdPartySlotsAction
 * 
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class ArchiveThirdPartySlotsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ThirdPartySlotService.
      ThirdPartySlotServiceInterface thirdpartySlotService =
          user.getService(DfpService.V201302.THIRD_PARTY_SLOT_SERVICE);

      //Set the company that the third party slots to archive belong to.
      Long companyId = Long.parseLong("INSERT_COMPANY_ID_HERE");
      
      // Create a statement to only select active third party slots.
      String statementText = "WHERE status = :status AND " 
          + "companyId = :companyId LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("")
            .putValue("status", ThirdPartySlotStatus.ACTIVE.toString())
            .putValue("companyId", companyId)
            .toStatement();

      // Set defaults for page and offset.
      ThirdPartySlotPage page = new ThirdPartySlotPage();
      int offset = 0;
      int i = 0;
      List<Long> thirdPartySlotIds = new ArrayList<Long>();

      do {
        // Create a statement to page through active third party slots.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get third party slots by statement.
        page = thirdpartySlotService.getThirdPartySlotsByStatement(filterStatement);

        if (page.getResults() != null) {
          for (ThirdPartySlot thirdPartySlot : page.getResults()) {
            System.out.println("Third party slot with ID \"" + thirdPartySlot.getId()
                + "\" will be archived.");
            thirdPartySlotIds.add(thirdPartySlot.getId());
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of third party slots to be archived: " 
          + thirdPartySlotIds.size());

      if (thirdPartySlotIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" 
            + StringUtils.join(thirdPartySlotIds, ",") + ")");

        // Create action.
        ArchiveThirdPartySlots action = new ArchiveThirdPartySlots();

        // Perform action.
        UpdateResult result =
            thirdpartySlotService.performThirdPartySlotAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of third party slots archived: " + result.getNumChanges());
        } else {
          System.out.println("No third party slots were archived.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
