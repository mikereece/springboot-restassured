package com.example.restassured.stepdefs;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.restassured.configuration.RestAssuredConfiguration;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * Step Definition base class.
 */
@SpringBootTest
@ContextConfiguration(classes = RestAssuredConfiguration.class, loader = SpringBootContextLoader.class)
@WebAppConfiguration
public class BaseStepDefinition {

	protected final static Logger LOGGER = LoggerFactory.getLogger(BaseStepDefinition.class);

	@Autowired
	protected RestAssuredConfiguration restAssuredConfiguration;

	protected Response response;

	protected ValidatableResponse json;

	protected RequestSpecification request;

	protected Map<String, String> pathParameters = new HashMap<String, String>();

	protected Map<String, String> queryParameters = new HashMap<String, String>();

}
