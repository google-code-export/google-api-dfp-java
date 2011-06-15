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

package v201004.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201004.StatementBuilder;
import com.google.api.ads.dfp.v201004.DeactivatePlacements;
import com.google.api.ads.dfp.v201004.InventoryStatus;
import com.google.api.ads.dfp.v201004.Placement;
import com.google.api.ads.dfp.v201004.PlacementPage;
import com.google.api.ads.dfp.v201004.PlacementServiceInterface;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates all active placements. To determine which placements
 * exist, run GetAllPlacementsExample.java.
 *
 * Tags: PlacementService.getPlacementsByStatement
 * Tags: PlacementService.performPlacementAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivatePlacementsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201004.PLACEMENT_SERVICE);

      // Create statement text to select active placements.
      String statementText = "WHERE status = :status LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("")
              .putParam("status", InventoryStatus.ACTIVE.toString())
              .toStatement();

      // Set defaults for page and offset.
      PlacementPage page = new PlacementPage();
      int offset = 0;
      List<Long> placementIds = new ArrayList<Long>();

      do {
        // Create a statement to page through active placements.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get placements by statement.
        page = placementService.getPlacementsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Placement placement : page.getResults()) {
            System.out.println(i + ") Placement with ID \"" + placement.getId()
                + "\", name \"" + placement.getName()
                + "\", and status \"" + placement.getStatus() + "\" will be deactivated.");
            placementIds.add(placement.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());


      System.out.println("Number of placements to be deactivated: " + placementIds.size());

      // Modify statement for action.
      filterStatement.setQuery("WHERE id IN (" + StringUtils.join(placementIds, ",") + ")");

      // Create action.
      DeactivatePlacements action = new DeactivatePlacements();

      // Perform action.
      UpdateResult result = placementService.performPlacementAction(action, filterStatement);

      // Display results.
      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of placements deactivated: " + result.getNumChanges());
      } else {
        System.out.println("No placements were deactivated.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
