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

package v201204.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201204.CustomTargetingKey;
import com.google.api.ads.dfp.v201204.CustomTargetingKeyPage;
import com.google.api.ads.dfp.v201204.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201204.Statement;

/**
 * This example updates the display name of each custom targeting key up to the
 * first 500. To determine which custom targeting keys exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingKeysByStatement
 * Tags: CustomTargetingService.updateCustomTargetingKeys
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCustomTargetingKeysExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201204.CUSTOM_TARGETING_SERVICE);

      // Create a statement to get all custom targeting keys.
      Statement filterStatement = new Statement("LIMIT 500", null);

      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(filterStatement);

      if (page.getResults() != null) {
        CustomTargetingKey[] customTargetingKeys = page.getResults();

        // Update each local custom targeting key object by changing its display
        // name.
        for (CustomTargetingKey customTargetingKey : customTargetingKeys) {
          if (customTargetingKey.getDisplayName() == null) {
            customTargetingKey.setDisplayName(customTargetingKey.getName());
          }
          customTargetingKey.setDisplayName(customTargetingKey.getDisplayName() + " (Deprecated)");
        }

        // Update the custom targeting keys on the server.
        customTargetingKeys = customTargetingService.updateCustomTargetingKeys(customTargetingKeys);

        if (customTargetingKeys != null) {
          for (CustomTargetingKey customTargetingKey : customTargetingKeys) {
            System.out.println("Custom targeting key with ID \""
                + customTargetingKey.getId() + "\", name \"" + customTargetingKey.getName()
                + "\", and display name \"" + customTargetingKey.getDisplayName()
                + "\" was updated.");
          }
        } else {
          System.out.println("No custom targeting keys updated.");
        }
      } else {
        System.out.println("No custom targeting keys found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
