/**
 * LineItemServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;

public class LineItemServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.v201108.LineItemService {

    public LineItemServiceLocator() {
    }


    public LineItemServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LineItemServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LineItemServiceInterfacePort
    private java.lang.String LineItemServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201108/LineItemService";

    public java.lang.String getLineItemServiceInterfacePortAddress() {
        return LineItemServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LineItemServiceInterfacePortWSDDServiceName = "LineItemServiceInterfacePort";

    public java.lang.String getLineItemServiceInterfacePortWSDDServiceName() {
        return LineItemServiceInterfacePortWSDDServiceName;
    }

    public void setLineItemServiceInterfacePortWSDDServiceName(java.lang.String name) {
        LineItemServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.v201108.LineItemServiceInterface getLineItemServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LineItemServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLineItemServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.v201108.LineItemServiceInterface getLineItemServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.v201108.LineItemServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201108.LineItemServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLineItemServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLineItemServiceInterfacePortEndpointAddress(java.lang.String address) {
        LineItemServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.v201108.LineItemServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.v201108.LineItemServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201108.LineItemServiceSoapBindingStub(new java.net.URL(LineItemServiceInterfacePort_address), this);
                _stub.setPortName(getLineItemServiceInterfacePortWSDDServiceName());
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
        if ("LineItemServiceInterfacePort".equals(inputPortName)) {
            return getLineItemServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "LineItemService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "LineItemServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LineItemServiceInterfacePort".equals(portName)) {
            setLineItemServiceInterfacePortEndpointAddress(address);
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
