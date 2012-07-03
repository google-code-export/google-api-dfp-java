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

import com.google.api.ads.dfp.lib.utils.XmlUtils;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.description.OperationDesc;
import org.w3c.dom.Node;

import java.util.Map;

import javax.xml.soap.SOAPException;

/**
 * The {@code ServiceAccountant} class acts as an accountant for metrics
 * extracted from the request and response from a SOAP call. From
 * {@link DfpHttpSender}, the method {@link #handleRequest(Message)}, or
 * {@link #handleResponse(String, OperationDesc, String, Message, String)}
 * are called.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ServiceAccountant {
  private final DfpUser user;

  private ServiceAccountantRecord lastServiceAccountantRecord;

  private long totalResponseTime;
  private long totalOperations;
  private long totalUnits;

  /**
   * Constructor to set the {@code user} of the service accountant which will
   * be used to record properties such as the effective client and the
   * environment that the request went against.
   *
   * @param user the {@link DfpUser} to attach to this
   *     {@code ServiceAccountant}
   */
  public ServiceAccountant(DfpUser user) {
    this.user = user;
    lastServiceAccountantRecord =
        new ServiceAccountantRecord("", "", "", "", "", 0L, 0L, null);
  }

  /**
   * Resets the header counters including operations, units, time, and request
   * Id.
   */
  public void resetCounters() {
   totalResponseTime = 0L;
   totalOperations = 0L;
   totalUnits = 0L;
  }

  /**
   * Returns the time it took to execute the last request issued through this
   * service instance or {@code null} if the last request time was not
   * recorded successfully.
   *
   * @return elapsed time between the web service receiving last request and
   *     sending the response, in milliseconds
   */
  public long getLastResponseTime() {
    return lastServiceAccountantRecord.getResponseTime();
  }

  /**
   * Returns the total time it took to execute all requests issued through
   * this service instance.
   *
   * @return total elapsed time between the web service receiving all requests
   *     and sending all responses, in milliseconds
   */
  public long getTotalResponseTime() {
    return totalResponseTime;
  }

  /**
   * Returns the number of operations executed by the last request issued
   * through this service instance  or {@code null} if the last number
   * of operations not recorded successfully.
   *
   * @return number of operations in the last request
   */
  public long getLastOperationCount() {
    return lastServiceAccountantRecord.getOperations();
  }

  /**
   * Returns the total number of operations executed by all requests issued
   * through this service instance.
   *
   * @return total number of operations in all requests
   */
  public long getTotalOperationCount() {
    return totalOperations;
  }

  /**
   * Returns the total number of API units consumed by all requests issued
   * through this service instance.
   *
   * @return total number of API units that all requests used
   */
  public long getTotalUnitCount() {
    return totalUnits;
  }

  /**
   * Returns the unique ID that identifies last request issued through this
   * service instance  or {@code null} if the last number request ID was
   * not recorded successfully.
   *
   * @return unique ID that identifies this request
   */
  public String getLastRequestId() {
    return lastServiceAccountantRecord.getRequestId();
  }

  /**
   * Returns the last {@link ServiceAccountantRecord} handled by this
   * accountant.
   *
   * @return the last {@code ServiceAccountantRecord}
   */
  public ServiceAccountantRecord getLastServiceAccountantRecord() {
    return lastServiceAccountantRecord;
  }

  /**
   * Handles the request from the SOAP call by extracting the sanitized
   * XML from the {@link Message}. Logs the sanitized SOAP XML to the
   * {@link DfpServiceLogger#SOAP_XML_LOG} logger. If the SOAP XML could
   * not be sanitized because of an {@code AxisFault} or
   * {@code ServiceException} thrown while being processed, it is omitted from
   * the logs.
   *
   * @param soapMessage the message from the SOAP call
   */
  public void handleRequest(Message soapMessage) {
    try {
      DfpServiceLogger.SOAP_XML_LOG.debug(getSanitizedSoapXmlFromMessage(soapMessage));
    } catch (AxisFault e) {
      DfpServiceLogger.SOAP_XML_LOG.error(
          "SOAP XML ommited because it could not be sanitized.", e);
    } catch (SOAPException e) {
      DfpServiceLogger.SOAP_XML_LOG.error(
          "SOAP XML ommited because it could not be sanitized.", e);
    }
  }

  /**
   * Gets the sanitized SOAP XML from the SOAP request message.
   *
   * @param soapRequestMessage the SOAP request message
   * @return a string representing the sanitized XML
   * @throws AxisFault if the SOAP header could not be extracted
   * @throws SOAPException if the SOAP XML could not be extracted to a string
   */
  private String getSanitizedSoapXmlFromMessage(Message soapRequestMessage)
      throws AxisFault, SOAPException {
    Node headerNode = XmlUtils.extractRequestHeaderNode(soapRequestMessage.getSOAPHeader());
    return XmlUtils.getSanitizedSoapXml(soapRequestMessage.getSOAPPartAsString(), headerNode);
  }

  /**
   * Handles the XML response by extracting metrics from the SOAP header,
   * recording those metrics to the {@link
   * DfpServiceLogger#REQUEST_INFO_LOG} and writing the response XML
   * to the {@link DfpServiceLogger#SOAP_XML_LOG}. If the XML cannot
   * be processed or the header map could not be extracted, this method
   * fails gracefully by not throwing the exceptions, but logging them in the
   * {@link DfpServiceLogger#DFP_API_LIB_LOG} and returning a {@code null}.
   *
   * @param service the DFP service that was reached
   * @param operation the operation that Axis is currently handling
   * @param server the server the call was made against
   * @param soapMessage the XML response message
   * @param faultMessage the fault message
   * @return a {@link ServiceAccountantRecord} of the response or {@code null}
   *     if the message could not be processed.
   * @throws SOAPException if the SOAP XML could not be extracted to a string
   * @throws AxisFault if the SOAP header could not be extracted
   */
  public ServiceAccountantRecord handleResponse(String service, OperationDesc operation,
      String server, Message soapMessage, String faultMessage)
      throws SOAPException, AxisFault {
    Map<String, String> headerMap =
        XmlUtils.extractHeaderMap(
            XmlUtils.extractResponseHeaderNode(soapMessage.getSOAPHeader()));

    lastServiceAccountantRecord =
        createServiceAccountantRecord(service, operation.getName(),
            headerMap, faultMessage, server);

    totalOperations += lastServiceAccountantRecord.getOperations();
    totalResponseTime += lastServiceAccountantRecord.getResponseTime();

    DfpServiceLogger.REQUEST_INFO_LOG.debug(lastServiceAccountantRecord.toString());
    DfpServiceLogger.SOAP_XML_LOG.debug(soapMessage.getSOAPPartAsString());
    return lastServiceAccountantRecord;
  }

  /**
   * Creates a new {@link ServiceAccountantRecord} given the service, method,
   * operators, and {@code Map<String, String>} representing the SOAP response
   * header.
   *
   * @param service the service that was called
   * @param method the method that was called
   * @param headerMap a {@code Map<String, String>} representing the SOAP
   *     response header
   * @param faultMessage the fault message
   * @param server the server the call was made against
   * @return a new {@code ServiceAccountantRecord} representing the SOAP call
   */
  private ServiceAccountantRecord createServiceAccountantRecord(String service,
      String method, Map<String, String> headerMap, String faultMessage,
      String server) {
    Long responseTime = getLongMetricWithDefault("responseTime", headerMap);
    Long operations = getLongMetricWithDefault("operations", headerMap);
    String requestId = headerMap.get("requestId") == null ? "" : headerMap.get("requestId");
    String email = user != null ? user.getEmail() : "service_not_registered";

    return new ServiceAccountantRecord(requestId, service,
        method, email, server,
        responseTime, operations, faultMessage);
  }

  /**
   * Attempts to get a {@code Long} metric from a {@code Map<String, String>},
   * which represents the SOAP response header key-value pairs. If the key
   * could not be found or the not parsed correctly to a {@code Long}, 0 is
   * returned.
   *
   * @param key the key to get and parse
   * @param headerMap the SOAP response header key-value pairs
   * @return the parsed value or 0 if it could not be parsed
   */
  private Long getLongMetricWithDefault(String key, Map<String, String> headerMap) {
    try {
      return Long.parseLong(headerMap.get(key));
    } catch (NumberFormatException e) {
      return 0L;
    }
  }
}
