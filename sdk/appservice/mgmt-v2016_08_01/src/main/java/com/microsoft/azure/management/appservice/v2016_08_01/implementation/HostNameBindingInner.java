/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.AzureResourceType;
import com.microsoft.azure.management.appservice.v2016_08_01.CustomHostNameDnsRecordType;
import com.microsoft.azure.management.appservice.v2016_08_01.HostNameType;
import com.microsoft.azure.management.appservice.v2016_08_01.SslState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * A hostname binding object.
 */
@JsonFlatten
public class HostNameBindingInner extends ProxyOnlyResource {
    /**
     * App Service app name.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /**
     * Fully qualified ARM domain resource URI.
     */
    @JsonProperty(value = "properties.domainId")
    private String domainId;

    /**
     * Azure resource name.
     */
    @JsonProperty(value = "properties.azureResourceName")
    private String azureResourceName;

    /**
     * Azure resource type. Possible values include: 'Website',
     * 'TrafficManager'.
     */
    @JsonProperty(value = "properties.azureResourceType")
    private AzureResourceType azureResourceType;

    /**
     * Custom DNS record type. Possible values include: 'CName', 'A'.
     */
    @JsonProperty(value = "properties.customHostNameDnsRecordType")
    private CustomHostNameDnsRecordType customHostNameDnsRecordType;

    /**
     * Hostname type. Possible values include: 'Verified', 'Managed'.
     */
    @JsonProperty(value = "properties.hostNameType")
    private HostNameType hostNameType;

    /**
     * SSL type. Possible values include: 'Disabled', 'SniEnabled',
     * 'IpBasedEnabled'.
     */
    @JsonProperty(value = "properties.sslState")
    private SslState sslState;

    /**
     * SSL certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    @JsonProperty(value = "properties.virtualIP", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualIP;

    /**
     * Get app Service app name.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set app Service app name.
     *
     * @param siteName the siteName value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get fully qualified ARM domain resource URI.
     *
     * @return the domainId value
     */
    public String domainId() {
        return this.domainId;
    }

    /**
     * Set fully qualified ARM domain resource URI.
     *
     * @param domainId the domainId value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get azure resource name.
     *
     * @return the azureResourceName value
     */
    public String azureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set azure resource name.
     *
     * @param azureResourceName the azureResourceName value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
        return this;
    }

    /**
     * Get azure resource type. Possible values include: 'Website', 'TrafficManager'.
     *
     * @return the azureResourceType value
     */
    public AzureResourceType azureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set azure resource type. Possible values include: 'Website', 'TrafficManager'.
     *
     * @param azureResourceType the azureResourceType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
        return this;
    }

    /**
     * Get custom DNS record type. Possible values include: 'CName', 'A'.
     *
     * @return the customHostNameDnsRecordType value
     */
    public CustomHostNameDnsRecordType customHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }

    /**
     * Set custom DNS record type. Possible values include: 'CName', 'A'.
     *
     * @param customHostNameDnsRecordType the customHostNameDnsRecordType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        return this;
    }

    /**
     * Get hostname type. Possible values include: 'Verified', 'Managed'.
     *
     * @return the hostNameType value
     */
    public HostNameType hostNameType() {
        return this.hostNameType;
    }

    /**
     * Set hostname type. Possible values include: 'Verified', 'Managed'.
     *
     * @param hostNameType the hostNameType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withHostNameType(HostNameType hostNameType) {
        this.hostNameType = hostNameType;
        return this;
    }

    /**
     * Get sSL type. Possible values include: 'Disabled', 'SniEnabled', 'IpBasedEnabled'.
     *
     * @return the sslState value
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set sSL type. Possible values include: 'Disabled', 'SniEnabled', 'IpBasedEnabled'.
     *
     * @param sslState the sslState value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    /**
     * Get sSL certificate thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set sSL certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @return the virtualIP value
     */
    public String virtualIP() {
        return this.virtualIP;
    }

}
