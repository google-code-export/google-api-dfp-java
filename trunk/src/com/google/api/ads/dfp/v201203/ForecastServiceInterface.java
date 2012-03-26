/**
 * ForecastServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link Forecast} on a prospective {@link LineItem} object.
     * Valid
     *         values for {@link LineItem#lineItemType} are
     *         {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}.
     * Other
     *         values will result in
     *         {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     * 
     *         
     * @param lineItem the target of the forecast. Must be a prospective
     * line item
     *         that has not yet been booked in the system. i.e. {@link LineItem#id}
     * must be null.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.v201203.Forecast getForecast(com.google.api.ads.dfp.v201203.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Gets a {@link Forecast} for an existing {@link LineItem} object.
     * Only
     *         line items having type {@link LineItemType#SPONSORSHIP} or
     * {@link LineItemType#STANDARD} are valid. Other types will result in
     * {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     * 
     *         
     * @param lineItemId the ID of a {@link LineItem} to run the forecast
     * on.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.v201203.Forecast getForecastById(java.lang.Long lineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;
}
