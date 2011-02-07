// Copyright 2011 Google Inc. All Rights Reserved.
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

package v201101.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201101.CustomCriteria;
import com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.v201101.CustomCriteriaNode;
import com.google.api.ads.dfp.v201101.CustomCriteriaSet;
import com.google.api.ads.dfp.v201101.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.dfp.v201101.CustomTargetingValue;
import com.google.api.ads.dfp.v201101.CustomTargetingValueMatchType;
import com.google.api.ads.dfp.v201101.FreeFormCustomCriteria;
import com.google.api.ads.dfp.v201101.LineItem;
import com.google.api.ads.dfp.v201101.LineItemServiceInterface;
import com.google.api.ads.dfp.v201101.PredefinedCustomCriteria;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This example updates a line item to add custom criteria targeting. To
 * determine which line items exist, run GetAllLineItemsExample.java. To
 * determine which custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java.
 */
public class TargetCustomCriteriaExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201101.LINEITEM_SERVICE);

      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      Long freeFormCustomTargetingKeyId1 =
          Long.parseLong("INSERT_FREE_FORM_CUSTOM_TARGETING_KEY_ID_HERE");
      Long freeFormCustomTargetingKeyId2 =
          Long.parseLong("INSERT_FREE_FORM_CUSTOM_TARGETING_KEY_ID_HERE");

      // Create the free-form custom criteria for targeting "toyota".
      CustomTargetingValue toyotaFreeFormCustomTargetingValue = new CustomTargetingValue();
      toyotaFreeFormCustomTargetingValue.setName("toyota");
      toyotaFreeFormCustomTargetingValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      FreeFormCustomCriteria toyotaFreeFormCustomCriteria = new FreeFormCustomCriteria();
      toyotaFreeFormCustomCriteria.setKeyId(freeFormCustomTargetingKeyId1);
      toyotaFreeFormCustomCriteria.setValues(
          new CustomTargetingValue[] {toyotaFreeFormCustomTargetingValue});
      toyotaFreeFormCustomCriteria.setOperator(CustomCriteriaComparisonOperator.IS);

      // Create the free-form custom criteria for targeting "honda".
      CustomTargetingValue hondaFreeFormCustomTargetingValue = new CustomTargetingValue();
      hondaFreeFormCustomTargetingValue.setName("honda");
      hondaFreeFormCustomTargetingValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      FreeFormCustomCriteria hondaFreeFormCustomCriteria = new FreeFormCustomCriteria();
      hondaFreeFormCustomCriteria.setKeyId(freeFormCustomTargetingKeyId1);
      hondaFreeFormCustomCriteria.setValues(
          new CustomTargetingValue[] {hondaFreeFormCustomTargetingValue});
      hondaFreeFormCustomCriteria.setOperator(CustomCriteriaComparisonOperator.IS_NOT);

      // Create the free-form custom criteria for targeting "ford".
      CustomTargetingValue fordFreeFormCustomTargetingValue = new CustomTargetingValue();
      fordFreeFormCustomTargetingValue.setName("ford");
      fordFreeFormCustomTargetingValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      FreeFormCustomCriteria fordFreeFormCustomCriteria = new FreeFormCustomCriteria();
      fordFreeFormCustomCriteria.setKeyId(freeFormCustomTargetingKeyId2);
      fordFreeFormCustomCriteria.setValues(
          new CustomTargetingValue[] {fordFreeFormCustomTargetingValue});
      fordFreeFormCustomCriteria.setOperator(CustomCriteriaComparisonOperator.IS);

      // Create the custom criteria set that will resemble:
      //
      // (freeFormCustomTargetingKeyId1 == toyota OR
      //     (freeFormCustomTargetingKeyId1 != honda AND
      //         freeFormCustomTargetingKeyId2 == ford))
      CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
      topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.OR);

      CustomCriteriaSet subCustomCriteriaSet = new CustomCriteriaSet();
      subCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
      subCustomCriteriaSet.setChildren(
          new CustomCriteriaNode[] {hondaFreeFormCustomCriteria, fordFreeFormCustomCriteria});
      topCustomCriteriaSet.setChildren(
          new CustomCriteriaNode[] {toyotaFreeFormCustomCriteria, subCustomCriteriaSet});

      // Set the custom criteria targeting on the line item.
      LineItem lineItem = lineItemService.getLineItem(lineItemId);
      lineItem.getTargeting().setCustomTargeting(topCustomCriteriaSet);

      // Update the line items on the server.
      lineItem = lineItemService.updateLineItem(lineItem);

      // Display the updated line item.
      System.out.printf("Line item with ID %s update with custom criteria targeting \n%s\n",
          lineItem.getId(),
          getCustomCriteriaSetString(lineItem.getTargeting().getCustomTargeting(), 0));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Gets a string representation of the custom criteria node. If it has
   * children, each child will be appended to the string recursively.
   *
   * @param root the root custom criteria node
   * @param level the level of the custom criteria tree
   * @return a string representation of the custom criteria node and its
   *     children
   */
  private static String getCustomCriteriaSetString(CustomCriteriaNode root, int level) {
    StringBuilder sb = new StringBuilder();
    sb.append(StringUtils.repeat("\t", level));
    if (root instanceof CustomCriteria) {
      if (root instanceof PredefinedCustomCriteria) {
        PredefinedCustomCriteria predefinedCustomCriteria = (PredefinedCustomCriteria) root;
        sb.append(String.format("Predefined: operator: [%s] key: [%s] values: [%s]\n",
            predefinedCustomCriteria.getOperator(), predefinedCustomCriteria.getKeyId(),
            StringUtils.join(ArrayUtils.toObject(predefinedCustomCriteria.getValueIds()), ",")));
        return sb.toString();
      } else if (root instanceof FreeFormCustomCriteria) {
        FreeFormCustomCriteria freeFormCustomCriteria = (FreeFormCustomCriteria) root;
        sb.append(String.format("Free-form: operator: [%s] key: [%s] values: [%s]\n",
            freeFormCustomCriteria.getOperator(), freeFormCustomCriteria.getKeyId(),
            getCustomTargetValuesString(freeFormCustomCriteria.getValues())));
        return sb.toString();
      } else {
        throw new IllegalStateException("Unexpected node: " + root);
      }
    } else if (root instanceof CustomCriteriaSet){
      CustomCriteriaSet customCriteriaSet = (CustomCriteriaSet) root;
      sb.append(String.format("CustomCriteriaSet: operator: [%s] children: \n",
          customCriteriaSet.getLogicalOperator()));
      for (CustomCriteriaNode node : customCriteriaSet.getChildren()) {
        sb.append(getCustomCriteriaSetString(node, level + 1));
      }
      return sb.append("\n").toString();
    } else {
      throw new IllegalStateException("Unexpected node: " + root);
    }
  }

  /**
   * Gets a string representation of an array of custom targeting values.
   *
   * @param values the array of custom targeting values
   * @return a string representation in the form of (match type : name),...
   */
  private static String getCustomTargetValuesString(CustomTargetingValue[] values) {
    StringBuffer sb = new StringBuffer();
    for (CustomTargetingValue customTargetingValue : values) {
      sb.append(String.format("(%s : %s)", customTargetingValue.getMatchType(),
          customTargetingValue.getName()));
    }
    return sb.toString();
  }
}
