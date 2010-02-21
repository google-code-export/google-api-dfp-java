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

package v201002.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201002.Creative;
import com.google.api.ads.dfp.v201002.CreativePage;
import com.google.api.ads.dfp.v201002.CreativeServiceInterface;
import com.google.api.ads.dfp.v201002.Filter;

/**
 * This example gets all image creatives. The filter
 * retrieves up to the maximum page size limit of 500. To create an image
 * creative, run CreateCreativesExample.java.
 */
public class GetCreativesByFilterExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201002.CREATIVE_SERVICE);

      // Create a filter to only select image creatives.
      Filter filter = new Filter("WHERE creativeType = 'ImageCreative' LIMIT 500");

      // Get creatives by filter.
      CreativePage page = creativeService.getCreativesByFilter(filter);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Creative creative : page.getResults()) {
          System.out.println(i + ") Creative with ID \"" + creative.getId()
              + "\", name \"" + creative.getName()
              + "\", and type \"" + creative.getCreativeType() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
       e.printStackTrace();
    }
  }
}
