package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ExamDataExtractionLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        return "Hello from Lambda!";
    }
}
