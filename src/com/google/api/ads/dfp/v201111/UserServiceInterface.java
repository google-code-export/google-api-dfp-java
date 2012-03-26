/**
 * UserServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;

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
    public com.google.api.ads.dfp.v201111.User createUser(com.google.api.ads.dfp.v201111.User user) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Creates new {@link User} objects.
     *         
     *         
     * @param users the users to create
     *         
     * @return the created users with their IDs filled in
     */
    public com.google.api.ads.dfp.v201111.User[] createUsers(com.google.api.ads.dfp.v201111.User[] users) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Returns the {@link Role} objects that are defined for the users
     * of the
     *         network.
     *         
     *         
     * @return the roles defined for the user's network
     */
    public com.google.api.ads.dfp.v201111.Role[] getAllRoles() throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Returns the current {@link User}.
     *         
     *         
     * @return the current user
     */
    public com.google.api.ads.dfp.v201111.User getCurrentUser() throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Returns the {@link User} uniquely identified by the given ID.
     * 
     *         
     * @param userId The optional ID of the user. For current user set to
     * {@code null}.
     *         
     * @return the {@code User} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201111.User getUser(java.lang.Long userId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Gets a {@link UserPage} of {@link User} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
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
     *         <td>{@code roleId}</td>
     *         <td>{@link User#roleId}
     *         </tr>
     *         <tr>
     *         <td>{@code rolename}</td>
     *         <td>{@link User#roleName}
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
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of users
     *         
     * @return the users that match the given filter
     */
    public com.google.api.ads.dfp.v201111.UserPage getUsersByStatement(com.google.api.ads.dfp.v201111.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Performs actions on {@link User} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param userAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of users
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201111.UpdateResult performUserAction(com.google.api.ads.dfp.v201111.UserAction userAction, com.google.api.ads.dfp.v201111.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Updates the specified {@link User}.
     *         
     *         
     * @param user the user to update
     *         
     * @return the updated user
     */
    public com.google.api.ads.dfp.v201111.User updateUser(com.google.api.ads.dfp.v201111.User user) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;

    /**
     * Updates the specified {@link User} objects.
     *         
     *         
     * @param users the users to update
     *         
     * @return the updated users
     */
    public com.google.api.ads.dfp.v201111.User[] updateUsers(com.google.api.ads.dfp.v201111.User[] users) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201111.ApiException;
}
