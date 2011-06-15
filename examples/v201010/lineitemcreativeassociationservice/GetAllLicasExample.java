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

package v201010.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201010.Statement;
import com.google.api.ads.dfp.v201010.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201010.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201010.LineItemCreativeAssociationServiceInterface;

/**
 * This example gets all line item creative associations (LICA). To create
 * LICAs, run CreateLicasExample.java.
 *
 * Tags: LineItemCreativeAssociationService.getLineItemCreativeAssociationsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllLicasExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201010.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Sets defaults for page and filterStatement.
      LineItemCreativeAssociationPage page = new LineItemCreativeAssociationPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all LICAs.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get LICAs by statement.
        page = licaService.getLineItemCreativeAssociationsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (LineItemCreativeAssociation lica : page.getResults()) {
            System.out.println(i + ") LICA with line item ID \"" + lica.getLineItemId()
                + "\", creative ID \"" + lica.getCreativeId()
                + "\", and status \"" + lica.getStatus()
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
