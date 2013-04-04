// Copyright 2013 Google Inc. All Rights Reserved.
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

package v201302.contactservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.v201302.Contact;
import com.google.api.ads.dfp.v201302.ContactPage;
import com.google.api.ads.dfp.v201302.ContactServiceInterface;
import com.google.api.ads.dfp.v201302.ContactStatus;
import com.google.api.ads.dfp.v201302.Statement;

/**
 * This example gets all contacts that aren't invited yet. The statement
 * retrieves up to the maximum page size limit of 500. To create contacts, run
 * CreateContactsExample.java.
 *
 * Tags: ContactService.getContactsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetContactsByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ContactService.
      ContactServiceInterface contactService =
          user.getService(DfpService.V201302.CONTACT_SERVICE);

      // Create a statement to only select contacts that aren't invited yet.
      Statement filterStatement =
          new StatementBuilder("WHERE status = :status LIMIT 500")
              .putValue("status", ContactStatus.UNINVITED.toString()).toStatement();

      // Get contacts by statement.
      ContactPage page = contactService.getContactsByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Contact contact : page.getResults()) {
          System.out.printf(
              "%s) Contact with ID \"%d\" and name \"%s\" was found.\n", i++,
              contact.getId(), contact.getName());
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
