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
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * The AuthToken class creates an authentication token using
 * the <a href="http://code.google.com/apis/accounts/docs/AuthForInstalledApps.html">
 * ClientLogin API</a>.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class AuthToken {
  public static final String CLIENT_LOGIN_SERVER = "https://www.google.com/accounts/";

  private static final String CLIENT_LOGIN_URL = CLIENT_LOGIN_SERVER + "ClientLogin";
  private static final int HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS = (int) TimeUnit.SECONDS.toMillis(20);
  private static final String AUTH_TOKEN_KEY = "Auth";
  private static final String ERROR_KEY = "Error";
  private static final String INFO_KEY = "Info";
  private static final String URL_KEY = "Url";
  private static final String CAPTCHA_TOKEN_KEY = "CaptchaToken";
  private static final String CAPTCHA_URL_KEY = "CaptchaUrl";
  private static final String CAPTCHA_REQUIRED_ERROR = "CaptchaRequired";

  private final String email;
  private final String password;
  private final String captchaToken;
  private final String captchaAnswer;

  /**
   * Constructor for email and password request.
   *
   * @param email the user's login email address
   * @param password the user's password
   */
  public AuthToken(String email, String password) {
    this(email, password, null, null);
  }

  /**
   * Constructor which provides fields for CAPTCHA information.
   *
   * @param email the user's login email address
   * @param password the user's password
   * @param captchaToken the CAPTCHA token
   * @param captchaAnswer the CAPTCHA answer
   */
  public AuthToken(String email, String password, String captchaToken, String captchaAnswer) {
    this.email = email;
    this.password = password;
    this.captchaToken = captchaToken;
    this.captchaAnswer = captchaAnswer;
  }

  /**
   * Constructor used for generating a new {@code AuthToken} from an old one
   * along with CAPTCHA information.
   *
   * @param authToken the {@code AuthToken} object to get the email and password
   *     from
   * @param captchaToken the CAPTCHA token
   * @param captchaAnswer the CAPTCHA answer
   */
  public AuthToken(AuthToken authToken, String captchaToken, String captchaAnswer) {
    this.email = authToken.email;
    this.password = authToken.password;
    this.captchaToken = captchaToken;
    this.captchaAnswer = captchaAnswer;
  }

  /**
   * Retrieves an authentication token using the user's credentials.
   *
   * @return a {@code String} authentication token.
   * @throws AuthTokenException if the status from the Client Login server is
   *     anything but {@code HttpStatus.SC_OK = 200}
   */
  public String getAuthToken() throws AuthTokenException {
    try {
      PostMethod postMethod = new PostMethod(CLIENT_LOGIN_URL);

      int statusCode = postToClientLogin(postMethod);
      Properties responseProperties =
          generatePropertiesFromResponse(postMethod.getResponseBodyAsStream());

      if (statusCode == HttpStatus.SC_OK) {
        if (responseProperties.containsKey(AUTH_TOKEN_KEY)) {
          return responseProperties.getProperty(AUTH_TOKEN_KEY).toString();
        } else {
          throw new IllegalStateException("Unable to get auth token from Client Login server");
        }
      } else {
        CaptchaInformation captchaInfo = null;
        String errorCode = null;

        if (responseProperties.containsKey(ERROR_KEY)) {
          errorCode = responseProperties.getProperty(ERROR_KEY);
          if (errorCode != null && errorCode.equals(CAPTCHA_REQUIRED_ERROR)) {
            captchaInfo = extractCaptchaInfoFromProperties(responseProperties);
          }

          if (responseProperties.containsKey(INFO_KEY)) {
            errorCode += ": " + responseProperties.getProperty(INFO_KEY);
          }
        }

        throw new AuthTokenException(statusCode, postMethod.getResponseBodyAsString(), errorCode,
            captchaInfo, null);
      }
    } catch (IOException e) {
      throw new AuthTokenException(null, null, null, null, e);
    }
  }

  /**
   * Makes the POST to the client login API.
   *
   * @param postMethod the {@code PostMethod} which encapsulates the URL to
   *     post against
   * @return an HTTP status code as defined by {@code HttpStatus}
   * @throws IOException if the HTTP client could not establish a
   *     connection
   */
  private int postToClientLogin(PostMethod postMethod) throws IOException {
    HttpClient httpClient = new HttpClient(new MultiThreadedHttpConnectionManager());

    setProxy(httpClient);

    HttpConnectionManagerParams connectionManagerParams =
        httpClient.getHttpConnectionManager().getParams();

    connectionManagerParams.setTcpNoDelay(true);
    connectionManagerParams.setSoTimeout(HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS);
    postMethod.addParameter("Email", email);
    postMethod.addParameter("Passwd", password);
    postMethod.addParameter("accountType", "GOOGLE");
    postMethod.addParameter("service", "gam");
    postMethod.addParameter("source", "google-dfpapi-java");

    if (captchaToken != null) {
      postMethod.addParameter("logintoken", captchaToken);
    }

    if (captchaAnswer != null) {
      postMethod.addParameter("logincaptcha", captchaAnswer);
    }

    return httpClient.executeMethod(postMethod);
  }

  /**
   * Sets the proxy for the HTTP client.
   *
   * @param httpClient the HTTP client to set the proxy for
   */
  private void setProxy(HttpClient httpClient) {
    if (System.getProperty("http.proxyHost") != null
        && System.getProperty("http.proxyPort") != null) {
      httpClient.getHostConfiguration().setProxy(System.getProperty("http.proxyHost"),
          Integer.parseInt(System.getProperty("http.proxyPort")));

      if (System.getProperty("http.proxyUser") != null
          && System.getProperty("http.proxyPassword") != null) {
        HttpState state = new HttpState();
        state.setProxyCredentials(new AuthScope(System.getProperty("http.proxyHost"),
            Integer.parseInt(System.getProperty("http.proxyPort"))),
                new UsernamePasswordCredentials(System.getProperty("http.proxyUser"),
                    System.getProperty("http.proxyPassword")));
        httpClient.setState(state);
      }
    }
  }

  /**
   * Extracts the CAPTCHA information from a response.
   *
   * @param authProperties the response from the client login API
   * @return the CAPTCHA information
   */
  private CaptchaInformation extractCaptchaInfoFromProperties(Properties authProperties) {
    String captchaUrl = CLIENT_LOGIN_SERVER + authProperties.getProperty(CAPTCHA_URL_KEY);
    String captchaToken = authProperties.getProperty(CAPTCHA_TOKEN_KEY);
    String url = authProperties.getProperty(URL_KEY);

    return new CaptchaInformation(captchaUrl, captchaToken, url);
  }

  /**
   * Generates a {@code Properties} from a client login API response
   *
   * @param responseBodyStream the response body as a stream
   * @return a {@code Properties} generated from the response body
   * @throws IOException if response body stream could not be read
   */
  private Properties generatePropertiesFromResponse(InputStream responseBodyStream)
      throws IOException {
    Properties properties = new Properties();
    properties.load(responseBodyStream);
    return properties;
  }
}
