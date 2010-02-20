/**
 * UserServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public interface UserServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link User}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link User#email}</li>
     *         <li>{@link User#name}</li>
     *         </ul>
     *         
     *         
     * @param user the user to create
     *         
     * @return the new user with its ID filled in
     */
    public com.google.api.ads.dfp.v201002.User createUser(com.google.api.ads.dfp.v201002.User user) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Creates new {@link User} objects.
     *         
     *         
     * @param users the users to create
     *         
     * @return the created users with their IDs filled in
     */
    public com.google.api.ads.dfp.v201002.User[] createUsers(com.google.api.ads.dfp.v201002.User[] users) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link Role} objects that are defined for the users
     * of the
     *         network.
     *         
     *         
     * @return the roles defined for the user's network
     */
    public com.google.api.ads.dfp.v201002.Role[] getAllRoles() throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link User} uniquely identified by the given ID.
     * 
     *         
     * @param userId the ID of the user, which must already exist
     *         
     * @return the {@code User} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201002.User getUser(java.lang.Long userId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Gets a {@link UserPage} of {@link User} objects that satisfy
     * the given
     *         {@link Filter}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * values</th>
     *         </tr>
     *         <tr>
     *         <td>{@code email}</td>
     *         <td>{@link User#email}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link User#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link User#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@code ACTIVE} if {@link User#isActive} is true; {@code
     * INACTIVE}
     *         otherwise</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over users
     *         
     * @return the users that match the given filter
     */
    public com.google.api.ads.dfp.v201002.UserPage getUsersByFilter(com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Performs actions on {@link User} objects that match the given
     * {@link Filter}.
     *         
     *         
     * @param userAction the action to perform
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over users
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201002.UpdateResult performUserAction(com.google.api.ads.dfp.v201002.UserAction userAction, com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException;

    /**
     * Updates the specified {@link User}.
     *         
     *         
     * @param user the user to update
     *         
     * @return the updated user
     */
    public com.google.api.ads.dfp.v201002.User updateUser(com.google.api.ads.dfp.v201002.User user) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link User} objects.
     *         
     *         
     * @param users the users to update
     *         
     * @return the updated users
     */
    public com.google.api.ads.dfp.v201002.User[] updateUsers(com.google.api.ads.dfp.v201002.User[] users) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;
}
