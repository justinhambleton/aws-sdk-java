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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Scaling Process Types Request Marshaller
 */
public class DescribeScalingProcessTypesRequestMarshaller implements Marshaller<Request<DescribeScalingProcessTypesRequest>, DescribeScalingProcessTypesRequest> {

    public Request<DescribeScalingProcessTypesRequest> marshall(DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) {

        if (describeScalingProcessTypesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScalingProcessTypesRequest> request = new DefaultRequest<DescribeScalingProcessTypesRequest>(describeScalingProcessTypesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScalingProcessTypes");
        request.addParameter("Version", "2011-01-01");

        return request;
    }
}
