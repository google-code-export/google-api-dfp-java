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

package v201104.lineitemservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201104.CustomCriteria;
import com.google.api.ads.dfp.v201104.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.v201104.CustomCriteriaNode;
import com.google.api.ads.dfp.v201104.CustomCriteriaSet;
import com.google.api.ads.dfp.v201104.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.dfp.v201104.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201104.LineItem;
import com.google.api.ads.dfp.v201104.LineItemServiceInterface;

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
          user.getService(DfpService.V201104.LINEITEM_SERVICE);

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201104.CUSTOM_TARGETING_SERVICE);

      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      Long[] customCriteriaIds1 =
          new Long[] {Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE"),
              Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE")};
      Long[] customCriteriaIds2 =
        new Long[] {Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE"),
            Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE")};
      Long[] customCriteriaIds3 =
        new Long[] {Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE"),
            Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE")};

      // Create custom criteria.
      CustomCriteria customCriteria1 = new CustomCriteria();
      customCriteria1.setKeyId(customCriteriaIds1[0]);
      customCriteria1.setValueIds(new long[] {customCriteriaIds1[1]});
      customCriteria1.setOperator(CustomCriteriaComparisonOperator.IS);

      CustomCriteria customCriteria2 = new CustomCriteria();
      customCriteria2.setKeyId(customCriteriaIds2[0]);
      customCriteria2.setValueIds(new long[] {customCriteriaIds2[1]});
      customCriteria2.setOperator(CustomCriteriaComparisonOperator.IS_NOT);

      CustomCriteria customCriteria3 = new CustomCriteria();
      customCriteria3.setKeyId(customCriteriaIds3[0]);
      customCriteria3.setValueIds(new long[] {customCriteriaIds3[1]});
      customCriteria3.setOperator(CustomCriteriaComparisonOperator.IS);

      // Create the custom criteria set that will resemble:
      //
      // (customCriteria1.key == customCriteria1.value OR
      //     (customCriteria2.key != customCriteria2.value AND
      //         customCriteria3.key == customCriteria3.value))
      CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
      topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.OR);

      CustomCriteriaSet subCustomCriteriaSet = new CustomCriteriaSet();
      subCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
      subCustomCriteriaSet.setChildren(
          new CustomCriteriaNode[] {customCriteria2, customCriteria3});
      topCustomCriteriaSet.setChildren(
          new CustomCriteriaNode[] {customCriteria1, subCustomCriteriaSet});

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
      CustomCriteria customCriteria = (CustomCriteria) root;
      sb.append(String.format("Custom criteria: operator: [%s] key: [%s] values: [%s]\n",
          customCriteria.getOperator(), customCriteria.getKeyId(),
          StringUtils.join(ArrayUtils.toObject(customCriteria.getValueIds()), ",")));
      return sb.toString();
    } else if (root instanceof CustomCriteriaSet){
      CustomCriteriaSet customCriteriaSet = (CustomCriteriaSet) root;
      sb.append(String.format("Custom criteria set: operator: [%s] children: \n",
          customCriteriaSet.getLogicalOperator()));
      for (CustomCriteriaNode node : customCriteriaSet.getChildren()) {
        sb.append(getCustomCriteriaSetString(node, level + 1));
      }
      return sb.append("\n").toString();
    } else {
      throw new IllegalStateException("Unexpected node: " + root);
    }
  }
}
