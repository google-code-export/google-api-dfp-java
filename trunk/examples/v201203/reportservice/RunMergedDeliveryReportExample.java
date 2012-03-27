// Copyright 2012 Google Inc. All Rights Reserved.
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

package v201203.reportservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201203.Column;
import com.google.api.ads.dfp.v201203.DateRangeType;
import com.google.api.ads.dfp.v201203.Dimension;
import com.google.api.ads.dfp.v201203.ReportJob;
import com.google.api.ads.dfp.v201203.ReportJobStatus;
import com.google.api.ads.dfp.v201203.ReportQuery;
import com.google.api.ads.dfp.v201203.ReportServiceInterface;

/**
 * This example runs a report that an upgraded publisher would use to include
 * statistics before the upgrade. To download the report see
 * DownloadReportExample.java. To use the
 * {@link com.google.api.ads.dfp.lib.utils.v201203.ReportUtils} class, see
 * RunAndDownloadReport.java under /examples/v201203/utils.
 *
 * Tags: ReportService.runReportJob, ReportService.getReportJob
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class RunMergedDeliveryReportExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ReportService.
      ReportServiceInterface reportService = user.getService(DfpService.V201203.REPORT_SERVICE);

      // Create report job.
      ReportJob reportJob = new ReportJob();

      // Create report query.
      ReportQuery reportQuery = new ReportQuery();
      reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);
      reportQuery.setDimensions(new Dimension[] {Dimension.ORDER});
      reportQuery.setColumns(new Column[] {Column.MERGED_AD_SERVER_IMPRESSIONS,
          Column.MERGED_AD_SERVER_CLICKS, Column.MERGED_AD_SERVER_CTR,
          Column.MERGED_AD_SERVER_REVENUE, Column.MERGED_AD_SERVER_AVERAGE_ECPM});
      reportJob.setReportQuery(reportQuery);

      // Run report job.
      reportJob = reportService.runReportJob(reportJob);

      do {
        System.out.println("Report with ID '" + reportJob.getId() + "' is still running.");
        Thread.sleep(30000);
        // Get report job.
        reportJob = reportService.getReportJob(reportJob.getId());
      } while (reportJob.getReportJobStatus() == ReportJobStatus.IN_PROGRESS);

      if (reportJob.getReportJobStatus() == ReportJobStatus.FAILED) {
        System.out.println("Report job with ID '" + reportJob.getId()
            + "' failed to finish successfully.");
      } else {
        System.out.println("Report job with ID '" + reportJob.getId()
            + "' completed successfully.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
