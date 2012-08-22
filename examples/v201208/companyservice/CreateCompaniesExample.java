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

package v201208.companyservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201208.Company;
import com.google.api.ads.dfp.v201208.CompanyServiceInterface;
import com.google.api.ads.dfp.v201208.CompanyType;

/**
 * This example creates new companies. To determine which companies
 * exist, run GetAllCompaniesExample.java.
 *
 * Tags: CompanyService.createCompanies
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCompaniesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201208.COMPANY_SERVICE);

      // Create an array to store local company objects.
      Company[] companies = new Company[5];

      for (int i = 0; i < 5; i++) {
        Company company = new Company();
        company.setName("Advertiser #" + i);
        company.setType(CompanyType.ADVERTISER);
        companies[i] = company;
      }

      // Create the companies on the server.
      companies = companyService.createCompanies(companies);

      if (companies != null) {
        for (Company company : companies) {
          System.out.println("A company with ID \"" + company.getId()
              + "\", name \"" + company.getName()
              + "\", and type \"" + company.getType() + "\" was created.");
        }
      } else {
        System.out.println("No companies created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
