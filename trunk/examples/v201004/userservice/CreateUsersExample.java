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
import com.google.api.ads.dfp.v201004.User;
import com.google.api.ads.dfp.v201004.UserServiceInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * This example creates new users. To determine which users
 * exist, run GetAllUsersExample.java.
 */
public class CreateUsersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201004.USER_SERVICE);

      // Set the user's email addresses and names.
      List<String[]> emailAndNames = new ArrayList<String[]>();
      emailAndNames.add(new String[] {"INSERT_EMAIL_ADDRESS_HERE",
          "INSERT_NAME_HERE"});
      emailAndNames.add(new String[] {"INSERT_ANOTHER_EMAIL_ADDRESS_HERE",
          "INSERT_ANOTHER_NAME_HERE"});

      // Roles can be obtained by running GetAllRolesExample.java.
      Long roleId = Long.parseLong("INSERT_ROLE_ID_HERE");

      // Create an array to store local user objects.
      User[] users = new User[emailAndNames.size()];

      for (int i = 0; i < users.length; i++) {
        // Create the new user structure.
        User newUser = new User();
        newUser.setEmail(emailAndNames.get(i)[0]);
        newUser.setName(emailAndNames.get(i)[1]);
        newUser.setRoleId(roleId);
        newUser.setPreferredLocale("en_US");

        users[i] = newUser;
      }

      // Create the users.
      users = userService.createUsers(users);

      if (users != null) {
        for (User newUser : users) {
          System.out.println("A user with ID \"" + newUser.getId()
              + "\", email \"" + newUser.getEmail()
              + "\", and role \"" + newUser.getRoleName() + "\" was created.");
        }
      } else {
        System.out.println("No users created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
