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

package v201002.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.v201002.LineItemCreativeAssociationServiceInterface;

/**
 * This example gets all line item creative associations for a given line
 * item ID. The filter retrieves up to the maximum page size limit of 500. To
 * create LICAs, run CreateLicasExample.java.
 */
public class GetLicasByFilterExample {
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

      // Create a filter to only select LICAs for the given lineItem ID.
      Filter filter = new Filter("WHERE lineItemId = '" + lineItemId + "' LIMIT 500");

      // Get LICAs by filter.
     LineItemCreativeAssociationPage page =
         licaService.getLineItemCreativeAssociationsByFilter(filter);

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

     System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
