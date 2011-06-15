// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201004.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.AdUnit;
import com.google.api.ads.dfp.v201004.AdUnitPage;
import com.google.api.ads.dfp.v201004.InventoryServiceInterface;
import com.google.api.ads.dfp.v201004.Statement;

/**
 * This example updates an ad unit by enabling AdSense to the first 500. To
 * determine which ad units exist, run GetAllAdUnitsExample.java or
 * GetInventoryTreeExample.java.
 *
 * Tags: InventoryService.getAdUnitsByStatement, InventoryService.updateAdUnits
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201004.INVENTORY_SERVICE);

      // Create a statement to get all ad units.
      Statement filterStatement = new Statement("LIMIT 500", null);

      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(filterStatement);

      if (page.getResults() != null) {
        // Update each local ad unit object by enabling AdSense.
        for (AdUnit adUnit : page.getResults()) {
          adUnit.getInheritedAdSenseSettings().getValue().setAdSenseEnabled(true);
        }

        // Update the ad units on the server.
        AdUnit[] updatedAdUnits = inventoryService.updateAdUnits(page.getResults());

        if (updatedAdUnits != null) {
          for (AdUnit adUnit : updatedAdUnits) {
            System.out.println("Ad unit with ID \"" + adUnit.getId() + "\", name \""
                + adUnit.getName() + "\", and is AdSense enabled \""
                + adUnit.getInheritedAdSenseSettings().getValue().getAdSenseEnabled()
                + "\" was updated.");
          }
        } else {
          System.out.println("No ad units updated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
