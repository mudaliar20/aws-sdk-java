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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChannelModeratorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChannelModeratorMarshaller {

    private static final MarshallingInfo<StructuredPojo> MODERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Moderator").build();
    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelArn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();

    private static final ChannelModeratorMarshaller instance = new ChannelModeratorMarshaller();

    public static ChannelModeratorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChannelModerator channelModerator, ProtocolMarshaller protocolMarshaller) {

        if (channelModerator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(channelModerator.getModerator(), MODERATOR_BINDING);
            protocolMarshaller.marshall(channelModerator.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(channelModerator.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(channelModerator.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
