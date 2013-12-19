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

package v201308.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201308.User;
import com.google.api.ads.dfp.v201308.UserServiceInterface;

/**
 * This example gets a user by its ID. To create users, run
 * CreateUsersExample.java.
 *
 * Tags: UserService.getUser
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetUserExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201308.USER_SERVICE);

      // Set the ID of the user to get.
      Long userId = Long.parseLong("INSERT_USER_ID_HERE");

      // Get the user.
      User usr = userService.getUser(userId);

      if (usr != null) {
        System.out.println("User with ID \"" + usr.getId()
            + "\" email \"" + usr.getEmail()
            + "\", and role \"" + usr.getRoleName() + "\" was found.");
      } else {
        System.out.println("No user found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
