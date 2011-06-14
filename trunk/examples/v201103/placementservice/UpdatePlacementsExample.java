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

package v201103.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201103.Placement;
import com.google.api.ads.dfp.v201103.PlacementPage;
import com.google.api.ads.dfp.v201103.PlacementServiceInterface;
import com.google.api.ads.dfp.v201103.Statement;

/**
 * This example updates all placements to allow for AdSense targeting up to the
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
          user.getService(DfpService.V201103.PLACEMENT_SERVICE);

      // Create a statement to select first 500 placements.
      Statement filterStatement = new Statement("LIMIT 500", null);

      // Get placements by statement.
      PlacementPage page = placementService.getPlacementsByStatement(filterStatement);

      if (page.getResults() != null) {
        Placement[] placements = page.getResults();

        // Update each local placement object by enabling AdSense targeting.
        for (Placement placement : placements) {
          placement.setTargetingDescription(
              (placement.getDescription() == null || placement.getDescription().isEmpty())
              ? "Generic description" : placement.getDescription());
          placement.setTargetingAdLocation("All images on sports pages.");
          placement.setTargetingSiteName("http://code.google.com");
          placement.setIsAdSenseTargetingEnabled(true);
        }

        // Update the placements on the server.
        placements = placementService.updatePlacements(placements);

        // Display results.
        if (placements != null) {
          for (Placement placement : placements) {
            System.out.println("A placement with ID \""
                + placement.getId() + "\", name \""
                + placement.getName() + "\", and AdSense targeting enabled \""
                + placement.getIsAdSenseTargetingEnabled() + "\" was updated.");
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
