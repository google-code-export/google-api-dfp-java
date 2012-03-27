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

package v201203.contentservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201203.StatementBuilder;
import com.google.api.ads.dfp.v201203.Content;
import com.google.api.ads.dfp.v201203.ContentPage;
import com.google.api.ads.dfp.v201203.ContentServiceInterface;
import com.google.api.ads.dfp.v201203.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201203.CustomTargetingValuePage;
import com.google.api.ads.dfp.v201203.NetworkServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;

/**
 * This example gets all active content categorized as "comedy" using the
 * network's content browse custom targeting key. This feature is only available
 * to DFP video publishers.
 *
 * Tags: NetworkService.getCurrentNetwork
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 * Tags: ContentService.getContentByStatementAndCustomTargetingValue
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetContentByCategoryExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ContentService.
      ContentServiceInterface contentService = user.getService(DfpService.V201203.CONTENT_SERVICE);

      // Get the NetworkService.
      NetworkServiceInterface networkService = user.getService(DfpService.V201203.NETWORK_SERVICE);

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201203.CUSTOM_TARGETING_SERVICE);

      // Get content browse custom targeting key ID.
      long contentBrowseCustomTargetingKeyId =
          networkService.getCurrentNetwork().getContentBrowseCustomTargetingKeyId();

      // Create a statement to select the categories matching the name comedy.
      Statement categoryFilterStatement = new StatementBuilder(
          "WHERE customTargetingKeyId = :contentBrowseCustomTargetingKeyId " +
          " and name = :category LIMIT 1")
          .putValue("contentBrowseCustomTargetingKeyId", contentBrowseCustomTargetingKeyId)
          .putValue("category", "comedy").toStatement();

      // Get categories matching the filter statement.
      CustomTargetingValuePage customTargetingValuePage =
          customTargetingService.getCustomTargetingValuesByStatement(categoryFilterStatement);

      // Get the custom targeting value ID for the comedy category.
      long categoryCustomTargetingValueId = customTargetingValuePage.getResults()[0].getId();

      // Set defaults for page and filterStatement.
      ContentPage page = new ContentPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all active content.
        filterStatement.setQuery("WHERE status = 'ACTIVE' LIMIT 500 OFFSET " + offset);

        // Get content by statement.
        page = contentService.getContentByStatementAndCustomTargetingValue(filterStatement,
            categoryCustomTargetingValueId);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Content content : page.getResults()) {
            System.out.println(i + ") Content with ID \"" + content.getId()
                + "\", name \"" + content.getName()
                + "\", and status \"" + content.getStatus() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
