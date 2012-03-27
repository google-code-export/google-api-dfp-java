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

package v201203.labelservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201203.StatementBuilder;
import com.google.api.ads.dfp.v201203.DeactivateLabels;
import com.google.api.ads.dfp.v201203.Label;
import com.google.api.ads.dfp.v201203.LabelPage;
import com.google.api.ads.dfp.v201203.LabelServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;
import com.google.api.ads.dfp.v201203.UpdateResult;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example deactivates all active labels. To determine which labels exist,
 * run GetAllLabelsExample.java. This feature is only available to DFP premium
 * solution networks.
 *
 * Tags: LabelService.getLabelsByStatement, LabelService.performLabelAction
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DeactivateLabelsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201203.LABEL_SERVICE);

      // Create statement text to select active labels.
      String statementText = "WHERE isActive = :isActive LIMIT 500";
      Statement filterStatement =
          new StatementBuilder("").putValue("isActive", true).toStatement();

      // Set defaults for page and offset.
      LabelPage page = new LabelPage();
      int offset = 0;
      List<Long> labelIds = new ArrayList<Long>();

      do {
        // Create a statement to page through active labels.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get labels by statement.
        page = labelService.getLabelsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Label label : page.getResults()) {
            System.out.println(i + ") Label with ID \"" + label.getId()
                + "\" and name \"" + label.getName()
                + "\" will be deactivated.");
            labelIds.add(label.getId());
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of labels to be deactivated: " + labelIds.size());

      if (labelIds.size() > 0) {
        // Modify statement for action.
        filterStatement.setQuery("WHERE id IN (" + StringUtils.join(labelIds, ",") + ")");

        // Create action.
        DeactivateLabels action = new DeactivateLabels();

        // Perform action.
        UpdateResult result = labelService.performLabelAction(action, filterStatement);

        // Display results.
        if (result != null && result.getNumChanges() > 0) {
          System.out.println("Number of labels deactivated: " + result.getNumChanges());
        } else {
          System.out.println("No labels were deactivated.");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
