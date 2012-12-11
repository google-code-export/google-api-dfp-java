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

package v201211.creativetemplateservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201211.StatementBuilder;
import com.google.api.ads.dfp.v201211.CreativeTemplate;
import com.google.api.ads.dfp.v201211.CreativeTemplatePage;
import com.google.api.ads.dfp.v201211.CreativeTemplateServiceInterface;
import com.google.api.ads.dfp.v201211.CreativeTemplateType;
import com.google.api.ads.dfp.v201211.Statement;

/**
 * This example gets up to 500 system defined creative templates.
 *
 * Tags: CreativeTemplateService.getCreativeTemplatesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCreativeTemplatesByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeTemplateService.
      CreativeTemplateServiceInterface creativeTemplateService =
          user.getService(DfpService.V201211.CREATIVE_TEMPLATE_SERVICE);

      // Create a statement to only select system defined creative templates.
      Statement filterStatement =
          new StatementBuilder("WHERE type = :creativeTemplateType LIMIT 500").putValue(
              "creativeTemplateType", CreativeTemplateType.SYSTEM_DEFINED.toString()).toStatement();

      // Get creative templates by statement.
      CreativeTemplatePage page =
          creativeTemplateService.getCreativeTemplatesByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (CreativeTemplate creativeTemplate : page.getResults()) {
          System.out.println(i + ") Creative template with ID \"" + creativeTemplate.getId()
              + "\", name \"" + creativeTemplate.getName()
              + "\", and type \"" + creativeTemplate.getType() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
       e.printStackTrace();
    }
  }
}
