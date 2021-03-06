/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUseCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUseCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     */
    private String integrationAssociationId;
    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     */
    private String useCaseType;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUseCaseRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the AppIntegration association.
     */

    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @return The identifier for the AppIntegration association.
     */

    public String getIntegrationAssociationId() {
        return this.integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the AppIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUseCaseRequest withIntegrationAssociationId(String integrationAssociationId) {
        setIntegrationAssociationId(integrationAssociationId);
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @see UseCaseType
     */

    public void setUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @return The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *         have only one of each use case type.
     * @see UseCaseType
     */

    public String getUseCaseType() {
        return this.useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UseCaseType
     */

    public CreateUseCaseRequest withUseCaseType(String useCaseType) {
        setUseCaseType(useCaseType);
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UseCaseType
     */

    public CreateUseCaseRequest withUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: ").append(getIntegrationAssociationId()).append(",");
        if (getUseCaseType() != null)
            sb.append("UseCaseType: ").append(getUseCaseType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUseCaseRequest == false)
            return false;
        CreateUseCaseRequest other = (CreateUseCaseRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIntegrationAssociationId() == null ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        if (other.getUseCaseType() == null ^ this.getUseCaseType() == null)
            return false;
        if (other.getUseCaseType() != null && other.getUseCaseType().equals(this.getUseCaseType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId().hashCode());
        hashCode = prime * hashCode + ((getUseCaseType() == null) ? 0 : getUseCaseType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUseCaseRequest clone() {
        return (CreateUseCaseRequest) super.clone();
    }

}
