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

package v201002.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.DeactivateLineItemCreativeAssociations;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociationStatus;
import com.google.api.ads.dfp.v201002.UpdateResult;

/**
 * This example deactivates all LICAs for the line item. To determine which
 * LICAs exist, run GetAllLicasExample.java.
 */
public class DeactivateLicasExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201002.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Set the line item to get LICAs by.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

      // Create filter text to select active LICAs for a given line item.
      String filterText = "WHERE lineItemId = '" + lineItemId + "' and status = '"
          + LineItemCreativeAssociationStatus.ACTIVE + "'";

      // Sets defaults for page and filter.
      LineItemCreativeAssociationPage page = new LineItemCreativeAssociationPage();
      Filter filter = new Filter();
      int offset = 0;

      do {
        // Create a filter to page through active LICAs.
        filter.setText(filterText + " LIMIT 500 OFFSET " + offset);

        // Get LICAs by filter.
        page = licaService.getLineItemCreativeAssociationsByFilter(filter);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (LineItemCreativeAssociation lica : page.getResults()) {
            System.out.println(i + ") LICA with line item ID \"" + lica.getLineItemId()
                + "\", creative ID \"" + lica.getCreativeId()
                + "\", and status \"" + lica.getStatus()
                + "\" will be deactivated.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);


      System.out.println("Number of LICAs to be deactivated: " + page.getTotalResultSetSize());

      // Create action filter.
      filter.setText(filterText);

      // Create action.
      DeactivateLineItemCreativeAssociations action = new DeactivateLineItemCreativeAssociations();

      // Perform action.
      UpdateResult result = licaService.performLineItemCreativeAssociationAction(action, filter);

      // Display results.
      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of LICAs deactivated: " + result.getNumChanges());
      } else {
        System.out.println("No LICAs were deactivated.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
