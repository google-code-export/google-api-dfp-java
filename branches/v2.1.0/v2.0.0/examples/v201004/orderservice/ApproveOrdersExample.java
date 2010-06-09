// Copyright 2010 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201004.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.ApproveOrders;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.Order;
import com.google.api.ads.dfp.v201004.OrderPage;
import com.google.api.ads.dfp.v201004.OrderServiceInterface;
import com.google.api.ads.dfp.v201004.OrderStatus;
import com.google.api.ads.dfp.v201004.UpdateResult;

/**
 * This example approves all draft orders. To determine which orders exist,
 * run GetAllOrdersExample.java.
 */
public class ApproveOrdersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201004.ORDER_SERVICE);

      // Create statement text to select all draft orders.
      String statementText = "WHERE status IN ('" + OrderStatus.DRAFT + "','"
          + OrderStatus.PENDING_APPROVAL + "')";

      // Set defaults for page and filterStatement.
      OrderPage page = new OrderPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to page through draft orders.
        filterStatement.setQuery(statementText + " LIMIT 500 OFFSET " + offset);

        // Get orders by statement.
        page = orderService.getOrdersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Order order : page.getResults()) {
            System.out.println(i + ") Order with ID \""
                + order.getId() + "\", name \"" + order.getName()
                + "\", and status \"" + order.getStatus()
                + "\" will be approved.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of orders to be approved: " + page.getTotalResultSetSize());

      // Modify statement for action.
      filterStatement.setQuery(statementText);

      // Create action.
      ApproveOrders action = new ApproveOrders();

      // Perform action.
      UpdateResult result = orderService.performOrderAction(action, filterStatement);

      // Display results.
      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of orders approved: " + result.getNumChanges());
      } else {
        System.out.println("No orders were approved.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
