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

package v201111.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201111.AdUnitSize;
import com.google.api.ads.dfp.v201111.InventoryServiceInterface;

/**
 * This example gets all ad unit sizes in the network.
 *
 * Tags: InventoryService.getAdUnitSizes
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAdUnitSizesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201111.INVENTORY_SERVICE);

      // Get all ad unit sizes.
      AdUnitSize[] adUnitSizes = inventoryService.getAdUnitSizes();

      // Display results.
      if (adUnitSizes != null) {
        for (int i = 0; i < adUnitSizes.length; i++) {
          AdUnitSize adUnitSize = adUnitSizes[i];
          System.out.printf("%s) Ad unit size (%sx%s) was found.\n", i,
              adUnitSize.getSize().getWidth(), adUnitSize.getSize().getHeight());
        }
      } else {
        System.out.println("No ad unit sizes found.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
