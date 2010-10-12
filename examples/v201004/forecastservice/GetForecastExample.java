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

package v201004.forecastservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201004.DateTimeUtils;
import com.google.api.ads.dfp.v201004.CostType;
import com.google.api.ads.dfp.v201004.Forecast;
import com.google.api.ads.dfp.v201004.ForecastServiceInterface;
import com.google.api.ads.dfp.v201004.InventoryTargeting;
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemSummaryStartType;
import com.google.api.ads.dfp.v201004.LineItemType;
import com.google.api.ads.dfp.v201004.Size;
import com.google.api.ads.dfp.v201004.Targeting;
import com.google.api.ads.dfp.v201004.UnitType;

/**
 * This example gets a forecast for a prospective line item. To determine which
 * placements exist, run GetAllPlacementsExample.java.
 */
public class GetForecastExample {
  public static void main(String[] args) throws Exception{
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the Forecast.
    ForecastServiceInterface forecastService =
        user.getService(DfpService.V201004.FORECAST_SERVICE);

    // Set the placement that the prospective line item will target.
    long[] targetPlacementIds = new long[] {Long.parseLong("INSERT_PLACEMENT_ID_HERE")};

    // Set the end date time to have the line line item run till.
    String endDateTime = "INSERT_END_DATE_TIME_HERE";

    // Create hypothetical line item.
    LineItem lineItem = new LineItem();
    lineItem.setLineItemType(LineItemType.SPONSORSHIP);
    lineItem.setTargeting(new Targeting(new InventoryTargeting(null, null, targetPlacementIds)));

    // Set the size of creatives that can be associated with this line item.
    lineItem.setCreativeSizes(new Size[] {new Size(300, 250, false)});

    // Set the line item's time to be now until the projected end date time.
    lineItem.setStartType(LineItemSummaryStartType.IMMEDIATELY);
    lineItem.setEndDateTime(DateTimeUtils.fromString(endDateTime));

    // Set the line item to use 50% of the impressions.
    lineItem.setUnitType(UnitType.IMPRESSIONS);
    lineItem.setUnitsBought(50L);

    // Set the cost type to match the unit type.
    lineItem.setCostType(CostType.CPM);

    // Get forecast for line item.
    Forecast forecast = forecastService.getForecast(lineItem);

    // Display results.
    long matched = forecast.getForecastUnits();
    double availablePercent = (forecast.getAvailableUnits() / (matched * 1.0)) * 100;
    String unitType = forecast.getUnitType().toString().toLowerCase();

    System.out.println(matched + " " + unitType + " matched.\n"
        + availablePercent + "% " + unitType + " available.");

    if (forecast.getPossibleUnits() != null) {
      double possiblePercent = (forecast.getPossibleUnits() / (matched * 1.0)) * 100;
      System.out.println(possiblePercent + "% " + unitType + " possible.\n");
    }
  }
}
