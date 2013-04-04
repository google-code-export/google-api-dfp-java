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

package v201302.creativesetservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201302.LineItemCreativeAssociationServiceInterface;

/**
 * This code example creates a line item creative association for a creative
 * set. To create creative sets, run CreateCreativeSetExample.java. To create
 * creatives, run CreateCreativesExample.java. To determine which LICAs exist,
 * run GetAllLicasExample.java.
 *
 * Tags: LineItemCreativeAssociationService.createLineItemCreativeAssociations
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class AssociateCreativeSetToLineItemExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemCreativeAssociationService.
      LineItemCreativeAssociationServiceInterface licaService =
          user.getService(DfpService.V201302.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Set the line item ID and creative set ID to associate.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      Long creativeSetId = Long.parseLong("INSERT_CREATIVE_SET_ID_HERE");

      LineItemCreativeAssociation lica = new LineItemCreativeAssociation();
      lica.setCreativeSetId(creativeSetId);
      lica.setLineItemId(lineItemId);

      // Create the LICAs on the server.
      lica = licaService.createLineItemCreativeAssociations(
          new LineItemCreativeAssociation[] {lica})[0];

      System.out.println("A LICA with line item ID \"" + lica.getLineItemId()
          + "\" and creative set ID \"" + lica.getCreativeSetId() + "\" was created.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
