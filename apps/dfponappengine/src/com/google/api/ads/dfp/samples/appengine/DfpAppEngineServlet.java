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

import com.google.api.ads.dfp.v201111.ClientLogin;
import com.google.api.ads.dfp.v201111.Network;
import com.google.api.ads.dfp.v201111.NetworkService;
import com.google.api.ads.dfp.v201111.NetworkServiceInterface;
import com.google.api.ads.dfp.v201111.SoapRequestHeader;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello World DFP API Servlet on Java App Engine.
 *
 * @author api.paulrashidi@gmail.com (Paul Rashidi)
 */
public class DfpAppEngineServlet extends HttpServlet {
  private String authToken = null;
  private static final Logger logger = Logger.getLogger("DfpAppEngineServlet");
  private static final String EMAIL_ADDRESS = "INSERT_EMAIL_HERE";
  private static final String EMAIL_ADDRESS_PASSWORD = "INSERT_PASSWORD_HERE";

  /**
   * Perform initialization of servlet and cached resources used to access DFP
   * API.
   */
  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);

    // Generate an authToken.
    try {
      authToken = regenerateAuthToken();
    } catch (Exception exception) {
      throw new ServletException("Could not generate an Auth Token.", exception);
    }
  }

  /**
   * Regenerate the client login auth token that the servlet uses.
   *
   * @throws Exception
   */
  public synchronized String regenerateAuthToken() throws Exception {
    ClientLoginAuth clientLoginAuth = new ClientLoginAuth(EMAIL_ADDRESS, EMAIL_ADDRESS_PASSWORD);
    return clientLoginAuth.getAuthToken();
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
    try {
      // Retrieve an object handle to our network service.
      NetworkService networkService = new NetworkService();
      NetworkServiceInterface networkServiceInterface =
          networkService.getNetworkServiceInterfacePort();

      // Prepare header object to make server call
      SoapRequestHeader requestHeader = new SoapRequestHeader();
      requestHeader.setApplicationName("Hello World");
      ClientLogin clientLogin = new ClientLogin();
      clientLogin.setToken(authToken);
      requestHeader.setAuthentication(clientLogin);

      // Make protected call to the server.
      String rootAdUnitId = "";
      Network currentNetwork = networkServiceInterface.getCurrentNetwork(requestHeader, null);
      // Extract data from object returned from server.
      rootAdUnitId = currentNetwork.getEffectiveRootAdUnitId();

      resp.setContentType("text/plain");
      resp.getWriter().println("Hello, world. Your root ad unit id is: " + rootAdUnitId);
    } catch (Exception e) {
      // Perform exception handling.
      logger.log(Level.SEVERE, "Exception retrieving data", e);
      throw new ServletException("Error occurred. Check logs for specific details"
          + " about the error.");
    }
  }
}
