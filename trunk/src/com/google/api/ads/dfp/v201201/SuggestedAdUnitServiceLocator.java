/**
 * SuggestedAdUnitServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;

public class SuggestedAdUnitServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.v201201.SuggestedAdUnitService {

    public SuggestedAdUnitServiceLocator() {
    }


    public SuggestedAdUnitServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SuggestedAdUnitServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SuggestedAdUnitServiceInterfacePort
    private java.lang.String SuggestedAdUnitServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201201/SuggestedAdUnitService";

    public java.lang.String getSuggestedAdUnitServiceInterfacePortAddress() {
        return SuggestedAdUnitServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SuggestedAdUnitServiceInterfacePortWSDDServiceName = "SuggestedAdUnitServiceInterfacePort";

    public java.lang.String getSuggestedAdUnitServiceInterfacePortWSDDServiceName() {
        return SuggestedAdUnitServiceInterfacePortWSDDServiceName;
    }

    public void setSuggestedAdUnitServiceInterfacePortWSDDServiceName(java.lang.String name) {
        SuggestedAdUnitServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceInterface getSuggestedAdUnitServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SuggestedAdUnitServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSuggestedAdUnitServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceInterface getSuggestedAdUnitServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSuggestedAdUnitServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSuggestedAdUnitServiceInterfacePortEndpointAddress(java.lang.String address) {
        SuggestedAdUnitServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201201.SuggestedAdUnitServiceSoapBindingStub(new java.net.URL(SuggestedAdUnitServiceInterfacePort_address), this);
                _stub.setPortName(getSuggestedAdUnitServiceInterfacePortWSDDServiceName());
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
        if ("SuggestedAdUnitServiceInterfacePort".equals(inputPortName)) {
            return getSuggestedAdUnitServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "SuggestedAdUnitService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "SuggestedAdUnitServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SuggestedAdUnitServiceInterfacePort".equals(portName)) {
            setSuggestedAdUnitServiceInterfacePortEndpointAddress(address);
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
