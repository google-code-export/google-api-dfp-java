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

/**
 * This example gets all ad units. To create ad units, run
 * CreateAdUnitsExample.java.
 */
public class GetAllAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201004.INVENTORY_SERVICE);

      // Sets defaults for page and filterStatement.
      AdUnitPage page = new AdUnitPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a filter to get all ad units.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get ad units by statement.
        page = inventoryService.getAdUnitsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (AdUnit adUnit : page.getResults()) {
            System.out.println(i + ") Ad unit with ID \"" + adUnit.getId()
                + "\" name \"" + adUnit.getName()
                + "\", and status \"" + adUnit.getStatus() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
