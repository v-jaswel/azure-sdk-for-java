/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filters that will be applied to determine which resources to remediate.
 */
public class RemediationFilters {
    /**
     * The resource locations that will be remediated.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Get the resource locations that will be remediated.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the resource locations that will be remediated.
     *
     * @param locations the locations value to set
     * @return the RemediationFilters object itself.
     */
    public RemediationFilters withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

}
