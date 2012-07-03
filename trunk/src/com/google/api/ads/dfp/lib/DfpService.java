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
   * Gets the endpoint server.
   *
   * @return the endpoint server of this service
   */
  public String getEndpointServer() {
    return version.getUrl();
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
     * {@link com.google.api.ads.dfp.v201111.PublisherQueryLanguageServiceInterface}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201111);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201111.SuggestedAdUnitServiceInterface}.
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
     * {@link com.google.api.ads.dfp.v201111.CreativeTemplateServiceInterface}.
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

  /**
   * The service class for v201203. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201203 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.PublisherQueryLanguageServiceInterface}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201203);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201203);
  }

  /**
   * The service class for v201204. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201204 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201204);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201204.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201204);
  }

  /**
   * The service class for v201206. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201206 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201203.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201206);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201206.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201206);
  }
}
