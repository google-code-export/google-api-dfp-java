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

package v201208.teamservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201208.Team;
import com.google.api.ads.dfp.v201208.TeamServiceInterface;

/**
 * This example gets a team by its ID. To determine which teams exist, run
 * GetAllTeamsExample.java.
 *
 * Tags: TeamService.getTeam
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetTeamExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the TeamService.
      TeamServiceInterface teamService = user.getService(DfpService.V201208.TEAM_SERVICE);

      // Set the ID of the team to get.
      Long teamId = Long.parseLong("INSERT_TEAM_ID_HERE");

      // Get the team.
      Team team = teamService.getTeam(teamId);

      if (team != null) {
        System.out.println("Team with ID \"" + team.getId() + "\"and name \"" + team.getName()
            + "\" was found.");
      } else {
        System.out.println("No team found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
