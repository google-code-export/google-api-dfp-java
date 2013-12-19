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

package v201311.creativesetservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.v201311.CreativeSet;
import com.google.api.ads.dfp.v201311.CreativeSetPage;
import com.google.api.ads.dfp.v201311.CreativeSetServiceInterface;
import com.google.api.ads.dfp.v201311.Statement;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This code example gets all creative sets for a master creative. The statement
 * retrieves up to the maximum page size limit of 500. To create creative sets,
 * run CreateCreativeSetExample.java.
 *
 * Tags: CreativeSetService.getCreativeSetsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCreativeSetsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeSetService.
      CreativeSetServiceInterface creativeSetService =
          user.getService(DfpService.V201311.CREATIVE_SET_SERVICE);

      // Set the ID of the master creative to get creative sets for.
      Long masterCreativeId = Long.parseLong("INSERT_MASTER_CREATIVE_ID_HERE");

      // Create statement object to only select creative sets that have the
      // given master creative.
      Statement filterStatement =
          new StatementBuilder("WHERE masterCreativeId = :masterCreativeId LIMIT 500")
              .putValue("masterCreativeId", masterCreativeId).toStatement();

      // Get creative sets by statement.
      CreativeSetPage page = creativeSetService.getCreativeSetsByStatement(filterStatement);

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

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
       e.printStackTrace();
    }
  }
}
