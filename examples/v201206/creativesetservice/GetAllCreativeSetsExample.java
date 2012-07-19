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

package v201206.creativesetservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201206.CreativeSet;
import com.google.api.ads.dfp.v201206.CreativeSetPage;
import com.google.api.ads.dfp.v201206.CreativeSetServiceInterface;
import com.google.api.ads.dfp.v201206.Statement;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This example gets all creative sets. To create creative sets, run
 * CreateCreativeSetExample.java.
 *
 * Tags: CreativeService.getCreativesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCreativeSetsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeSetService.
      CreativeSetServiceInterface creativeSetService =
          user.getService(DfpService.V201206.CREATIVE_SET_SERVICE);

      // Set defaults for page and filterStatement.
      CreativeSetPage page = new CreativeSetPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all creative sets.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get creative sets by statement.
        page = creativeSetService.getCreativeSetsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (CreativeSet creativeSet : page.getResults()) {
            System.out.println(i + ") Creative set with ID \"" + creativeSet.getId()
                + "\", master creative ID \"" + creativeSet.getMasterCreativeId()
                + "\", and companion creative IDs {"
                + StringUtils.join(ArrayUtils.toObject(creativeSet.getCompanionCreativeIds()), ',')
                + "} was found.");
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
