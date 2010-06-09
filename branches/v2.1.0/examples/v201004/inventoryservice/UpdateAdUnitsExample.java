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
import com.google.api.ads.dfp.v201004.AdUnitPage;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.InventoryServiceInterface;
import com.google.api.ads.dfp.v201004.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example updates an ad unit by adding a new size to the first 500. To
 * determine which ad units exist, run GetAllAdUnitsExample.java or
 * GetInventoryTreeExample.java.
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
        AdUnit[] adUnits = page.getResults();

        // Update each local ad unit object by adding a new size.
        for (AdUnit adUnit : adUnits) {
          List<Size> sizes = (adUnit.getSizes() == null)
              ? new ArrayList<Size>()
              : new ArrayList<Size>(Arrays.asList(adUnit.getSizes()));
          sizes.add(new Size(728, 90, false));
          adUnit.setSizes(sizes.toArray(new Size[] {}));
        }

        // Update the ad units on the server.
        adUnits = inventoryService.updateAdUnits(adUnits);

        if (adUnits != null) {
          for (AdUnit adUnit : adUnits) {
            System.out.print("Ad unit with ID \""
                + adUnit.getId() + "\", name \""
                + adUnit.getName() + "\", and sizes {");

            if (adUnit.getSizes() != null) {
              for (int i = 0; i < adUnit.getSizes().length; i++) {
                System.out.print("(" + adUnit.getSizes()[i].getWidth() + "x"
                    + adUnit.getSizes()[i].getHeight() + ")");
                if (i != (adUnit.getSizes().length - 1)) {
                  System.out.print(", ");
                }
              }
            }

            System.out.println("} was updated.");
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
