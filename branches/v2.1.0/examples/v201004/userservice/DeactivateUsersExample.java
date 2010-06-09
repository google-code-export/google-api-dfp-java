// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201004.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201004.DeactivateUsers;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.UpdateResult;
import com.google.api.ads.dfp.v201004.User;
import com.google.api.ads.dfp.v201004.UserPage;
import com.google.api.ads.dfp.v201004.UserServiceInterface;

/**
 * This example deactivates a user. Deactivated users can no longer make
 * requests to the API. The user making the request cannot deactivate itself.
 * To determine which users exist, run GetAllUsersExample.java.
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
          user.getService(DfpService.V201004.USER_SERVICE);

      // Set the ID of the user to deactivate
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");

      // Create filter text to select user by id.
      String filterText = "WHERE id = " + userId;

      // Set defaults for page and filterStatement.
      UserPage page = new UserPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to page through users.
        filterStatement.setQuery(filterText + " LIMIT 500 OFFSET " + offset);

        // Get users by statement.
        page = userService.getUsersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (User userResult : page.getResults()) {
            System.out.println(i + ") User with ID \"" + userResult.getId()
                + "\", email \"" + userResult.getEmail()
                + "\", and status \"" + (userResult.getIsActive() ? "ACTIVE" : "INACTIVE")
                + "\" will be deactivated.");
            i++;
          }
        }

        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);


      System.out.println("Number of users to be deactivated: " + page.getTotalResultSetSize());

      // Modify statement for action.
      filterStatement.setQuery(filterText);

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
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
