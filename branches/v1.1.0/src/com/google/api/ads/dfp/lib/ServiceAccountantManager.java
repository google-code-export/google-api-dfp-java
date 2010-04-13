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

package com.google.api.ads.dfp.lib;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Stub;

import java.rmi.Remote;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.rpc.Service;
import javax.xml.soap.SOAPException;

/**
 * The {@code ServiceAccountantManager} manages all instances of {@code
 * ServiceAccountant} by reference to the {@code javax.xml.rpc.Service}
 * hashcode.
 * <p>
 * This class is intended to be used by the HTTP transport layer of the Axis
 * engine; i.e. {@link DfpHttpSender#invoke(MessageContext)} calls
 * {@link #recordMessage(MessageContext)}.
 * </p>
 * <p>
 * The default behavior of the manager is to create service accountants
 * automatically when the first response is received for that service and to not
 * retain a reference to that service. A service which accounting is enabled for
 * is called a "registered" service. A service which has its reference managed
 * by this manager is called a "retained" service. If you would like to retain
 * references to all created services (so this class can be used a service
 * manager), then {@link #setRetainServices(boolean)} should be called with
 * {@code true}. This can also be set by setting the jvm property: {@code
 * com.google.api.ads.dfp.lib.serviceaccountantmanager.retainservice=true}
 * </p>
 * <p>
 * For memory management, the {@link #clear()} method can be used to remove all
 * references to services so that they may be garbage collected. Again, this is
 * only needed if service retention is enabled (not by default).
 * </p>
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class ServiceAccountantManager {
  private boolean autoCreateAccountant;
  private boolean retainServices;

  private final static String AUTO_CREATE_ACCOUNTANT_PROPERTY =
      "com.google.api.ads.dfp.lib.serviceaccountantmanager.autocreateaccountant";
  private final static String RETAIN_SERVICE_PROPERTY =
      "com.google.api.ads.dfp.lib.serviceaccountantmanager.retainservice";

  private long totalTime;
  private long totalOperations;

  private Map<Integer, ServiceAccountant> serviceAccountants;
  private Map<Integer, DfpUser> serviceUsers;
  private Map<Integer, Stub> retainedStubs;

  private static volatile ServiceAccountantManager instance =
      new ServiceAccountantManager(true, false);

  /**
   * The following properties will override the constructors parameters
   * respectively:
   *
   * com.google.api.ads.dfp.lib.serviceaccountantmanager.retainservice
   * com.google.api.ads.dfp.lib.serviceaccountantmanager.autocreateaccountant
   *
   * @param autoCreateAccountant {@code true} if accountants should be created
   *     automatically
   * @param retainServices {@code true} if service references should be retained
   */
  private ServiceAccountantManager(boolean autoCreateAccountant, boolean retainServices) {
    serviceAccountants = new ConcurrentHashMap<Integer, ServiceAccountant>();
    serviceUsers = new ConcurrentHashMap<Integer, DfpUser>();
    retainedStubs = new ConcurrentHashMap<Integer, Stub>();

    if (System.getProperty(RETAIN_SERVICE_PROPERTY) != null) {
      this.retainServices = Boolean.parseBoolean(System.getProperty(RETAIN_SERVICE_PROPERTY));
    } else {
      this.retainServices = retainServices;
    }

    if (System.getProperty(AUTO_CREATE_ACCOUNTANT_PROPERTY) != null) {
      this.autoCreateAccountant =
          Boolean.parseBoolean(System.getProperty(AUTO_CREATE_ACCOUNTANT_PROPERTY));
    } else {
      this.autoCreateAccountant = autoCreateAccountant;
    }
  }

  /**
   * Gets the singleton instance of the {@code ServiceAccountantManager}, in
   * which the service accounant will be automatically created upon the first
   * service call and services will not be retained.
   *
   * @return the singleton instance of the {@code ServiceAccountantManager}
   */
  public static ServiceAccountantManager getInstance() {
    if (instance == null) {
      instance = new ServiceAccountantManager(true, false);
    }
    return instance;
  }

  /**
   * Sets the serivce accountant manager to auto create the service accountant
   * upon the first call.
   *
   * @param autoCreateAccountant {@code true} if a service accountant should be
   *     created on first call to the service it represents
   */
  public void setAutoCreateAccountant(boolean autoCreateAccountant) {
    this.autoCreateAccountant = autoCreateAccountant;
  }

  /**
   * Returns {@code true} if service accountant auto creation is turned on.
   *
   * @return {@code true} if service accountant auto creation is turned on
   */
  public boolean isAutoCreateAccountant() {
    return autoCreateAccountant;
  }

  /**
   * Sets the serivce accountant manager to retain services on a
   * {@link #putService(Stub, DfpUser)} call, instead of just the hash
   * code of the service. The services can then be pulled by calling
   * {@link #getRetainedServicesForUser(DfpUser)}.
   *
   * @param retainServices {@code true} if a service accountant should be
   *     created on first call to the service it represents
   */
  public void setRetainServices(boolean retainServices) {
    this.retainServices = retainServices;
  }

  /**
   * Returns {@code true} if service retention is turned on.
   *
   * @return {@code true} if service retention is turned on
   */
  public boolean isRetainServices() {
    return retainServices;
  }

  /**
   * Clears the service accountant manager's counters.
   */
  public void clearCounters() {
    totalTime = 0;
    totalOperations = 0;
  }

  /**
   * Creates an association between the service and the user so that the user
   * can be recalled in the future using just the service.
   *
   * @param stub the Dfp service
   * @param user the {@code DfpUser} to association with the service
   */
  public void putService(Stub stub, DfpUser user) {
    serviceUsers.put(stub._getService().hashCode(), user);
    if (retainServices) {
      retainedStubs.put(stub._getService().hashCode(), stub);
    }
  }

  /**
   * Gets the service accountant for the service provided. Returns {@code null}
   * if there is no service accountant associated with the service. This method
   * performs the same actions as
   * {@link ServiceAccountantManager#getServiceAccountant(Service)}.
   *
   * @param remote the {@link Remote} instance of the stub for the service
   * @return the service accountant or {@code null}, if one does not exist
   * @throws IllegalArgumentException if {@code remote} is not an instance of
   *     a {@link Stub}.
   */
  public ServiceAccountant getServiceAccountant(Remote remote) {
    if (remote instanceof Stub) {
      return getServiceAccountant((Stub) remote);
    } else {
      throw new IllegalArgumentException("The Remote object must be an instance of a Stub.");
    }
  }

  /**
   * Gets the service accountant for the service provided. Returns {@code null}
   * if there is no service accountant associated with the service. This method
   * performs the same actions as
   * {@link ServiceAccountantManager#getServiceAccountant(Service)}.
   *
   * @param stub the stub to get the accountant for
   * @return the service accountant or {@code null}, if one does not exist.
   */
  public ServiceAccountant getServiceAccountant(Stub stub) {
    return getServiceAccountant(stub._getService());
  }

  /**
   * Gets the service accountant for the service provided. Returns {@code null}
   * if there is no service accountant associated with the service.
   *
   * @param service the service to get the accountant for
   * @return the service accountant or {@code null}, if one does not exist.
   */
  public ServiceAccountant getServiceAccountant(Service service) {
    return serviceAccountants.get(service.hashCode());
  }

  /**
   * Removes all references to the supplied service in the manager. Typically,
   * this should be done if the service is no longer needed. This method
   * performs the same actions as
   * {@link ServiceAccountantManager#removeService(Service)}.
   *
   * @param remote the {@link Remote} instance of the stub for the service
   * @throws IllegalArgumentException if {@code remote} is not an instance of
   *     a {@link Stub}.
   */
  public void removeService(Remote remote) {
    if (remote instanceof Stub) {
      removeService((Stub) remote);
    } else {
      throw new IllegalArgumentException("The Remote object must be an instance of a Stub.");
    }
  }

  /**
   * Removes all references to the supplied service in the manager. Typically,
   * this should be done if the service is no longer needed. This method
   * performs the same actions as
   * {@link ServiceAccountantManager#removeService(Service)}.
   *
   * @param stub the service stub to remove from management
   */
  public void removeService(Stub stub) {
    this.removeService(stub._getService());
  }

  /**
   * Removes all references to the supplied service in the manager. Typically,
   * this should be done if the service is no longer needed.
   *
   * @param service the service to remove from management
   */
  public void removeService(Service service) {
    removeService(service.hashCode());
  }

  /**
   * Removes all references to the supplied service in the manager. Typically,
   * this should be done if the service is no longer needed.
   *
   * @param serviceHashCode the service hash code to remove from management
   */
  private void removeService(Integer serviceHashCode) {
    serviceAccountants.remove(serviceHashCode);
    serviceUsers.remove(serviceHashCode);
    retainedStubs.remove(serviceHashCode);
  }

  /**
   * Clears all references of managed services.
   */
  public void clear() {
    serviceAccountants.clear();
    serviceUsers.clear();
    retainedStubs.clear();
  }

  /**
   * Removes all services for a user.
   *
   * @param user the user to remove all services for
   */
  public void removeAllServicesForUser(DfpUser user) {
    Integer[] services = getAllServiceHashCodesForUser(user);
    for (Integer service : services) {
      removeService(service);
    }
  }

  /**
   * Gets all service hash codes belonging to a user.
   *
   * @param user the user which was used to generate the services
   * @return hash codes of all services belonging to a user
   */
  private Integer[] getAllServiceHashCodesForUser(DfpUser user) {
    Set<Integer> services = new HashSet<Integer>();
    for (Entry<Integer, DfpUser> entry : serviceUsers.entrySet()) {
      if (user.equals(entry.getValue())) {
        services.add(entry.getKey());
      }
    }
    return services.toArray(new Integer[] {});
  }

  /**
   * Gets all retained services belonging to a user. Retained services are
   * services that are still referenced by this manager. This will only return
   * a populated array if {@link #setRetainServices(boolean)} was set to
   * {@code true}.
   *
   * @param user the user which was used to generate the services
   * @return all services belonging to a user
   */
  public Stub[] getRetainedServicesForUser(DfpUser user) {
    Integer[] serviceHashCodes = getAllServiceHashCodesForUser(user);
    Set<Stub> stubs = new HashSet<Stub>();
    for (Integer serviceHashCode : serviceHashCodes) {
      if (retainedStubs.get(serviceHashCode) != null)
        stubs.add(retainedStubs.get(serviceHashCode));
    }
    return stubs.toArray(new Stub[] {});
  }

  /**
   * Gets all retained services referenced by their user. Retained services are
   * services that are still referenced by this manager. This will only return
   * a populated map if {@link #setRetainServices(boolean)} was set to
   * {@code true}. If service retention is off, this will return a map
   * of all registered users to empty arrays.
   *
   * @return all services belonging to the manager
   */
  public Map<DfpUser, Stub[]> getAllRetainedServices() {
    Map<DfpUser, Stub[]> allRetainedServices = new HashMap<DfpUser, Stub[]>();
    Set<DfpUser> allUsers =
        new HashSet<DfpUser>(Arrays.asList(serviceUsers.values().toArray(
            new DfpUser[] {})));
    for (DfpUser user : allUsers) {
      allRetainedServices.put(user, getRetainedServicesForUser(user));
    }
    return allRetainedServices;
  }

  /**
   * Gets the number of retained services. Retained services are
   * services that are still referenced by this manager.
   *
   * @return the number of retained services
   */
  public int getNumberRetainedServices() {
    return retainedStubs.size();
  }

  /**
   * Gets the number of retained services for a user. Retained services are
   * services that are still referenced by this manager.
   *
   * @param user the user to which the services belong
   * @return the number of retained services for a user
   */
  public int getNumberRetainedServices(DfpUser user) {
    return getRetainedServicesForUser(user).length;
  }

  /**
   * Gets the number of registered services. Registered services are
   * services which have been registered to the manager for logging, but may
   * not have a reference within it.
   *
   * @return the number of registered services
   */
  public int getNumberRegisteredServices() {
    return serviceUsers.size();
  }

  /**
   * Gets the number of registered services for a user. Registered services are
   * services which have been registered to the manager for logging, but may
   * not have a reference within it.
   *
   * @param user the user to which the services belong
   * @return the number of registered services for a user
   */
  public int getNumberRegisteredServices(DfpUser user) {
    return getAllServiceHashCodesForUser(user).length;
  }

  /**
   * Gets an {@link DfpUser} by the service that it was registered with.
   *
   * @param service the service to lookup
   * @return the DfpUser that the service was registered with
   */
  public DfpUser getDfpUserByService(Service service) {
    return serviceUsers.get(service.hashCode());
  }

  /**
   * Gets an {@link DfpUser} by the service stub that it was registered
   * with.
   *
   * @param stub the service stub to lookup
   * @return the DfpUser that the service stub was registered with
   */
  public DfpUser getDfpUserByService(Stub stub) {
    return serviceUsers.get(stub._getService().hashCode());
  }

  /**
   * Gets an {@link DfpUser} by the {@code Remote} object that it was
   * registered with.
   *
   * @param remote the {@link Remote} instance of the stub for the service
   * @return the DfpUser that the service was registered with
   * @throws IllegalArgumentException if {@code remote} is not an instance of
   *     a {@link Stub}.
   */
  public DfpUser getDfpUserByService(Remote remote) {
    if (remote instanceof Stub) {
      return getDfpUserByService((Stub) remote);
    } else {
      throw new IllegalArgumentException("The Remote object must be an instance of a Stub.");
    }
  }

  /**
   * Records a message context from the HTTP transport layer by calling the
   * methods {@link ServiceAccountant#handleRequest(org.apache.axis.Message)}
   * and {@link ServiceAccountant#handleResponse(String, org.apache.axis.description.OperationDesc, String, Message, String)}.
   *
   * @param messageContext the message context from the HTTP transport layer
   *     to record
   */
  public void recordMessage(MessageContext messageContext) {
    ServiceAccountant serviceAccountant = null;
    if (autoCreateAccountant) {
      serviceAccountant = createServiceAccountant(messageContext);
    } else {
      serviceAccountant =
          getServiceAccountant((Service) messageContext.getProperty("wsdl.service"));
    }

    if (serviceAccountant != null) {
      serviceAccountant.handleRequest(messageContext.getRequestMessage());

      String service = messageContext.getProperty("wsdl.portName").toString().split("Interface")[0];
      String server = messageContext.getProperty("transport.url").toString().split("/api/")[0];
      String fault = checkForFault(messageContext);

      try {
        ServiceAccountantRecord record = serviceAccountant.handleResponse(service,
            messageContext.getOperation(), server,
            messageContext.getResponseMessage(), fault);

        totalOperations += record.getOperations();
        totalTime += record.getResponseTime();
      } catch (SOAPException e) {
        DfpServiceLogger.DFP_API_LIB_LOG.error("Could not extract header values.", e);
      } catch (AxisFault e) {
        DfpServiceLogger.DFP_API_LIB_LOG.error("Could not generate SOAP xml string.", e);
      }
    }
  }

  /**
   * Creates the {@code ServiceAccountant} determined by the underlying service
   * within the {@code MessageContext}.
   *
   * @param msgContext the {@code MessageContext} containing the service
   *     information
   * @return the {@code ServiceAccountant} for the underlying service
   */
  public static ServiceAccountant createServiceAccountant(MessageContext msgContext) {
    return createServiceAccountant((Service) msgContext.getProperty("wsdl.service"));
  }

  /**
   * Creates the {@code ServiceAccountant} determined by the underlying service
   * within the {@code Stub}.
   *
   * @param stub the {@code Stub} containing the service information
   * @return the {@code ServiceAccountant} for the underlying service
   */
  public static ServiceAccountant createServiceAccountant(Stub stub) {
    return createServiceAccountant(stub._getService());
  }

  /**
   * Creates the {@code ServiceAccountant} determined by the underlying service
   * within the {@code Remote} object. If the {@code Remote} object is not also
   * of type {@code Stub}, an exception is thrown.
   *
   * @param remote the {@code Remote} containing the service information
   * @return the {@code ServiceAccountant} for the underlying service
   * @throws IllegalArgumentException if {@code remote} is not of type
   *     {@code Stub}
   */
  public static ServiceAccountant createServiceAccountant(Remote remote)
      throws IllegalArgumentException {
    if (remote instanceof Stub) {
      return createServiceAccountant((Stub) remote);
    } else {
      throw new IllegalArgumentException("Object remote must be of type Stub.");
    }
  }

  /**
   * Creates the {@code ServiceAccountant} for the service only if one does not
   * exist yet.
   *
   * @param service the {@code Service} to create an accountant for
   * @return the {@code ServiceAccountant} for the underlying service
   */
  public static ServiceAccountant createServiceAccountant(Service service) {
    if (instance.serviceAccountants.get(service.hashCode()) == null) {
      ServiceAccountant serviceAccountant =
          new ServiceAccountant(instance.serviceUsers.get(service.hashCode()));
      instance.serviceAccountants.put(service.hashCode(), serviceAccountant);
    }

    return instance.serviceAccountants.get(service.hashCode());
  }

  /**
   * Returns the total number of operations executed by all requests issued
   * through {@code ServiceAccountant}s owned by this manager.
   *
   * @return total number of operations in all requests
   */
  public long getTotalOperationCount() {
    return totalOperations;
  }

  /**
   * Returns the total time it took to execute all requests issued
   * through {@code ServiceAccountant}s owned by this manager.
   *
   * @return total elapsed time between the web service receiving all requests
   *         and sending all responses, in milliseconds
   */
  public long getTotalResponseTime() {
    return totalTime;
  }

  /**
   * Checks for a fault within the response message and retuns the fault
   * message if one exists, an empty string if there was no message, and
   * {@code null} if there was no exception.
   *
   * @param msgContext the message context
   * @return the fault message if one exists, an empty string if there was no
   * message, and {@code null} if there was no exception.
   */
  private String checkForFault(MessageContext msgContext) {
    try {
      return msgContext.getResponseMessage().getSOAPBody().getFault().getFaultString();
    } catch (SOAPException e) {
      return e.getMessage();
    } catch (NullPointerException e) {
      return null;
    }
  }
}
