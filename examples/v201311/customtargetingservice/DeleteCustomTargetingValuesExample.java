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

package v201311.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.v201311.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201311.CustomTargetingValue;
import com.google.api.ads.dfp.v201311.CustomTargetingValuePage;
import com.google.api.ads.dfp.v201311.DeleteCustomTargetingValues;
import com.google.api.ads.dfp.v201311.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deletes custom targeting values for a given custom targeting
 * key. To determine which custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 * Tags: CustomTargetingService.performCustomTargetingValueAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeleteCustomTargetingValuesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201311.CUSTOM_TARGETING_SERVICE);

      // Set ID of the custom targeting key to delete values from.
      long customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");

      // Create statement to only select custom values by the given custom
      // targeting key ID.
      String statementText = "WHERE customTargetingKeyId = :customTargetingKeyId";
      StatementBuilder statementBuilder = new StatementBuilder("")
          .putValue("customTargetingKeyId", customTargetingKeyId);

      // Set defaults for page and offset.
      CustomTargetingValuePage page = new CustomTargetingValuePage();
      int offset = 0;
      List<Long> customTargetingValueIds = new ArrayList<Long>();

      do {
        // Create a statement to page through custom targeting values.
        statementBuilder.setQuery(statementText + " LIMIT 500 OFFSET " + offset);

        // Get custom targeting values by statement.
        page = customTargetingService.getCustomTargetingValuesByStatement(
            statementBuilder.toStatement());

        if (page.getResults() != null) {
          for (CustomTargetingValue customTargetingValue : page.getResults()) {
            customTargetingValueIds.add(customTargetingValue.getId());
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println(
          "Number of custom targeting values to be deleted: " + customTargetingValueIds.size());

      if (customTargetingValueIds.size() > 0) {
        // Modify statement for action.
        statementBuilder.setQuery("WHERE customTargetingKeyId = :customTargetingKeyId AND id IN ("
            + StringUtils.join(customTargetingValueIds, ",") + ")");

        // Create action.
        DeleteCustomTargetingValues action = new DeleteCustomTargetingValues();

        // Perform action.
        UpdateResult result = customTargetingService.performCustomTargetingValueAction(
            action, statementBuilder.toStatement());

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of custom targeting values deleted: "
              + result.getNumChanges());
        } else {
          System.out.println("No custom targeting values were deleted.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
