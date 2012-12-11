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
import com.google.api.ads.dfp.v201211.BrowserTargeting;
import com.google.api.ads.dfp.v201211.CostType;
import com.google.api.ads.dfp.v201211.CreativePlaceholder;
import com.google.api.ads.dfp.v201211.CreativeRotationType;
import com.google.api.ads.dfp.v201211.DayOfWeek;
import com.google.api.ads.dfp.v201211.DayPart;
import com.google.api.ads.dfp.v201211.DayPartTargeting;
import com.google.api.ads.dfp.v201211.DeliveryTimeZone;
import com.google.api.ads.dfp.v201211.GeoTargeting;
import com.google.api.ads.dfp.v201211.InventoryTargeting;
import com.google.api.ads.dfp.v201211.LineItem;
import com.google.api.ads.dfp.v201211.LineItemServiceInterface;
import com.google.api.ads.dfp.v201211.LineItemType;
import com.google.api.ads.dfp.v201211.Location;
import com.google.api.ads.dfp.v201211.MinuteOfHour;
import com.google.api.ads.dfp.v201211.Money;
import com.google.api.ads.dfp.v201211.Size;
import com.google.api.ads.dfp.v201211.StartDateTimeType;
import com.google.api.ads.dfp.v201211.Targeting;
import com.google.api.ads.dfp.v201211.Technology;
import com.google.api.ads.dfp.v201211.TechnologyTargeting;
import com.google.api.ads.dfp.v201211.TimeOfDay;
import com.google.api.ads.dfp.v201211.UnitType;
import com.google.api.ads.dfp.v201211.UserDomainTargeting;

/**
 * This example creates new line items. To determine which line items exist, run
 * GetAllLineItemsExample.java. To determine which orders exist, run
 * GetAllOrdersExample.java. To determine which placements exist, run
 * GetAllPlacementsExample.java. To determine the IDs for locations, run
 * GetAllCitiesExample.java, GetAllCountriesExample.java,
 * GetAllMetrosExample.java, and GetAllRegionsExample.java.
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
          user.getService(DfpService.V201211.LINEITEM_SERVICE);

      // Set the order that all created line items will belong to and the
      // placement ID to target.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      long[] targetedPlacementIds = new long[] {Long.parseLong("INSERT_PLACEMENT_ID_HERE")};

      // Create inventory targeting.
      InventoryTargeting inventoryTargeting = new InventoryTargeting();
      inventoryTargeting.setTargetedPlacementIds(targetedPlacementIds);

      // Create geographical targeting.
      GeoTargeting geoTargeting = new GeoTargeting();

      // Include the US, Quebec, Canada, and the B3P Canada postal code.
      Location countryLocation = new Location();
      countryLocation.setId(2840L);

      Location regionLocation = new Location();
      regionLocation.setId(20123L);

      Location postalCodeLocation = new Location();
      postalCodeLocation.setId(9000093L);

      geoTargeting.setTargetedLocations(new Location[] {countryLocation, regionLocation,
          postalCodeLocation});

      // Exclude Chicago and the New York metro area.
      Location cityLocation = new Location();
      cityLocation.setId(1016367L);

      Location metroLocation = new Location();
      metroLocation.setId(200501L);
      geoTargeting.setExcludedLocations(new Location[] {cityLocation, metroLocation});

      // Exclude domains that are not under the network's control.
      UserDomainTargeting userDomainTargeting = new UserDomainTargeting();
      userDomainTargeting.setDomains(new String[] {"usa.gov"});
      userDomainTargeting.setTargeted(false);

      // Create day-part targeting.
      DayPartTargeting dayPartTargeting = new DayPartTargeting();
      dayPartTargeting.setTimeZone(DeliveryTimeZone.BROWSER);

      // Target only the weekend in the browser's timezone.
      DayPart saturdayDayPart = new DayPart();
      saturdayDayPart.setDayOfWeek(DayOfWeek.SATURDAY);
      saturdayDayPart.setStartTime(new TimeOfDay(0, MinuteOfHour.ZERO));
      saturdayDayPart.setEndTime(new TimeOfDay(24, MinuteOfHour.ZERO));

      DayPart sundayDayPart = new DayPart();
      sundayDayPart.setDayOfWeek(DayOfWeek.SUNDAY);
      sundayDayPart.setStartTime(new TimeOfDay(0, MinuteOfHour.ZERO));
      sundayDayPart.setEndTime(new TimeOfDay(24, MinuteOfHour.ZERO));
      dayPartTargeting.setDayParts(new DayPart[] {saturdayDayPart, sundayDayPart});

      // Create technology targeting.
      TechnologyTargeting technologyTargeting = new TechnologyTargeting();

      // Create browser targeting.
      BrowserTargeting browserTargeting = new BrowserTargeting();
      browserTargeting.setIsTargeted(true);

      // Target just the Chrome browser.
      Technology browserTechnology = new Technology();
      browserTechnology.setId(500072L);
      browserTargeting.setBrowsers(new Technology[] {browserTechnology});
      technologyTargeting.setBrowserTargeting(browserTargeting);

      // Create targeting.
      Targeting targeting = new Targeting();
      targeting.setGeoTargeting(geoTargeting);
      targeting.setInventoryTargeting(inventoryTargeting);
      targeting.setUserDomainTargeting(userDomainTargeting);
      targeting.setDayPartTargeting(dayPartTargeting);
      targeting.setTechnologyTargeting(technologyTargeting);

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
