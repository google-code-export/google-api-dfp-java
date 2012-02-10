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

package v201201.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201201.Statement;
import com.google.api.ads.dfp.v201201.Placement;
import com.google.api.ads.dfp.v201201.PlacementPage;
import com.google.api.ads.dfp.v201201.PlacementServiceInterface;

/**
 * This example gets all placements. To create placements, run
 * CreatePlacementsExample.java.
 *
 * Tags: PlacementService.getPlacementsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllPlacementsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201201.PLACEMENT_SERVICE);

      // Sets defaults for page and filterStatement.
      PlacementPage page = new PlacementPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all ad units.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get ad units by filter.
        page = placementService.getPlacementsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Placement placement : page.getResults()) {
            System.out.println(i + ") Placement with ID \"" + placement.getId()
                + "\" and name \"" + placement.getName() + "\" was found.");
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
