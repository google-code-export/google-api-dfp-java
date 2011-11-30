// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201111.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201111.Statement;
import com.google.api.ads.dfp.v201111.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201111.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201111.LineItemCreativeAssociationServiceInterface;

/**
 * This example updates the destination URL of all LICAs up to the first
 * 500. To determine which LICAs exist, run GetAllLicasExample.java.
 *
 * Tags: LineItemCreativeAssociationService.getLineItemCreativeAssociationsByStatement
 * Tags: LineItemCreativeAssociationService.updateLineItemCreativeAssociations
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateLicasExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201111.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Create a statement to get all LICAs.
      Statement filterStatement = new Statement("LIMIT 500", null);

      // Get LICAs by statement.
      LineItemCreativeAssociationPage page =
          licaService.getLineItemCreativeAssociationsByStatement(filterStatement);

      if (page.getResults() != null) {
        LineItemCreativeAssociation[] licas = page.getResults();

        // Update each local LICA object by changing its destination URL.
        for (LineItemCreativeAssociation lica : licas) {
          lica.setDestinationUrl("http://news.google.com");
        }

        // Update the LICAs on the server.
        licas = licaService.updateLineItemCreativeAssociations(licas);

        if (licas != null) {
          for (LineItemCreativeAssociation lica : licas) {
            System.out.println("LICA with line item ID \"" + lica.getLineItemId()
                + "\", creative ID \"" + lica.getCreativeId()
                + "\", and destination URL \"" + lica.getDestinationUrl()
                + "\" was updated.");
          }
        } else {
          System.out.println("No LICAs updated.");
        }
      } else {
        System.out.println("No LICAs found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
