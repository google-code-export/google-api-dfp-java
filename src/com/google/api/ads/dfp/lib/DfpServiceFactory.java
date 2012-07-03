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

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.XMLStringProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.Remote;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

/**
 * The {@code DfpServiceFactory} generates service stubs with an
 * Axis {@link EngineConfiguration} which maps the HTTP transport to the
 * class {@link DfpHttpSender}. If a custom client configuration must
 * be deployed, there is an example client-config.wsdd included in this
 * distribution, which when included in the classpath and when
 * {@code user.useClasspathClientConfig == true}, will override this
 * class' {@code EngineConfiguration}. Not setting the
 * {@code DfpHttpSender} to the HTTP transport will result in the
 * loss of functionality in SOAP XML logging and {@code ServiceAccountant}
 * abilities.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class DfpServiceFactory {
  private static final String DEFAULT_ENGINE_CONFIGURATION_XML =
      "<?xml version='1.0'?> "
      + "<deployment name='defaultClientConfig' "
      + "xmlns='http://xml.apache.org/axis/wsdd/' "
      + "xmlns:java='http://xml.apache.org/axis/wsdd/providers/java'> "
      + "<globalConfiguration> "
      + "<parameter name='disablePrettyXML' value='true'/> "
      + "</globalConfiguration> "
      + "<transport name='http' pivot='java:com.google.api.ads.dfp.lib.DfpHttpSender' /> "
      + "<transport name='local' pivot='java:org.apache.axis.transport.local.LocalSender' /> "
      + "<transport name='java' pivot='java:org.apache.axis.transport.java.JavaSender' /> "
      + "</deployment>";

  /**
   * {@code DfpServiceFactory} is meant to be used statically.
   */
  private DfpServiceFactory() {}

  /**
   * Gets the default engine configuration which maps the HTTP transport
   * to {@link DfpHttpSender}.
   *
   * @return the engine configuration that enables SOAP XML logging and
   *     {@code ServiceAccountant} abilities
   */
  public static EngineConfiguration getDefaultEngineConfiguration() {
    return new XMLStringProvider(DEFAULT_ENGINE_CONFIGURATION_XML);
  }

  /**
   * Generates a service stub determined by {@code service}
   * for this user.
   *
   * @param service the {@code DfpSerivce} used to generate
   *     the service
   * @param user the {@code DfpUser} to create the service with
   * @param endpointServer the server to override the service's endpoint address
   *     with
   * @return a {@code Stub} for the service determined by {@code service}
   * @throws ServiceException if stub could not be generated
   */
  public static Stub generateSerivceStub(DfpService service, DfpUser user,
      String endpointServer) throws ServiceException {
    try {
      Service axisService =
          generateAxisService(service.getLocatorClass(),
              DfpUser.getUseClasspathClientConfig());
      setEndpointAddress(axisService, service.getEndpointAddress(endpointServer));
      Stub stub = getConfiguredStub(axisService, service.getInterfaceClass(),
          service.getVersion(), user);
      ServiceAccountantManager.getInstance().putService(stub, user);
      return stub;
    } catch (InstantiationException e) {
      throw new ServiceException("Instace of stub could not be created.", e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("This point should not have been reached.", e);
    } catch (ClassNotFoundException e) {
      throw new ServiceException("Could not locate an Axis generated class; check classpath.", e);
    } catch (NoSuchMethodException e) {
      throw new ServiceException("Error configuring service. "
          + "Check that the correct version of AXIS is being used.", e);
    } catch (InvocationTargetException e) {
      throw new ServiceException("Could not instantiate service class.", e.getCause());
    }
  }

  /**
   * Generates a service stub determined by {@code service} for this user.
   *
   * @param service the {@code DfpSerivce} used to generate
   *     the service
   * @param user the {@code DfpUser} to create the service with
   * @return a {@code Stub} for the service determined by {@code service}
   * @throws ServiceException if stub could not be generated
   */
  public static Stub generateSerivceStub(DfpService service, DfpUser user) throws ServiceException {
    return generateSerivceStub(service, user, service.getEndpointServer());
  }

  /**
   * Gets a configured stub for the axis {@link Service}, the interface class
   * it should be mapped to, the version, and the user to configure the headers
   * of the stub for.
   *
   * @param axisService the axis {@code Service} to generate a stub for
   * @param interfaceClass the interface class to map the stub to
   * @param version the {@link DfpVersion} used to configure the headers of
   *     the stub
   * @param user the {@link DfpUser} used to get information to populate
   *     the headers of the stub
   * @return the generated and configured stub
   * @throws ServiceException if there was an error while generating the stub through
   *     {@link Service#getPort(Class)} or while setting the headers of the
   *     stub through
   *     {@link DfpVersion#setHeaders(Stub, DfpUser)}.
   */
  private static Stub getConfiguredStub(Service axisService,
      Class<? extends Remote> interfaceClass, DfpVersion version, DfpUser user)
      throws ServiceException {
    Stub stub = (Stub) axisService.getPort(interfaceClass);
    version.setHeaders(stub, user);
    return stub;
  }

  /**
   * Sets the endpoint address of an axis {@link Service}. This will be the
   * address that all SOAP calls are made to.
   *
   * @param axisService the axis {@code Service} to configure
   * @param endPointAddress the endpoint address to set
   * @throws SecurityException if {@code setEndpointAddress} could not be
   *     called
   * @throws NoSuchMethodException if the {@code setEndpointAddress} method
   *     could not be found
   * @throws InvocationTargetException if there was an underlying exception
   *     thrown from the {@code setEndpointAddress} method
   * @throws IllegalAccessException if the {@code setEndpointAddress} method is
   *     inaccessible
   * @throws ServiceException if was an error in retrieving the service's ports
   */
  private static void setEndpointAddress(Service axisService, String endPointAddress)
      throws SecurityException, NoSuchMethodException, IllegalArgumentException,
      IllegalAccessException, InvocationTargetException, ServiceException {
    Iterator<QName> portNames = axisService.getPorts();
    Method method =
        axisService.getClass().getMethod("setEndpointAddress", QName.class, String.class);
    while (portNames.hasNext()) {
      method.invoke(axisService, portNames.next(), endPointAddress);
    }
  }

  /**
   * Generates the axis {@link Service} from the provided locator class.
   *
   * @param locatorClass the locator class for the axis {@code Service}
   * @param useClasspathClientConfig {@code true} if the
   *     {@code clientconfig.wsdd} located in the classpath should be used
   * @return the instantiated {@code Service}
   * @throws NoSuchMethodException if the constructor could not be found
   * @throws InstantiationException if the class could not be instantiated
   * @throws IllegalAccessException if the constructor is inaccessible
   * @throws InvocationTargetException if the underlying constructor throws an
   *     exception
   */
  private static Service generateAxisService(Class<? extends Service> locatorClass,
      boolean useClasspathClientConfig) throws NoSuchMethodException, InstantiationException,
      IllegalAccessException, InvocationTargetException {
    if (useClasspathClientConfig) {
      return locatorClass.getConstructor().newInstance();
    } else {
      Constructor<? extends Service> locatorConstructor =
          locatorClass.getConstructor(EngineConfiguration.class);
      EngineConfiguration config = getDefaultEngineConfiguration();
      return locatorConstructor.newInstance(config);
    }
  }
}
