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

package v201306.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201306.LineItemPage;
import com.google.api.ads.dfp.v201306.LineItemServiceInterface;
import com.google.api.ads.dfp.v201306.LineItemSummary;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This example gets all line items. To create line items, run
 * CreateLineItemsExample.java.
 *
 * Tags: LineItemService.getLineItemsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllLineItemsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201306.LINEITEM_SERVICE);

      // Sets defaults for page and filterStatement.
      LineItemPage page = new LineItemPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all line items.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get line items by statement.
        page = lineItemService.getLineItemsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (LineItemSummary lineItem : page.getResults()) {
            System.out.println(i + ") Line item with ID \""
                + lineItem.getId() + "\", belonging to order ID \""
                + lineItem.getOrderId() + "\", and named \"" + lineItem.getName()
                + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
