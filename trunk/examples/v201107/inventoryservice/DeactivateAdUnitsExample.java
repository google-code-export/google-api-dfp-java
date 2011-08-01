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

package v201107.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201107.StatementBuilder;
import com.google.api.ads.dfp.v201107.AdUnit;
import com.google.api.ads.dfp.v201107.AdUnitPage;
import com.google.api.ads.dfp.v201107.DeactivateAdUnits;
import com.google.api.ads.dfp.v201107.InventoryServiceInterface;
import com.google.api.ads.dfp.v201107.InventoryStatus;
import com.google.api.ads.dfp.v201107.Statement;
import com.google.api.ads.dfp.v201107.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates all active ad units. To determine which ad units
 * exist, run GetAllAdUnitsExample.java or GetInventoryTreeExample.java.
 *
 * Tags: InventoryService.getAdUnitsByStatement
 * Tags: InventoryService.performAdUnitAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivateAdUnitsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201107.INVENTORY_SERVICE);

      // Create statement text to select active ad units.
      String statementText = "WHERE status = :status LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("")
              .putValue("status", InventoryStatus.ACTIVE.toString())
              .toStatement();

      // Set defaults for page and offset.
      AdUnitPage page = new AdUnitPage();
      int offset = 0;
      List<String> adUnitIds = new ArrayList<String>();

      do {
        // Create a statement to page through active ad units.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get ad units by statement.
        page = inventoryService.getAdUnitsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (AdUnit adUnit : page.getResults()) {
            System.out.println(i + ") Ad unit with ID \"" + adUnit.getId()
                + "\", name \"" + adUnit.getName()
                + "\", and status \"" + adUnit.getStatus() + "\" will be deactivated.");
            adUnitIds.add(adUnit.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of ad units to be deactivated: " + adUnitIds.size());

      if (adUnitIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(adUnitIds, ",") + ")");

        // Create action.
        DeactivateAdUnits action = new DeactivateAdUnits();

        // Perform action.
        UpdateResult result = inventoryService.performAdUnitAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of ad units deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No ad units were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
