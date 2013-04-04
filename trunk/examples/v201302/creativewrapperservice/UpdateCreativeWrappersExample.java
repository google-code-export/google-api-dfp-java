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

package v201302.creativewrapperservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.CreativeWrapper;
import com.google.api.ads.dfp.v201302.CreativeWrapperOrdering;
import com.google.api.ads.dfp.v201302.CreativeWrapperServiceInterface;

/**
 * This code example updates a creative wrapper to the 'OUTER' wrapping order.
 * To determine which creative wrappers exist, run
 * GetAllCreativeWrappersExample.java.
 *
 * Tags: CreativeWrapperService.getCreativeWrapper
 * Tags: CreativeWrapperService.updateCreativeWrappers
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCreativeWrappersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeWrapperService.
      CreativeWrapperServiceInterface creativeWrapperService =
          user.getService(DfpService.V201302.CREATIVE_WRAPPER_SERVICE);

      Long creativeWrapperId = Long.parseLong("INSERT_CREATIVE_WRAPPER_LABEL_ID_HERE");

      // Get the creative wrapper.
      CreativeWrapper creativeWrapper1 =
          creativeWrapperService.getCreativeWrapper(creativeWrapperId);

      creativeWrapper1.setOrdering(CreativeWrapperOrdering.OUTER);

      // Update the creative wrappers on the server.
      CreativeWrapper[] creativeWrappers =
          creativeWrapperService.updateCreativeWrappers(new CreativeWrapper[] {creativeWrapper1});

      for (CreativeWrapper creativeWrapper : creativeWrappers) {
        System.out.printf(
            "Creative wrapper with ID \"%s\" and wrapping order \"%s\" was updated.\n",
            creativeWrapper.getId(), creativeWrapper.getOrdering());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
