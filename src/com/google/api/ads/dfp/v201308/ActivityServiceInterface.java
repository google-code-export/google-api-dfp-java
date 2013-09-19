/**
 * ActivityServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public interface ActivityServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Activity} objects.
     *         
     *         
     * @param activities to be created.
     *         
     * @return the created activities with its IDs filled in.
     */
    public com.google.api.ads.dfp.v201308.Activity[] createActivities(com.google.api.ads.dfp.v201308.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Creates a new {@link Activity}.
     *         
     *         
     * @param activity to be created
     *         
     * @return the created activity with its ID filled in.
     */
    public com.google.api.ads.dfp.v201308.Activity createActivity(com.google.api.ads.dfp.v201308.Activity activity) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Gets an {@link ActivityPage} of {@link Activity} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Activity#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Activity#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code expectedURL}</td>
     *         <td>{@link Activity#expectedURL}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Activity#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code activityGroupId}</td>
     *         <td>{@link Activity#activityGroupId}</td>
     *         </tr>
     *         </table>
     *         
     *         <p><strong>Note:</strong> {@code activityGroupId} is required
     * in the statement.
     *         
     *         
     * @param filterStatement a statement used to filter a set of activities.
     * 
     * @return the activities that match the given filter.
     */
    public com.google.api.ads.dfp.v201308.ActivityPage getActivitiesByStatement(com.google.api.ads.dfp.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Returns the {@link Activity} uniquely identified by the given
     * ID.
     *         
     *         
     * @param activityId the ID of the activity, which must already exist
     * 
     * @return the {@code Activity} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201308.Activity getActivity(java.lang.Integer activityId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Updates the specified {@link Activity} objects.
     *         
     *         
     * @param activities to be updated.
     *         
     * @return the updated activities.
     */
    public com.google.api.ads.dfp.v201308.Activity[] updateActivities(com.google.api.ads.dfp.v201308.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Updates the specified {@link Activity}.
     *         
     *         
     * @param activity to be updated.
     *         
     * @return the updated activity.
     */
    public com.google.api.ads.dfp.v201308.Activity updateActivity(com.google.api.ads.dfp.v201308.Activity activity) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;
}
