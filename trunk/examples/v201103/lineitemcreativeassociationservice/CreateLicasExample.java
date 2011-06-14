// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201103.lineitemcreativeassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201103.CreativeServiceInterface;
import com.google.api.ads.dfp.v201103.LineItemCreativeAssociation;
import com.google.api.ads.dfp.v201103.LineItemCreativeAssociationServiceInterface;

/**
 * This example creates new line item creative associations (LICAs) for an
 * existing line item and a set of creative ids. For small business networks,
 * the creative ids must represent new or copied creatives as creatives cannot
 * be used for more than one line item. For premium solution networks, the
 * creative ids can represent any creatvie. To copy creatives, run
 * CopyImageCreativesExample.java. To determine which LICAs exist, run
 * GetAllLicasExample.java.
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
          user.getService(DfpService.V201103.LINEITEMCREATIVEASSOCIATION_SERVICE);

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201103.CREATIVE_SERVICE);

      // Set the line item ID and creative IDs to associate.
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      Long[] creativeIds = new Long[] {Long.parseLong("INSERT_CREATIVE_ID_HERE")};

      // Create an array to store local LICA objects.
      LineItemCreativeAssociation[] licas = new LineItemCreativeAssociation[creativeIds.length];

      // For each line item, associate it with the given creative.
      int i = 0;
      for (Long creativeId : creativeIds) {
        LineItemCreativeAssociation lica = new LineItemCreativeAssociation();
        lica.setCreativeId(creativeId);
        lica.setLineItemId(lineItemId);
        licas[i++] = lica;
      }

      // Create the LICAs on the server.
      licas = licaService.createLineItemCreativeAssociations(licas);

      if (licas != null) {
        for (LineItemCreativeAssociation lica : licas) {
          System.out.println("A LICA with line item ID \"" + lica.getLineItemId()
              + "\", creative ID \"" + lica.getCreativeId() + "\", and status \""
              + lica.getStatus() + "\" was created.");
        }
      } else {
        System.out.println("No LICAs created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
