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

package v201104.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.CustomTargetingKey;
import com.google.api.ads.dfp.v201104.CustomTargetingKeyPage;
import com.google.api.ads.dfp.v201104.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201104.CustomTargetingValue;
import com.google.api.ads.dfp.v201104.CustomTargetingValuePage;
import com.google.api.ads.dfp.v201104.Statement;


/**
 * This example gets all custom targeting keys and the values. To create custom
 * targeting keys and values, run
 * CreateCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingKeysByStatement
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCustomTargetingKeysAndValuesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201104.CUSTOM_TARGETING_SERVICE);

      // Sets defaults for page and filter.
      CustomTargetingKeyPage keyPage = new CustomTargetingKeyPage();
      Statement keyFilterStatement = new Statement();
      int keyOffset = 0;

      do {
        // Create a statement to get all custom targeting keys.
        keyFilterStatement.setQuery("LIMIT 500 OFFSET " + keyOffset);

        // Get custom targeting keys by statement.
        keyPage = customTargetingService.getCustomTargetingKeysByStatement(keyFilterStatement);

        if (keyPage.getResults() != null) {
          int i = keyPage.getStartIndex();
          for (CustomTargetingKey key : keyPage.getResults()) {
            System.out.println(i + ") Custom targeting key with ID \"" + key.getId()
                + "\", name \"" + key.getName() + "\", display name \"" + key.getDisplayName()
                + "\", and type \"" + key.getType() + "\" was found.");


            // Sets defaults for page and filter.
            CustomTargetingValuePage valuePage = new CustomTargetingValuePage();
            Statement valueFilterStatement = new Statement();
            int valueOffset = 0;

            do {
              // Create a statement to get all custom targeting values for a
              // custom targeting key (required) by its ID.
              valueFilterStatement.setQuery("WHERE customTargetingKeyId = " + key.getId()
                  + " LIMIT 500 OFFSET " + valueOffset);

              // Get custom targeting values by statement.
              valuePage =
                  customTargetingService.getCustomTargetingValuesByStatement(valueFilterStatement);

              if (valuePage.getResults() != null) {
                int j = valuePage.getStartIndex();
                for (CustomTargetingValue value : valuePage.getResults()) {
                  System.out.println("\t" + j + ") Custom targeting value with ID \""
                      + value.getId() + "\", name \"" + value.getName() + "\", and display name \""
                      + value.getDisplayName() + "\" was found.");
                  j++;
                }
              }
              valueOffset += 500;
            } while (valuePage.getResults() != null && valuePage.getResults().length == 500);

            i++;
          }
        }
        keyOffset += 500;
      } while (keyPage.getResults() != null && keyPage.getResults().length == 500);

      System.out.println("Number of results found: " + keyPage.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
