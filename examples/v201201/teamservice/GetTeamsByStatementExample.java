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

package v201201.teamservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201201.StatementBuilder;
import com.google.api.ads.dfp.v201201.Statement;
import com.google.api.ads.dfp.v201201.Team;
import com.google.api.ads.dfp.v201201.TeamPage;
import com.google.api.ads.dfp.v201201.TeamServiceInterface;
import com.google.api.ads.dfp.v201201.UserServiceInterface;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This example gets all teams that you belong to. The statement
 * retrieves up to the maximum page size limit of 500. To create teams, run
 * CreateTeamsExample.java.
 *
 * Tags: TeamService.getTeamsByStatement, UserService.getCurrentUser
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetTeamsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the TeamService.
      TeamServiceInterface teamService = user.getService(DfpService.V201201.TEAM_SERVICE);

      // Get the UserService.
      UserServiceInterface userService = user.getService(DfpService.V201201.USER_SERVICE);

      // Get the current user's teams.
      long[] teamIds = userService.getCurrentUser().getTeamIds();

      if (teamIds != null) {
        // Create a statement to only select teams by their IDs.
        Statement filterStatement =
            new StatementBuilder("WHERE id IN ("
                + StringUtils.join(ArrayUtils.toObject(teamIds), ',') + ") LIMIT 500")
                .toStatement();

        // Get teams by statement.
        TeamPage page = teamService.getTeamsByStatement(filterStatement);

        // Display results.
        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Team team : page.getResults()) {
            System.out.println(i + ") Team with ID \"" + team.getId()
                + "\", and name \"" + team.getName()
                + "\" was found.");
            i++;
          }
        }

        System.out.println("Number of results found: " + page.getTotalResultSetSize());
      } else {
        System.out.println("No teams found for current user.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
