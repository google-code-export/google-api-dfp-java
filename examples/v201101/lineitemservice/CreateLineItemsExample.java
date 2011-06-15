// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201101.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201101.DateTimeUtils;
import com.google.api.ads.dfp.v201101.CityLocation;
import com.google.api.ads.dfp.v201101.CostType;
import com.google.api.ads.dfp.v201101.CountryLocation;
import com.google.api.ads.dfp.v201101.CreativeRotationType;
import com.google.api.ads.dfp.v201101.GeoTargeting;
import com.google.api.ads.dfp.v201101.InventoryTargeting;
import com.google.api.ads.dfp.v201101.LineItem;
import com.google.api.ads.dfp.v201101.LineItemServiceInterface;
import com.google.api.ads.dfp.v201101.LineItemType;
import com.google.api.ads.dfp.v201101.Location;
import com.google.api.ads.dfp.v201101.MetroLocation;
import com.google.api.ads.dfp.v201101.Money;
import com.google.api.ads.dfp.v201101.RegionLocation;
import com.google.api.ads.dfp.v201101.Size;
import com.google.api.ads.dfp.v201101.StartDateTimeType;
import com.google.api.ads.dfp.v201101.Targeting;
import com.google.api.ads.dfp.v201101.UnitType;

/**
 * This example creates new line items. To determine which line items exist, run
 * GetAllLineItemsExample.java. To determine which orders exist, run
 * GetAllOrdersExample.java. To determine which placements exist, run
 * GetAllPlacementsExample.java.
 *
 * Tags: LineItemService.createLineItems
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateLineItemsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201101.LINEITEM_SERVICE);

      // Set the order that all created line items will belong to and the
      // placement ID to target.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      long[] targetedPlacementIds = new long[] {Long.parseLong("INSERT_PLACEMENT_ID_HERE")};

      // Create inventory targeting.
      InventoryTargeting inventoryTargeting = new InventoryTargeting();
      inventoryTargeting.setTargetedPlacementIds(targetedPlacementIds);

      // Create geographical targeting.
      GeoTargeting geoTargeting = new GeoTargeting();

      // Include the US and Quebec, Canada.
      CountryLocation countryLocation = new CountryLocation();
      countryLocation.setCountryCode("US");
      RegionLocation regionLocation = new RegionLocation();
      regionLocation.setRegionCode("CA-QC");
      geoTargeting.setTargetedLocations(new Location[] {countryLocation, regionLocation});

      // Exclude Chicago and the New York metro area.
      CityLocation cityLocation = new CityLocation();
      cityLocation.setCityName("Chicago");
      cityLocation.setCountryCode("US");
      MetroLocation metroLocation = new MetroLocation();
      metroLocation.setMetroCode("501");
      geoTargeting.setExcludedLocations(new Location[] {cityLocation, metroLocation});

      // Create targeting.
      Targeting targeting = new Targeting();
      targeting.setGeoTargeting(geoTargeting);
      targeting.setInventoryTargeting(inventoryTargeting);

      // Create an array to store local line item objects.
      LineItem[] lineItems = new LineItem[5];

      for (int i = 0; i < 5; i++) {
        LineItem lineItem = new LineItem();
        lineItem.setName("Line item #" + i);
        lineItem.setOrderId(orderId);
        lineItem.setTargeting(targeting);
        lineItem.setLineItemType(LineItemType.STANDARD);
        lineItem.setAllowOverbook(true);

        // Set the creative rotation type to even.
        lineItem.setCreativeRotationType(CreativeRotationType.EVEN);

        // Set the size of creatives that can be associated with this line item.
        lineItem.setCreativeSizes(new Size[] {new Size(300, 250, false)});

        // Set the length of the line item to run.
        lineItem.setStartDateTimeType(StartDateTimeType.IMMEDIATELY);
        lineItem.setEndDateTime(DateTimeUtils.fromString("2011-09-01T00:00:00"));

        // Set the cost per unit to $2.
        lineItem.setCostType(CostType.CPM);
        lineItem.setCostPerUnit(new Money("USD", 2000000L));

        // Set the number of units bought to 500,000 so that the budget is
        // $1,000.
        lineItem.setUnitsBought(500000L);
        lineItem.setUnitType(UnitType.IMPRESSIONS);

        lineItems[i] = lineItem;
      }

      // Create the line items on the server.
      lineItems = lineItemService.createLineItems(lineItems);

      if (lineItems != null) {
        for (LineItem lineItem : lineItems) {
          System.out.println("A line item with ID \"" + lineItem.getId()
              + "\", belonging to order ID \"" + lineItem.getOrderId() + "\", and named \""
              + lineItem.getName() + "\" was created.");
        }
      } else {
        System.out.println("No line items created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
