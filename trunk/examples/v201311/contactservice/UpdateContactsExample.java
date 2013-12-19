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

package v201311.contactservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201311.Contact;
import com.google.api.ads.dfp.v201311.ContactServiceInterface;

/**
 * This example updates contact addresses. To determine which contacts exist,
 * run GetAllContactsExample.java.
 *
 * Tags: ContactService.getContact, ContactService.updateContacts
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateContactsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ContactService.
      ContactServiceInterface contactService =
          user.getService(DfpService.V201311.CONTACT_SERVICE);

      // Set the ID of the contact to update.
      Long contactId = Long.parseLong("INSERT_CONTACT_ID_HERE");

      // Get the contact.
      Contact contact = contactService.getContact(contactId);

      // Update the address of the contact.
      contact.setAddress("123 New Street, New York, NY, 10011");

      // Update the contact on the server.
      Contact[] contacts = contactService.updateContacts(new Contact[] {contact});

      for (Contact updatedContact : contacts) {
        System.out.printf(
            "Contact with ID \"%d\", name \"%s\", and address \"%s\" was updated.\n",
            updatedContact.getId(), updatedContact.getName(), updatedContact.getAddress());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
