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
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.InventoryServiceInterface;

/**
 * This example gets the root ad unit by using a filter. To create an
 * ad unit, run CreateAdUnitsExample.java.
 */
public class GetAdUnitsByFilterExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201002.INVENTORY_SERVICE);

      // Create a filter to only select the root ad unit.
      Filter filter = new Filter("WHERE parentId IS NULL LIMIT 500");

      // Get ad units by filter.
      AdUnitPage page = inventoryService.getAdUnitsByFilter(filter);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (AdUnit adUnit : page.getResults()) {
          System.out.println(i + ") Ad unit with ID \"" + adUnit.getId()
              + "\", name \"" + adUnit.getName()
              + "\", and status \"" + adUnit.getStatus() + "\" was found.");
          i++;
        }
      }

      // The number of results should always be 1 for this example.
      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
