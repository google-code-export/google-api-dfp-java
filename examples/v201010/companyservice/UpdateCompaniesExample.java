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

package v201010.companyservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201010.StatementBuilder;
import com.google.api.ads.dfp.v201010.Company;
import com.google.api.ads.dfp.v201010.CompanyPage;
import com.google.api.ads.dfp.v201010.CompanyServiceInterface;
import com.google.api.ads.dfp.v201010.CompanyType;
import com.google.api.ads.dfp.v201010.Statement;

/**
 * This example updates the names of all companies that are advertisers by
 * appending "LLC." up to the first 500. To determine which companies exist, run
 * GetAllCompaniesExample.java.
 *
 * Tags: CompanyService.getCompaniesByStatement, CompanyService.updateCompanies
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCompaniesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201010.COMPANY_SERVICE);

      // Create a statement to only select companies that are advertisers.
      Statement filterStatement =
          new StatementBuilder("WHERE type = :type LIMIT 500")
              .putParam("type", CompanyType.ADVERTISER.toString()).toStatement();

      // Get the companies by statement.
      CompanyPage page =
          companyService.getCompaniesByStatement(filterStatement);

      if (page.getResults() != null) {
        Company[] companies = page.getResults();

        // Update each local company object by appending LLC. to its name.
        for (Company company : companies) {
          company.setName(company.getName() + " LLC.");
        }

        // Update the companies on the server.
        companies = companyService.updateCompanies(companies);

        if (companies != null) {
          for (Company company : companies) {
            System.out.println("A company with ID \"" + company.getId()
                + "\" and name \"" + company.getName() + "\" was updated.");
          }
        } else {
          System.out.println("No companies updated.");
        }
      } else {
        System.out.println("No companies found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
