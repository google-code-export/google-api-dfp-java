// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201204.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201204.StatementBuilder;
import com.google.api.ads.dfp.v201204.DeleteUserTeamAssociations;
import com.google.api.ads.dfp.v201204.Statement;
import com.google.api.ads.dfp.v201204.UpdateResult;
import com.google.api.ads.dfp.v201204.UserTeamAssociation;
import com.google.api.ads.dfp.v201204.UserTeamAssociationPage;
import com.google.api.ads.dfp.v201204.UserTeamAssociationServiceInterface;

/**
 * This example removes the user from all its teams. To determine which users
 * exist, run GetAllUsersExample.java.
 *
 * Tags: UserTeamAssociationService.performUserTeamAssociationAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeleteUserTeamAssociationsExample {

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201204.USER_TEAM_ASSOCIATION_SERVICE);

      // Set the user to remove from its teams.
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");

      // Create filter text to select user team associations by the user ID.
      String statementText = "WHERE userId = :userId LIMIT 500";
      Statement filterStatement =
        new StatementBuilder("")
            .putValue("userId", userId)
            .toStatement();

      // Set defaults for page and offset.
      UserTeamAssociationPage page = new UserTeamAssociationPage();
      int offset = 0;

      do {
        // Create a statement to page through user team associations.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get user team associations by statement.
        page = userTeamAssociationService.getUserTeamAssociationsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (UserTeamAssociation userTeamAssociation : page.getResults()) {
            System.out.println(i + ") User team association between user with ID \""
                + userTeamAssociation.getUserId() + "\" and team with ID \""
                + userTeamAssociation.getTeamId() + "\" will be deleted.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of teams that the user will be removed from: "
          + page.getTotalResultSetSize());

      if (page.getTotalResultSetSize() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE userId = :userId");

        // Create action.
        DeleteUserTeamAssociations action = new DeleteUserTeamAssociations();

        // Perform action.
        UpdateResult result =
            userTeamAssociationService.performUserTeamAssociationAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of teams that the user was removed from: "
              + result.getNumChanges());
        } else {
          System.out.println("No user team associations were deleted.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
