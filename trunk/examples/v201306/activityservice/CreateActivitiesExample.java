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
import com.google.api.ads.dfp.v201306.Activity;
import com.google.api.ads.dfp.v201306.ActivityServiceInterface;
import com.google.api.ads.dfp.v201306.ActivityType;

import java.util.Random;

/**
 * This example creates new activities. To determine which activities
 * exist, run GetAllActivitiesExample.java.
 *
 * Tags: ActivityService.createActivities
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateActivitiesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityService.
      ActivityServiceInterface activityService =
          user.getService(DfpService.V201306.ACTIVITY_SERVICE);

      // Set the ID of the activity group to create the activities for.
      Integer activityGroupId = Integer.parseInt("INSERT_ACTIVITY_GROUP_ID_HERE");

      // Create a daily visits activity.
      Activity dailyVisitsActivity = new Activity();
      dailyVisitsActivity.setName("Activity #" + new Random().nextLong());
      dailyVisitsActivity.setActivityGroupId(activityGroupId);
      dailyVisitsActivity.setType(ActivityType.DAILY_VISITS);

      // Create a custom activity.
      Activity customActivity = new Activity();
      customActivity.setName("Activity #" + new Random().nextLong());
      customActivity.setActivityGroupId(activityGroupId);
      customActivity.setType(ActivityType.CUSTOM);

      // Create the activities on the server.
      Activity[] activities =
          activityService.createActivities(new Activity[] {dailyVisitsActivity, customActivity});

      for (Activity activity : activities) {
        System.out.printf("An activity with ID \"%d\", name \"%s\", and type \"%s\" was created.\n",
            activity.getId(), activity.getName(), activity.getType());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
