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

package v201203.teamservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.Team;
import com.google.api.ads.dfp.v201203.TeamServiceInterface;
import com.google.api.ads.dfp.v201203.UserServiceInterface;

/**
 * This example creates new teams with the logged in user added to each
 * team. To determine which teams exist, run
 * GetAllTeamsExample.java.
 *
 * Tags: TeamService.createTeams, UserService.getCurrentUser
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateTeamsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the TeamService.
      TeamServiceInterface teamService = user.getService(DfpService.V201203.TEAM_SERVICE);

      // Get the UserService.
      UserServiceInterface userService = user.getService(DfpService.V201203.USER_SERVICE);

      // Get the current user's ID.
      long userId = userService.getCurrentUser().getId();

      // Create an array to store local team objects.
      Team[] teams = new Team[5];

      for (int i = 0; i < 5; i++) {
        Team team = new Team();
        team.setName("Team #" + i);
        team.setUserIds(new long[] {userId});
        team.setHasAllCompanies(true);
        team.setHasAllInventory(true);
        teams[i] = team;
      }

      // Create the teams on the server.
      teams = teamService.createTeams(teams);

      if (teams != null) {
        for (Team team : teams) {
          System.out.println("A team with ID \"" + team.getId() + "\", and name \""
              + team.getName() + "\" was created.");
        }
      } else {
        System.out.println("No teams created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
