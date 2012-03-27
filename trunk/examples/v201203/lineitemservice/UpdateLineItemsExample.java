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
import com.google.api.ads.dfp.v201203.DeliveryRateType;
import com.google.api.ads.dfp.v201203.LineItem;
import com.google.api.ads.dfp.v201203.LineItemPage;
import com.google.api.ads.dfp.v201203.LineItemServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;

/**
 * This example updates the delivery rate of all line items up to the first 500.
 * To determine which line items exist, run GetAllLineItemsExample.java. To
 * determine which order exist, run GetAllOrdersExample.java.
 *
 * Tags: LineItemService.getLineItemsByStatement
 * Tags: LineItemService.updateLineItems
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateLineItemsExample {
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

      // Create a statement to get line items with even delivery rates.
      Statement filterStatement = new StatementBuilder(
          "WHERE deliveryRateType = :deliveryRateType AND orderId = :orderId LIMIT 500")
              .putValue("orderId", orderId)
              .putValue("deliveryRateType", DeliveryRateType.EVENLY.toString()).toStatement();

      // Get line items by statement.
      LineItemPage page = lineItemService.getLineItemsByStatement(filterStatement);

      if (page.getResults() != null) {
        LineItem[] lineItems = page.getResults();

        // Update each local line item object by changing its delivery rate.
        for (int i = 0; i < lineItems.length; i++) {
          // Archived line items cannot be updated.
          if (lineItems[i].getIsArchived()) {
            lineItems[i] = null;
          } else {
            lineItems[i].setDeliveryRateType(DeliveryRateType.AS_FAST_AS_POSSIBLE);
          }
        }

        // Update the line items on the server.
        lineItems = lineItemService.updateLineItems(lineItems);

        if (lineItems != null) {
          for (LineItem lineItem : lineItems) {
            System.out.println("A line item with ID \""
                + lineItem.getId() + "\", belonging to order ID \""
                + lineItem.getOrderId() + "\", named \"" + lineItem.getName()
                + "\", and having delivery rate \"" + lineItem.getDeliveryRateType()
                + "\" was updated.");
          }
        } else {
          System.out.println("No line items updated.");
        }
      } else {
        System.out.println("No line items found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
