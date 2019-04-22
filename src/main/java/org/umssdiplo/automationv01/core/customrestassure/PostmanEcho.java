package org.umssdiplo.automationv01.core.customrestassure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

/**
 * Manage PostMan Echo
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0
 */
public class PostmanEcho implements IEndPoint {

    private static PostmanEcho instance = new PostmanEcho();
    private RequestSpecification requestSpecification;

    private PostmanEcho() {
        configureGetRequest();
    }

    public static PostmanEcho getInstance() {
        return instance;
    }

    @Override
    public void configureGetRequest() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(PropertyAccessor.getInstance().getPostmanRestBaseURL())
                .build();
    }

    @Override
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}
