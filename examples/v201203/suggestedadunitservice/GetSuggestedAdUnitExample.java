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

package v201203.suggestedadunitservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.SuggestedAdUnit;
import com.google.api.ads.dfp.v201203.SuggestedAdUnitServiceInterface;

/**
 * This example gets a suggested ad unit by its ID. To determine which suggested
 * ad units exist, run GetAllSuggestedAdUnitsExample.java. This feature is only
 * available to DFP premium solution networks.
 *
 * Tags: SuggestedAdUnitService.getSuggestedAdUnit
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetSuggestedAdUnitExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the SuggestedAdUnitService.
      SuggestedAdUnitServiceInterface suggestedAdUnitService =
          user.getService(DfpService.V201203.SUGGESTED_AD_UNIT_SERVICE);

      // Set the ID of the suggested ad unit to get.
      String suggestedAdUnitId = "INSERT_SUGGESTED_AD_UNIT_ID_HERE";

      // Get the suggested ad unit.
      SuggestedAdUnit suggestedAdUnit =
          suggestedAdUnitService.getSuggestedAdUnit(suggestedAdUnitId);

      if (suggestedAdUnit != null) {
        System.out.println("Suggested ad unit with ID \"" + suggestedAdUnit.getId()
            + "\", and number of requests \"" + suggestedAdUnit.getNumRequests()
            + "\" was found.");
      } else {
        System.out.println("No suggested ad unit found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
