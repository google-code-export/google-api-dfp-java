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
import com.google.api.ads.dfp.lib.utils.DateTimeUtils;
import com.google.api.ads.dfp.v201004.CostType;
import com.google.api.ads.dfp.v201004.Forecast;
import com.google.api.ads.dfp.v201004.ForecastServiceInterface;
import com.google.api.ads.dfp.v201004.InventoryTargeting;
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemSummaryStartType;
import com.google.api.ads.dfp.v201004.LineItemType;
import com.google.api.ads.dfp.v201004.Money;
import com.google.api.ads.dfp.v201004.Size;
import com.google.api.ads.dfp.v201004.Targeting;
import com.google.api.ads.dfp.v201004.UnitType;

/**
 * This example gets a forecast for a hypothetical line item. To determine which
 * orders exist, run GetAllOrdersExamle.java. To determine which ad units exist,
 * run GetInventoryTreeExample.java or GetAllAdUnitsExample.java.
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

    // Set the order to which the hypothetical line item would belong to and
    // the ad unit ID to target.
    Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
    String[] targetAdUnitIds = new String[] {"INSERT_AD_UNIT_ID_HERE"};

    // Set the end date time to have the line line item run till.
    String endDateTime = "INSERT_END_DATE_TIME_HERE";

    // Create hypothetical line item.
    LineItem lineItem = new LineItem();
    lineItem.setOrderId(orderId);
    lineItem.setLineItemType(LineItemType.SPONSORSHIP);
    lineItem.setTargeting(new Targeting(new InventoryTargeting(targetAdUnitIds, null, null)));

    // Set the size of creatives that can be associated with this line item.
    lineItem.setCreativeSizes(new Size[] {new Size(300, 250, false)});

    // Set the line item's time to be now until the projected end date time.
    lineItem.setStartType(LineItemSummaryStartType.IMMEDIATELY);
    lineItem.setEndDateTime(DateTimeUtils.fromString(endDateTime));

    // Set the cost per unit to $2.
    lineItem.setCostType(CostType.CPM);
    lineItem.setCostPerUnit(new Money("USD", 2000000L));

    // Set the line item to use 50% of the impressions.
    lineItem.setUnitType(UnitType.IMPRESSIONS);
    lineItem.setUnitsBought(50L);

    // Get forecast for line item.
    Forecast forecast = forecastService.getForecast(lineItem);

    long matched = forecast.getForecastUnits();
    double possiblePercent = (forecast.getPossibleUnits() / (matched * 1.0)) * 100;
    double availablePercent = (forecast.getAvailableUnits() / (matched * 1.0)) * 100;
    String unitType = forecast.getUnitType().toString().toLowerCase();

    System.out.println(matched + " " + unitType + " matched.\n"
        + possiblePercent + "% " + unitType + " possible.\n"
        + availablePercent + "% " + unitType + " available.");
  }
}
