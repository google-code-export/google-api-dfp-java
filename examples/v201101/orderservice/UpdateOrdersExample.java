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

package v201101.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201101.Statement;
import com.google.api.ads.dfp.v201101.Order;
import com.google.api.ads.dfp.v201101.OrderPage;
import com.google.api.ads.dfp.v201101.OrderServiceInterface;

/**
 * This example updates the notes of each order up to the first 500.
 * To determine which orders exist, run GetAllOrdersExample.java.
 *
 * Tags: OrderService.getOrdersByStatement, OrderService.updateOrders
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateOrdersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201101.ORDER_SERVICE);

      // Create a statement to get all orders.
      Statement filterStatement = new Statement("LIMIT 500", null);

      // Get orders by statement.
      OrderPage page = orderService.getOrdersByStatement(filterStatement);

      if (page.getResults() != null) {
        Order[] orders = page.getResults();

        // Update each local order object by changing its notes.
        int i = 0;
        for (Order order : orders) {
          // Archived orders cannot be updated.
          if (order.getIsArchived()) {
            orders[i] = null;
          } else {
            order.setNotes("Spoke to advertiser. All is well.");
          }
          i++;
        }

        // Update the orders on the server.
        orders = orderService.updateOrders(orders);

        if (orders != null) {
          for (Order order : orders) {
            System.out.println("Order with ID \""
                + order.getId() + "\", name \"" + order.getName()
                + "\", advertiser \"" + order.getAdvertiserId()
                + "\", and notes \"" + order.getNotes() + "\" was updated.");
          }
        } else {
          System.out.println("No orders updated.");
        }
      } else {
        System.out.println("No orders found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
