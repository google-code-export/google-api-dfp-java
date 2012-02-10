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

package v201201.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201201.CustomTargetingKey;
import com.google.api.ads.dfp.v201201.CustomTargetingKeyType;
import com.google.api.ads.dfp.v201201.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201201.CustomTargetingValue;
import com.google.api.ads.dfp.v201201.CustomTargetingValueMatchType;

/**
 * This example creates new custom targeting keys and values. To determine which
 * custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValuesExample.java. To target these custom
 * targeting keys and values, run TargetCustomCriteriaExample.java.
 *
 * Tags: CustomTargetingService.createCustomTargetingKeys
 * Tags: CustomTargetingService.createCustomTargetingValues
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CreateCustomTargetingKeysAndValuesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201201.CUSTOM_TARGETING_SERVICE);

      // Create predefined key.
      CustomTargetingKey genderKey = new CustomTargetingKey();
      genderKey.setDisplayName("gender");
      genderKey.setName("g");
      genderKey.setType(CustomTargetingKeyType.PREDEFINED);

      // Create predefined key that may be used for content targeting.
      CustomTargetingKey genreKey = new CustomTargetingKey();
      genreKey.setDisplayName("genre");
      genreKey.setName("genre");
      genreKey.setType(CustomTargetingKeyType.PREDEFINED);

      // Create free-form key.
      CustomTargetingKey carModelKey = new CustomTargetingKey();
      carModelKey.setDisplayName("car model");
      carModelKey.setName("c");
      carModelKey.setType(CustomTargetingKeyType.FREEFORM);

      // Create the custom targeting keys on the server.
      CustomTargetingKey[] keys = customTargetingService.createCustomTargetingKeys(
          new CustomTargetingKey[] {genderKey, genreKey, carModelKey});

      if (keys != null) {
        for (CustomTargetingKey key : keys) {
          System.out.println("A custom targeting key with ID \"" + key.getId()
              + "\", name \"" + key.getName() + "\", and display name \""
              + key.getDisplayName() + "\" was created.");
        }
      } else {
        System.out.println("No keys were created.");
      }

      // Create custom targeting value for the predefined gender key.
      CustomTargetingValue genderMaleValue = new CustomTargetingValue();
      genderMaleValue.setCustomTargetingKeyId(keys[0].getId());
      genderMaleValue.setDisplayName("male");
      // Name is set to 1 so that the actual name can be hidden from website
      // users.
      genderMaleValue.setName("1");
      genderMaleValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      CustomTargetingValue genderFemaleValue = new CustomTargetingValue();
      genderFemaleValue.setCustomTargetingKeyId(keys[0].getId());
      genderFemaleValue.setDisplayName("female");
      // Name is set to 2 so that the actual name can be hidden from website
      // users.
      genderFemaleValue.setName("2");
      genderFemaleValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      // Create custom targeting value for the predefined genre key.
      CustomTargetingValue genreComedyValue = new CustomTargetingValue();
      genreComedyValue.setCustomTargetingKeyId(keys[1].getId());
      genreComedyValue.setDisplayName("comedy");
      genreComedyValue.setName("comedy");
      genreComedyValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      CustomTargetingValue genreDramaValue = new CustomTargetingValue();
      genreDramaValue.setCustomTargetingKeyId(keys[1].getId());
      genreDramaValue.setDisplayName("drama");
      genreDramaValue.setName("drama");
      genreDramaValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      // Create custom targeting value for the free-form age key. These are
      // values that would be suggested in the UI or can be used when targeting
      // with a {@link FreeFormCustomCriteria}.
      CustomTargetingValue carModelHondaCivicValue = new CustomTargetingValue();
      carModelHondaCivicValue.setCustomTargetingKeyId(keys[2].getId());
      carModelHondaCivicValue.setDisplayName("honda civic");
      carModelHondaCivicValue.setName("honda civic");
      // Setting match type to exact will match exactly "honda civic".
      carModelHondaCivicValue.setMatchType(CustomTargetingValueMatchType.EXACT);

      // Create the custom targeting values on the server.
      CustomTargetingValue[] returnValues =
          customTargetingService.createCustomTargetingValues(new CustomTargetingValue[] {
              genderMaleValue, genderFemaleValue, genreComedyValue, genreDramaValue,
              carModelHondaCivicValue});

      if (returnValues != null) {
        for (CustomTargetingValue value : returnValues) {
          System.out.println("A custom targeting value with ID \"" + value.getId()
              + "\", belonging to key with ID \"" + value.getCustomTargetingKeyId()
              + "\", name \"" + value.getName() + "\", and display name \""
              + value.getDisplayName() + "\" was created.");
        }
      } else {
        System.out.println("No values were created.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
