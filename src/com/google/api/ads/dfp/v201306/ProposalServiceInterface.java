/**
 * ProposalServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public interface ProposalServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Proposal}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Proposal#name}</li>
     *         </ul>
     *         
     *         
     * @param proposal the proposal to create
     *         
     * @return the created proposal with its ID filled in
     */
    public com.google.api.ads.dfp.v201306.Proposal createProposal(com.google.api.ads.dfp.v201306.Proposal proposal) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Creates new {@link Proposal} objects.
     *         
     *         For each proposal, the following fields are required:
     *         <ul>
     *         <li>{@link Proposal#name}</li>
     *         </ul>
     *         
     *         
     * @param proposals the proposals to create
     *         
     * @return the created proposals with their IDs filled in
     */
    public com.google.api.ads.dfp.v201306.Proposal[] createProposals(com.google.api.ads.dfp.v201306.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Returns the {@link Proposal} uniquely identified by the given
     * ID.
     *         
     *         
     * @param proposalId the ID of the proposal, which must already exist
     * 
     * @return the proposal uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201306.Proposal getProposal(java.lang.Long proposalId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Gets a {@link ProposalPage} of {@link Proposal} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Proposal#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Proposal#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Proposal#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link Proposal#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link Proposal#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Proposal#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of proposals
     *         
     * @return the proposals that match the given filter
     */
    public com.google.api.ads.dfp.v201306.ProposalPage getProposalsByStatement(com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Performs actions on {@link Proposal} objects that match the
     * given {@link Statement#query}.
     *         
     *         The following fields are also required when submitting proposals
     * for approval:
     *         <ul>
     *         <li>{@link Proposal#advertiser}</li>
     *         <li>{@link Proposal#primarySalesperson}</li>
     *         <li>{@link Proposal#primaryTraffickerId}</li>
     *         </ul>
     *         
     *         
     * @param proposalAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of proposals
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201306.UpdateResult performProposalAction(com.google.api.ads.dfp.v201306.ProposalAction proposalAction, com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Updates the specified {@link Proposal}.
     *         
     *         
     * @param proposal the proposal to update
     *         
     * @return the updated proposal
     */
    public com.google.api.ads.dfp.v201306.Proposal updateProposal(com.google.api.ads.dfp.v201306.Proposal proposal) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Updates the specified {@link Proposal} objects.
     *         
     *         
     * @param proposals the proposals to update
     *         
     * @return the updated proposals
     */
    public com.google.api.ads.dfp.v201306.Proposal[] updateProposals(com.google.api.ads.dfp.v201306.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;
}
