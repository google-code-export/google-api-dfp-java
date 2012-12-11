/**
 * AudienceSegmentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;

public interface AudienceSegmentServiceInterface extends java.rmi.Remote {

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
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of audience
     *         segments
     *         
     * @return the audience segments that match the given filter
     */
    public com.google.api.ads.dfp.v201211.AudienceSegmentPage getAudienceSegmentsByStatement(com.google.api.ads.dfp.v201211.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201211.ApiException;
}
