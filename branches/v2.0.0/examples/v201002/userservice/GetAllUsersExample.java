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
 * This example gets all users. To create users, run CreateUsersExample.java.
 */
public class GetAllUsersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201002.USER_SERVICE);

      // Sets defaults for page and filter.
      UserPage page = new UserPage();
      Filter filter = new Filter();
      int offset = 0;

      do {
        // Create a filter to get all users.
        filter.setText("LIMIT 500 OFFSET " + offset);

        // Get users by filter.
        page = userService.getUsersByFilter(filter);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (User usr : page.getResults()) {
            System.out.println(i + ") User with ID \"" + usr.getId()
                + "\", email \"" + usr.getEmail()
                + "\", and role \"" + usr.getRoleName() + "\" was found.");
            i++;
          }
        }
        offset += 500;
      } while (page.getResults() != null && page.getResults().length == 500);

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
