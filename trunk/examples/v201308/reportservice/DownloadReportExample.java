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

package v201308.reportservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201308.ExportFormat;
import com.google.api.ads.dfp.v201308.ReportServiceInterface;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/**
 * This example downloads a completed report. To run a report, run
 * RunDeliveryReportExample.java. To use the
 * {@link com.google.api.ads.dfp.lib.utils.v201308.ReportUtils} class, see
 * RunAndDownloadReport.java under /examples/v201308/utils.
 *
 * Tags: ReportService.getReportDownloadURL
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DownloadReportExample {
  public static void main(String[] args) throws Exception{
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the ReportService.
    ReportServiceInterface reportService = user.getService(DfpService.V201308.REPORT_SERVICE);

    // Set the ID of the completed report.
    Long reportJobId = Long.parseLong("INSERT_REPORT_JOB_ID_HERE");

    // Change to your file location.
    String folderPath = "/path/to/folder";

    // Change to your preferred export format.
    ExportFormat exportFormat = ExportFormat.CSV_DUMP;

    // Construct file path to download the report to.
    String filePath = folderPath + File.separator + "report-" + System.currentTimeMillis()
        + "." + exportFormat.toString().split("_")[0].toLowerCase() + ".gz";

    System.out.print("Downloading report to " + filePath + "...");

    String downloadUrl = reportService.getReportDownloadURL(reportJobId, exportFormat);

    downloadFile(downloadUrl, filePath);

    System.out.println("done.");
  }

  /**
   * Writes the contents of the URL to the file path.
   *
   * @param url the URL locating the report XML
   * @param filePath the file path to write to
   * @throws IOException if an I/O error occurs
   */
  public static void downloadFile(String url, String filePath) throws IOException {
    BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream());
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));

    try {
      int i = 0;
      while ((i = inputStream.read()) != -1) {
        bos.write(i);
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }

      if (bos != null) {
        bos.close();
      }
    }
  }
}
