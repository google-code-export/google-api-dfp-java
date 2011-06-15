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

package v201101.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201101.AdUnit;
import com.google.api.ads.dfp.v201101.AdUnitPage;
import com.google.api.ads.dfp.v201101.InventoryServiceInterface;
import com.google.api.ads.dfp.v201101.Statement;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

/**
 * This example retrieves a previously created ad units and creates
 * a tree.
 *
 * Tags: InventoryService.getAdUnit, InventoryService.getAdUnitsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetInventoryTreeExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get all ad units.
      AdUnit[] allAdUnits = getAllAdUnits(user);

      // Find the root ad unit. rootAdUnit can also be set to child unit to
      // only build and display a portion of the tree.
      // i.e. AdUnit adUnit =
      //          inventoryService.getAdUnit("INSERT_AD_UNIT_HERE")
      AdUnit rootAdUnit = findRootAdUnit(user);

      if (rootAdUnit == null) {
        System.out.println("Could not build tree. No root ad unit found.");
      } else {
        buildAndDisplayAdUnitTree(rootAdUnit, allAdUnits);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Gets all ad units for this user.
   *
   * @param user the {@code DfpUser} to get the ad units for
   * @return all ad units for this user
   * @throws ServiceException thrown if service could not be created
   * @throws RemoteException thrown if there was a problem retrieving ad units
   */
  private static AdUnit[] getAllAdUnits(DfpUser user)
      throws ServiceException, RemoteException {
    // Create list to hold all ad units.
    List<AdUnit> adUnits = new ArrayList<AdUnit>();

    // Get InventoryService.
    InventoryServiceInterface inventoryService =
        user.getService(DfpService.V201101.INVENTORY_SERVICE);

    // Sets defaults for page and filterStatement.
    AdUnitPage page = new AdUnitPage();
    Statement filterStatement = new Statement();
    int offset = 0;

    do {
      // Create a statement to get all ad units.
      filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

      // Get ad units by statement.
      page = inventoryService.getAdUnitsByStatement(filterStatement);

      if (page.getResults() != null) {
        adUnits.addAll(Arrays.asList(page.getResults()));
      }

      offset += 500;
    } while (offset < page.getTotalResultSetSize());

    return adUnits.toArray(new AdUnit[] {});
  }

  /**
   * Finds the root ad unit for the user.
   *
   * @param user the {@code DfpUser} to get the root ad unit for
   * @return the ad unit representing the root ad unit or {@code null} if one
   *     is not found.
   * @throws ServiceException thrown if service could not be created
   * @throws RemoteException thrown if there was a problem retrieving ad units
   */
  private static AdUnit findRootAdUnit(DfpUser user)
      throws ServiceException, RemoteException {
    // Get InventoryService.
    InventoryServiceInterface inventoryService =
        user.getService(DfpService.V201101.INVENTORY_SERVICE);

    // Create a statement to only select the root ad unit.
    Statement filterStatement = new Statement("WHERE parentId IS NULL LIMIT 500", null);

    // Get ad units by statement.
    AdUnitPage page = inventoryService.getAdUnitsByStatement(filterStatement);

    if (page.getResults() != null) {
      return page.getResults()[0];
    }

    return null;
  }

  /**
   * Builds and displays an ad unit tree from an array of ad units underneath
   * the root ad unit.
   *
   * @param root the root ad unit to build the tree under
   * @param units the array of ad units.
   */
  private static void buildAndDisplayAdUnitTree(AdUnit root, AdUnit[] units) {
    Map<String, List<AdUnit>> treeMap = new HashMap<String, List<AdUnit>>();

    for (AdUnit unit : units) {
      if (unit.getParentId() != null) {
        if (treeMap.get(unit.getParentId()) == null) {
          treeMap.put(unit.getParentId(), new ArrayList<AdUnit>());
        }

        treeMap.get(unit.getParentId()).add(unit);
      }
    }

    if (root != null) {
      displayInventoryTree(root, treeMap);
    } else {
      System.out.println("No root unit found.");
    }
  }

  /**
   * Displays the ad unit tree beginning at the root ad unit.
   *
   * @param root the root ad unit
   * @param treeMap the map of id to {@code List} of ad units
   */
  private static void displayInventoryTree(AdUnit root, Map<String, List<AdUnit>> treeMap) {
    displayInventoryTreeHelper(root, treeMap, 0);
  }

  /**
   * Helper for displaying inventory units.
   *
   * @param root the root inventory unit
   * @param treeMap the map of id to {@code List} of inventory units
   * @param depth the depth the tree has reached
   */
  private static void displayInventoryTreeHelper(AdUnit root,
      Map<String, List<AdUnit>> treeMap, int depth) {
    System.out.println(generateTab(depth) + root.getName() + " (" + root.getId() + ")");

    if (treeMap.get(root.getId()) != null) {
      for (AdUnit child : treeMap.get(root.getId())) {
        displayInventoryTreeHelper(child, treeMap, depth + 1);
      }
    }
  }

  /**
   * Generates a {@code String} of tabs to represent branching to children.
   *
   * @param depth a depth from 0 to max(depth)
   * @return a {@code String} to insert in front of the root unit
   */
  private static String generateTab(int depth) {
    StringBuilder builder = new StringBuilder();
    if (depth != 0) {
      builder.append("  ");
    }

    for (int i = 1; i < depth; i++) {
      builder.append("|  ");
    }

    return builder.append("+--").toString();
  }
}
