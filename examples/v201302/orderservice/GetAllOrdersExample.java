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

package v201302.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.Order;
import com.google.api.ads.dfp.v201302.OrderPage;
import com.google.api.ads.dfp.v201302.OrderServiceInterface;
import com.google.api.ads.dfp.v201302.Statement;

/**
 * This example gets all orders. To create orders, run
 * CreateOrdersExample.java.
 *
 * Tags: OrderService.getOrdersByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllOrdersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201302.ORDER_SERVICE);

      // Sets defaults for page and filter.
      OrderPage page = new OrderPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all orders.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get orders by statement.
        page = orderService.getOrdersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Order order : page.getResults()) {
            System.out.println(i + ") Order with ID \""
                + order.getId() + "\", name \"" + order.getName()
                + "\", and advertiser ID \"" + order.getAdvertiserId()
                + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
