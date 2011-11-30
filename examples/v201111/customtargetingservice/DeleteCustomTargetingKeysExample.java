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

package v201111.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201111.StatementBuilder;
import com.google.api.ads.dfp.v201111.CustomTargetingKey;
import com.google.api.ads.dfp.v201111.CustomTargetingKeyPage;
import com.google.api.ads.dfp.v201111.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201111.DeleteCustomTargetingKeys;
import com.google.api.ads.dfp.v201111.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deletes custom targeting key by its name. To determine which
 * custom targeting keys exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingKeysByStatement
 * Tags: CustomTargetingService.performCustomTargetingKeyAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeleteCustomTargetingKeysExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201111.CUSTOM_TARGETING_SERVICE);

      // Set the name of the custom targeting key to delete.
      String customTargetingKeyName = "INSERT_CUSTOM_TARGETING_KEY_NAME_HERE";

      // Create statement to only select custom targeting key by the given name.
      String statementText = "WHERE name = :name";
      StatementBuilder statementBuilder = new StatementBuilder("")
          .putValue("name", customTargetingKeyName);

      // Set defaults for page and offset.
      CustomTargetingKeyPage page = new CustomTargetingKeyPage();
      int offset = 0;
      List<Long> customTargetingKeyIds = new ArrayList<Long>();

      do {
        // Create a statement to page through custom targeting keys.
        statementBuilder.setQuery(statementText + " LIMIT 500 OFFSET " + offset);

        // Get custom targeting keys by statement.
        page = customTargetingService.getCustomTargetingKeysByStatement(
            statementBuilder.toStatement());

        if (page.getResults() != null) {
          for (CustomTargetingKey customTargetingKey : page.getResults()) {
            customTargetingKeyIds.add(customTargetingKey.getId());
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println(
          "Number of custom targeting keys to be deleted: " + customTargetingKeyIds.size());

      if (customTargetingKeyIds.size() > 0) {
        // Modify statement for action.
        statementBuilder.setQuery(
            "WHERE id IN (" + StringUtils.join(customTargetingKeyIds, ",") + ")");

        // Create action.
        DeleteCustomTargetingKeys action = new DeleteCustomTargetingKeys();

        // Perform action.
        UpdateResult result = customTargetingService.performCustomTargetingKeyAction(
            action, statementBuilder.toStatement());

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of custom targeting keys deleted: " + result.getNumChanges());
        } else {
          System.out.println("No custom targeting keys were deleted.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
