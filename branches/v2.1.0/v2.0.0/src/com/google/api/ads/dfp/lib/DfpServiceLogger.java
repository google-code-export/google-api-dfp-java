// Copyright 2010, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.WriterAppender;
import org.apache.log4j.varia.NullAppender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * The class {@code DfpServiceLogger} allows logging of
 * outgoing and incoming SOAP XML (<code>DfpService</code>)
 * messages as API calls are executed. It contains both public constant loggers
 * and methods to direct how to record these logs.
 */
public abstract class DfpServiceLogger {
  /** The Axis HTTPSender logger. */
  public static final Logger AXIS_LOG =
      Logger.getLogger("org.apache.axis.transport.http.HTTPSender");
  /** The request info logger. */
  public static final Logger REQUEST_INFO_LOG =
      Logger.getLogger(DfpUser.class.getName() + ".request_info");
  /** The soap XML logger. */
  public static final Logger SOAP_XML_LOG =
      Logger.getLogger(DfpUser.class.getName() + ".soap_xml");
  /** The client library logger. */
  public static final Logger DFP_API_LIB_LOG =
    Logger.getLogger(DfpUser.class.getName() + ".dfp_api_lib");

  /** The default pattern layout. */
  public static PatternLayout defaultPatternLayout = new PatternLayout("%d{DATE}::%p::%n%m%n");

  /**
   * Private constructor.
   */
  private DfpServiceLogger() {}

  /**
   * Loads the default logging behavior for outputting all SOAP to the
   * logs/soap_xml.log , all request info to logs/request_info.log, all axis
   * messages to logs/axis.log, and all client library messages to
   * logs/dfp_api_lib.log. See the logging section of the README for more
   * information.
   */
  public static void log() {
    removleAllLoggerAppenders();
    new File("logs").mkdir();

    Properties logProperties = new Properties();

    logProperties.put("log4j.appender.soapXmlFile", "org.apache.log4j.FileAppender");
    logProperties.put("log4j.appender.soapXmlFile.File", "logs/soap_xml.log");
    logProperties.put("log4j.appender.soapXmlFile.layout", "org.apache.log4j.PatternLayout");
    logProperties.put("log4j.appender.soapXmlFile.layout.ConversionPattern",
        "[%d{DATE} - %-5p]%n%m%n");

    logProperties.put("log4j.appender.requestInfoFile", "org.apache.log4j.FileAppender");
    logProperties.put("log4j.appender.requestInfoFile.File", "logs/request_info.log");
    logProperties.put("log4j.appender.requestInfoFile.layout", "org.apache.log4j.PatternLayout");
    logProperties.put("log4j.appender.requestInfoFile.layout.ConversionPattern",
        "[%d{DATE} - %-5p] %m%n");

    logProperties.put("log4j.appender.dfpApiLibFile", "org.apache.log4j.FileAppender");
    logProperties.put("log4j.appender.dfpApiLibFile.File", "logs/dfp_api_lib.log");
    logProperties.put("log4j.appender.dfpApiLibFile.layout", "org.apache.log4j.PatternLayout");
    logProperties.put("log4j.appender.dfpApiLibFile.layout.ConversionPattern",
        "[%d{DATE} - %-5p] %m%n");

    logProperties.put("log4j.logger.com.google.api.ads.dfp.lib.DfpUser.soap_xml",
        "DEBUG, soapXmlFile");
    logProperties.put("log4j.logger.com.google.api.ads.dfp.lib.DfpUser.request_info",
        "DEBUG, requestInfoFile");
    logProperties.put("log4j.logger.com.google.api.ads.dfp.lib.DfpUser.dfp_api_lib",
        "DEBUG, dfpApiLibFile");

    PropertyConfigurator.configure(logProperties);
    initRootLogger();
  }

  /**
   * Initialize the root logger to only append to a NullAppender.
   */
  public static void initRootLogger() {
    NullAppender nullAppender = new NullAppender();
    nullAppender.setThreshold(Level.OFF);
    Logger.getRootLogger().setLevel(Level.ALL);
    Logger.getRootLogger().removeAllAppenders();
    Logger.getRootLogger().addAppender(nullAppender);
  }

  /**
   * Removes all appenders from DFP_API_LIB_LOG, SOAP_XML_LOG, and
   * REQUEST_INFO_LOG.
   */
  public static void removleAllLoggerAppenders() {
    DFP_API_LIB_LOG.removeAllAppenders();
    SOAP_XML_LOG.removeAllAppenders();
    REQUEST_INFO_LOG.removeAllAppenders();
  }

  /**
   * Loads the log4j configuration located at {@code fileName}.
   * @param fileName the log4j configuration to load
   */
  public static void loadLog4JConfiguration(String fileName) {
    removleAllLoggerAppenders();
    PropertyConfigurator.configure(fileName);
    initRootLogger();
  }

  /**
   * Logs contents of {@code log} to the given {@code OutputStream}.
   *
   * @param log the {@code Logger} to log to a stream
   * @param out {@code OutputStream} to which {@code DfpService}
   *            messages should be written
   */
  public static void logToStream(Logger log, OutputStream out) {
    WriterAppender appender = new WriterAppender(defaultPatternLayout, out);
    appender.setThreshold(Level.ALL);
    log.addAppender(appender);
  }

  /**
   * Logs contents of {@code log} to the given {@code OutputStream}.
   *
   * @param log the {@code Logger} to log to a stream
   * @param out {@code OutputStream} to which {@code DfpService}
   *            messages should be written
   * @param threshold the threshold for this stream
   */
  public static void logToStream(Logger log, OutputStream out, Level threshold) {
    WriterAppender appender = new WriterAppender(defaultPatternLayout, out);
    appender.setThreshold(threshold);
    log.addAppender(appender);
  }

  /**
   * Logs contents of {@code log} to the given file {@code fileName}.
   *
   * @param log the {@code Logger} to log to a file
   * @param fileName absolute or relative path of the file to which
   *                 {@code log}'s messages should be written
   * @throws FileNotFoundException if given file cannot be opened for writing
   */
  public static void logToFile(Logger log, String fileName) throws FileNotFoundException {
    OutputStream os = new FileOutputStream(fileName);
    logToStream(log, os);
  }

  /**
   * Logs contents of {@code log} to the given file {@code fileName}.
   *
   * @param log the {@code Logger} to log to a file
   * @param fileName absolute or relative path of the file to which
   *                 {@code log}'s messages should be written
   * @param threshold the threshold for this file
   * @throws FileNotFoundException if given file cannot be opened for writing
   */
  public static void logToFile(Logger log, String fileName, Level threshold)
      throws FileNotFoundException {
    OutputStream os = new FileOutputStream(fileName);
    logToStream(log, os, threshold);
  }
}
