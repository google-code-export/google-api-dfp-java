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
import com.google.api.ads.dfp.lib.ServiceAccountant;
import com.google.api.ads.dfp.lib.ServiceAccountantManager;
import com.google.api.ads.dfp.v201211.CompanyServiceInterface;
import com.google.api.ads.dfp.v201211.CreativeServiceInterface;
import com.google.api.ads.dfp.v201211.InventoryServiceInterface;
import com.google.api.ads.dfp.v201211.Statement;
import com.google.api.ads.dfp.v201211.UserServiceInterface;

import org.apache.axis.client.Stub;

import java.rmi.RemoteException;

/**
 * This demo shows how to use the features of the
 * {@link ServiceAccountantManager} and the {@link ServiceAccountant} class.
 *
 * Tags: CreativeService.getCreativesByStatement
 * Tags: InventoryService.getAdUnitsByStatement
 * Tags: UserService.getUsersByStatement
 * Tags: CompanyService.getCompaniesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ServiceAccountantExample {
  public static void main(String args[]) throws Exception {
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Create the service accountant manager to automatically create
    // service accountants on first call and to not retain services.
    ServiceAccountantManager serviceAccountantManager = ServiceAccountantManager.getInstance();

    // Get the CompanyService.
    CompanyServiceInterface companyService = user.getService(DfpService.V201211.COMPANY_SERVICE);

    // Get the UserService.
    UserServiceInterface userService = user.getService(DfpService.V201211.USER_SERVICE);

    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        user.getService(DfpService.V201211.INVENTORY_SERVICE);

    // Turn on retain service here to just retain the creative service.
    serviceAccountantManager.setRetainServices(true);

    // Get the CreativeService.
    CreativeServiceInterface creativeService = user.getService(DfpService.V201211.CREATIVE_SERVICE);

    // Since autoCreateAccountant is set to true in the service accountant
    // manager, all service accountants will be created during this method call.
    performOperations(companyService, userService, inventoryService, creativeService);

    // Get the CompanyService ServiceAccountant.
    ServiceAccountant companyServiceAccountant =
        serviceAccountantManager.getServiceAccountant(companyService);

    // Get the UserService ServiceAccountant.
    ServiceAccountant userServiceAccountant =
        serviceAccountantManager.getServiceAccountant(userService);

    // Get the InventoryService ServiceAccountant.
    ServiceAccountant inventoryServiceAccountant =
        serviceAccountantManager.getServiceAccountant(inventoryService);

    // Get the CreativeService ServiceAccountant.
    ServiceAccountant creativeServiceAccountant =
        serviceAccountantManager.getServiceAccountant(creativeService);

    // Retrieve the total response time for each service object we used.
    System.out.println("CampaignService used "
        + companyServiceAccountant.getTotalResponseTime() + " millisecond(s).");
    System.out.println("UserService used "
        + userServiceAccountant.getTotalResponseTime() + " millisecond(s).");
    System.out.println("InventoryService used "
        + inventoryServiceAccountant.getTotalResponseTime() + " millisecond(s).");
    System.out.println("CreativeService used "
        + creativeServiceAccountant.getTotalResponseTime() + " millisecond(s).");

    // Retrieve the total amounts using the ServiceAccountantManager.
    System.out.println("There were " + ServiceAccountantManager.getInstance().getTotalResponseTime()
        + " millisecond(s) used all together.");
    System.out.println("There were "
        + ServiceAccountantManager.getInstance().getTotalOperationCount()
        + " operations performed all together.");

    // Get all services that were retained.
    Stub[] retainedServices = serviceAccountantManager.getRetainedServicesForUser(user);

    // Recall retained service to use again if needed.
    creativeService = (CreativeServiceInterface) retainedServices[0];

    // Retrieve the last response time for the creativeService object.
    System.out.println("The last call to CreativeService took "
        + serviceAccountantManager.getServiceAccountant(creativeService).getLastResponseTime()
        + " milliseconds.");

    // Remove retained service so that it can be garbage collected.
    serviceAccountantManager.removeService(creativeService);

    if (serviceAccountantManager.getRetainedServicesForUser(user).length == 0) {
      System.out.println("All services were cleared for garabage collection.");
    }

    // Remove all remaining retained services for the user, which should be
    // none at this point.
    serviceAccountantManager.removeAllServicesForUser(user);
  }

  /**
   * Performs a set of operations using the supplied services that should be
   * considered a black box for the purpose of this demo.
   *
   * @param companyService the company service
   * @param userService the user service
   * @param inventoryService the inventory service
   * @param creativeService the creative service
   * @throws RemoteException if the soap request fails
   */
  private static void performOperations(CompanyServiceInterface companyService,
      UserServiceInterface userService, InventoryServiceInterface inventoryService,
      CreativeServiceInterface creativeService) throws RemoteException {
    companyService.getCompaniesByStatement(new Statement("LIMIT 500", null));
    userService.getUsersByStatement(new Statement("LIMIT 500", null));
    inventoryService.getAdUnitsByStatement(new Statement("LIMIT 500", null));

    // Call twice to creative service.
    creativeService.getCreativesByStatement(new Statement("LIMIT 500", null));
    creativeService.getCreativesByStatement(new Statement("LIMIT 500", null));
  }
}
