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

import org.apache.axis.client.Stub;

import java.lang.reflect.InvocationTargetException;

import javax.xml.rpc.ServiceException;

/**
 * For each active version of the DoubleClick For Publishers API, there should exist
 * a sub-class which implements the abstract class.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public abstract class DfpVersion {
  /**
   * The {@code DfpVersion} for v201203.
   */
  public static final DfpVersion V201203 = new DfpVersionV201203();

  /**
   * The {@code DfpVersion} for v201204.
   */
  public static final DfpVersion V201204 = new DfpVersionV201204();

  /**
   * The {@code DfpVersion} for v201206.
   */
  public static final DfpVersion V201206 = new DfpVersionV201206();

  /**
   * The {@code DfpVersion} for v201208.
   */
  public static final DfpVersion V201208 = new DfpVersionV201208();
  
  /**
   * The {@code DfpVersion} for v201211.
   */
  public static final DfpVersion V201211 = new DfpVersionV201211();

  protected final String version;
  protected final String namespace;
  protected final String packagePrefix;
  protected final String url;

  /**
   * @param version the version name i.e. v201004
   * @param namespace the namespace
   * @param packagePrefix the package prefix such that the package
   *                      {@code packagPrefix + "." + version} contains all
   *                      code for that version
   * @param url the URL
   */
  protected DfpVersion(String version, String namespace, String packagePrefix, String url) {
    this.version = version;
    this.namespace = namespace;
    this.packagePrefix = packagePrefix;
    this.url = url;
  }

  /**
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * @return the namespace
   */
  public String getNamespace() {
    return namespace;
  }

  /**
   * @return the packagePrefix
   */
  public String getPackagePrefix() {
    return packagePrefix;
  }

  /**
   * @return the URL
   */
  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    return this.version;
  }

  /**
   * Sets the headers for the service designated by {@code stub}.
   *
   * @param stub the stub which headers need populating
   * @param user the user to populate the stub headers with
   * @throws ServiceException thrown if headers could not be set
   */
  public abstract void setHeaders(Stub stub, DfpUser user) throws ServiceException;

  /**
   * The v201203 version class.
   */
  private static class DfpVersionV201203 extends DfpVersion {
    protected DfpVersionV201203() {
      super("v201203", "https://www.google.com/apis/ads/publisher/v201203",
          "com.google.api.ads.dfp.", "https://www.google.com");
    }

    /**
     * See {@link DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        Class<?> clientLoginClass =
            Class.forName(packagePrefix + this.toString() + "." + "ClientLogin");
        Class<?> authenticationClass =
            Class.forName(packagePrefix + this.toString() + "." + "Authentication");

        Object clientLogin =
            clientLoginClass.getConstructor(String.class, String.class).newInstance(null,
                user.getRegisteredAuthToken());

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, authenticationClass)
                .newInstance(user.getNetworkCode(), user.getClientLibraryIdentifier(),
                    clientLogin));

      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
  }

  /**
   * The v201204 version class.
   */
  private static class DfpVersionV201204 extends DfpVersion {
    protected DfpVersionV201204() {
      super("v201204", "https://www.google.com/apis/ads/publisher/v201204",
          "com.google.api.ads.dfp.", "https://www.google.com");
    }

    /**
     * See {@link DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        Class<?> clientLoginClass =
            Class.forName(packagePrefix + this.toString() + "." + "ClientLogin");
        Class<?> authenticationClass =
            Class.forName(packagePrefix + this.toString() + "." + "Authentication");

        Object clientLogin =
            clientLoginClass.getConstructor(String.class, String.class).newInstance(null,
                user.getRegisteredAuthToken());

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, authenticationClass)
                .newInstance(user.getNetworkCode(), user.getClientLibraryIdentifier(),
                    clientLogin));

      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
  }

  /**
   * The v201206 version class.
   */
  private static class DfpVersionV201206 extends DfpVersion {
    protected DfpVersionV201206() {
      super("v201206", "https://www.google.com/apis/ads/publisher/v201206",
          "com.google.api.ads.dfp.", "https://www.google.com");
    }

    /**
     * See {@link DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        Class<?> clientLoginClass =
            Class.forName(packagePrefix + this.toString() + "." + "ClientLogin");
        Class<?> authenticationClass =
            Class.forName(packagePrefix + this.toString() + "." + "Authentication");

        Object clientLogin =
            clientLoginClass.getConstructor(String.class, String.class).newInstance(null,
                user.getRegisteredAuthToken());

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, authenticationClass)
                .newInstance(user.getNetworkCode(), user.getClientLibraryIdentifier(),
                    clientLogin));

      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
  }

  /**
   * The v201208 version class.
   */
  private static class DfpVersionV201208 extends DfpVersion {
    protected DfpVersionV201208() {
      super("v201208", "https://www.google.com/apis/ads/publisher/v201208",
          "com.google.api.ads.dfp.", "https://www.google.com");
    }

    /**
     * See {@link DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        Class<?> clientLoginClass =
            Class.forName(packagePrefix + this.toString() + "." + "ClientLogin");
        Class<?> authenticationClass =
            Class.forName(packagePrefix + this.toString() + "." + "Authentication");

        Object clientLogin =
            clientLoginClass.getConstructor(String.class, String.class).newInstance(null,
                user.getRegisteredAuthToken());

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, authenticationClass)
                .newInstance(user.getNetworkCode(), user.getClientLibraryIdentifier(),
                    clientLogin));

      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
  }

  /**
   * The v201211 version class.
   */
  private static class DfpVersionV201211 extends DfpVersion {
    protected DfpVersionV201211() {
      super("v201211", "https://www.google.com/apis/ads/publisher/v201211",
          "com.google.api.ads.dfp.", "https://www.google.com");
    }

    /**
     * See {@link DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        Class<?> clientLoginClass =
            Class.forName(packagePrefix + this.toString() + "." + "ClientLogin");
        Class<?> authenticationClass =
            Class.forName(packagePrefix + this.toString() + "." + "Authentication");

        Object clientLogin =
            clientLoginClass.getConstructor(String.class, String.class).newInstance(null,
                user.getRegisteredAuthToken());

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, authenticationClass)
                .newInstance(user.getNetworkCode(), user.getClientLibraryIdentifier(),
                    clientLogin));

      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
  }
}
