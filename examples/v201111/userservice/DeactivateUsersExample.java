// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201111.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201111.StatementBuilder;
import com.google.api.ads.dfp.v201111.DeactivateUsers;
import com.google.api.ads.dfp.v201111.Statement;
import com.google.api.ads.dfp.v201111.UpdateResult;
import com.google.api.ads.dfp.v201111.User;
import com.google.api.ads.dfp.v201111.UserPage;
import com.google.api.ads.dfp.v201111.UserServiceInterface;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates a user. Deactivated users can no longer make
 * requests to the API. The user making the request cannot deactivate itself.
 * To determine which users exist, run GetAllUsersExample.java.
 *
 * Tags: UserService.getUsersByStatement, UserService.performUserAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivateUsersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201111.USER_SERVICE);

      // Set the ID of the user to deactivate
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");

      // Create filter text to select user by id.
      String statementText = "WHERE id = :userId LIMIT 500";
      Statement filterStatement =
        new StatementBuilder("")
            .putValue("userId", userId)
            .toStatement();

      // Set defaults for page and offset.
      UserPage page = new UserPage();
      int offset = 0;
      List<Long> userIds = new ArrayList<Long>();

      do {
        // Create a statement to page through users.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get users by statement.
        page = userService.getUsersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (User userResult : page.getResults()) {
            System.out.println(i + ") User with ID \"" + userResult.getId()
                + "\", email \"" + userResult.getEmail()
                + "\", and status \"" + (userResult.getIsActive() ? "ACTIVE" : "INACTIVE")
                + "\" will be deactivated.");
            userIds.add(userResult.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of users to be deactivated: " + userIds.size());

      if (userIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(userIds, ",") + ")");

        // Create action.
        DeactivateUsers action = new DeactivateUsers();

        // Perform action.
        UpdateResult result = userService.performUserAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of users deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No users were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
