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

package com.google.api.ads.dfp.lib;

/**
 * A record for purposes of metric accounting. Each record is identified by its
 * {@code requestId}.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class ServiceAccountantRecord {
  private final String requestId;
  private final long responseTime;
  private final long operations;
  private final String service;
  private final String method;
  private final String email;
  private final String server;
  private final String faultMessage;

  /**
   * Constructor for a {@code ServiceAccoutantRecord}. Each record is
   * identified by its {@code requestId}.
   *
   * @param requestId the request ID extracted from the response
   * @param service the service called
   * @param method the method called
   * @param email the email of request
   * @param server the server the request was made against
   * @param responseTime the response time on the server
   * @param operations the operations performed by the SOAP call
   * @param faultMessage the fault message
   */
  public ServiceAccountantRecord(String requestId, String service, String method,
      String email, String server, long responseTime, long operations,
      String faultMessage) {
    this.requestId = requestId;
    this.responseTime = responseTime;
    this.operations = operations;
    this.service = service;
    this.method = method;
    this.server = server;
    this.faultMessage = faultMessage;
    this.email = email;
  }

  /**
   * Gets the request ID which is unique for this record.
   *
   * @return the {@code requestId}, which is unique for this record
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Gets the time spent on the server.
   *
   * @return the {@code responseTime} spent on the server
   */
  public long getResponseTime() {
    return responseTime;
  }

  /**
   * Gets the number of operations performed for this SOAP call.
   *
   * @return the {@code operations} performed for this SOAP call
   */
  public long getOperations() {
    return operations;
  }

  /**
   * Gets the service the call was made against.
   *
   * @return the {@code service} the call was made against
   */
  public String getService() {
    return service;
  }

  /**
   * Gets the method the call was made against.
   *
   * @return the {@code method} the call was made against
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the email used for authentication of the user.
   *
   * @return the {@code email} used for authentication of the user
   */
  public String getEmail() {
    return email;
  }

  /**
   * Returns the server the call was made against.
   *
   * @return the server the call was made against
   */
  public String getServer() {
    return server;
  }

  /**
   * Returns {@code true} if the SOAP call generated a fault.
   *
   * @return {@code true} if the SOAP call generated a fault
   */
  public boolean isFault() {
    return faultMessage != null;
  }

  /**
   * Returns the SOAP fault message.
   *
   * @return the SOAP fault message
   */
  public String getFaultMessage() {
    return faultMessage;
  }

  /**
   * Returns the string representation of the record. The returned string can
   * either represent a successful call or one that generated a fault; both will
   * be of the structure of {@code "key_0=value_0 key_1=value_1 ..."}.
   *
   * @return the string representation of the record
   */
  @Override
  public String toString() {
    StringBuilder stringBuilder =
        appendKeyValue(new StringBuilder(), "email", email);
    appendKeyValue(stringBuilder, "service", service);
    appendKeyValue(stringBuilder, "method", method);
    appendKeyValue(stringBuilder, "responseTime", responseTime);
    appendKeyValue(stringBuilder, "operations", operations);
    appendKeyValue(stringBuilder, "requestId", requestId);
    appendKeyValue(stringBuilder, "server", server);
    appendKeyValue(stringBuilder, "isFault", isFault());
    appendKeyValue(stringBuilder, "faultMessage", isFault() ? faultMessage : "null");
    return stringBuilder.toString().trim();
  }

  /**
   * Appends a key/value pair to the {@code stringBuilder} in the form of
   * {@code stringBuilder += "key=value "}.
   *
   * @param stringBuilder the {@link StringBuilder} to append to
   * @param key the key of the metric to append
   * @param value the value of the metric to append
   * @return the {@code StringBuilder} object with the key/value pair appended
   */
  private StringBuilder appendKeyValue(StringBuilder stringBuilder, String key, Object value) {
    return stringBuilder.append(key).append("=").append(value).append(" ");
  }
}
