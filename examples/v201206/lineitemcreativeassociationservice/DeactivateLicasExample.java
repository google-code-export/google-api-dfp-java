// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201206.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.DeactivateLineItemCreativeAssociations;
import com.google.api.ads.dfp.v201206.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201206.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201206.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.v201206.LineItemCreativeAssociationStatus;
import com.google.api.ads.dfp.v201206.Statement;
import com.google.api.ads.dfp.v201206.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates all LICAs for the line item. To determine which
 * LICAs exist, run GetAllLicasExample.java. To determine which line items
 * exist, run GetAllLineItemsExample.java
 *
 * Tags: LineItemCreativeAssociationService.getLineItemCreativeAssociationsByStatement
 * Tags: LineItemCreativeAssociationService.performLineItemCreativeAssociationAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
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
          user.getService(DfpService.V201206.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Set the line item to get LICAs by.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

      // Create statement text to select active LICAs for a given line item.
      String statementText = "WHERE lineItemId = :lineItemId and status = :status LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("").putValue("lineItemId", lineItemId).putValue("status",
              LineItemCreativeAssociationStatus.ACTIVE.toString()).toStatement();

      // Set defaults for page and offset.
      LineItemCreativeAssociationPage page = new LineItemCreativeAssociationPage();
      int offset = 0;
      List<Long> creativeIds = new ArrayList<Long>();

      do {
        // Create a statement to page through active LICAs.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get LICAs by statement.
        page = licaService.getLineItemCreativeAssociationsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (LineItemCreativeAssociation lica : page.getResults()) {
            System.out.println(i + ") LICA with line item ID \"" + lica.getLineItemId()
                + "\", creative ID \"" + lica.getCreativeId() + "\", and status \""
                + lica.getStatus() + "\" will be deactivated.");
            creativeIds.add(lica.getCreativeId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of LICAs to be deactivated: " + creativeIds.size());

      if (creativeIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE lineItemId = :lineItemId and creativeId IN ("
            + StringUtils.join(creativeIds, ",") + ")");

        // Create action.
        DeactivateLineItemCreativeAssociations action =
            new DeactivateLineItemCreativeAssociations();

        // Perform action.
        UpdateResult result =
            licaService.performLineItemCreativeAssociationAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of LICAs deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No LICAs were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
