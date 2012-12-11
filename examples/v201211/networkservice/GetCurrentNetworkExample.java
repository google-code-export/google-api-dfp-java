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

package v201211.networkservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201211.Network;
import com.google.api.ads.dfp.v201211.NetworkServiceInterface;

/**
 * This example gets the current network that you can make requests against.
 *
 * Tags: NetworkService.getCurrentNetwork
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCurrentNetworkExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the NetworkService.
      NetworkServiceInterface networkService = user.getService(DfpService.V201211.NETWORK_SERVICE);

      // Get the current network.
      Network network = networkService.getCurrentNetwork();

      System.out.println("Current network has network code \"" + network.getNetworkCode()
          + "\" and display name \"" + network.getDisplayName() + "\".");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
