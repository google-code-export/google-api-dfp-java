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

package v201311.creativewrapperservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.v201311.CreativeWrapper;
import com.google.api.ads.dfp.v201311.CreativeWrapperPage;
import com.google.api.ads.dfp.v201311.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.v201311.CreativeWrapperStatus;
import com.google.api.ads.dfp.v201311.DeactivateCreativeWrappers;
import com.google.api.ads.dfp.v201311.Statement;
import com.google.api.ads.dfp.v201311.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This code example deactivates a creative wrapper belonging to a label.
 *
 * Tags: CreativeWrapperService.getCreativeWrapperByStatement
 * Tags: CreativeWrapperService.performCreativeWrapperAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivateCreativeWrapperExample {

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeWrapperService.
      CreativeWrapperServiceInterface creativeWrapperService =
          user.getService(DfpService.V201311.CREATIVE_WRAPPER_SERVICE);

      Long labelId = Long.parseLong("INSERT_CREATIVE_WRAPPER_LABEL_ID_HERE");
      
      // Create statement text to select the active creative wrappers for the
      // given label.
      String statementText =
          "WHERE status = :status AND labelId = :labelId LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(statementText)
              .putValue("status", CreativeWrapperStatus.ACTIVE.toString())
              .putValue("labelId", labelId)
              .toStatement();

      // Set defaults for page and offset.
      CreativeWrapperPage page = new CreativeWrapperPage();
      int offset = 0;
      int i = 0;
      List<Long> creativeWrapperIds = new ArrayList<Long>();

      do {
        // Create a statement to page through creative wrappers.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get creative wrappers by statement.
        page = creativeWrapperService.getCreativeWrappersByStatement(filterStatement);

        if (page.getResults() != null) {
          for (CreativeWrapper creativeWrapper: page.getResults()) {
            System.out.printf("%d) Creative wrapper with ID \"%s\" applying to label"
                + " \"%s\" will be deactivated.\n", i++, creativeWrapper.getId(),
                creativeWrapper.getLabelId());
            creativeWrapperIds.add(creativeWrapper.getId());
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println(
          "Number of creative wrappers to be deactivated: " + creativeWrapperIds.size());

      if (creativeWrapperIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery(
            "WHERE id IN (" + StringUtils.join(creativeWrapperIds, ",") + ")");

        // Create action.
        DeactivateCreativeWrappers action = new DeactivateCreativeWrappers();

        // Perform action.
        UpdateResult result =
            creativeWrapperService.performCreativeWrapperAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of creative wrappers deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No creative wrappers were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
