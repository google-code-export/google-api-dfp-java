/**
 * ReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;

public interface ReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the URL at which the report file can be downloaded.
     * <p>
     *         The report will be generated as a gzip archive, containing
     * the report file itself.
     *         
     *         
     * @param reportJobId the ID of the {@link ReportJob}
     *         
     * @param exportFormat the {@link ExportFormat} for the report file
     *         
     * @return the URL for report file download
     */
    public java.lang.String getReportDownloadURL(java.lang.Long reportJobId, com.google.api.ads.dfp.v201204.ExportFormat exportFormat) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201204.ApiException;

    /**
     * Returns the {@link ReportJob} uniquely identified by the given
     * ID.
     *         
     *         
     * @param reportJobId the Id of the report job which must already exist
     * 
     * @return the {@code ReportJob} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201204.ReportJob getReportJob(java.lang.Long reportJobId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201204.ApiException;

    /**
     * Initiates the execution of a {@link ReportQuery} on the server.
     * 
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}</li>
     *         </ul>
     *         
     *         
     * @param reportJob the report job to run
     *         
     * @return the report job with its ID filled in
     */
    public com.google.api.ads.dfp.v201204.ReportJob runReportJob(com.google.api.ads.dfp.v201204.ReportJob reportJob) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201204.ApiException;
}
