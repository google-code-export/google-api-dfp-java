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

package v201108.labelservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201108.Label;
import com.google.api.ads.dfp.v201108.LabelServiceInterface;

/**
 * This example gets a label by its ID. To determine which labels exist, run
 * GetAllLabelsExample.java.  This feature is only available to DFP premium
 * solution networks.
 *
 * Tags: LabelService.getLabel
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetLabelExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201108.LABEL_SERVICE);

      // Set the ID of the label to get.
      Long labelId = Long.parseLong("INSERT_LABEL_ID_HERE");

      // Get the label.
      Label label = labelService.getLabel(labelId);

      if (label != null) {
        System.out.println("Label with ID \"" + label.getId()
            + "\", name \"" + label.getName()
            + "\", and type \"" + label.getType() + "\" was found.");
      } else {
        System.out.println("No label found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
