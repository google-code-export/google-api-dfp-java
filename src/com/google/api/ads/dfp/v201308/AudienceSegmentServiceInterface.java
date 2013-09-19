/**
 * AudienceSegmentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public interface AudienceSegmentServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link RuleBasedFirstPartyAudienceSegment} objects.
     * 
     *         
     * @param segments first-party audience segments to create
     *         
     * @return created first-party audience segments
     */
    public com.google.api.ads.dfp.v201308.FirstPartyAudienceSegment[] createAudienceSegments(com.google.api.ads.dfp.v201308.FirstPartyAudienceSegment[] segments) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Gets a {@link AudienceSegmentPage} of {@link AudienceSegment}
     * objects that satisfy the given
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
     *         <td>{@link AudienceSegment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AudienceSegment#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AudienceSegment#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link AudienceSegment#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code size}</td>
     *         <td>{@link AudienceSegment#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code dataProviderName}</td>
     *         <td>{@link AudienceSegmentDataProvider#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link ThirdPartyAudienceSegment#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cost}</td>
     *         <td>{@link ThirdPartyAudienceSegment#cost}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ThirdPartyAudienceSegment#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ThirdPartyAudienceSegment#endDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of audience
     *         segments
     *         
     * @return the audience segments that match the given filter
     */
    public com.google.api.ads.dfp.v201308.AudienceSegmentPage getAudienceSegmentsByStatement(com.google.api.ads.dfp.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Performs the given {@link AudienceSegmentAction} on the set
     * of segments identified by the given
     *         statement.
     *         
     *         
     * @param action {@link AudienceSegmentAction} to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of audience
     *         segments
     *         
     * @return {@link UpdateResult} indicating the result
     */
    public com.google.api.ads.dfp.v201308.UpdateResult performAudienceSegmentAction(com.google.api.ads.dfp.v201308.AudienceSegmentAction action, com.google.api.ads.dfp.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;

    /**
     * Updated the given {@link RuleBasedFirstPartyAudienceSegment}
     * objects.
     *         
     *         
     * @param segments first-party audience segments to update
     *         
     * @return updated first-party audience segments
     */
    public com.google.api.ads.dfp.v201308.FirstPartyAudienceSegment[] updateAudienceSegments(com.google.api.ads.dfp.v201308.FirstPartyAudienceSegment[] segments) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201308.ApiException;
}
