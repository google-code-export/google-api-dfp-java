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

package v201204.labelservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201204.Label;
import com.google.api.ads.dfp.v201204.LabelServiceInterface;
import com.google.api.ads.dfp.v201204.LabelType;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example creates new labels. To determine which labels exist, run
 * GetAllLabelsExample.java. This feature is only available to DFP premium
 * solution networks.
 *
 * Tags: LabelService.createLabels
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateLabelsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201204.LABEL_SERVICE);

      // Create an array to store local label objects.
      Label[] labels = new Label[5];

      for (int i = 0; i < 5; i++) {
        Label label = new Label();
        label.setName("Label #" + i);
        label.setTypes(new LabelType[] {LabelType.COMPETITIVE_EXCLUSION});
        labels[i] = label;
      }

      // Create the labels on the server.
      labels = labelService.createLabels(labels);

      if (labels != null) {
        for (Label label : labels) {
          List<String> labelTypes = new ArrayList<String>();
          for (LabelType labelType : label.getTypes()) {
            labelTypes.add(labelType.toString());
          }
          System.out.println("A label with ID \"" + label.getId()
              + "\", name \"" + label.getName()
              + "\", and types {" + StringUtils.join(labelTypes, ",") + "} was created.");
        }
      } else {
        System.out.println("No labels created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
