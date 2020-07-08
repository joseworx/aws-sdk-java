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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy
     * type you specify in the <code>Type</code> parameter.
     * </p>
     */
    private String content;
    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy
     * type you specify in the <code>Type</code> parameter.
     * </p>
     * 
     * @param content
     *        The policy text content to add to the new policy. The text that you supply must adhere to the rules of the
     *        policy type you specify in the <code>Type</code> parameter.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy
     * type you specify in the <code>Type</code> parameter.
     * </p>
     * 
     * @return The policy text content to add to the new policy. The text that you supply must adhere to the rules of
     *         the policy type you specify in the <code>Type</code> parameter.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy
     * type you specify in the <code>Type</code> parameter.
     * </p>
     * 
     * @param content
     *        The policy text content to add to the new policy. The text that you supply must adhere to the rules of the
     *        policy type you specify in the <code>Type</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * 
     * @param description
     *        An optional description to assign to the policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * 
     * @return An optional description to assign to the policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * 
     * @param description
     *        An optional description to assign to the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name to assign to the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The friendly name to assign to the policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name to assign to the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of policy to create. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     *        TAG_POLICY</a>
     *        </p>
     *        </li>
     * @see PolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of policy to create. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *         AISERVICES_OPT_OUT_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *         BACKUP_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *         SERVICE_CONTROL_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >TAG_POLICY</a>
     *         </p>
     *         </li>
     * @see PolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of policy to create. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     *        TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public CreatePolicyRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of policy to create. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     *        TAG_POLICY</a>
     *        </p>
     *        </li>
     * @see PolicyType
     */

    public void setType(PolicyType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">BACKUP_POLICY
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of policy to create. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     *        TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public CreatePolicyRequest withType(PolicyType type) {
        this.type = type.toString();
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyRequest clone() {
        return (CreatePolicyRequest) super.clone();
    }

}
