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

package v201002.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.Order;
import com.google.api.ads.dfp.v201002.OrderPage;
import com.google.api.ads.dfp.v201002.OrderServiceInterface;

/**
 * This example gets all orders for a given advertiser. The filter retrieves
 * up to the maximum page size limit of 500. To create orders, run
 * CreateOrdersExample.java.
 */
public class GetOrdersByFilterExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService =
          user.getService(DfpService.V201002.ORDER_SERVICE);

      // Set the name of the advertiser to get orders for.
      String advertiserId = "INSERT_ADVERTISER_ID_HERE";

      // Create a filter to only select orders for a given advertiser.
      Filter filter = new Filter("WHERE advertiserId = '" + advertiserId + "' LIMIT 500");

      // Get orders by filter.
      OrderPage page = orderService.getOrdersByFilter(filter);

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

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
