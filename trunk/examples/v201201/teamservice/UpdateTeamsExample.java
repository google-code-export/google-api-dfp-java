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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This example updates teams by adding you to them up to the first 500. To
 * determine which teams exist, run GetAllTeamsExample.java.
 *
 * Tags: TeamService.getTeamsByStatement, TeamService.updateTeams
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateTeamsExample {
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

      // Get the current user's ID.
      long userId = userService.getCurrentUser().getId();

      // Create a statement to select first 500 teams.
      Statement filterStatement = new StatementBuilder("LIMIT 500").toStatement();

      // Get the teams by statement.
      TeamPage page = teamService.getTeamsByStatement(filterStatement);

      if (page.getResults() != null) {
        Team[] teams = page.getResults();

        List<Team> updatedTeams = new ArrayList<Team>();
        // Update each local team object by adding the current user to it.
        for (Team team : teams) {
          Set<Long> userIdSet = team.getUserIds() != null
              ? new HashSet<Long>(Arrays.asList(ArrayUtils.toObject(team.getUserIds())))
                  : new HashSet<Long>();
          if (userIdSet.add(userId)) {
            team.setUserIds(ArrayUtils.toPrimitive(userIdSet.toArray(new Long[] {})));
            updatedTeams.add(team);
          }
        }

        // Update the teams on the server.
        teams = teamService.updateTeams(updatedTeams.toArray(new Team[] {}));

        if (teams != null) {
          for (Team team : teams) {
            System.out.println("A team with ID \"" + team.getId()
                + "\" and name \"" + team.getName() + "\" was updated.");
          }
        } else {
          System.out.println("No teams updated.");
        }
      } else {
        System.out.println("No teams found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
