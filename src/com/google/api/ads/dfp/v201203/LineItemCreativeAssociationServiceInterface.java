/**
 * LineItemCreativeAssociationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;

public interface LineItemCreativeAssociationServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link LineItemCreativeAssociation}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link LineItemCreativeAssociation#creativeId}</li>
     *         <li>{@link LineItemCreativeAssociation#lineItemId}</li>
     *         </ul>
     *         
     *         
     * @param lineItemCreativeAssociation the line item creative association
     * to
     *         create
     *         
     * @return the new line item creative association with its ID set
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociation createLineItemCreativeAssociation(com.google.api.ads.dfp.v201203.LineItemCreativeAssociation lineItemCreativeAssociation) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Creates new {@link LineItemCreativeAssociation} objects
     *         
     *         
     * @param lineItemCreativeAssociations the line item creative associations
     * to
     *         create
     *         
     * @return the created line item creative associations with their IDs
     * filled
     *         in
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociation[] createLineItemCreativeAssociations(com.google.api.ads.dfp.v201203.LineItemCreativeAssociation[] lineItemCreativeAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Returns the {@link LineItemCreativeAssociation} uniquely identified
     * by the
     *         given line item and creative IDs.
     *         
     *         
     * @param lineItemId the ID of the line item, which must already exist
     * 
     * @param creativeId the ID of the creative, which must already exist
     * 
     * @return the {@code LineItemCreativeAssociation} uniquely identified
     * by the
     *         line item and creative IDs
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociation getLineItemCreativeAssociation(java.lang.Long lineItemId, java.lang.Long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Gets a {@link LineItemCreativeAssociationPage} of
     *         {@link LineItemCreativeAssociation} objects that satisfy the
     * given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code creativeId}</td>
     *         <td>{@link LineItemCreativeAssociation#creativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code manualCreativeRotationWeight}</td>
     *         <td>{@link LineItemCreativeAssociation#manualCreativeRotationWeight}</td>
     * </tr>
     *         <tr>
     *         <td>{@code destinationUrl}</td>
     *         <td>{@link LineItemCreativeAssociation#destinationUrl}</td>
     * </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link LineItemCreativeAssociation#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItemCreativeAssociation#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItemCreativeAssociation#lastModifiedDateTime}</td>
     * </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line item creative associations
     *         
     * @return the line item creative associations that match the given filter
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociationPage getLineItemCreativeAssociationsByStatement(com.google.api.ads.dfp.v201203.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Returns an insite preview URL that references the specified
     * site URL with
     *         the specified creative from the association served to it.
     *         
     *         
     * @param lineItemId the ID of the line item, which must already exist
     * 
     * @param creativeId the ID of the creative, which must already exist
     * 
     * @param siteUrl the URL of the site that the creative should be previewed
     * in
     *         
     * @return a URL that references the specified site URL with the specified
     * creative served to it
     */
    public java.lang.String getPreviewUrl(java.lang.Long lineItemId, java.lang.Long creativeId, java.lang.String siteUrl) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Performs actions on {@link LineItemCreativeAssociation} objects
     * that match
     *         the given {@link Statement#query}.
     *         
     *         
     * @param lineItemCreativeAssociationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line item creative associations
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201203.UpdateResult performLineItemCreativeAssociationAction(com.google.api.ads.dfp.v201203.LineItemCreativeAssociationAction lineItemCreativeAssociationAction, com.google.api.ads.dfp.v201203.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Updates the specified {@link LineItemCreativeAssociation}.
     *         
     *         
     * @param lineItemCreativeAssociation the line item creative association
     * to
     *         update
     *         
     * @return the updated line item creative association
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociation updateLineItemCreativeAssociation(com.google.api.ads.dfp.v201203.LineItemCreativeAssociation lineItemCreativeAssociation) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;

    /**
     * Updates the specified {@link LineItemCreativeAssociation} objects
     * 
     *         
     * @param lineItemCreativeAssociations the line item creative associations
     * to
     *         update
     *         
     * @return the updated line item creative associations
     */
    public com.google.api.ads.dfp.v201203.LineItemCreativeAssociation[] updateLineItemCreativeAssociations(com.google.api.ads.dfp.v201203.LineItemCreativeAssociation[] lineItemCreativeAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201203.ApiException;
}
