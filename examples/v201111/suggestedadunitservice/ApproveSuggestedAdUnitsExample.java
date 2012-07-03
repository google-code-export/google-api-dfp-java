// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201111.suggestedadunitservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201111.StatementBuilder;
import com.google.api.ads.dfp.v201111.ApproveSuggestedAdUnit;
import com.google.api.ads.dfp.v201111.Statement;
import com.google.api.ads.dfp.v201111.SuggestedAdUnit;
import com.google.api.ads.dfp.v201111.SuggestedAdUnitPage;
import com.google.api.ads.dfp.v201111.SuggestedAdUnitServiceInterface;
import com.google.api.ads.dfp.v201111.SuggestedAdUnitUpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This code example approves all suggested ad units with 50 or more requests.
 * This feature is only available to DFP premium solution networks.
 *
 * Tags: SuggestedAdUnitService.getSuggestedAdUnitsByStatement Tags:
 * SuggestedAdUnitService.performSuggestedAdUnitAction
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
          user.getService(DfpService.V201111.SUGGESTED_AD_UNIT_SERVICE);

      // Set the number of requests to 50 or more.
      Long NUMBER_OF_REQUESTS = 50L;

      // Create statement text to select all suggested ad units.
      String statementText = "LIMIT 500";
      Statement filterStatement = new StatementBuilder(statementText).toStatement();

      // Set defaults for page and offset.
      SuggestedAdUnitPage page = new SuggestedAdUnitPage();
      int offset = 0;
      List<String> suggestedAdUnitIds = new ArrayList<String>();

      do {
        // Create a statement to page through suggested ad units.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get suggested ad units by statement.
        page = suggestedAdUnitService.getSuggestedAdUnitsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();

          for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
            if (suggestedAdUnit.getNumRequests() >= NUMBER_OF_REQUESTS) {
              System.out.println(i + ") Suggested ad unit with ID \"" + suggestedAdUnit.getId()
                  + "\", and \"" + suggestedAdUnit.getNumRequests()
                  + "\" will be approved.");
              suggestedAdUnitIds.add(suggestedAdUnit.getId());
            }
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of suggested ad units to be approved: "
          + suggestedAdUnitIds.size());

      if (suggestedAdUnitIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery(
            "WHERE id IN (" + StringUtils.join(suggestedAdUnitIds, ",") + ")");

        // Create action.
        ApproveSuggestedAdUnit action = new ApproveSuggestedAdUnit();

        // Perform action.
        SuggestedAdUnitUpdateResult result =
            suggestedAdUnitService.performSuggestedAdUnitAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of suggested ad units approved: " + result.getNumChanges());
        } else {
          System.out.println("No suggested ad units were approved.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
