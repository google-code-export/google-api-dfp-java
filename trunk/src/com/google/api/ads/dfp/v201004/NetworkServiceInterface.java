/**
 * NetworkServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201004;

public interface NetworkServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of {@link Network} objects to which the current
     * login has
     *         access.
     *         <p>
     *         Intended to be used without a network code in the SOAP header
     * when the 
     *         login may have more than one network associated with it.
     *         </p>
     *         
     *         
     * @return the networks to which the current login has access
     */
    public com.google.api.ads.dfp.v201004.Network[] getAllNetworks() throws java.rmi.RemoteException, com.google.api.ads.dfp.v201004.ApiException;

    /**
     * Returns the current network for which requests are being made.
     * 
     *         
     * @return the network for which the user is currently making the request
     */
    public com.google.api.ads.dfp.v201004.Network getCurrentNetwork() throws java.rmi.RemoteException, com.google.api.ads.dfp.v201004.ApiException;

    /**
     * Updates the specified network. Currently, only the network
     * display name can 
     *         be updated.
     *         
     *         
     * @param network the network that needs to be updated
     *         
     * @return the updated network
     */
    public com.google.api.ads.dfp.v201004.Network updateNetwork(com.google.api.ads.dfp.v201004.Network network) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201004.ApiException;
}
