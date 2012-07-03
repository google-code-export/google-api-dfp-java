// Copyright 2012, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils.v201206;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.ads.dfp.v201206.ExportFormat;
import com.google.api.ads.dfp.v201206.ReportJobStatus;
import com.google.api.ads.dfp.v201206.ReportServiceInterface;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.util.zip.GZIPInputStream;

import javax.xml.rpc.ServiceException;

/**
 * Retrieves reports using an {@link DfpUser} or an already created
 * {@link ReportService}.
 * <p>
 * There are two main functions of this class:
 * <ul>
 * <li>To download a report in Gzip format to a file or any {@code OutputStream}
 * </li>
 * <li>To get the report and perform a number of tasks on it</li>
 * </ul>
 * <p>
 * {@code ReportUtils} also provides the method
 * {@link #whenReportReady(ReportCallback)} to wait for a scheduled report to
 * finish processing before taking an action on the report through the supplied
 * {@link ReportCallback}.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ReportUtils {
  /** The time to sleep before each request to the service. */
  public static final int SLEEP_TIMER = 30000;

  /** The charset for the report XML. */
  private static final Charset REPORT_CHARSET = Charset.forName("UTF-8");

  private final ReportServiceInterface reportService;
  private final long reportJobId;

  /**
   * Constructs a {@code ReportUtils} object for a {@link DfpUser} and a report
   * job id that the the class works on.
   *
   * @param user the {@code DfpUser} to use
   * @param reportJobId the report job ID
   * @throws ServiceException if ReportService could not be instantiated
   */
  public ReportUtils(DfpUser user, long reportJobId) throws ServiceException {
    this((ReportServiceInterface) user.getService(DfpService.V201206.REPORT_SERVICE), reportJobId);
  }

  /**
   * Constructs a {@code ReportUtils} object for a
   * {@link ReportServiceInterface} and a report job id that the the class works
   * on.
   *
   * @param reportService the ReportService stub to make calls to
   * @param reportJobId the report job ID
   */
  public ReportUtils(ReportServiceInterface reportService, long reportJobId) {
    this.reportJobId = reportJobId;
    this.reportService = reportService;
  }

  /**
   * Waits for the report to be ready and then calls:
   * <ul>
   * <li>{@link ReportCallback#onSuccess()} for a successful scheduling</li>
   * <li>{@link ReportCallback#onFailure()} for a failed scheduling due to a
   * {@link ReportJobStatus#FAILED}</li>
   * <li>{@link ReportCallback#onInterruption()} if the wait thread is
   * interrupted</li>
   * <li>{@link ReportCallback#onException(Exception)} if there was an exception
   * while waiting for the report to finish</li>
   * </ul>
   *
   * @param callback the {@code ReportCallback} to call when the job has
   *     finished, successfully or otherwise
   * @throws IllegalArgumentException if {@code callback == null}
   * @return the thread created that handles waiting for the report.
   *     {@link Thread#interrupt()} can be called on the returned thread to
   *     interrupt it.
   */
  public Thread whenReportReady(final ReportCallback callback) {
    if (callback == null) {
      throw new IllegalArgumentException("Report callback cannot be null.");
    }

    Thread waitThread = new Thread("ReportUtils.whenReportReady " + reportJobId) {
      @Override
      public void run() {
        try {
          if (waitForReportReady()) {
            callback.onSuccess();
          } else {
            callback.onFailure();
          }
        } catch (RemoteException e) {
          callback.onException(e);
        } catch (InterruptedException e) {
          callback.onInterruption();
        } catch (RuntimeException e) {
          callback.onException(e);
        }
      }
    };
    waitThread.start();
    return waitThread;
  }

  /**
   * Blocks and waits for a report to be ready. When a {@link ReportJobStatus}
   * is received that is not {@code ReportJobStatus#Pending} or {@code
   * ReportJobStatus#InProgress}, the report is considered finished, and the
   * method is returned with a {@code true} if the report was succesfful, or an
   * {@code false} if not.
   *
   * @return {@code true} if the report was succesful, {@code false} otherwise
   * @throws RemoteException if there was an error performing one of the SOAP
   *     calls
   * @throws InterruptedException if the thread was interrupted
   */
  public boolean waitForReportReady() throws RemoteException, InterruptedException {
    ReportJobStatus status = reportService.getReportJob(reportJobId).getReportJobStatus();
    while (status == ReportJobStatus.IN_PROGRESS) {
      Thread.sleep(SLEEP_TIMER);
      status = reportService.getReportJob(reportJobId).getReportJobStatus();
    }

    return status == ReportJobStatus.COMPLETED;
  }

  /**
   * Downloads a Gzip report to file located at {@code fileName}.
   *
   * @param exportFormat the export format of the report
   * @param fileName the file location to download the report to
   * @throws IOException if there was an error performing any I/O action,
   *         including any SOAP calls
   * @throws IllegalStateException if the report is not ready to be downloaded
   */
  public void downloadReport(ExportFormat exportFormat, String fileName) throws IOException {
    downloadReport(exportFormat, new FileOutputStream(fileName));
  }

  /**
   * Downloads a Gzip or plain-text format report XML to output stream indicated
   * by {@code outputStream}.
   *
   * @param exportFormat the export format of the report
   * @param outputStream the output stream to download the report to
   * @throws IOException if there was an error performing any I/O action,
   *     including any SOAP calls
   * @throws IllegalStateException if the report is not ready to be downloaded
   */
  public void downloadReport(ExportFormat exportFormat, OutputStream outputStream)
      throws IOException {
    writeUrlContentsToStream(getDownloadUrl(exportFormat), outputStream);
  }

  /**
   * Gets the plain-text format report as a {@code String}.
   *
   *
   * @param exportFormat the export format of the report
   * @return the plain-text format report XML as a {@code String}
   * @throws IOException if there was an error performing any I/O action,
   *         including any SOAP calls
   * @throws IllegalStateException if the report is not ready to be downloaded
   */
  public String getReport(ExportFormat exportFormat) throws IOException {
    return getGzipUrlStringContents(getDownloadUrl(exportFormat));
  }

  /**
   * Gets the download URL for a GZip or plain-text format report.
   *
   * @param exportFormat the export format of the report
   * @return the URL for the report download
   * @throws RemoteException if there was an error performing any Axis call
   * @throws IllegalStateException if the report is not ready to be downloaded
   */
  private String getDownloadUrl(ExportFormat exportFormat) throws RemoteException {
    ReportJobStatus status = reportService.getReportJob(reportJobId).getReportJobStatus();
    if (status != ReportJobStatus.COMPLETED) {
      throw new IllegalStateException("Report " + reportJobId
          + " must be completed before downloading. It is currently: " + status);
    }

    return reportService.getReportDownloadURL(reportJobId, exportFormat);
  }

  /**
   * Gets the report contents of a URL that is assumed to be Gzipped encoded.
   *
   * @param url the URL locating the Gzipped report
   * @return the report contents of the URL
   * @throws IOException if an I/O error occurs
   */
  private String getGzipUrlStringContents(String url) throws IOException {
    return getInputStreamStringContents(new GZIPInputStream(new URL(url).openStream()));
  }

  /**
   * Gets the report contents of an input stream. This method assumes that the
   * stream's contents are encoded in UTF-8.
   *
   * @param inputStream the {@code InputStream} containing the report contents
   * @return the report contents of the stream
   * @throws IOException if an I/O error occurs
   */
  private String getInputStreamStringContents(InputStream inputStream) throws IOException {
    BufferedReader br = null;
    try {
      StringBuilder reportBuilder = new StringBuilder();
      br = new BufferedReader(new InputStreamReader(inputStream, REPORT_CHARSET));

      String line;
      while ((line = br.readLine()) != null) {
        reportBuilder.append(line + "\n");
      }

      return reportBuilder.toString();
    } finally {
      if (br != null) {
        br.close();
      }
    }
  }

  /**
   * Writes the contents of the URL to the {@link OutputStream} outputStream.
   *
   * @param url the URL locating the report XML
   * @param outputStream the {@code OutputStream} to write to
   * @throws IOException if an I/O error occurs
   */
  // TODO(api.arogal): combine logic of getInputStreamStringContents with
  // this method by using a StringWriter and an OutputStreamWriter.
  private void writeUrlContentsToStream(String url, OutputStream outputStream) throws IOException {
    BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream());
    BufferedOutputStream bos = new BufferedOutputStream(outputStream);

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
