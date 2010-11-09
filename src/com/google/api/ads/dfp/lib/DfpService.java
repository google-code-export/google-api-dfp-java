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

import org.apache.axis.client.Service;

import java.rmi.Remote;

/**
 * {@code DfpService} provides a class which defines a service
 * that can be instantiated through reflection. The properties of this object
 * are that it has a service name, an optional interface name prefix,
 * and a version. The interface name prefix will be used to locate an
 * interface in the form:
 * {@code <version.packagePrefix>.<interfacePrefix>Interface.java}
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DfpService {
  protected final String serviceInterfaceNamePrefix;
  protected final String serviceName;
  protected final DfpVersion version;

  /**
   * Using this constructor, the interface name prefix will be set to the
   * service name.
   *
   * @param serviceName the service name
   * @param version the version of the service
   */
  public DfpService(String serviceName, DfpVersion version) {
    this(serviceName, serviceName, version);
  }

  /**
   * @param serviceName the service name
   * @param serviceInterfaceName the name of the interface for the service
   * @param version the version of the service
   */
  public DfpService(String serviceName, String serviceInterfaceName,
      DfpVersion version) {
    this.serviceName = serviceName;
    this.serviceInterfaceNamePrefix = serviceInterfaceName;
    this.version = version;
  }

  /**
   * @return the service interface name prefix
   */
  public String getServiceInterfaceNamePrefix() {
    return serviceInterfaceNamePrefix;
  }

  /**
   * @return the service name
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * @return the version
   */
  public DfpVersion getVersion() {
    return version;
  }

  /**
   * Generates the interface class for this service by using reflection.
   *
   * @return the {@code Class<? extends Remote>} representing the interface
   * @throws ClassNotFoundException if the formulated interface name could not
   *     be found
   */
  public Class<? extends Remote> getInterfaceClass()
      throws ClassNotFoundException {
    return (Class<? extends Remote>) Class.forName(version.getPackagePrefix()
        + version + "." + serviceInterfaceNamePrefix + "Interface");
  }

  /**
   * Generates the locator class for this service by using reflection.
   *
   * @return the {@code Class<? extends Service>} representing the locator
   * @throws ClassNotFoundException if the formulated locator class name name
   *     could not be found
   */
  public Class<? extends Service> getLocatorClass()
      throws ClassNotFoundException {
    return (Class<? extends Service>) Class.forName(version.getPackagePrefix()
        + version + "." + serviceName + "Locator");
  }

  /**
   * Gets the endpoint address for the endpoint server.
   *
   * @param endpointServer the server the endpoint address should be generated
   *     from
   * @return the endpoint address of this service
   */
  public String getEndpointAddress(String endpointServer) {
    return endpointServer + "/" + "apis/ads/publisher/" + version + "/" + serviceName;
  }

  /**
   * Gets the endpoint server for the production or sandbox environment.
   *
   * @param useSandbox {@code true} if the endpoint address should be generated
   *     to make requests against the sandbox environment
   * @return the endpoint server of this service for the sandbox or production
   *     environment
   */
  public String getEndpointServer(boolean useSandbox) {
    return ((useSandbox) ? version.getSandboxUrl() : version.getProductionUrl());
  }

  /**
   * The service class for v201004. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201004 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201004);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201004.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201004);
  }

  /**
   * The service class for v201010. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201010 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201010);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201010.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201010);
  }
}
