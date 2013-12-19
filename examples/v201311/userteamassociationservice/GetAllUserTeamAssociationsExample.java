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

package v201311.userteamassociationservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201311.Statement;
import com.google.api.ads.dfp.v201311.UserTeamAssociation;
import com.google.api.ads.dfp.v201311.UserTeamAssociationPage;
import com.google.api.ads.dfp.v201311.UserTeamAssociationServiceInterface;

/**
 * This example gets all user team associations. To create user team
 * associations, run CreateUserTeamAssociationsExample.java.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllUserTeamAssociationsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserTeamAssociationService.
      UserTeamAssociationServiceInterface userTeamAssociationService =
          user.getService(DfpService.V201311.USER_TEAM_ASSOCIATION_SERVICE);

      // Set defaults for page and filterStatement.
      UserTeamAssociationPage page = new UserTeamAssociationPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all user team associations.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get user team associations by statement.
        page = userTeamAssociationService.getUserTeamAssociationsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (UserTeamAssociation userTeamAssociation : page.getResults()) {
            System.out.println(i + ") User team association between user with ID \""
                + userTeamAssociation.getUserId() + "\" and team with ID \""
                + userTeamAssociation.getTeamId() + "\" was found.");
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
