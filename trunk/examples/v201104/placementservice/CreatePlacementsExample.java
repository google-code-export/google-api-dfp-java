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

package v201104.placementservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.AdUnit;
import com.google.api.ads.dfp.v201104.AdUnitPage;
import com.google.api.ads.dfp.v201104.InventoryServiceInterface;
import com.google.api.ads.dfp.v201104.Placement;
import com.google.api.ads.dfp.v201104.PlacementServiceInterface;
import com.google.api.ads.dfp.v201104.Size;
import com.google.api.ads.dfp.v201104.Statement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This example creates new placements for various ad unit sizes. To determine
 * which placements exist, run GetAllPlacementsExample.java.
 */
public class CreatePlacementsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201104.INVENTORY_SERVICE);

      // Get the PlacementService.
      PlacementServiceInterface placementService =
          user.getService(DfpService.V201104.PLACEMENT_SERVICE);

      // Create local placement object to store skyscraper ad units.
      Placement skyscraperAdUnitPlacement = new Placement();
      skyscraperAdUnitPlacement.setName("Skyscraper AdUnit Placement #"
          + System.currentTimeMillis());
      skyscraperAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 120x600");
      skyscraperAdUnitPlacement.setTargetedAdUnitIds(new String[] {});

      // Create local placement object to store medium square ad units.
      Placement mediumSquareAdUnitPlacement = new Placement();
      mediumSquareAdUnitPlacement.setName("Medium Square AdUnit Placement #"
          + System.currentTimeMillis());
      mediumSquareAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 300x250");
      mediumSquareAdUnitPlacement.setTargetedAdUnitIds(new String[] {});

      // Create local placement object to store banner ad units.
      Placement bannerAdUnitPlacement = new Placement();
      bannerAdUnitPlacement.setName("Banner AdUnit Placement #"
          + System.currentTimeMillis());
      bannerAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 468x60");
      bannerAdUnitPlacement.setTargetedAdUnitIds(new String[] {});

      // Get the first 500 ad units.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(new Statement("LIMIT 500", null));

      // Separate the ad units by size.
      if (page.getResults() != null) {
        for (AdUnit adUnit : page.getResults()) {
          if (adUnit.getParentId() != null && adUnit.getSizes() != null) {
            for (Size size : adUnit.getSizes()) {
              if (size.getWidth() == 300 && size.getHeight() == 250) {
                Set<String> adUnitIds =
                    new HashSet<String>(Arrays.asList(
                        mediumSquareAdUnitPlacement.getTargetedAdUnitIds()));
                adUnitIds.add(adUnit.getId());
                mediumSquareAdUnitPlacement.setTargetedAdUnitIds(
                    adUnitIds.toArray(new String[] {}));
              } else if (size.getWidth() == 120 && size.getHeight() == 600) {
                Set<String> adUnitIds =
                    new HashSet<String>(Arrays.asList(
                        skyscraperAdUnitPlacement.getTargetedAdUnitIds()));
                adUnitIds.add(adUnit.getId());
                skyscraperAdUnitPlacement.setTargetedAdUnitIds(adUnitIds.toArray(new String[] {}));
              } else if (size.getWidth() == 468 && size.getHeight() == 60) {
                Set<String> adUnitIds =
                    new HashSet<String>(
                       Arrays.asList(bannerAdUnitPlacement.getTargetedAdUnitIds()));
                adUnitIds.add(adUnit.getId());
                bannerAdUnitPlacement.setTargetedAdUnitIds(adUnitIds.toArray(new String[] {}));
              }
            }
          }
        }
      }

      // Create the placements on the server.
      Placement[] placements =
          placementService.createPlacements(new Placement[] {mediumSquareAdUnitPlacement,
              skyscraperAdUnitPlacement, bannerAdUnitPlacement});

      // Display results.
      if (placements != null) {
        for (Placement placement : placements) {
          System.out.print("A placement with ID \"" + placement.getId()
              + "\", name \"" + placement.getName()
              + "\", and containing ad units {");

          if (placement.getTargetedAdUnitIds() != null) {
            for (String adUnitId : placement.getTargetedAdUnitIds()) {
              System.out.print(adUnitId + ", ");
            }
          }

          System.out.println("} was created.");
        }
      } else {
        System.out.println("No placements created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
