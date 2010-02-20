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

package v201002.placementervice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.Placement;
import com.google.api.ads.dfp.v201002.PlacementPage;
import com.google.api.ads.dfp.v201002.PlacementServiceInterface;

/**
 * This example gets all active placements by using a filter. To create a
 * placement, run CreatePlacementsExample.java.
 */
public class GetPlacementsByFilterExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201002.PLACEMENT_SERVICE);

      // Create a filter to only select active placements.
      Filter filter = new Filter("WHERE status = 'ACTIVE' LIMIT 500");

      // Get placements by filter.
      PlacementPage page = placementService.getPlacementsByFilter(filter);

      // Display results.
      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Placement placement : page.getResults()) {
          System.out.println(i + ") Placement with ID \"" + placement.getId()
              + "\", name \"" + placement.getName()
              + "\", and status \"" + placement.getStatus() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
