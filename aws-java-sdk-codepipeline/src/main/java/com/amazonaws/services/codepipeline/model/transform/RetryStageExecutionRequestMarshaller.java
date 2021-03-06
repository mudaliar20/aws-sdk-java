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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetryStageExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetryStageExecutionRequestMarshaller {

    private static final MarshallingInfo<String> PIPELINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineName").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageName").build();
    private static final MarshallingInfo<String> PIPELINEEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineExecutionId").build();
    private static final MarshallingInfo<String> RETRYMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("retryMode").build();

    private static final RetryStageExecutionRequestMarshaller instance = new RetryStageExecutionRequestMarshaller();

    public static RetryStageExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetryStageExecutionRequest retryStageExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (retryStageExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retryStageExecutionRequest.getPipelineName(), PIPELINENAME_BINDING);
            protocolMarshaller.marshall(retryStageExecutionRequest.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(retryStageExecutionRequest.getPipelineExecutionId(), PIPELINEEXECUTIONID_BINDING);
            protocolMarshaller.marshall(retryStageExecutionRequest.getRetryMode(), RETRYMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
