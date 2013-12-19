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

package v201311.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.v201311.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201311.CustomTargetingValue;
import com.google.api.ads.dfp.v201311.CustomTargetingValuePage;
import com.google.api.ads.dfp.v201311.Statement;

/**
 * This example updates the display name of each custom targeting value up to
 * the first 500. To determine which custom targeting keys exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 * Tags: CustomTargetingService.updateCustomTargetingValues
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCustomTargetingValuesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201311.CUSTOM_TARGETING_SERVICE);

      // Set the ID of the predefined custom targeting key to get custom
      // targeting values for.
      long customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");

      // Create a statement to only select predefined custom targeting values
      // for a given key.
      Statement filterStatement =
          new StatementBuilder("WHERE customTargetingKeyId = :customTargetingKeyId LIMIT 500")
              .putValue("customTargetingKeyId", customTargetingKeyId).toStatement();

      // Get custom targeting values by statement.
      CustomTargetingValuePage page =
          customTargetingService.getCustomTargetingValuesByStatement(filterStatement);

      if (page.getResults() != null) {
        CustomTargetingValue[] customTargetingValues = page.getResults();

        // Update each local custom targeting value object by changing its
        // display name.
        for (CustomTargetingValue customTargetingValue : customTargetingValues) {
          if (customTargetingValue.getDisplayName() == null) {
            customTargetingValue.setDisplayName(customTargetingValue.getName());
          }
          customTargetingValue.setDisplayName(customTargetingValue.getDisplayName()
              + " (Deprecated)");
        }

        // Update the custom targeting values on the server.
        customTargetingValues =
            customTargetingService.updateCustomTargetingValues(customTargetingValues);

        if (customTargetingValues != null) {
          for (CustomTargetingValue customTargetingValue : customTargetingValues) {
            System.out.println("Custom targeting value with ID \""
                + customTargetingValue.getId() + "\", name \"" + customTargetingValue.getName()
                + "\", and display name \"" + customTargetingValue.getDisplayName()
                + "\" was updated.");
          }
        } else {
          System.out.println("No custom targeting values updated.");
        }
      } else {
        System.out.println("No custom targeting values found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
