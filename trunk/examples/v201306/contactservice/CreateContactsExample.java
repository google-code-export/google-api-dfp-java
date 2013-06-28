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

package v201306.contactservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201306.Contact;
import com.google.api.ads.dfp.v201306.ContactServiceInterface;

import java.util.Random;

/**
 * This example creates new contacts. To determine which contacts exist, run
 * GetAllContactsExample.java.
 *
 * Tags: ContactService.createContacts
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateContactsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ContactService.
      ContactServiceInterface contactService =
          user.getService(DfpService.V201306.CONTACT_SERVICE);

      // Set the IDs of the companies for the contacts.
      Long advertiserCompanyId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");
      Long agencyCompanyId = Long.parseLong("INSERT_AGENCY_COMPANY_ID_HERE");

      // Create an advertiser contact.
      Contact advertiserContact = new Contact();
      advertiserContact.setName("Mr. Advertiser #" + new Random().nextLong());
      advertiserContact.setEmail("advertiser@advertising.com");
      advertiserContact.setCompanyId(advertiserCompanyId);

      // Create an agency contact.
      Contact agencyContact = new Contact();
      agencyContact.setName("Ms. Agency #" + new Random().nextLong());
      agencyContact.setEmail("agency@agencies.com");
      agencyContact.setCompanyId(agencyCompanyId);

      // Create the contacts on the server.
      Contact[] contacts =
          contactService.createContacts(new Contact[] {advertiserContact, agencyContact});

      for (Contact contact : contacts) {
        System.out.printf("A contact with ID \"%d\" and name \"%s\" was created.\n",
            contact.getId(), contact.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
