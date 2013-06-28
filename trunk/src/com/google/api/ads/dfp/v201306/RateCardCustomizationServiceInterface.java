/**
 * RateCardCustomizationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public interface RateCardCustomizationServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link RateCardCustomization} object.
     *         
     *         
     * @param rateCardCustomization the {@link RateCardCustomization} to
     * be
     *         created
     *         
     * @return the {@link RateCardCustomization} with its ID filled in
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomization createRateCardCustomization(com.google.api.ads.dfp.v201306.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Creates a list of new {@link RateCardCustomization} objects.
     * 
     *         
     * @param rateCardCustomizations the rate card customizations to be created
     * 
     * @return the rate card customizations with their IDs filled in
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomization[] createRateCardCustomizations(com.google.api.ads.dfp.v201306.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Returns the {@link RateCardCustomization} object uniquely identified
     * by the
     *         given ID.
     *         
     *         
     * @param rateCardCustomizationId the ID of the rate card customization,
     * which
     *         must already exist.
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomization getRateCardCustomization(java.lang.Long rateCardCustomizationId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Gets a {@link RateCardCustomizationPage} of {@link RateCardCustomization}
     * objects that satisfy the given {@link Statement#query}.
     *         
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link RateCardCustomization#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link RateCardCustomization#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link RateCardCustomization#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate card customizations.
     *         
     * @return the rate card customizations that match the given filter
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomizationPage getRateCardCustomizationsByStatement(com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Performs actions on {@link RateCardCustomization} objects that
     * satisfy the
     *         given {@link Statement#query}.
     *         
     *         
     * @param rateCardCustomizationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate card customizations.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201306.UpdateResult performRateCardCustomizationAction(com.google.api.ads.dfp.v201306.RateCardCustomizationAction rateCardCustomizationAction, com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Updates the specified {@link RateCardCustomization} object.
     * 
     *         
     * @param rateCardCustomization the rate card customization to be updated
     * 
     * @return the updated rate card customization
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomization updateRateCardCustomization(com.google.api.ads.dfp.v201306.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Updates the specified {@link RateCardCustomization} objects.
     * 
     *         
     * @param rateCardCustomizations the rate card customizations to be updated
     * 
     * @return the updated rate card customizations
     */
    public com.google.api.ads.dfp.v201306.RateCardCustomization[] updateRateCardCustomizations(com.google.api.ads.dfp.v201306.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;
}
