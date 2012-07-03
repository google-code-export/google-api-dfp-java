/**
 * TeamServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;

public interface TeamServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code Team}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Team#name}</li>
     *         </ul>
     *         
     *         
     * @param team the team to create
     *         
     * @return the team with its ID filled in
     */
    public com.google.api.ads.dfp.v201206.Team createTeam(com.google.api.ads.dfp.v201206.Team team) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;

    /**
     * Creates new {@link Team} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Team#name}</li>
     *         </ul>
     *         
     *         
     * @param teams the teams to create
     *         
     * @return the created teams with their IDs filled in
     */
    public com.google.api.ads.dfp.v201206.Team[] createTeams(com.google.api.ads.dfp.v201206.Team[] teams) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;

    /**
     * Returns the {@code Team} uniquely identified by the given ID.
     * 
     *         
     * @param teamId the ID of the team, which must already exist
     *         
     * @return the {@code Team} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201206.Team getTeam(java.lang.Long teamId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;

    /**
     * Gets a {@code TeamPage} of {@code Team} objects that satisfy
     * the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Team#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Team#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Team#description}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of teams.
     *         
     * @return the teams that match the given filter
     */
    public com.google.api.ads.dfp.v201206.TeamPage getTeamsByStatement(com.google.api.ads.dfp.v201206.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;

    /**
     * Updates the specified {@code Team}.
     *         
     *         
     * @param team the team to update
     *         
     * @return the updated team
     */
    public com.google.api.ads.dfp.v201206.Team updateTeam(com.google.api.ads.dfp.v201206.Team team) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;

    /**
     * Updates the specified {@link Team} objects.
     *         
     *         
     * @param teams the teams to update
     *         
     * @return the updated teams
     */
    public com.google.api.ads.dfp.v201206.Team[] updateTeams(com.google.api.ads.dfp.v201206.Team[] teams) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201206.ApiException;
}
