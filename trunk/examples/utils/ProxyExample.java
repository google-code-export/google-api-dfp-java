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
import com.google.api.ads.dfp.v201306.CompanyPage;
import com.google.api.ads.dfp.v201306.CompanyServiceInterface;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This demo shows how to use a proxy without using JVM parameters. The proxy
 * will be used by Axis and the HTTP client to fetch authentication tokens.
 *
 * Tags: CompanyService.getCompaniesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ProxyExample {
  public static void main(String[] args) throws Exception {
    // Set the proxy information.
    System.setProperty("https.proxyHost", "INSERT_PROXY_HOST_HERE");
    System.setProperty("https.proxyPort", "INSERT_PROXY_PORT_HERE");
    // Uncomment the following two lines if needed.
    //System.setProperty("https.proxyUser", "INSERT_PROXY_USER_HERE");
    //System.setProperty("https.proxyPassword", "INSERT_PROXY_PASSWORD_HERE");

    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the CompanyService.
    CompanyServiceInterface companyService =
        user.getService(DfpService.V201306.COMPANY_SERVICE);

    // Get companies by filter.
    CompanyPage page = companyService.getCompaniesByStatement(new Statement("LIMIT 1", null));
  }
}
