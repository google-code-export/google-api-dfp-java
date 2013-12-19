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

package v201311.creativewrapperservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201311.CreativeWrapper;
import com.google.api.ads.dfp.v201311.CreativeWrapperHtmlSnippet;
import com.google.api.ads.dfp.v201311.CreativeWrapperOrdering;
import com.google.api.ads.dfp.v201311.CreativeWrapperServiceInterface;

/**
 * This example creates a new creative wrapper. Creative wrappers must be
 * associated with a LabelType.CREATIVE_WRAPPER label and applied to ad units by
 * AdUnit.appliedLabels. To determine which creative wrappers exist, run
 * GetAllCreativeWrappers.java.
 *
 * Tags: CreativeWrapperService.createCreativeWrappers
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCreativeWrappersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeWrapperService.
      CreativeWrapperServiceInterface creativeWrapperService =
          user.getService(DfpService.V201311.CREATIVE_WRAPPER_SERVICE);

      Long labelId = Long.parseLong("INSERT_CREATIVE_WRAPPER_LABEL_ID_HERE");
      
      // Create a creative wrapper.
      CreativeWrapper creativeWrapper1 = new CreativeWrapper();
      // A label can only be associated with one creative wrapper.
      creativeWrapper1.setLabelId(labelId);
      creativeWrapper1.setOrdering(CreativeWrapperOrdering.INNER);
      creativeWrapper1.setHeader(
          new CreativeWrapperHtmlSnippet("<b>My creative wrapper header</b>"));
      creativeWrapper1.setFooter(
          new CreativeWrapperHtmlSnippet("<b>My creative wrapper footer</b>"));

      // Create the creative wrappers on the server.
      CreativeWrapper[] creativeWrappers =
          creativeWrapperService.createCreativeWrappers(new CreativeWrapper[] {creativeWrapper1});

      for (CreativeWrapper creativeWrapper : creativeWrappers) {
        System.out.printf(
            "Creative wrapper with ID \"%s\" applying to label \"%s\" was created.\n",
            creativeWrapper.getId(), creativeWrapper.getLabelId());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
