/**
 * ForecastServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201004;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link Forecast} on a hypothetical {@link LineItem}
     * object.
     *         
     *         
     * @param lineItem the target of the forecast. Must be a hypothetical
     * line item that has not yet been booked in the system. i.e.
     *         {@link LineItem#id} must be null.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.v201004.Forecast getForecast(com.google.api.ads.dfp.v201004.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201004.ApiException;

    /**
     * Gets a {@link Forecast} for an existing {@link LineItem} object.
     * 
     *         
     * @param lineItemId the ID of a {@link LineItem} to run the forecast
     * on.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.v201004.Forecast getForecastById(java.lang.Long lineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201004.ApiException;
}
