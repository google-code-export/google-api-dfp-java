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

package v201004.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.LineItem;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.v201004.LineItemPage;
import com.google.api.ads.dfp.v201004.LineItemServiceInterface;
import com.google.api.ads.dfp.v201004.Statement;

/**
 * This example creates new line item creative associations (LICAs) from a
 * given creative and existing line items belonging to an order. To determine
 * which creatives exist, run GetAllCreativesExample.java. To determine which
 * orders exist, run GetAllOrdersExample.java. To determine which LICAs exist,
 * run GetAllLicasExample.java.
 */
public class CreateLicasExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201004.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201004.LINEITEM_SERVICE);

      // Set the order to get line items from and the creative to associate
      // them with.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      Long creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");

      // Get first 500 line items for the given order. To get more than 500 line
      // items, see GetAllLineItemsExample.java.
      Statement filter = new Statement("WHERE orderId = '" + orderId + "' LIMIT 500", null);
      LineItemPage page = lineItemService.getLineItemsByStatement(filter);

      if (page.getResults() != null) {
        LineItem[] lineItems = page.getResults();

        // Create an array to store local LICA objects.
        LineItemCreativeAssociation[] licas = new LineItemCreativeAssociation[lineItems.length];

        // For each line item, associate it with the given creative.
        for (int i = 0;  i < lineItems.length; i++) {
          LineItemCreativeAssociation lica = new LineItemCreativeAssociation();
          lica.setCreativeId(creativeId);
          lica.setLineItemId(lineItems[i].getId());

          licas[i] = lica;
        }

        // Create the LICAs on the server.
        licas = licaService.createLineItemCreativeAssociations(licas);

        if (licas != null) {
          for (LineItemCreativeAssociation lica : licas) {
            System.out.println("A LICA with line item ID \"" + lica.getLineItemId()
                + "\", creative ID \"" + lica.getCreativeId()
                + "\", and status \"" + lica.getStatus()
                + "\" was created.");
          }
        } else {
          System.out.println("No LICAs created.");
        }
      } else {
        System.out.println("No line items to associate the creative with.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
