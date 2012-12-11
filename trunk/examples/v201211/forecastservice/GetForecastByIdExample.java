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

package v201211.forecastservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201211.Forecast;
import com.google.api.ads.dfp.v201211.ForecastServiceInterface;

/**
 * This example gets a forecast for an existing line item. To determine which
 * line items exist, run GetAllLineItemsExample.java.
 *
 * Tags: ForecastService.getForecastById
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetForecastByIdExample {
  public static void main(String[] args) throws Exception{
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the ForecastService.
    ForecastServiceInterface forecastService =
        user.getService(DfpService.V201211.FORECAST_SERVICE);

    // Set the line item to get a forecast for.
    Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

    // Get forecast for line item.
    Forecast forecast = forecastService.getForecastById(lineItemId);

    // Display results.
    long matched = forecast.getMatchedUnits();
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
