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

package v201010.inventoryservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201010.StatementBuilder;
import com.google.api.ads.dfp.v201010.AdUnit;
import com.google.api.ads.dfp.v201010.AdUnitPage;
import com.google.api.ads.dfp.v201010.InventoryServiceInterface;
import com.google.api.ads.dfp.v201010.NetworkServiceInterface;
import com.google.api.ads.dfp.v201010.Statement;

/**
 * This example gets first 500 children below the effective root ad unit. To
 * create ad units, run CreateAdUnitsExample.java.
 *
 * Tags: InventoryService.getAdUnitsByStatement
 * Tags: NetworkService.getCurrentNetwork
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAdUnitsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the InventoryService.
      InventoryServiceInterface inventoryService =
          user.getService(DfpService.V201010.INVENTORY_SERVICE);

      // Get the NetworkService.
      NetworkServiceInterface networkService =
          user.getService(DfpService.V201010.NETWORK_SERVICE);

      // Get the effective root ad unit ID of the network.
      String effectiveRootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

      // Create a statement to select the children of the effective root ad
      // unit.
      Statement filterStatement = new StatementBuilder("WHERE parentId = :id LIMIT 500")
          .putParam("id", effectiveRootAdUnitId).toStatement();

      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (AdUnit adUnit : page.getResults()) {
          System.out.println(i + ") Ad unit with ID \"" + adUnit.getId()
              + "\", name \"" + adUnit.getName()
              + "\", and status \"" + adUnit.getStatus() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
