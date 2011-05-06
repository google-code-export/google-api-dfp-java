// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201104.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.Creative;
import com.google.api.ads.dfp.v201104.CreativeServiceInterface;

/**
 * This example gets a creative by its ID. To determine which creatives
 * exist, run GetAllCreativesExample.java.
 */
public class GetCreativeExample {
  public static void main(final String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201104.CREATIVE_SERVICE);

      // Set the ID of the creative to get.
      Long creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");

      // Get the creative.
      Creative creative = creativeService.getCreative(creativeId);

      if (creative != null) {
        System.out.println("Creative with ID \"" + creative.getId()
             + "\", name \"" + creative.getName()
             + "\", and type \"" + creative.getCreativeType() + "\" was found.");
      } else {
        System.out.println("No creative found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
