/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_04_01.LocalNetworkGateway;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_04_01.AddressSpace;
import com.microsoft.azure.management.network.v2018_04_01.BgpSettings;

class LocalNetworkGatewayImpl extends GroupableResourceCoreImpl<LocalNetworkGateway, LocalNetworkGatewayInner, LocalNetworkGatewayImpl, NetworkManager> implements LocalNetworkGateway, LocalNetworkGateway.Definition, LocalNetworkGateway.Update {
    LocalNetworkGatewayImpl(String name, LocalNetworkGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<LocalNetworkGateway> createResourceAsync() {
        LocalNetworkGatewaysInner client = this.manager().inner().localNetworkGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LocalNetworkGateway> updateResourceAsync() {
        LocalNetworkGatewaysInner client = this.manager().inner().localNetworkGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LocalNetworkGatewayInner> getInnerAsync() {
        LocalNetworkGatewaysInner client = this.manager().inner().localNetworkGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public BgpSettings bgpSettings() {
        return this.inner().bgpSettings();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String gatewayIpAddress() {
        return this.inner().gatewayIpAddress();
    }

    @Override
    public AddressSpace localNetworkAddressSpace() {
        return this.inner().localNetworkAddressSpace();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public LocalNetworkGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.inner().withBgpSettings(bgpSettings);
        return this;
    }

    @Override
    public LocalNetworkGatewayImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public LocalNetworkGatewayImpl withGatewayIpAddress(String gatewayIpAddress) {
        this.inner().withGatewayIpAddress(gatewayIpAddress);
        return this;
    }

    @Override
    public LocalNetworkGatewayImpl withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.inner().withLocalNetworkAddressSpace(localNetworkAddressSpace);
        return this;
    }

    @Override
    public LocalNetworkGatewayImpl withResourceGuid(String resourceGuid) {
        this.inner().withResourceGuid(resourceGuid);
        return this;
    }

}
