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

package v201208.publisherquerylanguageservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.CsvUtils;
import com.google.api.ads.dfp.lib.utils.v201208.PqlUtils;
import com.google.api.ads.dfp.lib.utils.v201208.StatementBuilder;
import com.google.api.ads.dfp.v201208.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.v201208.ResultSet;
import com.google.api.ads.dfp.v201208.Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example gets all cities available to target. This example will take
 * a while to run.
 *
 * A full list of available tables can be found at
 * http://code.google.com/apis/dfp/docs/reference/v201208/PublisherQueryLanguageService.html
 *
 * Tags: PublisherQueryLanguageService.select
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCitiesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PublisherQueryLanguageService.
      PublisherQueryLanguageServiceInterface pqlService =
          user.getService(DfpService.V201208.PUBLISHER_QUERY_LANGUAGE_SERVICE);

      // Create statement to select all targetable cities.
      // For criteria that do not have a "targetable" property, that predicate
      // may be left off, i.e. just "SELECT * FROM Browser_Groups LIMIT 500"
      String selectStatement = "SELECT * FROM City WHERE targetable = true LIMIT 500";
      int offset = 0;
      int resultSetSize = 0;
      List<Row> allRows = new ArrayList<Row>();
      ResultSet resultSet;
      
      do {
        StatementBuilder statementBuilder =
            new StatementBuilder(selectStatement + " OFFSET " + offset);
        
        // Get all cities.
        resultSet = pqlService.select(statementBuilder.toStatement());

        // Collect all cities from each page.
        allRows.addAll(Arrays.asList(resultSet.getRows()));
        
        // Display results.
        System.out.println(PqlUtils.resultSetToString(resultSet));
        
        offset += 500;
        resultSetSize = resultSet.getRows() == null ? 0 : resultSet.getRows().length;
      } while (resultSetSize == 500);
      
      System.out.println("Number of results found: " + allRows.size());
      
      // Optionally, save all rows to a CSV.
      resultSet.setRows(allRows.toArray(new Row[] {}));
      CsvUtils.writeCsv(PqlUtils.resultSetToStringArrayList(resultSet), "cities.csv");       
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
