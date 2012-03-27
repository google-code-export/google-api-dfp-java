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

package v201203.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201203.StatementBuilder;
import com.google.api.ads.dfp.v201203.InventoryStatus;
import com.google.api.ads.dfp.v201203.Placement;
import com.google.api.ads.dfp.v201203.PlacementPage;
import com.google.api.ads.dfp.v201203.PlacementServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;

/**
 * This example gets all active placements. The statement retrieves up to the
 * maximum page size limit of 500. To create a placement, run
 * CreatePlacementsExample.java.
 *
 * Tags: PlacementService.getPlacementsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetPlacementsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201203.PLACEMENT_SERVICE);

      // Create a statement to only select active placements.
      Statement filterStatement =
        new StatementBuilder("WHERE status = :status LIMIT 500")
            .putValue("status", InventoryStatus.ACTIVE.toString()).toStatement();

      // Get placements by statement.
      PlacementPage page = placementService.getPlacementsByStatement(filterStatement);

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
