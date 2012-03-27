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

package v201203.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201203.StatementBuilder;
import com.google.api.ads.dfp.v201203.LineItem;
import com.google.api.ads.dfp.v201203.LineItemPage;
import com.google.api.ads.dfp.v201203.LineItemServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * This code example shows how to get recently updated line items. To create
 * line items, run CreateLineItemsExample.java. To determine which orders exist,
 * run GetAllOrdersExample.java.
 *
 * Tags: LineItemService.getLineItemsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetRecentlyUpdatedLineItemsExample {
  private static final SimpleDateFormat DATE_TIME_FORMAT =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201203.LINEITEM_SERVICE);

      // Set the ID of the order to get line items from.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      Calendar now = Calendar.getInstance();
      now.add(Calendar.DATE, -3);
      Date threeDaysAgo = now.getTime();

      // Create statement to only select line items for the given order that
      // have been modified in the last 3 days.
      Statement filterStatement =
          new StatementBuilder(
              "WHERE lastModifiedDateTime >= :dateTimeString AND orderId = :orderId LIMIT 500")
              .putValue("orderId", orderId)
              .putValue("dateTimeString", DATE_TIME_FORMAT.format(threeDaysAgo)).toStatement();

      // Get line items by statement.
      LineItemPage page = lineItemService.getLineItemsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (LineItem lineItem : page.getResults()) {
          System.out.println(i + ") Line item with ID \""
              + lineItem.getId() + "\", belonging to order ID \""
              + lineItem.getOrderId() + "\", and named \"" + lineItem.getName()
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
