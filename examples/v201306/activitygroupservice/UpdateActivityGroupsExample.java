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
import com.google.api.ads.dfp.v201306.ActivityGroup;
import com.google.api.ads.dfp.v201306.ActivityGroupServiceInterface;

import java.util.Arrays;

/**
 * This example updates activity groups by adding a company. To determine which
 * activity groups exist, run GetAllActivityGroupsExample.java.
 *
 * Tags: ActivityGroupService.getActivityGroup
 * Tags: ActivityGroupService.updateActivityGroups
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateActivityGroupsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityGroupService.
      ActivityGroupServiceInterface activityGroupService =
          user.getService(DfpService.V201306.ACTIVITY_GROUP_SERVICE);

      // Set the ID of the activity group and the company to update it with.
      Integer activityGroupId = Integer.parseInt("INSERT_ACTIVITY_GROUP_ID_HERE");
      Long advertiserCompanyId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");

      // Get the activity group.
      ActivityGroup activityGroup = activityGroupService.getActivityGroup(activityGroupId);

      long[] companyIds = Arrays.copyOf(
          activityGroup.getCompanyIds(), activityGroup.getCompanyIds().length + 1);

      companyIds[companyIds.length - 1] = advertiserCompanyId;

      // Update the companies.
      activityGroup.setCompanyIds(companyIds);

      // Update the activity group on the server.
      ActivityGroup[] activityGroups =
          activityGroupService.updateActivityGroups(new ActivityGroup[] {activityGroup});

      for (ActivityGroup updatedActivityGroup : activityGroups) {
        System.out.printf(
            "Activity group with ID \"%d\" and name \"%s\" was updated.\n",
            updatedActivityGroup.getId(), updatedActivityGroup.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
