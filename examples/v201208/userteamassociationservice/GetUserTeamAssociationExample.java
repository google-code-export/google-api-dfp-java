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

package v201208.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201208.UserTeamAssociation;
import com.google.api.ads.dfp.v201208.UserTeamAssociationServiceInterface;

/**
 * This example gets a user team association by the user and team ID. To
 * determine which teams exist, run GetAllTeamsExample.java. To determine which
 * users exist, run GetAllUsersExample.java.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociation
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetUserTeamAssociationExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201208.USER_TEAM_ASSOCIATION_SERVICE);

      // Set the IDs of the user and team to get the association for.
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");
      Long teamId = Long.parseLong("INSERT_TEAM_ID_HERE");

      // Get the user team association.
      UserTeamAssociation userTeamAssociation =
          userTeamAssociationService.getUserTeamAssociation(teamId, userId);

      if (userTeamAssociation != null) {
        System.out.println("User team association between user with ID \""
            + userTeamAssociation.getUserId() + "\" and team with ID \""
            + userTeamAssociation.getTeamId() + "\" was found.");
      } else {
        System.out.println("No user team association found.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
