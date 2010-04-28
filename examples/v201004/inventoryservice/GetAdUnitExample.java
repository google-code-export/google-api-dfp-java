// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201004.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.AdUnit;
import com.google.api.ads.dfp.v201004.InventoryServiceInterface;

/**
 * This example gets an ad unit by its ID. To determine which ad units
 * exist, run GetInventoryTreeExample.java or GetAllAdUnitsExample.java.
 */
public class GetAdUnitExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201004.INVENTORY_SERVICE);

      // Set the ID of the ad unit to get.
      String adUnitId = "INSERT_AD_UNIT_ID_HERE";

      // Get the ad unit.
      AdUnit adUnit = inventoryService.getAdUnit(adUnitId);

      if (adUnit != null) {
        System.out.println("Ad unit with ID \"" + adUnit.getId()
            + "\", name \"" + adUnit.getName()
            + "\", and status \"" + adUnit.getStatus() + "\" was found.");
      } else {
        System.out.println("No ad unit found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
