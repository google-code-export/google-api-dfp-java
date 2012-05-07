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
import com.google.api.ads.dfp.v201204.LabelPage;
import com.google.api.ads.dfp.v201204.LabelServiceInterface;
import com.google.api.ads.dfp.v201204.LabelType;
import com.google.api.ads.dfp.v201204.Statement;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example gets all labels. To create labels, run CreateLabelsExample.java.
 * This feature is only available to DFP premium solution networks.
 *
 * Tags: LabelService.getLabelsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllLabelsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LabelService.
      LabelServiceInterface labelService = user.getService(DfpService.V201204.LABEL_SERVICE);

      // Set defaults for page and filterStatement.
      LabelPage page = new LabelPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all labels.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get labels by statement.
        page = labelService.getLabelsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Label label : page.getResults()) {
            List<String> labelTypes = new ArrayList<String>();
            for (LabelType labelType : label.getTypes()) {
              labelTypes.add(labelType.toString());
            }
            System.out.println(i + ") Label with ID \"" + label.getId()
                + "\", name \"" + label.getName()
                + "\", and types {" + StringUtils.join(labelTypes, ",") + "} was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
