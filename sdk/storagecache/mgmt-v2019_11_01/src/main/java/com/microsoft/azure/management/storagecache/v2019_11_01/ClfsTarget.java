/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage container for use as a CLFS Storage Target.
 */
public class ClfsTarget {
    /**
     * Resource ID of storage container.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get resource ID of storage container.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set resource ID of storage container.
     *
     * @param target the target value to set
     * @return the ClfsTarget object itself.
     */
    public ClfsTarget withTarget(String target) {
        this.target = target;
        return this;
    }

}
