// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201004.companyservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.StatementBuilder;
import com.google.api.ads.dfp.v201004.Company;
import com.google.api.ads.dfp.v201004.CompanyPage;
import com.google.api.ads.dfp.v201004.CompanyServiceInterface;
import com.google.api.ads.dfp.v201004.CompanyType;
import com.google.api.ads.dfp.v201004.Statement;

/**
 * This example gets all companies that are advertisers. The statement
 * retrieves up to the maximum page size limit of 500. To create companies, run
 * CreateCompaniesExample.java.
 */
public class GetCompaniesByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201004.COMPANY_SERVICE);

      // Create a statement to only select companies that are advertisers sorted
      // by name.
      Statement filterStatement =
          new StatementBuilder("WHERE type = :type ORDER BY name LIMIT 500")
              .putParam("type", CompanyType.ADVERTISER.toString()).toStatement();

      // Get companies by statement.
      CompanyPage page = companyService.getCompaniesByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Company company : page.getResults()) {
          System.out.println(i + ") Company with ID \"" + company.getId()
              + "\", name \"" + company.getName()
              + "\", and type \"" + company.getType() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
