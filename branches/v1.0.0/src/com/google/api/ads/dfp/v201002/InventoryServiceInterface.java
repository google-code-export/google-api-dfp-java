/**
 * InventoryServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public interface InventoryServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link AdUnit}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link AdUnit#name}</li>
     *         <li>{@link AdUnit#parentId}</li>
     *         </ul>
     *         
     *         
     * @param adUnit the ad unit to create
     *         
     * @return the new ad unit with its ID set
     */
    public com.google.api.ads.dfp.v201002.AdUnit createAdUnit(com.google.api.ads.dfp.v201002.AdUnit adUnit) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Creates new {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to create
     *         
     * @return the created ad units, with their IDs filled in
     */
    public com.google.api.ads.dfp.v201002.AdUnit[] createAdUnits(com.google.api.ads.dfp.v201002.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link AdUnit} uniquely identified by the given
     * ID.
     *         
     *         
     * @param adUnitId ID of the ad unit, which must already exist
     *         
     * @return the {@code AdUnit} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201002.AdUnit getAdUnit(java.lang.String adUnitId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy
     * the given
     *         {@link Filter}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * values</th>
     *         </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         </table>
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over ad units
     *         
     * @return the ad units that match the given filter
     */
    public com.google.api.ads.dfp.v201002.AdUnitPage getAdUnitsByFilter(com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Performs actions on {@link AdUnit} objects that match the given
     * {@link Filter}.
     *         
     *         
     * @param adUnitAction the action to perform
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over ad units
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201002.UpdateResult performAdUnitAction(com.google.api.ads.dfp.v201002.AdUnitAction adUnitAction, com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link AdUnit}.
     *         
     *         
     * @param adUnit the ad unit to update
     *         
     * @return the updated ad unit
     */
    public com.google.api.ads.dfp.v201002.AdUnit updateAdUnit(com.google.api.ads.dfp.v201002.AdUnit adUnit) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to update
     *         
     * @return the updated ad units
     */
    public com.google.api.ads.dfp.v201002.AdUnit[] updateAdUnits(com.google.api.ads.dfp.v201002.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;
}
