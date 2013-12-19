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

package v201308.reportservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201308.StatementBuilder;
import com.google.api.ads.dfp.v201308.Column;
import com.google.api.ads.dfp.v201308.DateRangeType;
import com.google.api.ads.dfp.v201308.Dimension;
import com.google.api.ads.dfp.v201308.DimensionAttribute;
import com.google.api.ads.dfp.v201308.ReportJob;
import com.google.api.ads.dfp.v201308.ReportJobStatus;
import com.google.api.ads.dfp.v201308.ReportQuery;
import com.google.api.ads.dfp.v201308.ReportServiceInterface;
import com.google.api.ads.dfp.v201308.Statement;

/**
 * This example runs a report similar to the "Orders report" on the DFP website
 * with additional attributes. To download the report see
 * DownloadReportExample.java. To use the
 * {@link com.google.api.ads.dfp.lib.utils.v201308.ReportUtils} class, see
 * RunAndDownloadReport.java under /examples/v201308/utils.
 *
 * Tags: ReportService.runReportJob, ReportService.getReportJob
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class RunDeliveryReportExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ReportService.
      ReportServiceInterface reportService = user.getService(DfpService.V201308.REPORT_SERVICE);

      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      // Create statement to filter for an order.
      Statement filterStatement =
          new StatementBuilder("WHERE ORDER_ID = :id").putValue("id", orderId).toStatement();

      // Create report job.
      ReportJob reportJob = new ReportJob();

      // Create report query.
      ReportQuery reportQuery = new ReportQuery();
      reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);
      reportQuery.setDimensions(new Dimension[] {Dimension.ORDER_ID, Dimension.ORDER_NAME});
      reportQuery.setDimensionAttributes(new DimensionAttribute[] {
          DimensionAttribute.ORDER_TRAFFICKER, DimensionAttribute.ORDER_START_DATE_TIME,
          DimensionAttribute.ORDER_END_DATE_TIME});
      reportQuery.setStatement(filterStatement);
      reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS,
          Column.AD_SERVER_CLICKS, Column.AD_SERVER_CTR,
          Column.AD_SERVER_CPM_AND_CPC_REVENUE, Column.AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM});
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
