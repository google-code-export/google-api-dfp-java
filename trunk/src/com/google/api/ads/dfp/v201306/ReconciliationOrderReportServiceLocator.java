/**
 * ReconciliationOrderReportServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public class ReconciliationOrderReportServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.v201306.ReconciliationOrderReportService {

    public ReconciliationOrderReportServiceLocator() {
    }


    public ReconciliationOrderReportServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReconciliationOrderReportServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReconciliationOrderReportServiceInterfacePort
    private java.lang.String ReconciliationOrderReportServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201306/ReconciliationOrderReportService";

    public java.lang.String getReconciliationOrderReportServiceInterfacePortAddress() {
        return ReconciliationOrderReportServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReconciliationOrderReportServiceInterfacePortWSDDServiceName = "ReconciliationOrderReportServiceInterfacePort";

    public java.lang.String getReconciliationOrderReportServiceInterfacePortWSDDServiceName() {
        return ReconciliationOrderReportServiceInterfacePortWSDDServiceName;
    }

    public void setReconciliationOrderReportServiceInterfacePortWSDDServiceName(java.lang.String name) {
        ReconciliationOrderReportServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceInterface getReconciliationOrderReportServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReconciliationOrderReportServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReconciliationOrderReportServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceInterface getReconciliationOrderReportServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReconciliationOrderReportServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReconciliationOrderReportServiceInterfacePortEndpointAddress(java.lang.String address) {
        ReconciliationOrderReportServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceSoapBindingStub _stub = new com.google.api.ads.dfp.v201306.ReconciliationOrderReportServiceSoapBindingStub(new java.net.URL(ReconciliationOrderReportServiceInterfacePort_address), this);
                _stub.setPortName(getReconciliationOrderReportServiceInterfacePortWSDDServiceName());
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
        if ("ReconciliationOrderReportServiceInterfacePort".equals(inputPortName)) {
            return getReconciliationOrderReportServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ReconciliationOrderReportService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ReconciliationOrderReportServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReconciliationOrderReportServiceInterfacePort".equals(portName)) {
            setReconciliationOrderReportServiceInterfacePortEndpointAddress(address);
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
