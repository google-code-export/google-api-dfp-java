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

package v201206.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.Statement;
import com.google.api.ads.dfp.v201206.UserServiceInterface;
import com.google.api.ads.dfp.v201206.UserTeamAssociation;
import com.google.api.ads.dfp.v201206.UserTeamAssociationPage;
import com.google.api.ads.dfp.v201206.UserTeamAssociationServiceInterface;

/**
 * This example gets all teams that the current user belongs to. The statement
 * retrieves up to the maximum page size limit of 500. To create teams, run
 * CreateTeamsExample.java.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetUserTeamAssociationsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201206.USER_TEAM_ASSOCIATION_SERVICE);

      // Get the UserService.
      UserServiceInterface userService = user.getService(DfpService.V201206.USER_SERVICE);

      // Get the current user.
      long currentUserId = userService.getCurrentUser().getId();

      // Create filter text to select user team associations by the user ID.
      String statementText = "WHERE userId = :userId LIMIT 500";
      Statement filterStatement =
        new StatementBuilder("")
            .putValue("userId", currentUserId)
            .toStatement();

      // Get user team associations by statement.
      UserTeamAssociationPage page =
          userTeamAssociationService.getUserTeamAssociationsByStatement(filterStatement);

      // Display results.
      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (UserTeamAssociation userTeamAssociation : page.getResults()) {
          System.out.println(i + ") User team association between user with ID \""
              + userTeamAssociation.getUserId() + "\" and team with ID \""
              + userTeamAssociation.getTeamId() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
