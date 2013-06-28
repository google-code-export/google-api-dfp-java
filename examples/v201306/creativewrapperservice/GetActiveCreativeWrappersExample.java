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

package v201306.creativewrapperservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201306.StatementBuilder;
import com.google.api.ads.dfp.v201306.CreativeWrapper;
import com.google.api.ads.dfp.v201306.CreativeWrapperPage;
import com.google.api.ads.dfp.v201306.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.v201306.CreativeWrapperStatus;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This code example gets all active creative wrappers. To create creative
 * wrappers, run CreateCreativeWrappersExample.java.
 *
 * Tags: CreativeWrapperService.getCreativeWrappersByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetActiveCreativeWrappersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeWrapperService.
      CreativeWrapperServiceInterface creativeWrapperService =
          user.getService(DfpService.V201306.CREATIVE_WRAPPER_SERVICE);

      // Create a statement to select only active creative wrappers.
      String statementText = "WHERE status = :status LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(statementText)
              .putValue("status", CreativeWrapperStatus.ACTIVE.toString()).toStatement();

      // Set defaults for page and offset.
      CreativeWrapperPage page = new CreativeWrapperPage();
      int offset = 0;

      do {
        // Create a statement to get all active creative wrappers.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get creative wrappers by statement.
        page = creativeWrapperService.getCreativeWrappersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (CreativeWrapper creativeWrapper : page.getResults()) {
            System.out.printf(
                "%d) Creative wrapper with ID \"%s\" applying to label \"%s\" was found.\n", i++,
                creativeWrapper.getId(), creativeWrapper.getLabelId());
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
