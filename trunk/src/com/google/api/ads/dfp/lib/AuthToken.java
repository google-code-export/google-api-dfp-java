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

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * The AuthToken class creates an authentication token using
 * the <a href="http://code.google.com/apis/accounts/docs/AuthForInstalledApps.html">
 * ClientLogin API</a>.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class AuthToken {
  public static final String CLIENT_LOGIN_URL = "https://www.google.com/accounts/ClientLogin";
  public static final int HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS = (int) TimeUnit.SECONDS.toMillis(20);
  public static final String AUTH_TOKEN_PREFIX = "Auth=";

  private String email;
  private String password;

  /**
   * @param email the user's login email address
   * @param password the user's password
   */
  public AuthToken(String email, String password) {
    this.email = email;
    this.password = password;
  }

  /**
   * Retrieves an authentication token using the user's crendentials.
   *
   * @return a {@code String} authentication token.
   * @throws IOException if the status from the Client Login server is
   *     anything but {@code HttpStatus.SC_OK = 200}
   */
  public String getAuthToken() throws IOException {
    PostMethod postMethod = new PostMethod(CLIENT_LOGIN_URL);

    if (postToClientLogin(postMethod) == HttpStatus.SC_OK) {
      return extractAuthTokenFromResponse(postMethod.getResponseBodyAsString());
    } else {
      throw new IOException("Failed to do client auth with Gaia server.");
    }
  }

  /**
   * Makes the POST to the client login API.
   *
   * @param postMethod the {@code PostMethod} which encapsulates the URL to
   *                   post against
   * @return an HTTP status code as defined by {@code HttpStatus}
   * @throws IOException if the HTTP client could not establish a
   *     connection
   */
  private int postToClientLogin(PostMethod postMethod) throws IOException {
    HttpClient httpClient = new HttpClient(new MultiThreadedHttpConnectionManager());
    HttpConnectionManagerParams connectionManagerParams =
        httpClient.getHttpConnectionManager().getParams();
    connectionManagerParams.setTcpNoDelay(true);
    connectionManagerParams.setSoTimeout(HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS);
    postMethod.addParameter("Email", email);
    postMethod.addParameter("Passwd", password);
    postMethod.addParameter("accountType", "GOOGLE");
    postMethod.addParameter("service", "gam");
    postMethod.addParameter("source", "google-dfpapi-java");
    return httpClient.executeMethod(postMethod);
  }

  /**
   * Extracts the authentication token from the response.
   *
   * @param authResponse the response from the client login API
   * @return the authentication token
   * @throws IllegalStateException if auth token could not be extracted
   *    from response
   */
  private String extractAuthTokenFromResponse(String authResponse) {
    String[] lines = authResponse.split("\n");
    for (String line : lines) {
      if (line.startsWith(AUTH_TOKEN_PREFIX)) {
        return line.substring(AUTH_TOKEN_PREFIX.length());
      }
    }
    throw new IllegalStateException("Unable to get auth token from test Client Login server");
  }

  /**
   * Sample usage of the client login API. Email and password refer to those of
   * a valid Google account.
   */
  public static void main(String[] args) {
    String email = "INSERT_EMAIL_HERE";
    String password = "INSERT_PASSWORD_HERE";

    try {
      if (email.equals("INSERT_EMAIL_HERE")) {
        System.out.println("Please update AuthToken.java with email address and password.");
      } else {
        System.out.println(new AuthToken(email, password).getAuthToken());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
