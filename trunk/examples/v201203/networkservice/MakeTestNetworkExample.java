// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201203.networkservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.Network;
import com.google.api.ads.dfp.v201203.NetworkServiceInterface;

/**
 * This example creates a test network. You do not need to have a DFP account to
 * run this example, but you do need to have a new Google account (created at
 * http://www.google.com/accounts/newaccount) that is not associated with any
 * other DFP networks (including old sandbox networks). Once this network is
 * created, you can supply the network code in your settings to make calls to
 * other services.
 *
 * Please see the following URL for more information:
 * https://developers.google.com/doubleclick-publishers/docs/signup
 *
 * Tags: NetworkService.makeTestNetwork()
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class MakeTestNetworkExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the NetworkService.
      NetworkServiceInterface networkService = user.getService(DfpService.V201203.NETWORK_SERVICE);

      // Make the test network.
      Network network = networkService.makeTestNetwork();

      System.out.println("Test network with network code \"" + network.getNetworkCode()
          + "\" and display name \"" + network.getDisplayName() + "\" created.\n"
          + "You may now sign in at http://www.google.com/dfp/main?networkCode="
          + network.getNetworkCode());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
