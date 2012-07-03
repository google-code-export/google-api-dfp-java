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

package v201206.publisherquerylanguageservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201206.PqlUtils;
import com.google.api.ads.dfp.lib.utils.v201206.StatementBuilder;
import com.google.api.ads.dfp.v201206.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.v201206.ResultSet;

/**
 * This example gets all cities available to target.
 *
 * A full list of available tables can be found at
 * http://code.google.com/apis/dfp/docs/reference/v201206/PublisherQueryLanguageService.html
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
          user.getService(DfpService.V201206.PUBLISHER_QUERY_LANGUAGE_SERVICE);

      // Create statement to select all targetable cities.
      // A limit of 500 is set here. You may want to page through such a large
      // result set.
      // For criteria that do not have a "targetable" property, that predicate
      // may be left off, i.e. just "SELECT * FROM Browser_Groups LIMIT 500"
      StatementBuilder statementBuilder =
          new StatementBuilder("SELECT * FROM City WHERE targetable = true LIMIT 500");

      // Get all cities.
      ResultSet resultSet = pqlService.select(statementBuilder.toStatement());

      // Display results.
      System.out.println(PqlUtils.resultSetToString(resultSet));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
