/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServerVersion.
 */
public final class ServerVersion extends ExpandableStringEnum<ServerVersion> {
    /** Static value 9.5 for ServerVersion. */
    public static final ServerVersion NINE_FULL_STOP_FIVE = fromString("9.5");

    /** Static value 9.6 for ServerVersion. */
    public static final ServerVersion NINE_FULL_STOP_SIX = fromString("9.6");

    /** Static value 10 for ServerVersion. */
    public static final ServerVersion ONE_ZERO = fromString("10");

    /** Static value 10.0 for ServerVersion. */
    public static final ServerVersion ONE_ZERO_FULL_STOP_ZERO = fromString("10.0");

    /** Static value 10.2 for ServerVersion. */
    public static final ServerVersion ONE_ZERO_FULL_STOP_TWO = fromString("10.2");

    /** Static value 11 for ServerVersion. */
    public static final ServerVersion ONE_ONE = fromString("11");

    /**
     * Creates or finds a ServerVersion from its string representation.
     * @param name a name to look for
     * @return the corresponding ServerVersion
     */
    @JsonCreator
    public static ServerVersion fromString(String name) {
        return fromString(name, ServerVersion.class);
    }

    /**
     * @return known ServerVersion values
     */
    public static Collection<ServerVersion> values() {
        return values(ServerVersion.class);
    }
}
