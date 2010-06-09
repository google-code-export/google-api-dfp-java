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

package v201004.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.ActivateLineItems;
import com.google.api.ads.dfp.v201004.ComputedStatus;
import com.google.api.ads.dfp.v201004.LineItemPage;
import com.google.api.ads.dfp.v201004.LineItemServiceInterface;
import com.google.api.ads.dfp.v201004.LineItemSummary;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.UpdateResult;

/**
 * This example activates all line items for the given order. To be activated,
 * line items need to be in the approved state and have at least one creative
 * associated with them. To approve line items, approve the order to which they
 * belong by running ApproveOrdersExample.java. To create LICAs, run
 * CreateLicasExample.java. To determine which line items exist, run
 * GetAllLineItemsExample.java.
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
          user.getService(DfpService.V201004.LINEITEM_SERVICE);

      // Set the ID of the order to get line items from.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      // Create statement text to select approved line items from a given order.
      String statementText =
          "WHERE orderId = '" + orderId + "' and status = '" + ComputedStatus.NEEDS_CREATIVES + "'";

      // Set defaults for page and filterStatement.
      LineItemPage page = new LineItemPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to page through approved line items.
        filterStatement.setQuery(statementText + " LIMIT 500 OFFSET " + offset);

        // Get line items by statement.
        page = lineItemService.getLineItemsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (LineItemSummary lineItem : page.getResults()) {
            System.out.println(i + ") Line item with ID \""
                + lineItem.getId() + "\", belonging to order ID \""
                + lineItem.getOrderId() + "\", and name \"" + lineItem.getName()
                + "\" will be activated.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of line items to be activated: " + page.getTotalResultSetSize());

      // Modify statement for action.
      filterStatement.setQuery(statementText);

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
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
