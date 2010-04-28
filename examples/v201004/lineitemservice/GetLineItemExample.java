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
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemServiceInterface;

/**
 * This example gets a line item by its ID. To determine which line items
 * exist, run GetAllLineItemsExample.java.
 */
public class GetLineItemExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201004.LINEITEM_SERVICE);

      // Set the ID of the line item to get.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

      // Get the line item.
      LineItem lineItem = lineItemService.getLineItem(lineItemId);

      if (lineItem != null) {
        System.out.println("Line item with ID \""
                + lineItem.getId() + "\", belonging to order ID \""
                + lineItem.getOrderId() + "\", and named \"" + lineItem.getName()
                + "\" was found.");
      } else {
        System.out.println("No line item found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
