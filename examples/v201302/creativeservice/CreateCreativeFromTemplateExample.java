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

package v201302.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.MediaUtils;
import com.google.api.ads.dfp.v201302.AssetCreativeTemplateVariableValue;
import com.google.api.ads.dfp.v201302.BaseCreativeTemplateVariableValue;
import com.google.api.ads.dfp.v201302.CreativeServiceInterface;
import com.google.api.ads.dfp.v201302.LongCreativeTemplateVariableValue;
import com.google.api.ads.dfp.v201302.Size;
import com.google.api.ads.dfp.v201302.StringCreativeTemplateVariableValue;
import com.google.api.ads.dfp.v201302.TemplateCreative;
import com.google.api.ads.dfp.v201302.UrlCreativeTemplateVariableValue;

/**
 * This example creates a new template creative for a given advertiser. To
 * determine which companies are advertisers, run
 * GetCompaniesByStatementExample.java. To determine which creatives already
 * exist, run GetAllCreativesExample.java. To determine which creative templates
 * exist, run GetAllCreativeTemplatesExample.java
 *
 * Tags: CreativeService.createCreatives
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCreativeFromTemplateExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201302.CREATIVE_SERVICE);

      // Set the ID of the advertiser (company) that all creative will be
      // assigned to.
      Long advertiserId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");

      // Use the image banner with optional third party tracking template.
      Long creativeTemplateId = 10000680L;

      // Create the local custom creative object.
      TemplateCreative templateCreative = new TemplateCreative();
      templateCreative.setName("Template creative");
      templateCreative.setAdvertiserId(advertiserId);
      templateCreative.setCreativeTemplateId(creativeTemplateId);

      // Set the creative size.
      templateCreative.setSize(new Size(300, 250, false));

      // Create the asset variable value.
      AssetCreativeTemplateVariableValue assetVariableValue =
          new AssetCreativeTemplateVariableValue();
      assetVariableValue.setUniqueName("Imagefile");
      assetVariableValue.setAssetByteArray(MediaUtils.getAssetDataFromUrl(
          "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg"));
      // Filenames must be unique.
      assetVariableValue.setFileName(String.format("image%s.jpg", System.currentTimeMillis()));

      // Create the image width variable value.
      LongCreativeTemplateVariableValue imageWidthVariableValue =
          new LongCreativeTemplateVariableValue();
      imageWidthVariableValue.setUniqueName("Imagewidth");
      imageWidthVariableValue.setValue(300L);

      // Create the image height variable value.
      LongCreativeTemplateVariableValue imageHeightVariableValue =
          new LongCreativeTemplateVariableValue();
      imageHeightVariableValue.setUniqueName("Imageheight");
      imageHeightVariableValue.setValue(250L);

      // Create the URL variable value.
      UrlCreativeTemplateVariableValue urlVariableValue =
          new UrlCreativeTemplateVariableValue();
      urlVariableValue.setUniqueName("ClickthroughURL");
      urlVariableValue.setValue("www.google.com");

      // Create the target window variable value.
      StringCreativeTemplateVariableValue targetWindowVariableValue =
          new StringCreativeTemplateVariableValue();
      targetWindowVariableValue.setUniqueName("Targetwindow");
      targetWindowVariableValue.setValue("__blank");

      templateCreative.setCreativeTemplateVariableValues(new BaseCreativeTemplateVariableValue[] {
          assetVariableValue, imageWidthVariableValue, imageHeightVariableValue, urlVariableValue,
          targetWindowVariableValue});

      // Create the template creative on the server.
      templateCreative = (TemplateCreative) creativeService.createCreative(templateCreative);

      if (templateCreative != null) {
        System.out.println("A template creative with ID \"" + templateCreative.getId()
            + "\", name \"" + templateCreative.getName() + "\", and type \""
            + templateCreative.getCreativeType() + "\" was created and\n"
            + " can be previewed at: " + templateCreative.getPreviewUrl());
      } else {
        System.out.println("No creative was created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
