package com.example.restassured.stepdefs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.restassured.configuration.RestAssuredConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Step Definition class to define the scenario: 
 *
 */
@SpringBootTest
@ContextConfiguration(classes = { RestAssuredConfiguration.class })
public class TestStepDefinition {

	private final static Logger LOGGER = LoggerFactory.getLogger(TestStepDefinition.class);

	@Autowired
	private RestAssuredConfiguration restAssuredConfiguration;

	Response response;

	@Given("^ReST Client is setup on Application$")
	public void setup() throws Throwable {
		response = null;
	}

	@When("^When a request is made to the application with value \"([^\"]*)\"$")
	public void when(String value) throws Throwable {
		//@formatter:off
		RequestSpecification request = given()
				.with()
				.pathParam("objectName", value);
		//@formatter:on

		response = request.when().put(restAssuredConfiguration.getRestEndpoint());
	}

	@Then("^the application response is successful$")
	public void then() throws Throwable {
		if(response != null) {
			assertThat(response.statusCode(), is(201));
		}
	}
}