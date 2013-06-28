// Copyright 2013 Google Inc. All Rights Reserved.
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

package v201306.activitygroupservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201306.StatementBuilder;
import com.google.api.ads.dfp.v201306.ActivityGroup;
import com.google.api.ads.dfp.v201306.ActivityGroupPage;
import com.google.api.ads.dfp.v201306.ActivityGroupServiceInterface;
import com.google.api.ads.dfp.v201306.ActivityGroupStatus;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This example gets active activity groups. The statement retrieves up to the
 * maximum page size limit of 500. To create activity groups, run
 * CreateActivityGroupsExample.java.
 *
 * Tags: ActivityGroupService.getActivityGroupsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetActivityGroupsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityGroupService.
      ActivityGroupServiceInterface activityGroupService =
          user.getService(DfpService.V201306.ACTIVITY_GROUP_SERVICE);

      // Create a statement to only select active activity groups.
      Statement filterStatement =
          new StatementBuilder("WHERE status = :status LIMIT 500")
              .putValue("status", ActivityGroupStatus.ACTIVE.toString()).toStatement();

      // Get activity groups by statement.
      ActivityGroupPage page = activityGroupService.getActivityGroupsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (ActivityGroup activityGroup : page.getResults()) {
          System.out.printf(
              "%s) Activity group with ID \"%d\" and name \"%s\" was found.\n", i++,
              activityGroup.getId(), activityGroup.getName());
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
