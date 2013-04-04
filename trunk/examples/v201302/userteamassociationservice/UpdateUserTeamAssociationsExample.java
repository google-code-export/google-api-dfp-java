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

package v201302.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.v201302.Statement;
import com.google.api.ads.dfp.v201302.TeamAccessType;
import com.google.api.ads.dfp.v201302.UserTeamAssociation;
import com.google.api.ads.dfp.v201302.UserTeamAssociationPage;
import com.google.api.ads.dfp.v201302.UserTeamAssociationServiceInterface;

/**
 * This example updates user team associations by setting the overridden access
 * type to read only for all teams that the user belongs to. To determine
 * which users exists, run GetAllUsersExample.java
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 * Tags: UserTeamAssociationService.updateUserTeamAssociations
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateUserTeamAssociationsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201302.USER_TEAM_ASSOCIATION_SERVICE);

      // Set the user to set to read only access within its teams.
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");

      // Create filter text to select user team associations by the user ID.
      String statementText = "WHERE userId = :userId LIMIT 500";
      Statement filterStatement =
        new StatementBuilder("")
            .putValue("userId", userId)
            .toStatement();

      // Get user team associations by statement.
      UserTeamAssociationPage page =
          userTeamAssociationService.getUserTeamAssociationsByStatement(filterStatement);

      if (page.getResults() != null) {
        UserTeamAssociation[] userTeamAssociations = page.getResults();

        // Update each local user team association to read only access.
        for (UserTeamAssociation userTeamAssociation : userTeamAssociations) {
          userTeamAssociation.setOverriddenTeamAccessType(TeamAccessType.READ_ONLY);
        }

        // Update the user team associations on the server.
        userTeamAssociations =
            userTeamAssociationService.updateUserTeamAssociations(userTeamAssociations);

        if (userTeamAssociations != null) {
          for (UserTeamAssociation userTeamAssociation : userTeamAssociations) {
            System.out.println("User team association between user with ID \""
                + userTeamAssociation.getUserId() + "\" and team with ID \""
                + userTeamAssociation.getTeamId() + "\" was updated to access type \""
                + userTeamAssociation.getOverriddenTeamAccessType() + "\".");
          }
        } else {
          System.out.println("No user team associations updated.");
        }
      } else {
        System.out.println("No user team associations found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
