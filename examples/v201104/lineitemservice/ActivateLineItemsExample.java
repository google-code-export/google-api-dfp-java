// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201104.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201104.StatementBuilder;
import com.google.api.ads.dfp.v201104.ActivateLineItems;
import com.google.api.ads.dfp.v201104.ComputedStatus;
import com.google.api.ads.dfp.v201104.LineItemPage;
import com.google.api.ads.dfp.v201104.LineItemServiceInterface;
import com.google.api.ads.dfp.v201104.LineItemSummary;
import com.google.api.ads.dfp.v201104.Statement;
import com.google.api.ads.dfp.v201104.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example activates all line items for the given order. To be activated,
 * line items need to be in the approved (needs creatives) state and have at
 * least one creative associated with them. To approve line items, approve the
 * order to which they belong by running ApproveOrdersExample.java. To create
 * LICAs, run CreateLicasExample.java. To determine which line items exist, run
 * GetAllLineItemsExample.java. To determine which orders exist, run
 * GetAllOrdersExample.java.
 *
 * Tags: LineItemService.getLineItemsByStatement
 * Tags: LineItemService.performLineItemAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ActivateLineItemsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201104.LINEITEM_SERVICE);

      // Set the ID of the order to get line items from.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      // Create a statement to only select line items from the specified order
      // that are in the approved (needs creatives) state.
      String statementText = "WHERE orderID = :orderId and status = :status LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("")
              .putValue("orderId", orderId)
              .putValue("status", ComputedStatus.NEEDS_CREATIVES.toString())
              .toStatement();

      // Set defaults for page and offset.
      LineItemPage page = new LineItemPage();
      int offset = 0;
      int i = 0;
      List<Long> lineItemIds = new ArrayList<Long>();

      do {
        // Create a statement to page through approved line items.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get line items by statement.
        page = lineItemService.getLineItemsByStatement(filterStatement);

        if (page.getResults() != null) {
          for (LineItemSummary lineItem : page.getResults()) {
            // Archived line items cannot be activated.
            if (!lineItem.getIsArchived()) {
              System.out.println(i + ") Line item with ID \""
                  + lineItem.getId() + "\", belonging to order ID \""
                  + lineItem.getOrderId() + "\", and name \"" + lineItem.getName()
                  + "\" will be activated.");
              lineItemIds.add(lineItem.getId());
              i++;
            }
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of line items to be activated: " + lineItemIds.size());

      if (lineItemIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(lineItemIds, ",") + ")");

        // Create action.
        ActivateLineItems action = new ActivateLineItems();

        // Perform action.
        UpdateResult result = lineItemService.performLineItemAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of line items activated: " + result.getNumChanges());
        } else {
          System.out.println("No line items were activated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
