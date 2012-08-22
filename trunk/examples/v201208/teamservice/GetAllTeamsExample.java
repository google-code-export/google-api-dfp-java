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
import com.google.api.ads.dfp.v201208.Statement;
import com.google.api.ads.dfp.v201208.Team;
import com.google.api.ads.dfp.v201208.TeamPage;
import com.google.api.ads.dfp.v201208.TeamServiceInterface;

/**
 * This example gets all teams. To create teams, run CreateTeamsExample.java.
 *
 * Tags: TeamService.getTeamsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllTeamsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the TeamService.
      TeamServiceInterface teamService = user.getService(DfpService.V201208.TEAM_SERVICE);

      // Set defaults for page and filterStatement.
      TeamPage page = new TeamPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all teams.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get teams by statement.
        page = teamService.getTeamsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Team team : page.getResults()) {
            System.out.println(i + ") Team with ID \"" + team.getId()
                + "\", name \"" + team.getName() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
