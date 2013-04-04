// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201302.orderservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.v201302.ApproveAndOverbookOrders;
import com.google.api.ads.dfp.v201302.Order;
import com.google.api.ads.dfp.v201302.OrderPage;
import com.google.api.ads.dfp.v201302.OrderServiceInterface;
import com.google.api.ads.dfp.v201302.OrderStatus;
import com.google.api.ads.dfp.v201302.Statement;
import com.google.api.ads.dfp.v201302.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This example approves and overbooks all eligible draft and pending orders. To
 * determine which orders exist, run GetAllOrdersExample.java.
 *
 * Tags: OrderService.getOrdersByStatement, OrderService.performOrderAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ApproveOrdersExample {
  private static final SimpleDateFormat DATE_TIME_FORMAT =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the OrderService.
      OrderServiceInterface orderService = user.getService(DfpService.V201302.ORDER_SERVICE);

      // Create statement text to select all draft and pending orders that
      // haven't ended and aren't archived.
      String statementText =
          "WHERE status IN ('" + OrderStatus.DRAFT + "','" + OrderStatus.PENDING_APPROVAL
              + "') AND endDateTime >= :today AND isArchived = FALSE LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(statementText).putValue("today",
              DATE_TIME_FORMAT.format(new Date())).toStatement();

      // Set defaults for page and offset.
      OrderPage page = new OrderPage();
      int offset = 0;
      int i = 0;
      List<Long> orderIds = new ArrayList<Long>();

      do {
        // Create a statement to page through draft orders.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get orders by statement.
        page = orderService.getOrdersByStatement(filterStatement);

        if (page.getResults() != null) {
          for (Order order : page.getResults()) {
            System.out.println(i + ") Order with ID \""
                + order.getId() + "\", name \"" + order.getName()
                + "\", and status \"" + order.getStatus()
                + "\" will be approved.");
            orderIds.add(order.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of orders to be approved: " + orderIds.size());

      if (orderIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(orderIds, ",") + ")");

        // Create action.
        ApproveAndOverbookOrders action = new ApproveAndOverbookOrders();

        // Perform action.
        UpdateResult result = orderService.performOrderAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of orders approved: " + result.getNumChanges());
        } else {
          System.out.println("No orders were approved.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
