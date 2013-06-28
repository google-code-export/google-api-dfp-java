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

package v201306.suggestedadunitservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201306.Statement;
import com.google.api.ads.dfp.v201306.SuggestedAdUnit;
import com.google.api.ads.dfp.v201306.SuggestedAdUnitPage;
import com.google.api.ads.dfp.v201306.SuggestedAdUnitServiceInterface;

/**
 * This example gets all suggested ad units. To approve suggested ad units, run
 * ApproveSuggestedAdUnitsExample.java. This feature is only available to DFP
 * premium solution networks.
 *
 * Tags: SuggestedAdUnitService.getSuggestedAdUnitsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllSuggestedAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the SuggestedAdUnitService.
      SuggestedAdUnitServiceInterface suggestedAdUnitService =
          user.getService(DfpService.V201306.SUGGESTED_AD_UNIT_SERVICE);

      // Set defaults for page and filterStatement.
      SuggestedAdUnitPage page = new SuggestedAdUnitPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all suggested ad units.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get suggested ad units by statement.
        page = suggestedAdUnitService.getSuggestedAdUnitsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
            System.out.println(i + ") Suggested ad unit with ID \"" + suggestedAdUnit.getId()
                + "\", and number of requests \"" + suggestedAdUnit.getNumRequests()
                + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
