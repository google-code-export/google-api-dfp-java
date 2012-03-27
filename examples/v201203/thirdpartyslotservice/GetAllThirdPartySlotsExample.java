// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201203.thirdpartyslotservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.Statement;
import com.google.api.ads.dfp.v201203.ThirdPartySlot;
import com.google.api.ads.dfp.v201203.ThirdPartySlotPage;
import com.google.api.ads.dfp.v201203.ThirdPartySlotServiceInterface;

/**
 * This example gets all third party slots. To create third party slots, run
 * CreateThirdPartySlotExample.java.
 *
 * Tags: ThirdPartySlotService.getThirdPartySlotsByStatement
 *
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class GetAllThirdPartySlotsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ThirdPartySlotService.
      ThirdPartySlotServiceInterface thirdPartySlotService =
          user.getService(DfpService.V201203.THIRD_PARTY_SLOT_SERVICE);

      // Sets defaults for page and filterStatement.
      ThirdPartySlotPage page = new ThirdPartySlotPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get third party slots.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get third party slots by statement.
        page = thirdPartySlotService.getThirdPartySlotsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (ThirdPartySlot thirdPartySlot : page.getResults()) {
            System.out.println(i + ") Third party slot with ID \""
                + thirdPartySlot.getId() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
