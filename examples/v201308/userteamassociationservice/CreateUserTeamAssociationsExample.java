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

package v201308.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201308.UserTeamAssociation;
import com.google.api.ads.dfp.v201308.UserTeamAssociationServiceInterface;

/**
 * This example adds a user to a team by creating an association between the
 * two. To determine which teams exist, run GetAllTeamsExample.java. To
 * determine which users exist, run GetAllUsersExample.java.
 *
 * Tags: UserTeamAssociationService.createUserTeamAssociations
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateUserTeamAssociationsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201308.USER_TEAM_ASSOCIATION_SERVICE);

      // Set the users and team to add them to.
      Long teamId = Long.parseLong("INSERT_TEAM_ID_HERE");
      Long[] userIds = new Long[] {Long.parseLong("INSERT_USER_ID_HERE")};

      // Create an array to store local user team association objects.
      UserTeamAssociation[] userTeamAssociations = new UserTeamAssociation[userIds.length];

      // For each user, associate it with the given team.
      int i = 0;
      for (Long userId : userIds) {
        UserTeamAssociation userTeamAssociation = new UserTeamAssociation();
        userTeamAssociation.setUserId(userId);
        userTeamAssociation.setTeamId(teamId);
        userTeamAssociations[i++] = userTeamAssociation;
      }

      // Create the user team associations on the server.
      userTeamAssociations =
          userTeamAssociationService.createUserTeamAssociations(userTeamAssociations);

      if (userTeamAssociations != null) {
        for (UserTeamAssociation userTeamAssociation : userTeamAssociations) {
          System.out.println("A user team association between user with ID \""
              + userTeamAssociation.getUserId() + "\" and team with ID \""
              + userTeamAssociation.getTeamId() + "\" was created.");
        }
      } else {
        System.out.println("No user team associations created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
