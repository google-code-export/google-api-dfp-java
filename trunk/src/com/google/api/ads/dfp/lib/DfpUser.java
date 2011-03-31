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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

/**
 * The {@code DfpUser} class contains all needed information to
 * authenticate a user as well as generate a valid service for that user. The
 * way in which a service is generated is performed as:
 * <p>
 * <code>DfpUser user = new DfpUser(email, password, networkCode, applicationName, true);</code><br/>
 * <code>ServiceInterface service = user.getService(DfpService.version.serviceName);</code>
 * <p>
 * The interface {@code <Service>Interface} should match that described by
 * {@code DfpService.version.serviceName} or else a
 * {@code ServiceException} will be thrown. For example, if you wished to
 * get the service {@code InventoryService} and you referenced this service by
 * {@code DfpService.v201004.INVENTORY_SERVICE}, your import of
 * {@code InventoryServiceInterface} should be from the package
 * {@code com.google.api.ads.dfp.v201004}.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DfpUser {
  // Defaults for lib name and version, both of which will be loaded from
  // the build.properties file.
  private final static String DEFAULT_LIB_PREFIX_NAME = "DfpApi";
  private final static String DEFAULT_LIB_POSTFIX_NAME = "Java";
  private final static String DEFAULT_LIB_VERSION = "";

  private final static String DEFAULT_PROPERTY_FILE_LOCATION =
      System.getProperty("user.home") + "/dfp.properties";

  private static String libName;
  private static String libVersion;

  private static final String USE_CLASSPATH_CLIENT_CONFIG_PROPERTY =
      "com.google.api.ads.dfp.lib.useclasspathclientconfig";
  private static boolean useClasspathClientConfig = false;

  /**
   * Load properties statically.
   */
  {
    loadBuildProperties();
    loadSystemProperties();
  }

  private final String email;
  private final String password;
  private final String applicationName;
  private final String networkCode;

  private String authToken = null;

  private Boolean useSandbox;

  /**
   * @param email the email address of the user
   * @param password the password
   * @param networkCode the network code the login belongs to
   * @param applicationName the application name
   * @param useSandbox {@code true} if the Sandbox should be used
   */
  public DfpUser(String email, String password,
      String networkCode, String applicationName, boolean useSandbox) {
    this.email = email;
    this.password = password;
    this.networkCode = networkCode;
    this.applicationName = applicationName;
    this.useSandbox = useSandbox;
  }

  /**
   * Constructor defaults to using the sandbox environment.
   *
   * @param email the email address of the user
   * @param password the password
   * @param networkCode the network code the login belongs to
   * @param applicationName the application name
   */
  public DfpUser(String email, String password,
      String networkCode, String applicationName) {
    this(email, password, networkCode, applicationName, true);
  }

  /**
   * Constructor defaults to using the sandbox environment and does not supply
   * a network. This constructor assumes the user only has one network.
   *
   * @param email the email address of the user
   * @param password the password
   * @param applicationName the application name
   */
  public DfpUser(String email, String password, String applicationName) {
    this(email, password, null, applicationName, true);
  }

  /**
   * Creates <code>DfpUser</code> with default properties loaded
   * from "~/dfp.properties" file.
   *
   * @throws IOException if problem occurred while reading file
   */
  public DfpUser() throws IOException {
    this(DEFAULT_PROPERTY_FILE_LOCATION);
  }

  /**
   * Creates <code>DfpUser</code> with properties loaded
   * from given file.
   *
   * @param fileName absolute or relative path to the properties file, which
   *                 has to follow <code>java.util.Properties</code> file format
   * @throws IOException if problem occurred while reading file
   */
  public DfpUser(String fileName) throws IOException {
    this(getMap(fileName));
  }

  /**
   * Creates <code>DfpUser</code> with properties from given
   * <code>Properties</code>.</p>
   * <br><br>
   * The <code>Properties</code> may contain email, password, networkCode,
   * applicationName, and useSandbox.
   *
   * @param properties the {@code Map} object containing the constructor
   *                   parameters
   */
  public DfpUser(Map properties) {
    this((String) properties.get("email"),
         (String) properties.get("password"),
         (String) properties.get("networkCode"),
         (String) properties.get("applicationName"),
         (properties.get("useSandbox") == null) ? false
             : ((String) properties.get("useSandbox")).equalsIgnoreCase("true"));
  }

  /**
   * Gets an instantiated service generated for this user determined by
   * {@code service}. Should be used in the form:
   * <code>
   * ServiceNameInterface service = user.getService(DfpService.Version.Service);
   * </code>
   *
   * where ServiceNameInterface is described in the javadoc within
   * DfpService.Version.Service, and both Version and Service are constants.
   *
   * @param <T> the type determined by the return-capture variable to cast the
   *     generated stub to.
   * @param service the {@code DfpService} used to generate
   *     the service
   * @return the instantiated service for this user
   * @throws ServiceException if service stub could not be generated or
   *     if the return-capture variable's type does not match the service
   *     requested
   */
  public <T extends java.rmi.Remote> T getService(DfpService service)
      throws ServiceException {
    try {
      return (T) DfpServiceFactory.generateSerivceStub(service, this,
          service.getEndpointServer(this.isUsingSandbox()));
    } catch (ClassCastException e) {
      throw new ServiceException("Cannot cast serivce. Check the type of return-capture variable.",
          e);
    }
  }

  /**
   * Gets an instantiated service generated for this user determined by
   * {@code service}. Should be used in the form:
   * <code>
   * ServiceNameInterface service = user.getService(DfpService.Version.Service);
   * </code>
   *
   * where ServiceNameInterface is described in the javadoc within
   * DfpService.Version.Service, and both Version and Service are constants.
   *
   * @param <T> the type determined by the return-capture variable to cast the
   *     generated stub to.
   * @param service the {@code DfpService} used to generate
   *     the service
   * @param endpointServer the endpoint server of the service
   * @return the instantiated service for this user
   * @throws ServiceException if service stub could not be generated or
   *     if the return-capture variable's type does not match the service
   *     requested
   */
  public <T extends java.rmi.Remote> T getService(DfpService service, String endpointServer)
      throws ServiceException {
    try {
      return (T) DfpServiceFactory.generateSerivceStub(service, this, endpointServer);
    } catch (ClassCastException e) {
      throw new ServiceException("Cannot cast serivce. Check the type of return-capture variable.",
          e);
    }
  }

  /**
   * Gets the email.
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the password.
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the application name.
   * @return the application name.
   */
  public String getApplicationName() {
    return applicationName;
  }

  /**
   * Gets the network code.
   * @return the network code
   */
  public Object getNetworkCode() {
    return networkCode;
  }

  /**
   * Returns {@code true} if the user is using the sandbox.
   *
   * @return {@code true} if the user is using the sandbox
   */
  public boolean isUsingSandbox() {
    return useSandbox;
  }

  /**
   * Sets whether all future services will be generated to use the sandbox.
   *
   * @param useSandbox {@code true} if all future services will be generated
   *     to use the sandbox
   */
  public void useSandbox(boolean useSandbox) {
    this.useSandbox = useSandbox;
  }

  /**
   * Gets the registered authentication token associated with this user. This
   * method does not generate a new authentication token; use the
   * {@link AuthToken#getAuthToken()} method to do this. This can be
   * {@code null} if the authentication token was never set.
   *
   * @return the registered authentication token with this user
   */
  public String getRegisteredAuthToken() {
    return authToken;
  }

  /**
   * Sets the authentication token that is retrieved by
   * {@link #getRegisteredAuthToken()}. This authentication token will be used
   * when generating services; i.e.
   * {@code getService(DfpVersion.*.*)}.
   *
   * @param authToken the authentication token to use when generating services
   */
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  /**
   * Uses the client-config.wsdd located in the classpath instead of loading
   * the runtime {@code EngineConfiguration}, which sets the HTTP
   * transport to {@link DfpHttpSender}.
   *
   * @param useClasspathClientConfig {@code true} if the client-config.wsdd
   *     located in the classpath should be used
   */
  public static void useClasspathClientConfig(boolean useClasspathClientConfig) {
    DfpUser.useClasspathClientConfig = useClasspathClientConfig;
  }

  /**
   * Returns {@code true} if the {@link DfpServiceFactory} should use the
   * client-config.wsdd located in the classpath instead of loading the runtime
   * {@code EngineConfiguration}. See
   * {@link #useClasspathClientConfig(boolean)}.
   *
   * @return {@code true} if the client-config.wsdd located in the classpath
   *     should be used
   */
  public static boolean getUseClasspathClientConfig() {
    return useClasspathClientConfig;
  }

  /**
   * Gets the client library identifier used for user-agent fields.
   * @return the client library identifier used for user-agent fields
   */
  public String getClientLibraryIdentifier() {
    return libName + "-" + libVersion + "-" + applicationName;
  }

  /**
   * Loads the system properties statically.
   */
  private static void loadSystemProperties() {
    if (System.getProperty(USE_CLASSPATH_CLIENT_CONFIG_PROPERTY) != null) {
      useClasspathClientConfig = Boolean.parseBoolean(
          System.getProperty(USE_CLASSPATH_CLIENT_CONFIG_PROPERTY));
    }
  }

  /**
   * Loads the build properties from the build.properties and
   * build-extension.properties file.
   */
  private static void loadBuildProperties() {
    Properties buildProps = new Properties();
    try {
      buildProps = loadResourcePropertiesFile("build.properties");
    } catch (IOException e) {
      DfpServiceLogger.DFP_API_LIB_LOG.error("Could not load build.properties file.");
    }

    Properties buildExtProps = new Properties();
    try {
      buildExtProps = loadResourcePropertiesFile("build-extension.properties");
    } catch (IOException e) {
      DfpServiceLogger.DFP_API_LIB_LOG.error("Could not load build-extension.properties file.");
    }

    String libPrefix = (buildProps.containsKey("lib_prefix_name"))
        ? buildProps.getProperty("lib_prefix_name") : DEFAULT_LIB_PREFIX_NAME;
    String libPostfix = (buildProps.containsKey("lib_postfix_name"))
        ? buildProps.getProperty("lib_postfix_name") : DEFAULT_LIB_POSTFIX_NAME;
    String libVersion = (buildProps.containsKey("lib_version"))
        ? buildProps.getProperty("lib_version") : DEFAULT_LIB_VERSION;

    String libExtName = (buildExtProps.containsKey("lib_ext_name"))
        ? buildExtProps.getProperty("lib_ext_name") : "";
    String libExtVersion = (buildExtProps.containsKey("lib_ext_version"))
        ? buildExtProps.getProperty("lib_ext_version") : "";

    DfpUser.libName = libPrefix + "-" + libPostfix
        + (libExtName.equals("") ? libExtName : "-" + libExtName + "-");
    DfpUser.libVersion = libVersion + libExtVersion;
  }

  /**
   * Loads the properties file from resource relative to the src directory.
   *
   * @param fileName the file from resource to load
   * @return the loaded properties
   * @throws IOException if the properties cannot be loaded
   */
  private static Properties loadResourcePropertiesFile(String fileName) throws IOException {
    Properties properties = new Properties();
    InputStream propertiesFile = null;

    try {
      propertiesFile =
        DfpUser.class.getClassLoader().getResourceAsStream(fileName);
      if (propertiesFile != null) {
        properties.load(propertiesFile);
      }
    } finally {
      if (propertiesFile != null) {
        propertiesFile.close();
      }
    }

    return properties;
  }

  /**
   * Returns {@code Properties} object populated with properties loaded
   * from a given file.
   *
   * @param fileName absolute or relative path to the properties file, which
   *     has to follow {@code java.util.Properties} file format
   * @return Map object with loaded credentials
   * @throws IOException if problem occurred while reading file
   */
  public static Map getMap(String fileName) throws IOException {
    Properties credentials = new Properties();
    credentials.load(new FileInputStream(fileName));
    return credentials;
  }
}
