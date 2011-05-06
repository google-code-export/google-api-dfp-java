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

package v201004.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.LongParam;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemPage;
import com.google.api.ads.dfp.v201004.LineItemServiceInterface;
import com.google.api.ads.dfp.v201004.String_ParamMapEntry;

/**
 * This example gets all line items for the given order. The statement
 * retrieves up to the maximum page size limit of 500. To create line items,
 * run CreateLineItemsExample.java.
 */
public class GetLineItemsByStatementExample {
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

      // Create bind parameters map.
      String_ParamMapEntry[] paramMap = new String_ParamMapEntry[] {
          new String_ParamMapEntry("orderId", new LongParam(null, orderId))
      };

      // Create a statement to only select line items from a given order.
      Statement filterStatement = new Statement("WHERE orderId = :orderId LIMIT 500", paramMap);

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