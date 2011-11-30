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

package v201111.creativetemplateservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201111.CreativeTemplate;
import com.google.api.ads.dfp.v201111.CreativeTemplateServiceInterface;
import com.google.api.ads.dfp.v201111.CreativeTemplateVariable;

/**
 * This example gets a creative by its ID. To determine which creative templates
 * exist, run GetAllCreativeTemplatesExample.java.
 *
 * Tags: CreativeTemplateService.getCreativeTemplate
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCreativeTemplateExample {
  public static void main(final String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeTemplateService.
      CreativeTemplateServiceInterface creativeTemplateService =
          user.getService(DfpService.V201111.CREATIVE_TEMPLATE_SERVICE);

      // Set the ID of the creative template to get.
      Long creativeTemplateId = Long.parseLong("INSERT_CREATIVE_TEMPLATE_ID_HERE");

      // Get the creative template.
      CreativeTemplate creativeTemplate =
          creativeTemplateService.getCreativeTemplate(creativeTemplateId);

      if (creativeTemplate != null) {
        System.out.println("Creative template with ID \"" + creativeTemplate.getId()
             + "\", name \"" + creativeTemplate.getName()
             + "\", and type \"" + creativeTemplate.getType() + "\" was found.");
        for (CreativeTemplateVariable variable : creativeTemplate.getVariables()) {
          System.out.println("Variable with name \"" + variable.getUniqueName() + "\" is "
              + (variable.getIsRequired() ? "required." : "optional."));
        }
      } else {
        System.out.println("No creative template found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
