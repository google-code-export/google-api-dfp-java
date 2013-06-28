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

package v201306.activityservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201306.StatementBuilder;
import com.google.api.ads.dfp.v201306.Activity;
import com.google.api.ads.dfp.v201306.ActivityPage;
import com.google.api.ads.dfp.v201306.ActivityServiceInterface;
import com.google.api.ads.dfp.v201306.ActivityStatus;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This example gets active activities. The statement
 * retrieves up to the maximum page size limit of 500. To create activities, run
 * CreateActivitiesExample.java.
 *
 * Tags: ActivityService.getActivitiesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetActivitiesByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityService.
      ActivityServiceInterface activityService =
          user.getService(DfpService.V201306.ACTIVITY_SERVICE);

      // Set the ID of the activity group to get the activities for.
      Integer activityGroupId = Integer.parseInt("INSERT_ACTIVITY_GROUP_ID_HERE");

      // Create a statement to only select active activities.
      Statement filterStatement =
          new StatementBuilder(
              "WHERE activityGroupId = :activityGroupId and status = :status LIMIT 500")
              .putValue("activityGroupId", activityGroupId)
              .putValue("status", ActivityStatus.ACTIVE.toString()).toStatement();

      // Get activities by statement.
      ActivityPage page = activityService.getActivitiesByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Activity activity : page.getResults()) {
          System.out.printf(
              "%s) Activity with ID \"%d\", name \"%s\", and type \"%s\" was found.\n", i++,
              activity.getId(), activity.getName(), activity.getType());
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
