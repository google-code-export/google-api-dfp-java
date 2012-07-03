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

package v201206.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201206.CustomTargetingValue;
import com.google.api.ads.dfp.v201206.CustomTargetingValuePage;
import com.google.api.ads.dfp.v201206.Statement;

/**
 * This example gets custom targeting values for the given predefined custom
 * targeting key. The statement retrieves up to the maximum page size limit of
 * 500. To create custom targeting values, run
 * CreateCustomTargetingKeysAndValuesExample.java, To determine which custom
 * targeting keys exist, run GetAllCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCustomTargetingValuesByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201206.CUSTOM_TARGETING_SERVICE);

      // Set the ID of the custom targeting key to get custom targeting values
      // for.
      long customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");

      // Create a statement to only select custom targeting values for a given
      // key.
      Statement filterStatement =
          new StatementBuilder("WHERE customTargetingKeyId = :customTargetingKeyId LIMIT 500")
              .putValue("customTargetingKeyId", customTargetingKeyId).toStatement();

      // Get custom targeting values by statement.
      CustomTargetingValuePage page =
          customTargetingService.getCustomTargetingValuesByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (CustomTargetingValue customTargetingValue : page.getResults()) {
          System.out.println(i + ") Custom targeting value with ID \""
              + customTargetingValue.getId() + "\", name \"" + customTargetingValue.getName()
              + "\", and display name \"" + customTargetingValue.getDisplayName()
              + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
