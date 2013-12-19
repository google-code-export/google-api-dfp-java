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

package v201311.activityservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.v201311.Activity;
import com.google.api.ads.dfp.v201311.ActivityGroup;
import com.google.api.ads.dfp.v201311.ActivityGroupPage;
import com.google.api.ads.dfp.v201311.ActivityGroupServiceInterface;
import com.google.api.ads.dfp.v201311.ActivityPage;
import com.google.api.ads.dfp.v201311.ActivityServiceInterface;
import com.google.api.ads.dfp.v201311.Statement;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

/**
 * This example gets all activities. To create activities, run
 * CreateActivitiesExample.java.
 *
 * Tags: ActivityService.getActivitiesByStatement
 * Tags: ActivityGroupService.getActivityGroupsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllActivitiesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityService.
      ActivityServiceInterface activityService =
          user.getService(DfpService.V201311.ACTIVITY_SERVICE);

      // Get all activity group IDs.
      List<Integer> activityGroupIds = getAllActivityGroupIds(user);

      // Create a statement to get all activities for an activity group.
      String filterStatementString = "WHERE activityGroupId = :activityGroupId LIMIT 500 OFFSET ";
      StatementBuilder statementBuilder = new StatementBuilder(filterStatementString);

      int totalResultsCounter = 0;

      for (Integer activityGroupId : activityGroupIds) {
        // Set defaults for page.
        ActivityPage page = new ActivityPage();
        int offset = 0;

        // Default for total result set size and offset.
        int totalResultSetSize = 0;

        // Set the activity group ID to select from.
        statementBuilder.putValue("activityGroupId", activityGroupId);

        do {
          // Create a statement to get all activities from an activity group.
          statementBuilder.setQuery(filterStatementString + offset);

          // Get activities by statement.
          page = activityService.getActivitiesByStatement(statementBuilder.toStatement());

          if (page.getResults() != null) {
            totalResultSetSize = page.getTotalResultSetSize();
            for (Activity activity : page.getResults()) {
              System.out.printf(
                  "%s) Activity with ID \"%d\", name \"%s\", and type \"%s\" was found.\n",
                  totalResultsCounter++, activity.getId(), activity.getName(), activity.getType());
            }
          }

          offset += 500;
        } while (offset < page.getTotalResultSetSize());
      }

      System.out.printf("Number of results found: %s\n", totalResultsCounter);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Gets all activity group IDs.
   */
  private static List<Integer> getAllActivityGroupIds(DfpUser user)
      throws RemoteException, ServiceException {
    List<Integer> activityGroupIds = new ArrayList<Integer>();

    // Get the ActivityGroupService.
    ActivityGroupServiceInterface activityGroupService =
        user.getService(DfpService.V201311.ACTIVITY_GROUP_SERVICE);

    // Set defaults for page and filterStatement.
    ActivityGroupPage page = new ActivityGroupPage();
    Statement filterStatement = new Statement();
    int offset = 0;

    do {
      // Create a statement to get all activity groups.
      filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

      // Get activity groups by statement.
      page = activityGroupService.getActivityGroupsByStatement(filterStatement);

      if (page.getResults() != null) {
        for (ActivityGroup activityGroup : page.getResults()) {
          activityGroupIds.add(activityGroup.getId());
        }
      }

      offset += 500;
    } while (offset < page.getTotalResultSetSize());

    return activityGroupIds;
  }
}
