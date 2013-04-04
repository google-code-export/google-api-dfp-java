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

package v201302.creativesetservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201302.CreativeSet;
import com.google.api.ads.dfp.v201302.CreativeSetServiceInterface;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Random;

/**
 * This code example creates new creative sets. To determine which creative sets
 * exist, run GetAllCreativeSetsExample.java.
 *
 * Tags: CreativeSetService.createCreativeSet
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCreativeSetExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeSetService.
      CreativeSetServiceInterface creativeSetService =
          user.getService(DfpService.V201302.CREATIVE_SET_SERVICE);

      // Set the ID of the creatives to associate with this set.
      Long masterCreativeId = Long.parseLong("INSERT_MASTER_CREATIVE_ID_HERE");
      Long companionCreativeId = Long.parseLong("INSERT_COMPANION_CREATIVE_ID_HERE");

      CreativeSet creativeSet = new CreativeSet();
      creativeSet.setName("Creative set #" + new Random().nextLong());
      creativeSet.setMasterCreativeId(masterCreativeId);
      creativeSet.setCompanionCreativeIds(new long[] {companionCreativeId});

      // Create the creative set on the server.
      creativeSet = creativeSetService.createCreativeSet(creativeSet);

      if (creativeSet != null) {
        System.out.println("A creative set with ID \"" + creativeSet.getId()
            + "\", master creative ID \"" + creativeSet.getMasterCreativeId()
            + "\", and companion creative IDs {"
            + StringUtils.join(ArrayUtils.toObject(creativeSet.getCompanionCreativeIds()), ',')
            + "} was created.");
      } else {
        System.out.println("No creative sets created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
