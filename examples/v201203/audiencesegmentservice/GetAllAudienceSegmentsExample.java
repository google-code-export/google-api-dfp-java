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

package v201203.audiencesegmentservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.AudienceSegment;
import com.google.api.ads.dfp.v201203.AudienceSegmentPage;
import com.google.api.ads.dfp.v201203.AudienceSegmentServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;

/**
 * This example gets all audience segments.
 *
 * Tags: AudienceSegmentService.getAudienceSegmentsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllAudienceSegmentsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the AudienceSegmentService.
      AudienceSegmentServiceInterface audienceSegmentService =
          user.getService(DfpService.V201203.AUDIENCE_SEGMENT_SERVICE);

      // Set defaults for page and filterStatement.
      AudienceSegmentPage page;
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all audience segments.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get audience segments by statement.
        page = audienceSegmentService.getAudienceSegmentsByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (AudienceSegment audienceSegment : page.getResults()) {
            System.out.println(i + ") Audience segment with ID \"" + audienceSegment.getId()
                + "\" and name \"" + audienceSegment.getName() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
