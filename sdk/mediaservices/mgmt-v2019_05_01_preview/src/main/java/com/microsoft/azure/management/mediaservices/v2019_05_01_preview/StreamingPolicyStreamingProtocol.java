/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StreamingPolicyStreamingProtocol.
 */
public final class StreamingPolicyStreamingProtocol extends ExpandableStringEnum<StreamingPolicyStreamingProtocol> {
    /** Static value Hls for StreamingPolicyStreamingProtocol. */
    public static final StreamingPolicyStreamingProtocol HLS = fromString("Hls");

    /** Static value Dash for StreamingPolicyStreamingProtocol. */
    public static final StreamingPolicyStreamingProtocol DASH = fromString("Dash");

    /** Static value SmoothStreaming for StreamingPolicyStreamingProtocol. */
    public static final StreamingPolicyStreamingProtocol SMOOTH_STREAMING = fromString("SmoothStreaming");

    /** Static value Download for StreamingPolicyStreamingProtocol. */
    public static final StreamingPolicyStreamingProtocol DOWNLOAD = fromString("Download");

    /**
     * Creates or finds a StreamingPolicyStreamingProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding StreamingPolicyStreamingProtocol
     */
    @JsonCreator
    public static StreamingPolicyStreamingProtocol fromString(String name) {
        return fromString(name, StreamingPolicyStreamingProtocol.class);
    }

    /**
     * @return known StreamingPolicyStreamingProtocol values
     */
    public static Collection<StreamingPolicyStreamingProtocol> values() {
        return values(StreamingPolicyStreamingProtocol.class);
    }
}
