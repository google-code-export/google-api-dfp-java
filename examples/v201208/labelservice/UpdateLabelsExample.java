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

package v201208.labelservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201208.StatementBuilder;
import com.google.api.ads.dfp.v201208.Label;
import com.google.api.ads.dfp.v201208.LabelPage;
import com.google.api.ads.dfp.v201208.LabelServiceInterface;
import com.google.api.ads.dfp.v201208.Statement;

/**
 * This example updates the descriptions of all active labels by updating its
 * description up to the first 500. To determine which labels exist, run
 * GetAllLabelsExample.java. This feature is only available to DFP premium
 * solution networks.
 *
 * Tags: LabelService.getLabelsByStatement, LabelService.updateLabels
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateLabelsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201208.LABEL_SERVICE);

      // Create statement text to select active labels.
      Statement filterStatement = new StatementBuilder("WHERE isActive = :isActive LIMIT 500")
          .putValue("isActive", true).toStatement();

      // Get the labels by statement.
      LabelPage page =
          labelService.getLabelsByStatement(filterStatement);

      if (page.getResults() != null) {
        Label[] labels = page.getResults();

        // Update each local label object by updating its description.
        for (Label label : labels) {
          label.setDescription("These labels are updated.");
        }

        // Update the labels on the server.
        labels = labelService.updateLabels(labels);

        if (labels != null) {
          for (Label label : labels) {
            System.out.println("A label with ID \"" + label.getId()
                + "\" and name \"" + label.getName() + "\" was updated.");
          }
        } else {
          System.out.println("No labels updated.");
        }
      } else {
        System.out.println("No labels found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
