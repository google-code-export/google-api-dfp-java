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

import java.util.Random;

/**
 * This example creates new activity groups. To determine which activity groups
 * exist, run GetAllActivityGroupsExample.java.
 *
 * Tags: ActivityGroupService.createActivityGroups
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateActivityGroupsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ActivityGroupService.
      ActivityGroupServiceInterface activityGroupService =
          user.getService(DfpService.V201306.ACTIVITY_GROUP_SERVICE);

      // Set the ID of the company for the activity group.
      Long advertiserCompanyId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");

      // Create a short-term activity group.
      ActivityGroup shortTermActivityGroup = new ActivityGroup();
      shortTermActivityGroup.setName("Short-term activity group #" + new Random().nextLong());
      shortTermActivityGroup.setCompanyIds(new long[] {advertiserCompanyId});
      shortTermActivityGroup.setClicksLookback(1);
      shortTermActivityGroup.setImpressionsLookback(1);

      // Create a long-term activity group.
      ActivityGroup longTermActivityGroup = new ActivityGroup();
      longTermActivityGroup.setName("Long-term activity group #" + new Random().nextLong());
      longTermActivityGroup.setCompanyIds(new long[] {advertiserCompanyId});
      longTermActivityGroup.setClicksLookback(30);
      longTermActivityGroup.setImpressionsLookback(30);

      // Create the activity groups on the server.
      ActivityGroup[] activityGroups = activityGroupService.createActivityGroups(
          new ActivityGroup[] {shortTermActivityGroup, longTermActivityGroup});

      for (ActivityGroup activityGroup : activityGroups) {
        System.out.printf("An activity group with ID \"%d\" and name \"%s\" was created.\n",
            activityGroup.getId(), activityGroup.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
