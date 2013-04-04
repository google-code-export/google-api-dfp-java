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
import com.google.api.ads.dfp.v201302.ThirdPartySlot;
import com.google.api.ads.dfp.v201302.ThirdPartySlotServiceInterface;

/**
 * This example creates a new third party slot. To determine which third party
 * slots exist, run GetAllThirdPartySlotsExample.java.
 * 
 * Tags: ThirdPartySlotService.createThirdPartySlot
 * 
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class CreateThirdPartySlotExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ThirdPartySlotService.
      ThirdPartySlotServiceInterface thirdPartySlotService =
          user.getService(DfpService.V201302.THIRD_PARTY_SLOT_SERVICE);

      // Set the company ID to associate with this third party slot.
      Long companyId = Long.parseLong("INSERT_COMPANY_ID_HERE");

      // Set the external unique ID to associate with this third party slot.
      String externalUniqueId = "INSERT_EXTERNAL_UNIQUE_ID_HERE";

      // Set the external unique name to associate with this third party slot.
      String externalUniqueName = "INSERT_EXTERNAL_UNIQUE_NAME_HERE";

      // Set the creative IDs to associate with this third party slot.
      long[] creativeIds = new long[] {Long.parseLong("INSERT_CREATIVE_ID_HERE")};

      // Create the ThirdPartySlot object.
      ThirdPartySlot thirdPartySlot = new ThirdPartySlot();
      thirdPartySlot.setCompanyId(companyId);
      thirdPartySlot.setDescription("Third party slot description.");
      thirdPartySlot.setExternalUniqueId(externalUniqueId);
      thirdPartySlot.setExternalUniqueName(externalUniqueName);

      // Set the creatives that the third party slots will represent.
      thirdPartySlot.setCreativeIds(creativeIds);

      // Create the third party slot.
      thirdPartySlot = thirdPartySlotService.createThirdPartySlot(thirdPartySlot);

      if (thirdPartySlot != null) {
        System.out.println("A third party slot with ID \"" + thirdPartySlot.getId()
            + "\" and named \"" + thirdPartySlot.getExternalUniqueName() + "\" was created.");
      } else {
        System.out.println("No third party slot created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
