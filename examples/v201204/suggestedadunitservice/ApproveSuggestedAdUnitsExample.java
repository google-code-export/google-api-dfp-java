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

package v201204.suggestedadunitservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201204.StatementBuilder;
import com.google.api.ads.dfp.v201204.ApproveSuggestedAdUnit;
import com.google.api.ads.dfp.v201204.Statement;
import com.google.api.ads.dfp.v201204.SuggestedAdUnit;
import com.google.api.ads.dfp.v201204.SuggestedAdUnitPage;
import com.google.api.ads.dfp.v201204.SuggestedAdUnitServiceInterface;
import com.google.api.ads.dfp.v201204.UpdateResult;

/**
 * This code example approves all suggested ad units with 50 or more requests.
 * This feature is only available to DFP premium solution networks.
 *
 * Tags: SuggestedAdUnitService.getSuggestedAdUnitsByStatement
 * Tags: SuggestedAdUnitService.performSuggestedAdUnitAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ApproveSuggestedAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the SuggestedAdUnitService.
      SuggestedAdUnitServiceInterface suggestedAdUnitService =
          user.getService(DfpService.V201204.SUGGESTED_AD_UNIT_SERVICE);

      // Create statement to select all suggested ad units with 50 or more
      // requests.
      Statement filterStatement =
          new StatementBuilder("WHERE numRequests >= :numRequests").putValue("numRequests", 50L)
              .toStatement();

      // Get suggested ad units by statement.
      SuggestedAdUnitPage page =
          suggestedAdUnitService.getSuggestedAdUnitsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();

        for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
          System.out.println(i + ") Suggested ad unit with ID \"" + suggestedAdUnit.getId()
              + "\" and number of requests  \"" + suggestedAdUnit.getNumRequests()
              + "\" will be approved.");
          i++;
        }

        System.out.println("Number of suggested ad units to be approved: "
            + page.getTotalResultSetSize());

        // Create action.
        ApproveSuggestedAdUnit action = new ApproveSuggestedAdUnit();

        // Perform action.
        UpdateResult result =
            suggestedAdUnitService.performSuggestedAdUnitAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of suggested ad units approved: " + result.getNumChanges());
        } else {
          System.out.println("No suggested ad units were approved.");
        }
      } else {
        System.out.println("No suggested ad units were approved.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
