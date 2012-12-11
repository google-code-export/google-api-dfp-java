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

package v201211.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201211.DateTimeUtils;
import com.google.api.ads.dfp.v201211.CostType;
import com.google.api.ads.dfp.v201211.CreativePlaceholder;
import com.google.api.ads.dfp.v201211.CreativeRotationType;
import com.google.api.ads.dfp.v201211.DeviceManufacturerTargeting;
import com.google.api.ads.dfp.v201211.InventoryTargeting;
import com.google.api.ads.dfp.v201211.LineItem;
import com.google.api.ads.dfp.v201211.LineItemServiceInterface;
import com.google.api.ads.dfp.v201211.LineItemType;
import com.google.api.ads.dfp.v201211.MobileDeviceSubmodelTargeting;
import com.google.api.ads.dfp.v201211.MobileDeviceTargeting;
import com.google.api.ads.dfp.v201211.Money;
import com.google.api.ads.dfp.v201211.Size;
import com.google.api.ads.dfp.v201211.StartDateTimeType;
import com.google.api.ads.dfp.v201211.TargetPlatform;
import com.google.api.ads.dfp.v201211.Targeting;
import com.google.api.ads.dfp.v201211.Technology;
import com.google.api.ads.dfp.v201211.TechnologyTargeting;
import com.google.api.ads.dfp.v201211.UnitType;

/**
 * This example create a new line item to serve to the mobile platform. Mobile
 * features needs to be enabled in your account to use mobile targeting. To
 * determine which line items exist, run GetAllLineItemsExample.java. To
 * determine which orders exist, run GetAllOrdersExample.java. To determine
 * which placements exist, run GetAllPlacementsExample.java.
 *
 * Tags: LineItemService.createLineItem
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateMobileLineItemExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201211.LINEITEM_SERVICE);

      // Set the order that all created line items will belong to and the
      // placement containing ad units with a mobile target platform.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      long[] targetedPlacementIds = new long[] {Long.parseLong("INSERT_MOBILE_PLACEMENT_ID_HERE")};

      // Create inventory targeting.
      InventoryTargeting inventoryTargeting = new InventoryTargeting();
      inventoryTargeting.setTargetedPlacementIds(targetedPlacementIds);

      // Create technology targeting.
      TechnologyTargeting technologyTargeting = new TechnologyTargeting();

      // Create device manufacturer targeting.
      DeviceManufacturerTargeting deviceManufacturerTargeting = new DeviceManufacturerTargeting();
      deviceManufacturerTargeting.setIsTargeted(true);

      // Target the Google device manufacturer (40100).
      Technology deviceManufacturerTechnology = new Technology();
      deviceManufacturerTechnology.setId(40100L);
      deviceManufacturerTargeting
          .setDeviceManufacturers(new Technology[] {deviceManufacturerTechnology});
      technologyTargeting.setDeviceManufacturerTargeting(deviceManufacturerTargeting);

      // Create mobile device targeting.
      MobileDeviceTargeting mobileDeviceTargeting = new MobileDeviceTargeting();

      // Exclude the Nexus One device (604046).
      Technology mobileDeviceTechnology = new Technology();
      mobileDeviceTechnology.setId(604046L);
      mobileDeviceTargeting.setExcludedMobileDevices(new Technology[] {mobileDeviceTechnology});
      technologyTargeting.setMobileDeviceTargeting(mobileDeviceTargeting);

      // Create mobile device submodel targeting.
      MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting =
          new MobileDeviceSubmodelTargeting();

      // Target the iPhone 4 device submodel (640003).
      Technology mobileDeviceSubmodelTechnology = new Technology();
      mobileDeviceSubmodelTechnology.setId(640003L);
      mobileDeviceSubmodelTargeting
          .setTargetedMobileDeviceSubmodels(new Technology[] {mobileDeviceSubmodelTechnology});
      technologyTargeting.setMobileDeviceSubmodelTargeting(mobileDeviceSubmodelTargeting);

      // Create targeting.
      Targeting targeting = new Targeting();
      targeting.setInventoryTargeting(inventoryTargeting);
      targeting.setTechnologyTargeting(technologyTargeting);

      // Create local line item object.
      LineItem lineItem = new LineItem();
      lineItem.setName("Mobile line item");
      lineItem.setOrderId(orderId);
      lineItem.setTargeting(targeting);
      lineItem.setLineItemType(LineItemType.STANDARD);
      lineItem.setAllowOverbook(true);

      // Set the target platform to mobile.
      lineItem.setTargetPlatform(TargetPlatform.MOBILE);

      // Set the creative rotation type to even.
      lineItem.setCreativeRotationType(CreativeRotationType.EVEN);

      // Create the creative placeholder.
      CreativePlaceholder creativePlaceholder = new CreativePlaceholder();
      creativePlaceholder.setSize(new Size(300, 250, false));

      // Set the size of creatives that can be associated with this line item.
      lineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativePlaceholder});

      // Set the length of the line item to run.
      lineItem.setStartDateTimeType(StartDateTimeType.IMMEDIATELY);
      lineItem.setEndDateTime(DateTimeUtils.fromString("2012-09-01T00:00:00"));

      // Set the cost per unit to $2.
      lineItem.setCostType(CostType.CPM);
      lineItem.setCostPerUnit(new Money("USD", 2000000L));

      // Set the number of units bought to 500,000 so that the budget is
      // $1,000.
      lineItem.setUnitsBought(500000L);
      lineItem.setUnitType(UnitType.IMPRESSIONS);

      // Create the line item on the server.
      lineItem = lineItemService.createLineItem(lineItem);

      if (lineItem != null) {
        System.out.println("A line item with ID \"" + lineItem.getId()
            + "\", belonging to order ID \"" + lineItem.getOrderId() + "\", and named \""
            + lineItem.getName() + "\" was created.");
      } else {
        System.out.println("No line item created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
