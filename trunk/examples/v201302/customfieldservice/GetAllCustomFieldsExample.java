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

package v201302.customfieldservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.CustomField;
import com.google.api.ads.dfp.v201302.CustomFieldOption;
import com.google.api.ads.dfp.v201302.CustomFieldPage;
import com.google.api.ads.dfp.v201302.CustomFieldServiceInterface;
import com.google.api.ads.dfp.v201302.DropDownCustomField;
import com.google.api.ads.dfp.v201302.Statement;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example gets all custom fields. To create custom fields, run
 * CreateCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.getCustomFieldsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCustomFieldsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201302.CUSTOM_FIELD_SERVICE);

      // Sets defaults for page and filter.
      CustomFieldPage page = new CustomFieldPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all custom fields.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get custom fields by statement.
        page = customFieldService.getCustomFieldsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (CustomField customField : page.getResults()) {
            if (customField instanceof DropDownCustomField) {
              List<String> dropDownCustomFieldStrings = new ArrayList<String>();
              DropDownCustomField dropDownCustomField = (DropDownCustomField) customField;
              if (dropDownCustomField.getOptions() != null) {
                for (CustomFieldOption customFieldOption : dropDownCustomField.getOptions()) {
                  dropDownCustomFieldStrings.add(customFieldOption.getDisplayName());
                }
              }
              System.out.println(i + ") Drop-down custom field with ID \"" + customField.getId()
                  + "\", name \"" + customField.getName() + "\", and options {"
                  + StringUtils.join(dropDownCustomFieldStrings, ",") + "} was found.");
            } else {
              System.out.println(i + ") Custom field with ID \"" + customField.getId()
                  + "\" and  name \"" + customField.getName() + "\" was found.");
            }
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
