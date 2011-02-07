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

package v201101.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.MediaUtils;
import com.google.api.ads.dfp.lib.utils.v201101.StatementBuilder;
import com.google.api.ads.dfp.v201101.Creative;
import com.google.api.ads.dfp.v201101.CreativePage;
import com.google.api.ads.dfp.v201101.CreativeServiceInterface;
import com.google.api.ads.dfp.v201101.ImageCreative;

import org.apache.commons.lang.StringUtils;

/**
 * This example copies a given set of image creatives. This would typically be
 * done to reuse creatives in a small business network. To determine which
 * creatives exist, run GetAllCreatives.java.
 */
public class CopyImageCreativesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201101.CREATIVE_SERVICE);

      Long[] imageCreativeIds = new Long[] {Long.parseLong("INSERT_IMAGE_CREATIVE_ID_HERE")};

      // Create the statement to filter image creatives by id.
      StatementBuilder statementBuilder =
          new StatementBuilder("WHERE id IN ( " + StringUtils.join(imageCreativeIds, ',')
              + ") and creativeType = :creativeType LIMIT 500").putValue("creativeType",
              ImageCreative.class.getSimpleName());

      // Retrieve all creatives which match.
      CreativePage page =
          creativeService.getCreativesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        Creative[] creatives = page.getResults();
        long[] oldIds = new long[creatives.length];
        for (int i = 0; i < creatives.length; i++) {
          ImageCreative imageCreative = (ImageCreative) creatives[i];
          oldIds[i] = imageCreative.getId();
          imageCreative.setId(null);
          imageCreative.setAdvertiserId(imageCreative.getAdvertiserId());
          imageCreative.setName(imageCreative.getName() + " (Copy #" + System.currentTimeMillis()
              + ")");
          imageCreative.setImageByteArray(MediaUtils.getAssetDataFromUrl(imageCreative
              .getImageUrl()));
          creatives[i] = imageCreative;
        }

        // Create the copied creative.
        creatives = creativeService.createCreatives(creatives);

        // Display copied creatives.
        for (int i = 0; i < creatives.length; i++) {
          System.out.println("Image creative with ID \"" + oldIds[i] + "\" copied to ID \""
              + creatives[i].getId() + "\".");
        }
      } else {
        System.out.println("No creatives were copied.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
