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
import com.google.api.ads.dfp.lib.utils.v201208.StatementBuilder;
import com.google.api.ads.dfp.v201208.Statement;
import com.google.api.ads.dfp.v201208.Team;
import com.google.api.ads.dfp.v201208.TeamPage;
import com.google.api.ads.dfp.v201208.TeamServiceInterface;

/**
 * This example gets all teams ordered by name. The statement retrieves up to
 * the maximum page size limit of 500. To create teams, run
 * CreateTeamsExample.java.
 *
 * Tags: TeamService.getTeamsByStatement
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
      TeamServiceInterface teamService = user.getService(DfpService.V201208.TEAM_SERVICE);

      // Create a statement to order teams by name.
      Statement filterStatement =
          new StatementBuilder("ORDER BY name LIMIT 500")
              .toStatement();

      // Get teams by statement.
      TeamPage page = teamService.getTeamsByStatement(filterStatement);

      // Display results.
      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Team team : page.getResults()) {

          System.out.println(i + ") Team with ID \"" + team.getId()
              + "\" and name \"" + team.getName()
              + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
