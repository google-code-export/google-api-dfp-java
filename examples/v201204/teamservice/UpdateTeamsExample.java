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

package v201204.teamservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201204.StatementBuilder;
import com.google.api.ads.dfp.v201204.Statement;
import com.google.api.ads.dfp.v201204.Team;
import com.google.api.ads.dfp.v201204.TeamPage;
import com.google.api.ads.dfp.v201204.TeamServiceInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example updates teams by adding an ad unit to the first 5. To
 * determine which teams exist, run GetAllTeamsExample.java. To determine
 * which ad units exist, run GetAllAdUnitsExample.java.
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
      TeamServiceInterface teamService = user.getService(DfpService.V201204.TEAM_SERVICE);

      // Set the ID of the ad unit to add to the teams.
      String adUnitId = "INSERT_AD_UNIT_ID_HERE";

      // Create a statement to select first 5 teams.
      Statement filterStatement = new StatementBuilder("LIMIT 5").toStatement();

      // Get the teams by statement.
      TeamPage page = teamService.getTeamsByStatement(filterStatement);

      if (page.getResults() != null) {
        Team[] teams = page.getResults();

        // Update each local team object by adding the ad unit to it.
        for (Team team : teams) {
          // Don't add ad unit if the team has all inventory already.
          if (!team.getHasAllInventory()) {
            List<String> adUnitIds = new ArrayList<String>();
            if (team.getAdUnitIds() != null) {
              adUnitIds.addAll(Arrays.<String>asList(team.getAdUnitIds()));
            }
            adUnitIds.add(adUnitId);
            team.setAdUnitIds(adUnitIds.toArray(new String[] {}));
          }
        }

        // Update the teams on the server.
        teams = teamService.updateTeams(teams);

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
