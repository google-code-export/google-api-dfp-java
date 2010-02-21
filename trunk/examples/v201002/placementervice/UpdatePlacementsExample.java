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
import com.google.api.ads.dfp.v201002.AdUnitPage;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.InventoryServiceInterface;
import com.google.api.ads.dfp.v201002.Placement;
import com.google.api.ads.dfp.v201002.PlacementPage;
import com.google.api.ads.dfp.v201002.PlacementServiceInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This example updates all placements to include the root ad unit up to the
 * first 500. To determine which placements exist, run
 * GetAllPlacementsExample.java.
 */
public class UpdatePlacementsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201002.PLACEMENT_SERVICE);

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201002.INVENTORY_SERVICE);

      // Get the root ad unit by filter.
      AdUnitPage adUnitPage =
          inventoryService.getAdUnitsByFilter(new Filter("WHERE parentId IS NULL LIMIT 500"));
      String rootAdUnitId = (adUnitPage.getResults() != null)
          ? adUnitPage.getResults()[0].getId() : null;

      // Create a filter to select first 500 placements.
      Filter filter = new Filter("LIMIT 500");

      // Get placements by filter.
      PlacementPage page = placementService.getPlacementsByFilter(filter);

      if (page.getResults() != null) {
        Placement[] placements = page.getResults();

        // Update each local placement object by adding the root ad unit.
        for (Placement placement : placements) {
          Set<String> targetedAdUnitIds = (placement.getTargetedAdUnitIds() == null)
              ? new HashSet<String>()
              : new HashSet<String>(Arrays.asList(placement.getTargetedAdUnitIds()));
          targetedAdUnitIds.add(rootAdUnitId);
          placement.setTargetedAdUnitIds(targetedAdUnitIds.toArray(new String[] {}));
        }

        // Update the placements on the server.
        placements = placementService.updatePlacements(placements);

        // Display results.
        if (placements != null) {
          for (Placement placement : placements) {
            System.out.print("A placement with ID \""
                + placement.getId() + "\", name \""
                + placement.getName() + "\", and containing ad units {");

            if (placement.getTargetedAdUnitIds() != null) {
              for (String adUnitId : placement.getTargetedAdUnitIds()) {
                System.out.print(adUnitId + ", ");
              }
            }

            System.out.println("} was updated.");
          }
        } else {
          System.out.println("No placements updated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
