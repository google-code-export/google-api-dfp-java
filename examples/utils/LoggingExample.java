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

package utils;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.ServiceAccountantManager;
import com.google.api.ads.dfp.v201108.Company;
import com.google.api.ads.dfp.v201108.CompanyPage;
import com.google.api.ads.dfp.v201108.CompanyServiceInterface;
import com.google.api.ads.dfp.v201108.Statement;

import org.apache.log4j.Level;

/**
 * This demo shows how to use the {@link DfpServiceLogger} class to do
 * runtime logging configuration.
 *
 * Tags: CompanyService.getCompaniesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class LoggingExample {
  public static void main(String[] args) throws Exception {
    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the CompanyService.
    CompanyServiceInterface companyService =
        user.getService(DfpService.V201108.COMPANY_SERVICE);

    // Initialize the root logger so that all messages do not filter up.
    DfpServiceLogger.initRootLogger();

    // Log the incoming and outgoing XML to System.out;
    DfpServiceLogger.logToStream(DfpServiceLogger.SOAP_XML_LOG, System.out);

    // Fake an exception to test logger which will not work yet.
    DfpServiceLogger.DFP_API_LIB_LOG.error("Error in the library.",
        new NullPointerException());

    // Log errors of the DFP library to System.err.
    DfpServiceLogger.logToStream(DfpServiceLogger.DFP_API_LIB_LOG, System.err, Level.ERROR);

    // Fake an exception to test logger which will work now.
    DfpServiceLogger.DFP_API_LIB_LOG.error("Error in the library.", new NullPointerException());

    // Get companies by filter.
    CompanyPage page = companyService.getCompaniesByStatement(new Statement("LIMIT 1", null));

    if (page.getResults() != null) {
      int i = page.getStartIndex();
      for (Company company : page.getResults()) {
        System.out.println(i + ") Company with ID \"" + company.getId()
            + "\", name \"" + company.getName()
            + "\", and type \"" + company.getType() + "\" was found.");
        i++;
      }
    }

    // Determine how much response time all these operations have consumed.
    System.out.println("Total Quota unit cost for this run: "
        + ServiceAccountantManager.getInstance().getTotalResponseTime());
  }
}
