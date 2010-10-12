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

package v201004.utils;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.ads.dfp.lib.utils.v201004.DateTimeUtils;
import com.google.api.ads.dfp.lib.utils.v201004.ReportUtils;
import com.google.api.ads.dfp.v201004.Column;
import com.google.api.ads.dfp.v201004.DateRangeType;
import com.google.api.ads.dfp.v201004.Dimension;
import com.google.api.ads.dfp.v201004.ExportFormat;
import com.google.api.ads.dfp.v201004.ReportJob;
import com.google.api.ads.dfp.v201004.ReportQuery;
import com.google.api.ads.dfp.v201004.ReportServiceInterface;

import java.io.IOException;

/**
 * This example runs and downloads a report synchronously or asynchronously
 * using the {@link ReportUtils} class.
 */
public class RunAndDownloadReportExample {
  public static void main(String[] args) throws Exception{
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the ReportService.
    ReportServiceInterface reportService = user.getService(DfpService.V201004.REPORT_SERVICE);

    // Create report job.
    ReportJob reportJob = new ReportJob();

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDateRangeType(DateRangeType.CUSTOM_DATE_TIME);
    reportQuery.setStartDateTime(DateTimeUtils.fromString("2010-05-01T00:00:00"));
    reportQuery.setEndDateTime(DateTimeUtils.today("PST"));
    reportQuery.setDimensions(new Dimension[] {Dimension.ORDER, Dimension.LINE_ITEM});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS,
        Column.AD_SERVER_CLICKS, Column.AD_SERVER_CTR,
        Column.AD_SERVER_REVENUE, Column.AD_SERVER_AVERAGE_ECPM});
    reportJob.setReportQuery(reportQuery);

    System.out.println("Running report job.");

    // Run report job.
    long reportJobId = reportService.runReportJob(reportJob).getId();

    final ReportUtils reportUtils = new ReportUtils(reportService, reportJobId);

    // Change to your file location.
    final String gzCsvPath = "/path/to/filename.csv.gz";

    // Change to use synchronous or asynchronous downloading.
    boolean useSynchronous = true;

    if (useSynchronous) {
      // Download gzipped CSV synchronously.
      try {
        System.out.println("Waiting for report to finish.");
        if (reportUtils.waitForReportReady()) {
          System.out.print("Downloading report to " + gzCsvPath + "...");
          reportUtils.downloadReport(ExportFormat.CSV, gzCsvPath);
          System.out.println("done.");
        } else {
          System.out.println("The report failed to schedule.");
        }
      } catch (IOException e) {
        System.out.println("Report did not download for reason: " + e.getMessage());
        e.printStackTrace();
      }
    } else {
      // Download gzipped CSV asynchronously.
      Thread reportThread = reportUtils.whenReportReady(new ReportCallback() {
        public void onSuccess() {
          try {
            System.out.print("Downloading report to " + gzCsvPath + "...");
            reportUtils.downloadReport(ExportFormat.CSV, gzCsvPath);
            System.out.println("done.");
          } catch (IOException e) {
            System.out.println("Report did not download for reason: " + e.getMessage());
            e.printStackTrace();
          }
        }

        public void onInterruption() {
          System.out.println("The report thread was interrupted.");
        }

        public void onFailure() {
          System.out.println("The report failed to schedule.");
        }

        public void onException(Exception e) {
          System.out.println("Report did not download for reason: " + e.getMessage());
          e.printStackTrace();
        }
      });
    }
    System.out.println("Main function completed.");
  }
}
