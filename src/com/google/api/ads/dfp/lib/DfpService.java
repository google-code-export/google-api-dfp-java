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
   * The service class for v201103. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201103 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201103);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201103.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201103);
  }

  /**
   * The service class for v201104. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201104 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201104);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201104.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201104);
  }

  /**
   * The service class for v201107. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201107 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201107);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201107.LabelService}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201107);
  }

  /**
   * The service class for v201108. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201108 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.LabelService}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201108);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201108.ThirdPartySlotService}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201108);
  }

  /**
   * The service class for v201111. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201111 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.LabelService}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.ThirdPartySlotService}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.SuggestedAdUnitService}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.ContentService}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.CreativeTemplateService}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201111);
  }

  /**
   * The service class for v201201. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201201 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.LabelService}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.ThirdPartySlotService}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.SuggestedAdUnitService}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.ContentService}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.CreativeTemplateService}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201201);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201201.TeamService}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201201);
  }
}
