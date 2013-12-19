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
import com.google.api.ads.dfp.v201311.Activity;
import com.google.api.ads.dfp.v201311.ActivityServiceInterface;

/**
 * This example updates activity expected URLs. To determine which activities
 * exist, run GetAllActivitiesExample.java.
 *
 * Tags: ActivityService.getActivity
 * Tags: ActivityService.updateActivities
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateActivitiesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityService.
      ActivityServiceInterface activityService =
          user.getService(DfpService.V201311.ACTIVITY_SERVICE);

      // Set the ID of the activity to update.
      Integer activityId = Integer.parseInt("INSERT_ACTIVITY_ID_HERE");

      // Get the activity.
      Activity activity = activityService.getActivity(activityId);

      // Update the expected URL.
      activity.setExpectedURL("http://google.com");

      // Update the activity on the server.
      Activity[] activities = activityService.updateActivities(new Activity[] {activity});

      for (Activity updatedActivity : activities) {
        System.out.printf(
            "Activity with ID \"%d\" and name \"%s\" was updated.\n",
            updatedActivity.getId(), updatedActivity.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
