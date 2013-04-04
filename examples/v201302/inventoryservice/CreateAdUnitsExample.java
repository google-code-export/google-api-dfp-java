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

package v201302.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.AdUnit;
import com.google.api.ads.dfp.v201302.AdUnitSize;
import com.google.api.ads.dfp.v201302.AdUnitTargetWindow;
import com.google.api.ads.dfp.v201302.EnvironmentType;
import com.google.api.ads.dfp.v201302.InventoryServiceInterface;
import com.google.api.ads.dfp.v201302.NetworkServiceInterface;
import com.google.api.ads.dfp.v201302.Size;

/**
 * This example creates new ad units under a the effective root ad unit. To
 * determine which ad units exist, run GetInventoryTreeExample.java or
 * GetAllAdUnitsExample.java.
 *
 * Tags: InventoryService.createAdUnits, NetworkService.getCurrentNetwork
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201302.INVENTORY_SERVICE);

      // Get the NetworkService.
      NetworkServiceInterface networkService =
          user.getService(DfpService.V201302.NETWORK_SERVICE);

      // Set the parent ad unit's ID for all ad units to be created under.
      String effectiveRootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

      // Create an array to store local ad unit objects.
      AdUnit[] adUnits = new AdUnit[5];

      for (int i = 0; i < 5; i++) {
        AdUnit adUnit = new AdUnit();
        adUnit.setName("Ad_Unit_" + i);
        adUnit.setParentId(effectiveRootAdUnitId);
        adUnit.setDescription("Ad unit description.");
        adUnit.setTargetWindow(AdUnitTargetWindow.BLANK);

        // Create ad unit size.
        AdUnitSize adUnitSize = new AdUnitSize();
        adUnitSize.setSize(new Size(300, 250, false));
        adUnitSize.setEnvironmentType(EnvironmentType.BROWSER);

        // Set the size of possible creatives that can match this ad unit.
        adUnit.setAdUnitSizes(new AdUnitSize[] {adUnitSize});

        adUnits[i] = adUnit;
      }

      // Create the ad units on the server.
      adUnits = inventoryService.createAdUnits(adUnits);

      if (adUnits != null) {
        for (AdUnit adUnit : adUnits) {
          System.out.println("An ad unit with ID \"" + adUnit.getId()
              + "\" was created under parent with ID \"" + adUnit.getParentId()
              + "\".");
        }
      } else {
        System.out.println("No ad units created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
