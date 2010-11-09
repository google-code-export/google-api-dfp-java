// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201010.networkservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201010.Network;
import com.google.api.ads.dfp.v201010.NetworkServiceInterface;

/**
 * This example gets all networks that you have access to with the current login
 * credentials. A networkCode should be left out for this request.
 */
public class GetAllNetworksExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties". Comment out the networkCode field
      // to retrieve all networks you have access to.
      DfpUser user = new DfpUser();

      // Get the NetworkService.
      NetworkServiceInterface networkService =
          user.getService(DfpService.V201010.NETWORK_SERVICE);

      // Get all networks that you have access to with the current login
      // credentials.
      Network[] networks = networkService.getAllNetworks();

      int i = 0;
      for (Network network : networks) {
        System.out.println(i + ") Network with network code \"" + network.getNetworkCode()
            + "\" and display name \"" + network.getDisplayName() + "\" was found.");
        i++;
      }
      System.out.println("Number of networks found: " + i);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
