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
import com.google.api.ads.dfp.v201302.CustomFieldDataType;
import com.google.api.ads.dfp.v201302.CustomFieldEntityType;
import com.google.api.ads.dfp.v201302.CustomFieldServiceInterface;
import com.google.api.ads.dfp.v201302.CustomFieldVisibility;

/**
 * This example creates custom fields. To determine which custom fields exist,
 * run GetAllCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.createCustomFields
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCustomFields {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201302.CUSTOM_FIELD_SERVICE);

      // Create custom fields.
      CustomField customField1 = new CustomField();
      customField1.setName("Customer comments #" + System.currentTimeMillis());
      customField1.setEntityType(CustomFieldEntityType.LINE_ITEM);
      customField1.setDataType(CustomFieldDataType.STRING);
      customField1.setVisibility(CustomFieldVisibility.FULL);

      CustomField customField2 = new CustomField();
      customField2.setName("Internal approval status #" + System.currentTimeMillis());
      customField2.setEntityType(CustomFieldEntityType.LINE_ITEM);
      customField2.setDataType(CustomFieldDataType.DROP_DOWN);
      customField2.setVisibility(CustomFieldVisibility.FULL);

      // Add custom fields.
      CustomField[] customFields =
          customFieldService.createCustomFields(new CustomField[] {customField1, customField2});

      // Display results.
      if (customFields != null) {
        for (CustomField customField : customFields) {
          System.out.println("Custom field with ID \"" + customField.getId() + "\" and name \""
              + customField.getName() + "\" was created.");
        }
      } else {
        System.out.println("No custom fields created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
