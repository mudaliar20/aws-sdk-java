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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRegistryPolicyResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegistryPolicyResultJsonUnmarshaller implements Unmarshaller<GetRegistryPolicyResult, JsonUnmarshallerContext> {

    public GetRegistryPolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRegistryPolicyResult getRegistryPolicyResult = new GetRegistryPolicyResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRegistryPolicyResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("registryId", targetDepth)) {
                    context.nextToken();
                    getRegistryPolicyResult.setRegistryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyText", targetDepth)) {
                    context.nextToken();
                    getRegistryPolicyResult.setPolicyText(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRegistryPolicyResult;
    }

    private static GetRegistryPolicyResultJsonUnmarshaller instance;

    public static GetRegistryPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRegistryPolicyResultJsonUnmarshaller();
        return instance;
    }
}
