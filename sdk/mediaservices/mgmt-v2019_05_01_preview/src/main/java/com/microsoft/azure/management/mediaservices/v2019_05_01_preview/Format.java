/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for output.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = Format.class)
@JsonTypeName("Format")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ImageFormat", value = ImageFormat.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.MultiBitrateFormat", value = MultiBitrateFormat.class)
})
public class Format {
    /**
     * The pattern of the file names for the generated output files. The
     * following macros are supported in the file name: {Basename} - The base
     * name of the input video {Extension} - The appropriate extension for this
     * format. {Label} - The label assigned to the codec/layer. {Index} - A
     * unique index for thumbnails. Only applicable to thumbnails. {Bitrate} -
     * The audio/video bitrate. Not applicable to thumbnails. {Codec} - The
     * type of the audio/video codec. Any unsubstituted macros will be
     * collapsed and removed from the filename.
     */
    @JsonProperty(value = "filenamePattern", required = true)
    private String filenamePattern;

    /**
     * Get the pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - The base name of the input video {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. Any unsubstituted macros will be collapsed and removed from the filename.
     *
     * @return the filenamePattern value
     */
    public String filenamePattern() {
        return this.filenamePattern;
    }

    /**
     * Set the pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - The base name of the input video {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. Any unsubstituted macros will be collapsed and removed from the filename.
     *
     * @param filenamePattern the filenamePattern value to set
     * @return the Format object itself.
     */
    public Format withFilenamePattern(String filenamePattern) {
        this.filenamePattern = filenamePattern;
        return this;
    }

}
