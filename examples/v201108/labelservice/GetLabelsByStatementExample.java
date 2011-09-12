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
import com.google.api.ads.dfp.lib.utils.v201108.StatementBuilder;
import com.google.api.ads.dfp.v201108.Label;
import com.google.api.ads.dfp.v201108.LabelPage;
import com.google.api.ads.dfp.v201108.LabelServiceInterface;
import com.google.api.ads.dfp.v201108.LabelType;
import com.google.api.ads.dfp.v201108.Statement;

/**
 * This example gets all labels that are competitively excluded. The statement
 * retrieves up to the maximum page size limit of 500. To create labels, run
 * CreateLabelsExample.java. This feature is only available to DFP premium
 * solution networks.
 *
 * Tags: LabelService.getLabelsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetLabelsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201108.LABEL_SERVICE);

      // Create a statement to only select labels that are competitive
      // sorted by name.
      Statement filterStatement =
          new StatementBuilder("WHERE type = :type ORDER BY name LIMIT 500")
              .putValue("type", LabelType.COMPETITIVE_EXCLUSION.toString()).toStatement();

      // Get labels by statement.
      LabelPage page = labelService.getLabelsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Label label : page.getResults()) {
          System.out.println(i + ") Label with ID \"" + label.getId()
              + "\", name \"" + label.getName()
              + "\", and type \"" + label.getType() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
