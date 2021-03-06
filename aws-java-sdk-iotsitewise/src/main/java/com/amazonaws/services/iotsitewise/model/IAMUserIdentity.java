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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an AWS Identity and Access Management (IAM) user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/IAMUserIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IAMUserIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>. You can
     * delete the access policy for the IAM user that no longer exists.
     * </p>
     * </note>
     */
    private String arn;

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>. You can
     * delete the access policy for the IAM user that no longer exists.
     * </p>
     * </note>
     * 
     * @param arn
     *        The ARN of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>.
     *        You can delete the access policy for the IAM user that no longer exists.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>. You can
     * delete the access policy for the IAM user that no longer exists.
     * </p>
     * </note>
     * 
     * @return The ARN of the IAM user. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *         <i>IAM User Guide</i>.</p> <note>
     *         <p>
     *         If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>.
     *         You can delete the access policy for the IAM user that no longer exists.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>. You can
     * delete the access policy for the IAM user that no longer exists.
     * </p>
     * </note>
     * 
     * @param arn
     *        The ARN of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If you delete the IAM user, access policies that contain this identity include an empty <code>arn</code>.
     *        You can delete the access policy for the IAM user that no longer exists.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMUserIdentity withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IAMUserIdentity == false)
            return false;
        IAMUserIdentity other = (IAMUserIdentity) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public IAMUserIdentity clone() {
        try {
            return (IAMUserIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.IAMUserIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
