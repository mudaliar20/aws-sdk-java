/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import javax.annotation.Generated;

/**
 * <p>
 * The workspaces_DefaultRole role could not be found. If this is the first time you are registering a directory, you
 * will need to create the workspaces_DefaultRole role before you can register a directory. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role">
 * Creating the workspaces_DefaultRole Role</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspacesDefaultRoleNotFoundException extends com.amazonaws.services.workspaces.model.AmazonWorkspacesException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WorkspacesDefaultRoleNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WorkspacesDefaultRoleNotFoundException(String message) {
        super(message);
    }

}
