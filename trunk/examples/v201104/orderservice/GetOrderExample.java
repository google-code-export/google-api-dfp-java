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

package v201104.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.Order;
import com.google.api.ads.dfp.v201104.OrderServiceInterface;

/**
 * This example gets an order by its ID. To determine which orders
 * exist, run GetAllOrdersExample.java.
 *
 * Tags: OrderService.getOrder
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetOrderExample {
  public static void main(final String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201104.ORDER_SERVICE);

      // Set the ID of the order to get.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      // Get the order.
      Order order = orderService.getOrder(orderId);

      if (order != null) {
        System.out.println("An order with ID \""
            + order.getId() + "\", name \"" + order.getName()
            + "\", and advertiser ID \"" + order.getAdvertiserId()
            + "\" was found.");
      } else {
        System.out.println("No order found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
