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

package v201306.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.MediaUtils;
import com.google.api.ads.dfp.v201306.CreativeServiceInterface;
import com.google.api.ads.dfp.v201306.CustomCreative;
import com.google.api.ads.dfp.v201306.CustomCreativeAsset;
import com.google.api.ads.dfp.v201306.Size;

/**
 * This example creates a custom creative for a given advertiser. This feature
 * is only available to DFP premium solution networks. To determine which
 * companies are advertisers, run GetCompaniesByStatementExample.java. To
 * determine which creatives already exist, run GetAllCreativesExample.java.
 *
 * Tags: CreativeService.createCreative
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCustomCreativeExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201306.CREATIVE_SERVICE);

      // Set the ID of the advertiser (company) that all creatives will be
      // assigned to.
      Long advertiserId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");

      // Create the local custom creative object.
      CustomCreative customCreative = new CustomCreative();
      customCreative.setName("Custom creative");
      customCreative.setAdvertiserId(advertiserId);
      customCreative.setDestinationUrl("http://google.com");

      // Set the custom creative image asset.
      CustomCreativeAsset customCreativeAsset = new CustomCreativeAsset();
      customCreativeAsset.setMacroName("IMAGE_ASSET");
      customCreativeAsset.setAssetByteArray(MediaUtils.getAssetDataFromUrl(
          "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg"));
      // Filenames must be unique.
      customCreativeAsset.setFileName(String.format("image%s.jpg", System.currentTimeMillis()));
      customCreative.setCustomCreativeAssets(new CustomCreativeAsset[] {customCreativeAsset});

      // Set the HTML snippet using the custom creative asset macro.
      customCreative.setHtmlSnippet("<a href='%%CLICK_URL_UNESC%%%%DEST_URL%%'>" +
          "<img src='%%FILE:" + customCreativeAsset.getMacroName() + "%%'/>" +
          "</a><br>Click above for great deals!");

      // Set the creative size.
      customCreative.setSize(new Size(300, 250, false));

      // Create the custom creative on the server.
      customCreative = (CustomCreative) creativeService.createCreative(customCreative);

      if (customCreative != null) {
        System.out.println("A custom creative with ID \"" + customCreative.getId()
            + "\", name \"" + customCreative.getName()
            + "\", and size {" + customCreative.getSize().getWidth()
            + ", " + customCreative.getSize().getHeight() + "} was created and\n"
            + " can be previewed at: " + customCreative.getPreviewUrl());
      } else {
        System.out.println("No creative created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
