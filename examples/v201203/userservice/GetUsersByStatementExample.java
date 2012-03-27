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

package v201203.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.Statement;
import com.google.api.ads.dfp.v201203.User;
import com.google.api.ads.dfp.v201203.UserPage;
import com.google.api.ads.dfp.v201203.UserServiceInterface;

/**
 * This example gets all users sorted by name. The statement retrieves
 * up to the maximum page size limit of 500. To create new users,
 * run CreateUsersExample.java.
 *
 * Tags: UserService.getUsersByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetUsersByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201203.USER_SERVICE);

      // Create a statement to get all users sorted by name.
      Statement filterStatement = new Statement("ORDER BY name LIMIT 500", null);

      // Get users by statement.
      UserPage page = userService.getUsersByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (User usr : page.getResults()) {
          System.out.println(i + ") User with ID \"" + usr.getId()
              + "\", email \"" + usr.getEmail()
              + "\", and role \"" + usr.getRoleName() + "\" was found.");
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
