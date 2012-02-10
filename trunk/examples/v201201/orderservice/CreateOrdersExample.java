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

package v201201.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201201.Order;
import com.google.api.ads.dfp.v201201.OrderServiceInterface;

/**
 * This example creates new orders. To determine which orders exist, run
 * GetAllOrdersExample.java. To determine which companies are advertisers, run
 * GetCompaniesByStatementExample.java. To get salespeople and traffickers, run
 * GetAllUsersExample.java.
 *
 * Tags: OrderService.createOrders
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateOrdersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201201.ORDER_SERVICE);

      // Set the advertiser (company), salesperson, and trafficker to assign to
      // each order.
      Long advertiserId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");
      Long salespersonId = Long.parseLong("INSERT_SALESPERSON_ID_HERE");
      Long traffickerId = Long.parseLong("INSERT_TRAFFICKER_ID_HERE");

      // Create an array to store local order objects.
      Order[] orders = new Order[5];

      for (int i = 0; i < 5; i++) {
        Order order = new Order();
        order.setName("Order #" + i);
        order.setAdvertiserId(advertiserId);
        order.setSalespersonId(salespersonId);
        order.setTraffickerId(traffickerId);

        orders[i] = order;
      }

      // Create the orders on the server.
      orders = orderService.createOrders(orders);

      if (orders != null) {
        for (Order order : orders) {
          System.out.println("An order with ID \""
              + order.getId() + "\" and named \"" + order.getName() + "\" was created.");
        }
      } else {
        System.out.println("No orders created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
