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

package v201311.creativetemplateservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201311.CreativeTemplate;
import com.google.api.ads.dfp.v201311.CreativeTemplatePage;
import com.google.api.ads.dfp.v201311.CreativeTemplateServiceInterface;
import com.google.api.ads.dfp.v201311.Statement;

/**
 * This example gets all creative templates.
 *
 * Tags: CreativeTemplateService.getCreativeTemplatesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCreativeTemplatesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeTemplateService.
      CreativeTemplateServiceInterface creativeTemplateService =
          user.getService(DfpService.V201311.CREATIVE_TEMPLATE_SERVICE);

      // Set defaults for page and filterStatement.
      CreativeTemplatePage page = new CreativeTemplatePage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all creative templates.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get creative templates by statement.
        page = creativeTemplateService.getCreativeTemplatesByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (CreativeTemplate creativeTemplate : page.getResults()) {
            System.out.println(i + ") Creative template with ID \"" + creativeTemplate.getId()
                + "\", name \"" + creativeTemplate.getName()
                + "\", and type \"" + creativeTemplate.getType() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
