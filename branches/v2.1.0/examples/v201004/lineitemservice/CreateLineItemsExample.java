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
import com.google.api.ads.dfp.v201004.CostType;
import com.google.api.ads.dfp.v201004.CreativeRotationType;
import com.google.api.ads.dfp.v201004.Date;
import com.google.api.ads.dfp.v201004.DateTime;
import com.google.api.ads.dfp.v201004.InventoryTargeting;
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemServiceInterface;
import com.google.api.ads.dfp.v201004.LineItemType;
import com.google.api.ads.dfp.v201004.Money;
import com.google.api.ads.dfp.v201004.Size;
import com.google.api.ads.dfp.v201004.Targeting;
import com.google.api.ads.dfp.v201004.UnitType;

/**
 * This example creates new line items. To determine which line items exist,
 * run GetAllLineItemsExample.java.
 */
public class CreateLineItemsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201004.LINEITEM_SERVICE);

      // Set the order that all created line items will belong to and the ad
      // unit ID to target.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      String[] targetAdUnitIds = new String[] {"INSERT_AD_UNIT_ID_HERE"};

      // Create an array to store local line item objects.
      LineItem[] lineItems = new LineItem[5];

      for (int i = 0; i < 5; i++) {
        LineItem lineItem = new LineItem();
        lineItem.setName("Line item #" + i);
        lineItem.setOrderId(orderId);
        lineItem.setTargeting(new Targeting(new InventoryTargeting(targetAdUnitIds, null, null)));
        lineItem.setLineItemType(LineItemType.STANDARD);

        // Set the creative rotation type to even.
        lineItem.setCreativeRotationType(CreativeRotationType.EVEN);

        // Set the size of creatives that can be associated with this line item.
        lineItem.setCreativeSizes(new Size[] {new Size(300, 250, false)});

        // Set the length of the line item to run.
        lineItem.setStartDateTime(new DateTime(new Date(2010, 9, 1), 0, 0, 0, null));
        lineItem.setEndDateTime(new DateTime(new Date(2010, 9, 30), 0, 0, 0, null));

        // Set the cost per unit to $2.
        lineItem.setCostType(CostType.CPM);
        lineItem.setCostPerUnit(new Money("USD", 2000000L));

        // Set the number of units bought to 500,000 so that the budget is
        // $1,000.
        lineItem.setUnitsBought(500000L);
        lineItem.setUnitType(UnitType.IMPRESSIONS);

        lineItems[i] = lineItem;
      }

      // Create the line items on the server.
      lineItems = lineItemService.createLineItems(lineItems);

      if (lineItems != null) {
        for (LineItem lineItem : lineItems) {
          System.out.println("A line item with ID \""
                + lineItem.getId() + "\", belonging to order ID \""
                + lineItem.getOrderId() + "\", and named \"" + lineItem.getName()
                + "\" was created.");
        }
      } else {
        System.out.println("No line items created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
