// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201208.customfieldservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201208.BaseCustomFieldValue;
import com.google.api.ads.dfp.v201208.CustomField;
import com.google.api.ads.dfp.v201208.CustomFieldServiceInterface;
import com.google.api.ads.dfp.v201208.CustomFieldValue;
import com.google.api.ads.dfp.v201208.DropDownCustomField;
import com.google.api.ads.dfp.v201208.DropDownCustomFieldValue;
import com.google.api.ads.dfp.v201208.LineItem;
import com.google.api.ads.dfp.v201208.LineItemServiceInterface;
import com.google.api.ads.dfp.v201208.TextValue;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This example sets custom field values on a line item. To determine which
 * custom fields exist, run GetAllCustomFieldsExample.java. To create
 * custom field options, run CreateCustomFieldOptionsExample.java. To determine
 * which line items exist, run GetAllLineItemsExample.java.
 *
 * Tags: CustomFieldService.getCustomField
 * Tags: LineItemService.getLineItem
 * Tags: LineItemService.updateLineItems
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class SetLineItemCustomFieldValue {
  public static void main(final String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201208.CUSTOM_FIELD_SERVICE);

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201208.LINEITEM_SERVICE);

      // Set the IDs of the custom fields, custom field option, and line item.
      Long customFieldId = Long.parseLong("INSERT_STRING_CUSTOM_FIELD_ID_HERE");
      Long dropDownCustomFieldId = Long.parseLong("INSERT_DROP_DOWN_CUSTOM_FIELD_ID_HERE");
      Long customFieldOptionId = Long.parseLong("INSERT_CUSTOM_FIELD_OPTION_ID_HERE");
      Long lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");

      // Get the custom field.
      CustomField customField = customFieldService.getCustomField(customFieldId);

      // Get the drop-down custom field.
      DropDownCustomField dropDownCustomField =
          (DropDownCustomField) customFieldService.getCustomField(dropDownCustomFieldId);

      // Get the line item.
      LineItem lineItem = lineItemService.getLineItem(lineItemId);

      // Create custom field values.
      List<BaseCustomFieldValue> customFieldValues = new ArrayList<BaseCustomFieldValue>();
      TextValue textValue = new TextValue();
      textValue.setValue("Custom field value");

      CustomFieldValue customFieldValue = new CustomFieldValue();
      customFieldValue.setCustomFieldId(customFieldId);
      customFieldValue.setValue(textValue);
      customFieldValues.add(customFieldValue);

      DropDownCustomFieldValue dropDownCustomFieldValue = new DropDownCustomFieldValue();
      dropDownCustomFieldValue.setCustomFieldId(dropDownCustomFieldId);
      dropDownCustomFieldValue.setCustomFieldOptionId(customFieldOptionId);
      customFieldValues.add(dropDownCustomFieldValue);

      // Only add existing custom field values for different custom fields than
      // the ones you are setting.
      if (lineItem.getCustomFieldValues() != null) {
        for (BaseCustomFieldValue oldCustomFieldValue : lineItem.getCustomFieldValues()) {
          if (!oldCustomFieldValue.getCustomFieldId().equals(customFieldId)
              && !oldCustomFieldValue.getCustomFieldId().equals(dropDownCustomFieldId)) {
            customFieldValues.add(oldCustomFieldValue);
          }
        }
      }

      lineItem.setCustomFieldValues(customFieldValues.toArray(new BaseCustomFieldValue[]{}));

      // Update the line item on the server.
      LineItem[] lineItems = lineItemService.updateLineItems(new LineItem[] {lineItem});

      if (lineItems != null) {
        for (LineItem updatedLineItem : lineItems) {
          List<String> customFieldValueStrings = new ArrayList<String>();
          for (BaseCustomFieldValue baseCustomFieldValue : lineItem.getCustomFieldValues()) {
            if (baseCustomFieldValue instanceof CustomFieldValue
                && ((CustomFieldValue) baseCustomFieldValue).getValue() instanceof TextValue) {
              customFieldValueStrings.add("{ID: '" + baseCustomFieldValue.getCustomFieldId()
                  + "', value: '"
                  + ((TextValue) ((CustomFieldValue) baseCustomFieldValue).getValue()).getValue()
                  + "'}");
            } else if (baseCustomFieldValue instanceof DropDownCustomFieldValue) {
              customFieldValueStrings.add("{ID: '" + baseCustomFieldValue.getCustomFieldId()
                  + "', custom field option ID: '"
                  + ((DropDownCustomFieldValue) baseCustomFieldValue).getCustomFieldOptionId()
                  + "'}");
            }
          }
          System.out.println("A line item with ID \"" + lineItem.getId()
              + "\" set with custom field values \""
              + StringUtils.join(customFieldValueStrings, ","));
        }
      } else {
        System.out.println("No line items were updated.");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
