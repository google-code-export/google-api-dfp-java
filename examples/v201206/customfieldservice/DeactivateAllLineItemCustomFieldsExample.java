// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201206.customfieldservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.CustomField;
import com.google.api.ads.dfp.v201206.CustomFieldEntityType;
import com.google.api.ads.dfp.v201206.CustomFieldPage;
import com.google.api.ads.dfp.v201206.CustomFieldServiceInterface;
import com.google.api.ads.dfp.v201206.DeactivateCustomFields;
import com.google.api.ads.dfp.v201206.Statement;
import com.google.api.ads.dfp.v201206.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates all active line item custom fields. To determine
 * which custom fields exist, run GetAllCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.getCustomFieldsByStatement
 * Tags: CustomFieldService.performCustomFieldAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivateAllLineItemCustomFieldsExample {

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201206.CUSTOM_FIELD_SERVICE);

      // Create statement to select only active custom fields that apply to
      // line items.
      String statementText =
          "WHERE entityType = :entityType and isActive = :isActive LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(statementText)
              .putValue("entityType", CustomFieldEntityType.LINE_ITEM.toString())
              .putValue("isActive", true)
              .toStatement();

      // Set defaults for page and offset.
      CustomFieldPage page = new CustomFieldPage();
      int offset = 0;
      int i = 0;
      List<Long> customFieldIds = new ArrayList<Long>();

      do {
        // Create a statement to page through custom fields.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get custom fields by statement.
        page = customFieldService.getCustomFieldsByStatement(filterStatement);

        if (page.getResults() != null) {
          for (CustomField customField : page.getResults()) {
            System.out.println(i + ") Custom field with ID \""
                + customField.getId() + "\" and name \"" + customField.getName()
                + "\" will be deactivated.");
            customFieldIds.add(customField.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of custom fields to be deactivated: " + customFieldIds.size());

      if (customFieldIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(customFieldIds, ",") + ")");

        // Create action.
        DeactivateCustomFields action = new DeactivateCustomFields();

        // Perform action.
        UpdateResult result = customFieldService.performCustomFieldAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of custom fields deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No custom fields were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
