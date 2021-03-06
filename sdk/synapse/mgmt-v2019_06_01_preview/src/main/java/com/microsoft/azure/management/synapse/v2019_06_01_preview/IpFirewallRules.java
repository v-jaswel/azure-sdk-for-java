/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IpFirewallRuleInfo;
import rx.Completable;

/**
 * Type representing IpFirewallRules.
 */
public interface IpFirewallRules {
    /**
     * Begins definition for a new FirewallRule resource.
     * @param name resource name.
     * @return the first stage of the new FirewallRule definition.
     */
    IpFirewallRuleInfo.DefinitionStages.Blank defineFirewallRule(String name);

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IpFirewallRuleInfo> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param ruleName The IP firewall rule name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String ruleName);

    /**
     * Replaces firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplaceAllFirewallRulesOperationResponse> replaceAllAsync(String resourceGroupName, String workspaceName);

}
