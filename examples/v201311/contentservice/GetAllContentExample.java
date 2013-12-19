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

package v201311.contentservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201311.Content;
import com.google.api.ads.dfp.v201311.ContentPage;
import com.google.api.ads.dfp.v201311.ContentServiceInterface;
import com.google.api.ads.dfp.v201311.Statement;

/**
 * This example gets all content. This feature is only available to DFP video
 * publishers.
 *
 * Tags: ContentService.getContentByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllContentExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ContentService.
      ContentServiceInterface contentService = user.getService(DfpService.V201311.CONTENT_SERVICE);

      // Set defaults for page and filterStatement.
      ContentPage page = new ContentPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all content.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get content by statement.
        page = contentService.getContentByStatement(filterStatement);

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
