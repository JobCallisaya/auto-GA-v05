package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;
import sun.misc.Request;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {

    private RequestSpecification request;
    private Response response;

    @Given("^Request is configured$")
    public void configureRequest() throws Throwable {
        this.request = HandleRequest.configureRequest();
    }

    @When("^GET \"([^\"]*)\" is executed$")
    public void get(String endpoint) throws Throwable {
        this.response = HandleRequest.get(this.request, endpoint);
    }

    @When("^POST \"([^\"]*)\" with body \"([^\"]*)\" is executed$")
    public void post(String endpoint, String body) throws Throwable {
        this.response = HandleRequest.post(endpoint, body);
    }

    @Then("^response status should be (\\d+)$")
    public void statusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(this.response.getStatusCode(), statusCode);
    }

    @Then("^'responde.data' should be \"([^\"]*)\"$")
    public void responseDataShouldBe(String expected) throws Throwable {
        Response response = this.response.then().extract().response();
        Assert.assertEquals(response.path("data"), expected);
    }
}
