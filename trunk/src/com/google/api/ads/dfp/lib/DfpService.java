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
   * The service class for v201208. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201208 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201208);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201208.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201208);
  }

  /**
   * The service class for v201211. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201211 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201211);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201211.CreativeWrapperServiceInterface}.
     */
    public static final DfpService CREATIVE_WRAPPER_SERVICE =
        new DfpService("CreativeWrapperService", DfpVersion.V201211);
  }

  /**
   * The service class for v201302. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201302 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ThirdPartySlotServiceInterface}.
     */
    public static final DfpService THIRD_PARTY_SLOT_SERVICE =
        new DfpService("ThirdPartySlotService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.CreativeWrapperServiceInterface}.
     */
    public static final DfpService CREATIVE_WRAPPER_SERVICE =
        new DfpService("CreativeWrapperService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ContactServiceInterface}.
     */
    public static final DfpService CONTACT_SERVICE =
        new DfpService("ContactService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ContentBundleServiceInterface}.
     */
    public static final DfpService CONTENT_BUNDLE_SERVICE =
        new DfpService("ContentBundleService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.AdRuleServiceInterface}.
     */
    public static final DfpService AD_RULE_SERVICE =
        new DfpService("AdRuleService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ActivityServiceInterface}.
     */
    public static final DfpService ACTIVITY_SERVICE =
        new DfpService("ActivityService", DfpVersion.V201302);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201302.ActivityGroupServiceInterface}.
     */
    public static final DfpService ACTIVITY_GROUP_SERVICE =
        new DfpService("ActivityGroupService", DfpVersion.V201302);
  }

  /**
   * The service class for v201306. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201306 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.CreativeWrapperServiceInterface}.
     */
    public static final DfpService CREATIVE_WRAPPER_SERVICE =
        new DfpService("CreativeWrapperService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ContactServiceInterface}.
     */
    public static final DfpService CONTACT_SERVICE =
        new DfpService("ContactService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ContentBundleServiceInterface}.
     */
    public static final DfpService CONTENT_BUNDLE_SERVICE =
        new DfpService("ContentBundleService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.AdRuleServiceInterface}.
     */
    public static final DfpService AD_RULE_SERVICE =
        new DfpService("AdRuleService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ActivityServiceInterface}.
     */
    public static final DfpService ACTIVITY_SERVICE =
        new DfpService("ActivityService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ActivityGroupServiceInterface}.
     */
    public static final DfpService ACTIVITY_GROUP_SERVICE =
        new DfpService("ActivityGroupService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.LineItemTemplateServiceInterface}.
     */
    public static final DfpService LINE_ITEM_TEMPLATE_SERVICE =
        new DfpService("LineItemTemplateService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ProposalService}.
     */
    public static final DfpService PROPOSAL_SERVICE =
        new DfpService("ProposalService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ProposalLineItemService}.
     */
    public static final DfpService PROPOSAL_LINE_ITEM_SERVICE =
        new DfpService("ProposalLineItemService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ProductService}.
     */
    public static final DfpService PRODUCT_SERVICE =
        new DfpService("ProductService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ProductTemplateService}.
     */
    public static final DfpService PRODUCT_TEMPLATE_SERVICE =
        new DfpService("ProductTemplateService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.RateCardService}.
     */
    public static final DfpService RATE_CARD_SERVICE =
        new DfpService("RateCardService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.BaseRateService}.
     */
    public static final DfpService BASE_RATE_SERVICE =
        new DfpService("BaseRateService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.RateCardCustomizationService}.
     */
    public static final DfpService RATE_CARD_CUSTOMIZATION_SERVICE =
        new DfpService("RateCardCustomizationService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.WorkflowActionService}.
     */
    public static final DfpService WORKFLOW_ACTION_SERVICE =
        new DfpService("WorkflowActionService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ReconciliationOrderReportService}.
     */
    public static final DfpService RECONCILIATION_ORDER_REPORT_SERVICE =
        new DfpService("ReconciliationOrderReportService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ReconciliationReportService}.
     */
    public static final DfpService RECONCILIATION_REPORT_SERVICE =
        new DfpService("ReconciliationReportService", DfpVersion.V201306);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201306.ReconciliationReportRowService}.
     */
    public static final DfpService RECONCILIATION_REPORT_ROW_SERVICE =
        new DfpService("ReconciliationReportRowService", DfpVersion.V201306);
  }

  /**
   * The service class for v201308. Each {@code DfpService}
   * variable indicates which interface should be used.
   */
  public abstract static class V201308 {
    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.InventoryServiceInterface}.
     */
    public static final DfpService INVENTORY_SERVICE =
        new DfpService("InventoryService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CompanyServiceInterface}.
     */
    public static final DfpService COMPANY_SERVICE =
        new DfpService("CompanyService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.UserServiceInterface}.
     */
    public static final DfpService USER_SERVICE =
        new DfpService("UserService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.OrderServiceInterface}.
     */
    public static final DfpService ORDER_SERVICE =
        new DfpService("OrderService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.LineItemServiceInterface}.
     */
    public static final DfpService LINEITEM_SERVICE =
        new DfpService("LineItemService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.LineItemCreativeAssociationServiceInterface}.
     */
    public static final DfpService LINEITEMCREATIVEASSOCIATION_SERVICE =
        new DfpService("LineItemCreativeAssociationService",
            DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CreativeServiceInterface}.
     */
    public static final DfpService CREATIVE_SERVICE =
        new DfpService("CreativeService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.PlacementServiceInterface}.
     */
    public static final DfpService PLACEMENT_SERVICE =
        new DfpService("PlacementService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ReportServiceInterface}.
     */
    public static final DfpService REPORT_SERVICE =
        new DfpService("ReportService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ForecastServiceInterface}.
     */
    public static final DfpService FORECAST_SERVICE =
        new DfpService("ForecastService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.NetworkServiceInterface}.
     */
    public static final DfpService NETWORK_SERVICE =
        new DfpService("NetworkService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CustomTargetingServiceInterface}.
     */
    public static final DfpService CUSTOM_TARGETING_SERVICE =
        new DfpService("CustomTargetingService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.PublisherQueryLanguageService}.
     */
    public static final DfpService PUBLISHER_QUERY_LANGUAGE_SERVICE =
        new DfpService("PublisherQueryLanguageService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.LabelServiceInterface}.
     */
    public static final DfpService LABEL_SERVICE =
        new DfpService("LabelService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.SuggestedAdUnitServiceInterface}.
     */
    public static final DfpService SUGGESTED_AD_UNIT_SERVICE =
        new DfpService("SuggestedAdUnitService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ContentServiceInterface}.
     */
    public static final DfpService CONTENT_SERVICE =
        new DfpService("ContentService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CreativeTemplateServiceInterface}.
     */
    public static final DfpService CREATIVE_TEMPLATE_SERVICE =
        new DfpService("CreativeTemplateService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.TeamServiceInterface}.
     */
    public static final DfpService TEAM_SERVICE =
        new DfpService("TeamService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.AudienceSegmentServiceInterface}.
     */
    public static final DfpService AUDIENCE_SEGMENT_SERVICE =
        new DfpService("AudienceSegmentService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CustomFieldServiceInterface}.
     */
    public static final DfpService CUSTOM_FIELD_SERVICE =
        new DfpService("CustomFieldService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.UserTeamAssociationServiceInterface}.
     */
    public static final DfpService USER_TEAM_ASSOCIATION_SERVICE =
        new DfpService("UserTeamAssociationService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CreativeSetServiceInterface}.
     */
    public static final DfpService CREATIVE_SET_SERVICE =
        new DfpService("CreativeSetService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.CreativeWrapperServiceInterface}.
     */
    public static final DfpService CREATIVE_WRAPPER_SERVICE =
        new DfpService("CreativeWrapperService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ContactServiceInterface}.
     */
    public static final DfpService CONTACT_SERVICE =
        new DfpService("ContactService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ContentBundleServiceInterface}.
     */
    public static final DfpService CONTENT_BUNDLE_SERVICE =
        new DfpService("ContentBundleService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.AdRuleServiceInterface}.
     */
    public static final DfpService AD_RULE_SERVICE =
        new DfpService("AdRuleService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ActivityServiceInterface}.
     */
    public static final DfpService ACTIVITY_SERVICE =
        new DfpService("ActivityService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ActivityGroupServiceInterface}.
     */
    public static final DfpService ACTIVITY_GROUP_SERVICE =
        new DfpService("ActivityGroupService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.LineItemTemplateServiceInterface}.
     */
    public static final DfpService LINE_ITEM_TEMPLATE_SERVICE =
        new DfpService("LineItemTemplateService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ProposalService}.
     */
    public static final DfpService PROPOSAL_SERVICE =
        new DfpService("ProposalService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ProposalLineItemService}.
     */
    public static final DfpService PROPOSAL_LINE_ITEM_SERVICE =
        new DfpService("ProposalLineItemService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ProductService}.
     */
    public static final DfpService PRODUCT_SERVICE =
        new DfpService("ProductService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ProductTemplateService}.
     */
    public static final DfpService PRODUCT_TEMPLATE_SERVICE =
        new DfpService("ProductTemplateService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.RateCardService}.
     */
    public static final DfpService RATE_CARD_SERVICE =
        new DfpService("RateCardService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.BaseRateService}.
     */
    public static final DfpService BASE_RATE_SERVICE =
        new DfpService("BaseRateService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.RateCardCustomizationService}.
     */
    public static final DfpService RATE_CARD_CUSTOMIZATION_SERVICE =
        new DfpService("RateCardCustomizationService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.WorkflowActionService}.
     */
    public static final DfpService WORKFLOW_ACTION_SERVICE =
        new DfpService("WorkflowActionService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ReconciliationOrderReportService}.
     */
    public static final DfpService RECONCILIATION_ORDER_REPORT_SERVICE =
        new DfpService("ReconciliationOrderReportService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ReconciliationReportService}.
     */
    public static final DfpService RECONCILIATION_REPORT_SERVICE =
        new DfpService("ReconciliationReportService", DfpVersion.V201308);

    /**
     * Uses the interface
     * {@link com.google.api.ads.dfp.v201308.ReconciliationReportRowService}.
     */
    public static final DfpService RECONCILIATION_REPORT_ROW_SERVICE =
        new DfpService("ReconciliationReportRowService", DfpVersion.V201308);
  }
}
