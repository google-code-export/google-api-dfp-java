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

package v201103.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201103.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201103.LineItemCreativeAssociationServiceInterface;

/**
 * This example gets a line item creative association (LICA) by the line
 * item and creative ID. To determine which line items exist, run
 * GetAllLineItemsExample.java. To determine which creatives exit, run
 * GetAllCreativesExample.java.
 */
public class GetLicaExample {
  public static void main(final String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201103.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Set the line item and creative ID to use to retrieve the LICA.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      Long creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");

      // Get the LICA.
      LineItemCreativeAssociation lica =
          licaService.getLineItemCreativeAssociation(lineItemId, creativeId);

      if (lica != null) {
        System.out.println("LICA with line item ID \"" + lica.getLineItemId()
            + "\", creative ID \"" + lica.getCreativeId()
            + "\", and status \"" + lica.getStatus()
            + "\" was found.");
      } else {
        System.out.println("No LICA found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
