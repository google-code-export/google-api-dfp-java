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

package v201002.companyservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Company;
import com.google.api.ads.dfp.v201002.CompanyPage;
import com.google.api.ads.dfp.v201002.CompanyServiceInterface;
import com.google.api.ads.dfp.v201002.Filter;

/**
 * This example gets all companies that are advertisers. The filter
 * retrieves up to the maximum page size limit of 500. To create companies, run
 * CreateCompaniesExample.java.
 */
public class GetCompaniesByFilterExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CompanyService.
      CompanyServiceInterface companyService =
          user.getService(DfpService.V201002.COMPANY_SERVICE);

      // Create a filter to only select companies that are advertisers sorted
      // by name.
      Filter filter = new Filter("WHERE type = 'ADVERTISER' ORDER BY name LIMIT 500");

      // Get companies by filter.
      CompanyPage page = companyService.getCompaniesByFilter(filter);

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
