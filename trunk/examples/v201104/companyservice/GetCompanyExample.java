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
import com.google.api.ads.dfp.v201104.CompanyServiceInterface;

/**
 * This example gets a company by its ID. To determine which companies
 * exist, run GetAllCompaniesExample.java.
 */
public class GetCompanyExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201104.COMPANY_SERVICE);

      // Set the ID of the company to get.
      Long companyId = Long.parseLong("INSERT_COMPANY_ID_HERE");

      // Get the company.
      Company company = companyService.getCompany(companyId);

      if (company != null) {
        System.out.println("Company with ID \"" + company.getId()
            + "\", name \"" + company.getName()
            + "\", and type \"" + company.getType() + "\" was found.");
      } else {
        System.out.println("No company found for this ID.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
