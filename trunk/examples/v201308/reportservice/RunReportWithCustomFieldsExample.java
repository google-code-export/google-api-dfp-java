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
import com.google.api.ads.dfp.v201308.BaseCustomFieldValue;
import com.google.api.ads.dfp.v201308.Column;
import com.google.api.ads.dfp.v201308.DateRangeType;
import com.google.api.ads.dfp.v201308.Dimension;
import com.google.api.ads.dfp.v201308.LineItem;
import com.google.api.ads.dfp.v201308.LineItemPage;
import com.google.api.ads.dfp.v201308.LineItemServiceInterface;
import com.google.api.ads.dfp.v201308.ReportJob;
import com.google.api.ads.dfp.v201308.ReportJobStatus;
import com.google.api.ads.dfp.v201308.ReportQuery;
import com.google.api.ads.dfp.v201308.ReportServiceInterface;
import com.google.api.ads.dfp.v201308.Statement;

import org.apache.commons.lang.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * This example runs a report that includes custom fields found in the line
 * items of an order. To download the report see DownloadReportExample.java. To
 * use the {@link com.google.api.ads.dfp.lib.utils.v201308.ReportUtils} class,
 * see RunAndDownloadReport.java under /examples/v201308/utils.
 *
 * Tag: ReportService.runReportJob
 * Tag: ReportService.getReportJob
 * Tag: LineItemService.getLineItemsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class RunReportWithCustomFieldsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the LineItemService.
      LineItemServiceInterface lineItemService =
          user.getService(DfpService.V201308.LINEITEM_SERVICE);

      // Set the ID of the order to get line items from.
      Long orderId = Long.parseLong("INSERT_ORDER_ID_HERE");

      // Sets defaults for page and filterStatement.
      LineItemPage page = new LineItemPage();
      int offset = 0;

      // Create a statement to only select line items from a given order.
      String filterText = "WHERE orderId = :orderId LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(filterText).putValue("orderId", orderId).toStatement();

      // Collect all line item custom field IDs for an order.
      Set<Long> customFieldIds = new HashSet<Long>();
      do {
        filterStatement.setQuery(filterText + " OFFSET " + offset);

        // Get line items by statement.
        page = lineItemService.getLineItemsByStatement(filterStatement);

        // Get custom field IDs from the line items of an order.
        if (page.getResults() != null) {
          for (LineItem lineItem : page.getResults()) {
            if (lineItem.getCustomFieldValues() != null) {
              for (BaseCustomFieldValue customFieldValue : lineItem.getCustomFieldValues()) {
                customFieldIds.add(customFieldValue.getCustomFieldId());
              }
            }
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      // Get the ReportService.
      ReportServiceInterface reportService = user.getService(DfpService.V201308.REPORT_SERVICE);

      // Create statement to filter for an order.
      filterStatement =
          new StatementBuilder("WHERE ORDER_ID = :orderId").putValue("orderId", orderId)
              .toStatement();

      // Create report job.
      ReportJob reportJob = new ReportJob();

      // Create report query.
      ReportQuery reportQuery = new ReportQuery();
      reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);
      reportQuery.setDimensions(new Dimension[] {Dimension.LINE_ITEM_ID, Dimension.LINE_ITEM_NAME});
      reportQuery.setStatement(filterStatement);
      reportQuery.setCustomFieldIds(ArrayUtils.toPrimitive(customFieldIds.toArray(new Long[]{})));
      reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS});
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
