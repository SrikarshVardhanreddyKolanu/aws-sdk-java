/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SendUsersMessageResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessageResponseJsonUnmarshaller implements Unmarshaller<SendUsersMessageResponse, JsonUnmarshallerContext> {

    public SendUsersMessageResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        SendUsersMessageResponse sendUsersMessageResponse = new SendUsersMessageResponse();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    sendUsersMessageResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    sendUsersMessageResponse.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    context.nextToken();
                    sendUsersMessageResponse.setResult(new MapUnmarshaller<String, java.util.Map<String, EndpointMessageResult>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, EndpointMessageResult>(context.getUnmarshaller(String.class),
                            EndpointMessageResultJsonUnmarshaller.getInstance())).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sendUsersMessageResponse;
    }

    private static SendUsersMessageResponseJsonUnmarshaller instance;

    public static SendUsersMessageResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendUsersMessageResponseJsonUnmarshaller();
        return instance;
    }
}