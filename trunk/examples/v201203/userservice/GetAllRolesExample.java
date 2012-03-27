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
import com.google.api.ads.dfp.v201203.Role;
import com.google.api.ads.dfp.v201203.UserServiceInterface;

/**
 * This example gets all roles. This example can be used to determine which
 * role ID is needed when getting and creating users.
 *
 * Tags: UserService.getAllRoles
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllRolesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201203.USER_SERVICE);

      // Get all roles.
      Role[] roles = userService.getAllRoles();
      int numRoles = 0;
      if (roles != null && roles.length > 0) {
        for (Role role : roles) {
          System.out.println("Role with ID \"" + role.getId()
              + "\" and name \"" + role.getName() + "\" was found.");
        }
        numRoles = roles.length;
      }

      System.out.println("Number of results found: " + numRoles);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
