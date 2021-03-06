/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_11_01.implementation.PeerExpressRouteCircuitConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PeerExpressRouteCircuitConnections.
 */
public interface PeerExpressRouteCircuitConnections extends HasInner<PeerExpressRouteCircuitConnectionsInner> {
    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeerExpressRouteCircuitConnection> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeerExpressRouteCircuitConnection> listAsync(final String resourceGroupName, final String circuitName, final String peeringName);

}
