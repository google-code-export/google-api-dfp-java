// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201311.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201311.DateTimeUtils;
import com.google.api.ads.dfp.v201311.AdUnitTargeting;
import com.google.api.ads.dfp.v201311.CompanionDeliveryOption;
import com.google.api.ads.dfp.v201311.CostType;
import com.google.api.ads.dfp.v201311.CreativePlaceholder;
import com.google.api.ads.dfp.v201311.CreativeRotationType;
import com.google.api.ads.dfp.v201311.CustomCriteria;
import com.google.api.ads.dfp.v201311.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.v201311.CustomCriteriaNode;
import com.google.api.ads.dfp.v201311.CustomCriteriaSet;
import com.google.api.ads.dfp.v201311.EnvironmentType;
import com.google.api.ads.dfp.v201311.InventoryTargeting;
import com.google.api.ads.dfp.v201311.LineItem;
import com.google.api.ads.dfp.v201311.LineItemServiceInterface;
import com.google.api.ads.dfp.v201311.LineItemType;
import com.google.api.ads.dfp.v201311.Money;
import com.google.api.ads.dfp.v201311.Size;
import com.google.api.ads.dfp.v201311.StartDateTimeType;
import com.google.api.ads.dfp.v201311.Targeting;
import com.google.api.ads.dfp.v201311.VideoPosition;
import com.google.api.ads.dfp.v201311.VideoPositionTarget;
import com.google.api.ads.dfp.v201311.VideoPositionTargeting;
import com.google.api.ads.dfp.v201311.VideoPositionType;

/**
 * This example create a new line item to serve to video content. This feature
 * is only available to DFP premium solution networks. To determine which line
 * items exist, run GetAllLineItemsExample.java. To determine which orders
 * exist, run GetAllOrdersExample.java. To create a video ad unit, run
 * CreateVideoAdUnitExample.java. To create criteria for categories, run
 * CreateCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: LineItemService.createLineItem
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateVideoLineItemExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201311.LINEITEM_SERVICE);

      // Set the order that all created line items will belong to and the
      // video ad unit ID to target.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      String targetedVideoAdUnitId = "INSERT_TARGETED_VIDEO_AD_UNIT_ID_HERE";

      // Set the custom targeting key ID and value ID representing the metadata
      // on the content to target. This would typically be a key representing
      // a "genre" and a value representing something like "comedy".
      Long contentCustomTargetingKeyId =
          Long.parseLong("INSERT_CONTENT_CUSTOM_TARGETING_KEY_ID_HERE");
      Long contentCustomTargetingValueId =
          Long.parseLong("INSERT_CONTENT_CUSTOM_TARGETING_VALUE_ID_HERE");

      // Create custom criteria for the content metadata targeting.
      CustomCriteria contentCustomCriteria = new CustomCriteria();
      contentCustomCriteria.setKeyId(contentCustomTargetingKeyId);
      contentCustomCriteria.setValueIds(new long[] {contentCustomTargetingValueId});
      contentCustomCriteria.setOperator(CustomCriteriaComparisonOperator.IS);

      // Create custom criteria set.
      CustomCriteriaSet customCriteriaSet = new CustomCriteriaSet();
      customCriteriaSet.setChildren(new CustomCriteriaNode[] {contentCustomCriteria});

      // Create inventory targeting.
      InventoryTargeting inventoryTargeting = new InventoryTargeting();
      inventoryTargeting.setTargetedAdUnits(
          new AdUnitTargeting[] {new AdUnitTargeting(targetedVideoAdUnitId, true)});

      // Create video position targeting.
      VideoPosition videoPosition = new VideoPosition();
      videoPosition.setPositionType(VideoPositionType.PREROLL);
      VideoPositionTarget videoPositionTarget = new VideoPositionTarget();
      videoPositionTarget.setVideoPosition(videoPosition);
      VideoPositionTargeting videoPositionTargeting = new VideoPositionTargeting();
      videoPositionTargeting.setTargetedPositions(
          new VideoPositionTarget[] {videoPositionTarget});

      // Create targeting.
      Targeting targeting = new Targeting();
      targeting.setCustomTargeting(customCriteriaSet);
      targeting.setInventoryTargeting(inventoryTargeting);
      targeting.setVideoPositionTargeting(videoPositionTargeting);

      // Create local line item object.
      LineItem lineItem = new LineItem();
      lineItem.setName("Video line item");
      lineItem.setOrderId(orderId);
      lineItem.setTargeting(targeting);
      lineItem.setLineItemType(LineItemType.SPONSORSHIP);
      lineItem.setAllowOverbook(true);

      // Set the environment type to video.
      lineItem.setEnvironmentType(EnvironmentType.VIDEO_PLAYER);

      // Set the creative rotation type to optimized.
      lineItem.setCreativeRotationType(CreativeRotationType.OPTIMIZED);

      // Create the master creative placeholder.
      CreativePlaceholder creativeMasterPlaceholder = new CreativePlaceholder();
      creativeMasterPlaceholder.setSize(new Size(400, 300, false));

      // Create companion creative placeholders.
      CreativePlaceholder companionCreativePlaceholder1 = new CreativePlaceholder();
      companionCreativePlaceholder1.setSize(new Size(300, 250, false));

      CreativePlaceholder companionCreativePlaceholder2 = new CreativePlaceholder();
      companionCreativePlaceholder2.setSize(new Size(728, 90, false));

      // Set companion creative placeholders.
      creativeMasterPlaceholder.setCompanions(new CreativePlaceholder[] {
          companionCreativePlaceholder1, companionCreativePlaceholder2});

      // Set the size of creatives that can be associated with this line item.
      lineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativeMasterPlaceholder});

      // Set delivery of video companions to optional.
      lineItem.setCompanionDeliveryOption(CompanionDeliveryOption.OPTIONAL);

      // Set the length of the line item to run.
      lineItem.setStartDateTimeType(StartDateTimeType.IMMEDIATELY);
      lineItem.setEndDateTime(DateTimeUtils.fromString("2013-09-01T00:00:00"));

      // Set the cost per day to $1.
      lineItem.setCostType(CostType.CPD);
      lineItem.setCostPerUnit(new Money("USD", 1000000L));

      // Set the percentage to be 100%.
      lineItem.setUnitsBought(100L);

      // Create the line item on the server.
      lineItem = lineItemService.createLineItem(lineItem);

      if (lineItem != null) {
        System.out.println("A line item with ID \"" + lineItem.getId()
            + "\", belonging to order ID \"" + lineItem.getOrderId() + "\", and named \""
            + lineItem.getName() + "\" was created.");
      } else {
        System.out.println("No line item created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
