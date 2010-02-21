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

package v201002.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.AdUnit;
import com.google.api.ads.dfp.v201002.AdUnitPage;
import com.google.api.ads.dfp.v201002.DeactivateAdUnits;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.InventoryServiceInterface;
import com.google.api.ads.dfp.v201002.InventoryStatus;
import com.google.api.ads.dfp.v201002.UpdateResult;

/**
 * This example deactivates all active ad units. To determine which ad units
 * exist, run GetAllAdUnitsExample.java or GetInventoryTreeExample.java.
 */
public class DeactivateAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201002.INVENTORY_SERVICE);

      // Create filter text to select active ad units.
      String filterText = "WHERE status = '"+ InventoryStatus.ACTIVE + "'";

      // Sets defaults for page and filter.
      AdUnitPage page = new AdUnitPage();
      Filter filter = new Filter();
      int offset = 0;

      do {
        // Create a filter to page through active ad units.
        filter.setText(filterText + " LIMIT 500 OFFSET " + offset);

        // Get ad units by filter.
        page = inventoryService.getAdUnitsByFilter(filter);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (AdUnit adUnit : page.getResults()) {
            System.out.println(i + ") Ad unit with ID \"" + adUnit.getId()
                + "\", name \"" + adUnit.getName()
                + "\", and status \"" + adUnit.getStatus() + "\" will be deactivated.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);


      System.out.println("Number of ad units to be deactivated: " + page.getTotalResultSetSize());

      // Create action filter.
      filter.setText(filterText);

      // Create action.
      DeactivateAdUnits action = new DeactivateAdUnits();

      // Perform action.
      UpdateResult result = inventoryService.performAdUnitAction(action, filter);

      // Display results.
      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of ad units deactivated: " + result.getNumChanges());
      } else {
        System.out.println("No ad units were deactivated.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
