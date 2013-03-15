/**
 * CreativeWrapperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201302;

public class CreativeWrapperServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.v201302.CreativeWrapperService {

    public CreativeWrapperServiceLocator() {
    }


    public CreativeWrapperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreativeWrapperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreativeWrapperServiceInterfacePort
    private java.lang.String CreativeWrapperServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201302/CreativeWrapperService";

    public java.lang.String getCreativeWrapperServiceInterfacePortAddress() {
        return CreativeWrapperServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreativeWrapperServiceInterfacePortWSDDServiceName = "CreativeWrapperServiceInterfacePort";

    public java.lang.String getCreativeWrapperServiceInterfacePortWSDDServiceName() {
        return CreativeWrapperServiceInterfacePortWSDDServiceName;
    }

    public void setCreativeWrapperServiceInterfacePortWSDDServiceName(java.lang.String name) {
        CreativeWrapperServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.v201302.CreativeWrapperServiceInterface getCreativeWrapperServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreativeWrapperServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreativeWrapperServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.v201302.CreativeWrapperServiceInterface getCreativeWrapperServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.v201302.CreativeWrapperServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201302.CreativeWrapperServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreativeWrapperServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreativeWrapperServiceInterfacePortEndpointAddress(java.lang.String address) {
        CreativeWrapperServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.v201302.CreativeWrapperServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.v201302.CreativeWrapperServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201302.CreativeWrapperServiceSoapBindingStub(new java.net.URL(CreativeWrapperServiceInterfacePort_address), this);
                _stub.setPortName(getCreativeWrapperServiceInterfacePortWSDDServiceName());
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
        if ("CreativeWrapperServiceInterfacePort".equals(inputPortName)) {
            return getCreativeWrapperServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "CreativeWrapperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "CreativeWrapperServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreativeWrapperServiceInterfacePort".equals(portName)) {
            setCreativeWrapperServiceInterfacePortEndpointAddress(address);
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
