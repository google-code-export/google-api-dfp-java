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
import com.google.api.ads.dfp.v201302.CustomFieldOption;
import com.google.api.ads.dfp.v201302.CustomFieldServiceInterface;

/**
 * This example creates custom field options for a drop-down custom field.
 * Once created, custom field options can be found under the options fields of
 * the drop-down custom field and they cannot be deleted. To determine which
 * custom fields exist, run GetAllCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.createCustomFieldOptions
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCustomFieldOptions {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201302.CUSTOM_FIELD_SERVICE);

      // Set the ID of the drop-down custom field to create options for.
      Long customFieldId = Long.parseLong("INSERT_DROP_DOWN_CUSTOM_FIELD_ID_HERE");

      // Create custom field options.
      CustomFieldOption customFieldOption1 = new CustomFieldOption();
      customFieldOption1.setDisplayName("Approved");
      customFieldOption1.setCustomFieldId(customFieldId);

      CustomFieldOption customFieldOption2 = new CustomFieldOption();
      customFieldOption2.setDisplayName("Unapproved");
      customFieldOption2.setCustomFieldId(customFieldId);

      // Add custom field options.
      CustomFieldOption[] customFieldOptions =
          customFieldService.createCustomFieldOptions(new CustomFieldOption[] {customFieldOption1,
              customFieldOption2});

      // Display results.
      if (customFieldOptions != null) {
        for (CustomFieldOption customFieldOption : customFieldOptions) {
          System.out.println("Custom field option with ID \"" + customFieldOption.getId()
              + "\" and name \"" + customFieldOption.getDisplayName()
              + "\" was created.");
        }
      } else {
        System.out.println("No custom field options created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
