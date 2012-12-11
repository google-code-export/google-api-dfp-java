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

package v201211.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201211.AdUnit;
import com.google.api.ads.dfp.v201211.AdUnitSize;
import com.google.api.ads.dfp.v201211.AdUnitTargetWindow;
import com.google.api.ads.dfp.v201211.EnvironmentType;
import com.google.api.ads.dfp.v201211.InventoryServiceInterface;
import com.google.api.ads.dfp.v201211.MobilePlatform;
import com.google.api.ads.dfp.v201211.NetworkServiceInterface;
import com.google.api.ads.dfp.v201211.Size;
import com.google.api.ads.dfp.v201211.TargetPlatform;

/**
 * This example creates a new mobile ad unit under a the effective root ad unit.
 * Mobile features need to be enabled on your account to use mobile targeting.
 * To determine which ad units exist, run GetInventoryTreeExample.java or
 * GetAllAdUnitsExample.java.
 *
 * Tags: InventoryService.createAdUnits, NetworkService.getCurrentNetwork
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateMobileAdUnitExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201211.INVENTORY_SERVICE);

      // Get the NetworkService.
      NetworkServiceInterface networkService = user.getService(DfpService.V201211.NETWORK_SERVICE);

      // Set the parent ad unit's ID for all ad units to be created under.
      String effectiveRootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

      // Create local ad unit object.
      AdUnit adUnit = new AdUnit();
      adUnit.setName("Mobile_Ad_Unit");
      adUnit.setParentId(effectiveRootAdUnitId);
      adUnit.setDescription("Ad unit description.");
      adUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
      adUnit.setTargetPlatform(TargetPlatform.MOBILE);
      adUnit.setMobilePlatform(MobilePlatform.APPLICATION);

      // Create ad unit size.
      AdUnitSize adUnitSize = new AdUnitSize();
      adUnitSize.setSize(new Size(400, 300, false));
      adUnitSize.setEnvironmentType(EnvironmentType.BROWSER);

      // Set the size of possible creatives that can match this ad unit.
      adUnit.setAdUnitSizes(new AdUnitSize[] {adUnitSize});

      // Create the ad unit on the server.
      adUnit = inventoryService.createAdUnit(adUnit);

      if (adUnit != null) {
        System.out.println("An ad unit with ID \"" + adUnit.getId()
            + "\" was created under parent with ID \"" + adUnit.getParentId()
            + "\".");
      } else {
        System.out.println("No ad units created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
