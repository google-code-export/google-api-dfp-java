// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.samples.appengine;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * The ClientLoginAuth class creates an authentication token using the <a
 * href="http://code.google.com/apis/accounts/docs/AuthForInstalledApps.html">
 * ClientLogin API</a>. This class utilizes the java.net.HttpURLConnection class
 * in order to be compatible with Google AppEngine.
 *
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class ClientLoginAuth {
  private static final String CLIENT_LOGIN_SERVER = "https://www.google.com/accounts/";
  private static final String CLIENT_LOGIN_URL = CLIENT_LOGIN_SERVER + "ClientLogin";
  private static final int HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS = (int) TimeUnit.SECONDS.toMillis(20);
  private static final String AUTH_TOKEN_KEY = "Auth";
  private static final String ERROR_KEY = "Error";
  private static final String INFO_KEY = "Info";
  private static final String URL_KEY = "Url";
  private static final String CAPTCHA_TOKEN_KEY = "CaptchaToken";
  private static final String CAPTCHA_URL_KEY = "CaptchaUrl";
  private static final String CAPTCHA_REQUIRED_ERROR = "CaptchaRequired";
  private static final String HTTP_RESPONSE_CODE = "HTTP_RESPONSE_CODE";

  private final String email;
  private final String password;
  private final String captchaTokenId;
  private final String captchaAnswer;

  private CaptchaInformation captchaInformation = null;

  /**
   * Constructor for email and password request.
   *
   * @param email the user's login email address
   * @param password the user's password
   */
  public ClientLoginAuth(String email, String password) {
    this(email, password, null, null);
  }

  /**
   * Constructor which provides fields for CAPTCHA information.
   *
   * @param email the user's login email address
   * @param password the user's password
   * @param captchaTokenId the CAPTCHA token
   * @param captchaAnswer the CAPTCHA answer
   */
  public ClientLoginAuth(String email, String password, String captchaTokenId,
      String captchaAnswer) {
    this.email = email;
    this.password = password;
    this.captchaTokenId = captchaTokenId;
    this.captchaAnswer = captchaAnswer;
  }

  /**
   * Constructor used for generating a new {@code AuthToken} from an old one
   * along with CAPTCHA information.
   *
   * @param authToken the {@code AuthToken} object to get the email and password
   *        from
   * @param captchaTokenId the CAPTCHA token
   * @param captchaAnswer the CAPTCHA answer
   */
  public ClientLoginAuth(ClientLoginAuth authToken, String captchaTokenId, String captchaAnswer) {
    this.email = authToken.email;
    this.password = authToken.password;
    this.captchaTokenId = captchaTokenId;
    this.captchaAnswer = captchaAnswer;
  }

  /**
   * Retrieves an authentication token using the user's credentials.
   *
   * @return a {@code String} authentication token.
   * @throws Exception
   */
  public String getAuthToken() throws Exception {
    captchaInformation = null;

    // Attempt to get an auth token and put results into a properties file.
    Properties responseProperties = postToClientLogin();

    // Extract response code from properties.
    int responseCode = Integer.valueOf(responseProperties.getProperty(HTTP_RESPONSE_CODE, "000"));

    // Test if responseCode indicates a success.
    if (responseCode == HttpURLConnection.HTTP_OK) {
      // Test to see if an auth key was present.
      if (responseProperties.containsKey(AUTH_TOKEN_KEY)) {
        // Return auth key.
        return responseProperties.getProperty(AUTH_TOKEN_KEY).toString();
      } else {
        throw new Exception("Unable to get auth token from Client "
            + "Login server: Handshake was successful but "
            + "auth token was not present in the response.");
      }
    } else {
      // Failure was detected so try to collect captcha information
      // that calling application
      // can present to a user to authenticate.
      String errorCode = null;

      // Test to see if an error code was returned.
      if (responseProperties.containsKey(ERROR_KEY)) {
        // Extract the error code.
        errorCode = responseProperties.getProperty(ERROR_KEY);
        // Test if error code indicated that a captcha was required.
        if (errorCode != null && errorCode.equals(CAPTCHA_REQUIRED_ERROR)) {
          // Load captcha object from response properties if required.
          captchaInformation = extractCaptchaInfoFromProperties(responseProperties);
        }

        // Test for extra information that can be returned during a failure.
        if (responseProperties.containsKey(INFO_KEY)) {
          // Append error code with extra information that was returned.
          errorCode += ": " + responseProperties.getProperty(INFO_KEY);
        }
      }

      throw new Exception(errorCode);
    }
  }

  /**
   * Performs the POST to the client login API.
   *
   * @return Properties object containing information about the client login API
   *         call.
   * @throws Exception
   */
  private Properties postToClientLogin() throws Exception {
    HttpURLConnection connection = null;
    try {
      // Aim the connection at the client login service.
      URL url = new URL(CLIENT_LOGIN_URL);
      connection = (HttpURLConnection) url.openConnection();

      // Set connection parameters.
      connection.setDoOutput(true);
      connection.setDoInput(true);
      connection.setRequestMethod("POST");
      connection.setChunkedStreamingMode(-1);
      connection.setConnectTimeout(HTTP_CLIENT_SOCKET_TIMEOUT_IN_MS);
      connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

      // Create message to be POSTed.
      StringBuffer sb = new StringBuffer("");
      sb.append("accountType=HOSTED_OR_GOOGLE");
      sb.append("&Email=");
      sb.append(email);
      sb.append("&Passwd=");
      sb.append(password);
      sb.append("&service=gam");
      sb.append("&source=google-dfpapi-java");

      // Append captcha information if supplied.
      if (captchaTokenId != null) {
        sb.append("&logintoken=");
        sb.append(captchaTokenId);
      }
      if (captchaAnswer != null) {
        sb.append("&logincaptcha=");
        sb.append(captchaAnswer);
      }

      // Write the message to the server.
      OutputStreamWriter writer = null;
      try {
        writer = new OutputStreamWriter(connection.getOutputStream());
        writer.append(sb);
        writer.flush();
      } finally {
        writer.close();
      }

      // Connect to server.
      connection.connect();

      // Read response code from server.
      int responseCode = connection.getResponseCode();

      // Test server response.
      if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
        // OK
        Properties properties = generatePropertiesFromResponse(connection.getInputStream());
        properties.put(HTTP_RESPONSE_CODE, responseCode + "");
        return properties;
      } else {
        // Server returned error code.
        Properties properties = generatePropertiesFromResponse(connection.getErrorStream());
        properties.put(HTTP_RESPONSE_CODE, responseCode + "");
        return properties;
      }
    } finally {
      connection.disconnect();
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
   * @param responseInputStream the response body as a stream
   * @return a {@code Properties} generated from the response body
   * @throws IOException if response body stream could not be read
   */
  private static Properties generatePropertiesFromResponse(InputStream responseInputStream)
      throws IOException {
    Properties properties = new Properties();
    properties.load(responseInputStream);
    return properties;
  }

  /**
   * Returns captcha information if a captcha error happened while attempting to
   * get an auth token.
   *
   * @return Captcha information for last auth token error
   */
  public CaptchaInformation getCaptchaInformation() {
    return captchaInformation;
  }

  /**
   * Represents CAPTCHA information retruned by the client login API.
   *
   * @author api.paulrashidi@gmail.com (Paul Rashidi)
   */
  class CaptchaInformation {
    private final String captchaUrl;
    private final String captchaToken;
    private final String url;

    /**
     * @param captchaUrl the CAPTCHA URL
     * @param captchaToken the CAPTCHA token
     * @param url the URL
     */
    public CaptchaInformation(String captchaUrl, String captchaToken, String url) {
      this.captchaUrl = captchaUrl;
      this.captchaToken = captchaToken;
      this.url = url;
    }

    /**
     * Gets the CAPTCHA URL used to get the CAPTCHA image.
     *
     * @return the captchaUrl
     */
    public String getCaptchaUrl() {
      return captchaUrl;
    }

    /**
     * Gets the CAPTCHA token used in the next client login API request.
     *
     * @return the captchaToken
     */
    public String getCaptchaToken() {
      return captchaToken;
    }

    /**
     * Gets the URL to unlock an account.
     *
     * @return the URL
     */
    public String getUrl() {
      return url;
    }
  }

}
