// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201206.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.Creative;
import com.google.api.ads.dfp.v201206.CreativePage;
import com.google.api.ads.dfp.v201206.CreativeServiceInterface;
import com.google.api.ads.dfp.v201206.ImageCreative;
import com.google.api.ads.dfp.v201206.Statement;

/**
 * This example updates the destination URL of all image creatives up to
 * the first 500. To determine which image creatives exist, run
 * GetAllCreativesExample.java.
 *
 * Tags: CreativeService.getCreativesByStatement
 * Tags: CreativeService.updateCreatives
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCreativesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201206.CREATIVE_SERVICE);

      // Create a statement to get all image creatives.
      Statement filterStatement =
          new StatementBuilder("WHERE creativeType = :creativeType LIMIT 500")
              .putValue("creativeType", ImageCreative.class.getSimpleName()).toStatement();

      // Get creatives by statement.
      CreativePage page = creativeService.getCreativesByStatement(filterStatement);

      if (page.getResults() != null) {
        Creative[] creatives = page.getResults();

        // Update each local creative object by changing its destination URL.
        for (Creative creative : creatives) {
          if (creative instanceof ImageCreative) {
            ImageCreative imageCreative = (ImageCreative) creative;
            imageCreative.setDestinationUrl("http://news.google.com");
          }
        }

        // Update the creatives on the server.
        creatives = creativeService.updateCreatives(creatives);

        if (creatives != null) {
          for (Creative creative : creatives) {
            if (creative instanceof ImageCreative) {
              ImageCreative imageCreative = (ImageCreative) creative;
              System.out.println("An image creative with ID \"" + imageCreative.getId()
                  + "\" and destination URL \"" + imageCreative.getDestinationUrl()
                  + "\" was updated.");
            }
          }
        } else {
          System.out.println("No creatives updated.");
        }
      } else {
        System.out.println("No creatives found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
