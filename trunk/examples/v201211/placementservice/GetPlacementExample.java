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

package v201211.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201211.Placement;
import com.google.api.ads.dfp.v201211.PlacementServiceInterface;

/**
 * This example gets a placement by its ID. To determine which placements
 * exist, run GetAllPlacementsExample.java.
 *
 * Tags: PlacementService.getPlacement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetPlacementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201211.PLACEMENT_SERVICE);

      // Set the ID of the placement to get.
      Long placementId = Long.parseLong("INSERT_PLACEMENT_ID_HERE");

      // Get the placement.
      Placement placement = placementService.getPlacement(placementId);

      if (placement != null) {
        System.out.println("Placement with ID \"" + placement.getId()
            + "\", name \"" + placement.getName()
            + "\", and status \"" + placement.getStatus() + "\" was found.");
      } else {
        System.out.println("No placement found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
