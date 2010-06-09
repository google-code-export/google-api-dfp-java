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

package v201002.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Filter;
import com.google.api.ads.dfp.v201002.User;
import com.google.api.ads.dfp.v201002.UserPage;
import com.google.api.ads.dfp.v201002.UserServiceInterface;

/**
 * This example updates all users by adding "Sr." to the end of each
 * name (after a very large baby boom and lack of creativity). To
 * determine which users exist, run GetAllUsersExample.java.
 */
public class UpdateUsersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201002.USER_SERVICE);

      // Create a filter to get all users.
      Filter filter = new Filter("LIMIT 500");

      // Get users by filter.
      UserPage page = userService.getUsersByFilter(filter);

      if (page.getResults() != null) {
        User[] users = page.getResults();

        // Update each local users object by changing its name.
        for (User usr : users) {
          usr.setName(usr.getName() + " Sr.");
        }

        // Update the users on the server.
        users = userService.updateUsers(users);

        if (users != null) {
          for (User usr : users) {
            System.out.println("A user with ID \"" + usr.getId()
                + "\", name \"" + usr.getName()
                + "\", and role \"" + usr.getRoleName() +  "\" was updated.");
          }
        } else {
          System.out.println("No users updated.");
        }
      } else {
        System.out.println("No users found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
