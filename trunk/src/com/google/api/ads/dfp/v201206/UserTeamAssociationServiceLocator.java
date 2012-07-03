/**
 * UserTeamAssociationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;

public class UserTeamAssociationServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.v201206.UserTeamAssociationService {

    public UserTeamAssociationServiceLocator() {
    }


    public UserTeamAssociationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserTeamAssociationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserTeamAssociationServiceInterfacePort
    private java.lang.String UserTeamAssociationServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201206/UserTeamAssociationService";

    public java.lang.String getUserTeamAssociationServiceInterfacePortAddress() {
        return UserTeamAssociationServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserTeamAssociationServiceInterfacePortWSDDServiceName = "UserTeamAssociationServiceInterfacePort";

    public java.lang.String getUserTeamAssociationServiceInterfacePortWSDDServiceName() {
        return UserTeamAssociationServiceInterfacePortWSDDServiceName;
    }

    public void setUserTeamAssociationServiceInterfacePortWSDDServiceName(java.lang.String name) {
        UserTeamAssociationServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.v201206.UserTeamAssociationServiceInterface getUserTeamAssociationServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserTeamAssociationServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserTeamAssociationServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.v201206.UserTeamAssociationServiceInterface getUserTeamAssociationServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.v201206.UserTeamAssociationServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201206.UserTeamAssociationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserTeamAssociationServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserTeamAssociationServiceInterfacePortEndpointAddress(java.lang.String address) {
        UserTeamAssociationServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.v201206.UserTeamAssociationServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.v201206.UserTeamAssociationServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201206.UserTeamAssociationServiceSoapBindingStub(new java.net.URL(UserTeamAssociationServiceInterfacePort_address), this);
                _stub.setPortName(getUserTeamAssociationServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserTeamAssociationServiceInterfacePort".equals(inputPortName)) {
            return getUserTeamAssociationServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "UserTeamAssociationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "UserTeamAssociationServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserTeamAssociationServiceInterfacePort".equals(portName)) {
            setUserTeamAssociationServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
