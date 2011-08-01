/**
 * PlacementServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201107;

public interface PlacementServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Placement}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Placement#name}</li>
     *         <li>{@link Placement#description}</li>
     *         </ul>
     *         
     *         
     * @param placement the placement to create
     *         
     * @return the new placement with its ID set
     */
    public com.google.api.ads.dfp.v201107.Placement createPlacement(com.google.api.ads.dfp.v201107.Placement placement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Creates new {@link Placement} objects.
     *         
     *         
     * @param placements the placements to create
     *         
     * @return the new placements, with their IDs filled in
     */
    public com.google.api.ads.dfp.v201107.Placement[] createPlacements(com.google.api.ads.dfp.v201107.Placement[] placements) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Returns the {@link Placement} uniquely identified by the given
     * ID.
     *         
     *         
     * @param placementId ID of the placement, which must already exist
     *         
     * @return the {@code Placement} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201107.Placement getPlacement(java.lang.Long placementId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Gets a {@link PlacementPage} of {@link Placement} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Placement#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Placement#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isAdSenseTargetingEnabled}</td>
     *         <td>{@link Placement#isAdSenseTargetingEnabled}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Placement#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code placementCode}</td>
     *         <td>{@link Placement#placementCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Placement#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of placements
     *         
     * @return the placements that match the given filter
     */
    public com.google.api.ads.dfp.v201107.PlacementPage getPlacementsByStatement(com.google.api.ads.dfp.v201107.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Performs actions on {@link Placement} objects that match the
     * given
     *         {@link Statement#query}.
     *         
     *         
     * @param placementAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of placements
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201107.UpdateResult performPlacementAction(com.google.api.ads.dfp.v201107.PlacementAction placementAction, com.google.api.ads.dfp.v201107.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Updates the specified {@link Placement}.
     *         
     *         
     * @param placement the placement to update
     *         
     * @return the updated placement
     */
    public com.google.api.ads.dfp.v201107.Placement updatePlacement(com.google.api.ads.dfp.v201107.Placement placement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;

    /**
     * Updates the specified {@link Placement} objects.
     *         
     *         
     * @param placements the placements to update
     *         
     * @return the updated placements
     */
    public com.google.api.ads.dfp.v201107.Placement[] updatePlacements(com.google.api.ads.dfp.v201107.Placement[] placements) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201107.ApiException;
}
