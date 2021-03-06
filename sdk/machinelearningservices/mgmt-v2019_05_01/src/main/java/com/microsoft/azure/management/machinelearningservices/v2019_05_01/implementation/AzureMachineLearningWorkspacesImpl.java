/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AzureMachineLearningWorkspacesImpl class.
 */
public class AzureMachineLearningWorkspacesImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Azure subscription identifier. */
    private String subscriptionId;

    /**
     * Gets Azure subscription identifier.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Azure subscription identifier.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AzureMachineLearningWorkspacesImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Version of Azure Machine Learning resource provider API. */
    private String apiVersion;

    /**
     * Gets Version of Azure Machine Learning resource provider API.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AzureMachineLearningWorkspacesImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AzureMachineLearningWorkspacesImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AzureMachineLearningWorkspacesImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The VirtualMachineSizesInner object to access its operations.
     */
    private VirtualMachineSizesInner virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesInner object to access its operations.
     * @return the VirtualMachineSizesInner object.
     */
    public VirtualMachineSizesInner virtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /**
     * The MachineLearningComputesInner object to access its operations.
     */
    private MachineLearningComputesInner machineLearningComputes;

    /**
     * Gets the MachineLearningComputesInner object to access its operations.
     * @return the MachineLearningComputesInner object.
     */
    public MachineLearningComputesInner machineLearningComputes() {
        return this.machineLearningComputes;
    }

    /**
     * Initializes an instance of AzureMachineLearningWorkspaces client.
     *
     * @param credentials the management credentials for Azure
     */
    public AzureMachineLearningWorkspacesImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of AzureMachineLearningWorkspaces client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AzureMachineLearningWorkspacesImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AzureMachineLearningWorkspaces client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AzureMachineLearningWorkspacesImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-05-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.virtualMachineSizes = new VirtualMachineSizesInner(restClient().retrofit(), this);
        this.machineLearningComputes = new MachineLearningComputesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "AzureMachineLearningWorkspaces", "2019-05-01");
    }
}
