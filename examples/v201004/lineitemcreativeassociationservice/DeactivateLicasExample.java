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

package v201004.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.DeactivateLineItemCreativeAssociations;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.v201004.LineItemCreativeAssociationStatus;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.UpdateResult;

/**
 * This example deactivates all LICAs for the line item. To determine which
 * LICAs exist, run GetAllLicasExample.java. To determine which line items
 * exist, run GetAllLineItems.java
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
          user.getService(DfpService.V201004.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Set the line item to get LICAs by.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

      // Create statement text to select active LICAs for a given line item.
      String statementText = "WHERE lineItemId = '" + lineItemId + "' and status = '"
          + LineItemCreativeAssociationStatus.ACTIVE + "'";

      // Set defaults for page and filterStatement.
      LineItemCreativeAssociationPage page = new LineItemCreativeAssociationPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to page through active LICAs.
        filterStatement.setQuery(statementText + " LIMIT 500 OFFSET " + offset);

        // Get LICAs by statement.
        page = licaService.getLineItemCreativeAssociationsByStatement(filterStatement);

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

      // Modify statement for action.
      filterStatement.setQuery(statementText);

      // Create action.
      DeactivateLineItemCreativeAssociations action = new DeactivateLineItemCreativeAssociations();

      // Perform action.
      UpdateResult result =
          licaService.performLineItemCreativeAssociationAction(action, filterStatement);

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
