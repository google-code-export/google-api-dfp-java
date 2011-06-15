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

package v201101.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.MediaUtils;
import com.google.api.ads.dfp.v201101.Creative;
import com.google.api.ads.dfp.v201101.CreativeServiceInterface;
import com.google.api.ads.dfp.v201101.ImageCreative;
import com.google.api.ads.dfp.v201101.Size;

/**
 * This example creates new image creatives for a given advertiser. To determine
 * which companies are advertisers, run GetCompaniesByStatementExample.java. To
 * determine which creatives already exist, run GetAllCreativesExample.java.
 *
 * Tags: CreativeService.createCreatives
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCreativesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201101.CREATIVE_SERVICE);

      // Set the ID of the advertiser (company) that all creatives will be
      // assigned to.
      Long advertiserId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");

      // Create an array to store local image creative objects.
      Creative[] imageCreatives = new ImageCreative[5];

      for (int i = 0; i < 5; i++) {
        ImageCreative imageCreative = new ImageCreative();
        imageCreative.setName("Image creative #" + i);
        imageCreative.setAdvertiserId(advertiserId);
        imageCreative.setDestinationUrl("http://google.com");
        imageCreative.setImageName("image.jpg");
        imageCreative.setImageByteArray(
            MediaUtils.getAssetDataFromUrl(
                "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg"));
        imageCreative.setSize(new Size(300, 250, false));

        imageCreatives[i] = imageCreative;
      }

      // Create the image creatives on the server.
      imageCreatives = creativeService.createCreatives(imageCreatives);

      if (imageCreatives != null) {
        for (Creative creative : imageCreatives) {
          // Use instanceof to determine what type of creative was returned.
          if (creative instanceof ImageCreative) {
            ImageCreative imageCreative = (ImageCreative) creative;
            System.out.println("An image creative with ID \"" + imageCreative.getId()
                + "\", name \"" + imageCreative.getName()
                + "\", and size {" + imageCreative.getSize().getWidth()
                + ", " + imageCreative.getSize().getHeight() + "} was created and\n"
                + " can be previewed at: " + imageCreative.getPreviewUrl());
          } else {
            System.out.println("A creative with ID \"" + creative.getId()
                + "\", name \"" + creative.getName()
                + "\", and type \"" + creative.getCreativeType() + "\" was created.");
          }
        }
      } else {
        System.out.println("No creatives created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
