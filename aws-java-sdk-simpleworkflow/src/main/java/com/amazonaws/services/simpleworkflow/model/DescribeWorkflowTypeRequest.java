/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#describeWorkflowType(DescribeWorkflowTypeRequest) DescribeWorkflowType operation}.
 * <p>
 * Returns information about the specified <i>workflow type</i> . This
 * includes configuration settings specified when the type was registered
 * and other information such as creation date, current status, etc.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF
 * resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit
 * the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to
 * call this action.</li>
 * <li>Constrain the following parameters by using a
 * <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>workflowType.name</code> : String constraint. The key is
 * <code>swf:workflowType.name</code> .</li>
 * <li> <code>workflowType.version</code> : String constraint. The key
 * is <code>swf:workflowType.version</code> .</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the
 * action, or the parameter values fall outside the specified
 * constraints, the action fails. The associated event attribute's
 * <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For
 * details and example IAM policies, see
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#describeWorkflowType(DescribeWorkflowTypeRequest)
 */
public class DescribeWorkflowTypeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the domain in which this workflow type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The workflow type to describe.
     */
    private WorkflowType workflowType;

    /**
     * The name of the domain in which this workflow type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which this workflow type is registered.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which this workflow type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which this workflow type is registered.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which this workflow type is registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which this workflow type is registered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkflowTypeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The workflow type to describe.
     *
     * @return The workflow type to describe.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The workflow type to describe.
     *
     * @param workflowType The workflow type to describe.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The workflow type to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The workflow type to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkflowTypeRequest withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkflowTypeRequest == false) return false;
        DescribeWorkflowTypeRequest other = (DescribeWorkflowTypeRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkflowTypeRequest clone() {
        
            return (DescribeWorkflowTypeRequest) super.clone();
    }

}
    