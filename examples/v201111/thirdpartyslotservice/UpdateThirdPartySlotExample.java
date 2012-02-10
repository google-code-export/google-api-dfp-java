// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201111.thirdpartyslotservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201111.StatementBuilder;
import com.google.api.ads.dfp.v201111.Statement;
import com.google.api.ads.dfp.v201111.ThirdPartySlot;
import com.google.api.ads.dfp.v201111.ThirdPartySlotPage;
import com.google.api.ads.dfp.v201111.ThirdPartySlotServiceInterface;
import com.google.api.ads.dfp.v201111.ThirdPartySlotStatus;

/**
 * This example updates the first third party slot description.
 *
 * Tags: ThirdPartySlotService.getThirdPartySlotsByStatement
 * ThirdPartySlotService.updateThirdPartySlots
 *
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class UpdateThirdPartySlotExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ThirdPartySlotService.
      ThirdPartySlotServiceInterface thirdPartySlotService =
          user.getService(DfpService.V201111.THIRD_PARTY_SLOT_SERVICE);

      // Create a statement to get one active third party slot.
      Statement filterStatement =
          new StatementBuilder("WHERE status = :status LIMIT 1")
              .putValue("status", ThirdPartySlotStatus.ACTIVE.toString()).toStatement();

      // Get third party slot by statement.
      ThirdPartySlotPage page =
          thirdPartySlotService.getThirdPartySlotsByStatement(filterStatement);
      
      if (page.getResults() != null) {
        ThirdPartySlot[] thirdPartySlots = page.getResults();

        // Update each local third party slot by changing its description.
        for (ThirdPartySlot thirdPartySlot : thirdPartySlots) {
          thirdPartySlot.setDescription("Updated description");
          
          // Update the third party slot on the server.
          thirdPartySlot = thirdPartySlotService.updateThirdPartySlot(thirdPartySlot);
          
          // Display results.
          if (thirdPartySlot != null) {
            System.out.println("A third party slot with ID \"" + thirdPartySlot.getId()
              + "\" and description \"" + thirdPartySlot.getDescription() + "\" was updated.");
          } else {
            System.out.println("No third party slot was updated.");
          }
        }
      } else {
        System.out.println("No third party slots found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
