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

package v201104.companyservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.Company;
import com.google.api.ads.dfp.v201104.CompanyPage;
import com.google.api.ads.dfp.v201104.CompanyServiceInterface;
import com.google.api.ads.dfp.v201104.Statement;

/**
 * This example gets all companies. To create companies, run
 * CreateCompaniesExample.java.
 */
public class GetAllCompaniesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201104.COMPANY_SERVICE);

      // Set defaults for page and filterStatement.
      CompanyPage page = new CompanyPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all companies.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get companies by statement.
        page = companyService.getCompaniesByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Company company : page.getResults()) {
            System.out.println(i + ") Company with ID \"" + company.getId()
                + "\", name \"" + company.getName()
                + "\", and type \"" + company.getType() + "\" was found.");
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
