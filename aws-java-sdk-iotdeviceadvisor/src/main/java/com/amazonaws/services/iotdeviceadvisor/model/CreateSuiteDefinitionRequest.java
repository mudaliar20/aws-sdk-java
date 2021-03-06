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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSuiteDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Creates a Device Advisor test suite with suite definition configuration.
     * </p>
     */
    private SuiteDefinitionConfiguration suiteDefinitionConfiguration;
    /**
     * <p>
     * The tags to be attached to the suite definition.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Creates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Creates a Device Advisor test suite with suite definition configuration.
     */

    public void setSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        this.suiteDefinitionConfiguration = suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Creates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @return Creates a Device Advisor test suite with suite definition configuration.
     */

    public SuiteDefinitionConfiguration getSuiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Creates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Creates a Device Advisor test suite with suite definition configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionRequest withSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        setSuiteDefinitionConfiguration(suiteDefinitionConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to be attached to the suite definition.
     * </p>
     * 
     * @return The tags to be attached to the suite definition.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be attached to the suite definition.
     * </p>
     * 
     * @param tags
     *        The tags to be attached to the suite definition.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be attached to the suite definition.
     * </p>
     * 
     * @param tags
     *        The tags to be attached to the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSuiteDefinitionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getSuiteDefinitionConfiguration() != null)
            sb.append("SuiteDefinitionConfiguration: ").append(getSuiteDefinitionConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSuiteDefinitionRequest == false)
            return false;
        CreateSuiteDefinitionRequest other = (CreateSuiteDefinitionRequest) obj;
        if (other.getSuiteDefinitionConfiguration() == null ^ this.getSuiteDefinitionConfiguration() == null)
            return false;
        if (other.getSuiteDefinitionConfiguration() != null && other.getSuiteDefinitionConfiguration().equals(this.getSuiteDefinitionConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionConfiguration() == null) ? 0 : getSuiteDefinitionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSuiteDefinitionRequest clone() {
        return (CreateSuiteDefinitionRequest) super.clone();
    }

}
