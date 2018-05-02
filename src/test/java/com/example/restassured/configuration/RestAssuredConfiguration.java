package com.example.restassured.configuration;

import org.springframework.beans.factory.annotation.Value;

/**
 * Configuration class for rest assured properties from the application properties.
 */
public class RestAssuredConfiguration {

	@Value("${base.uri}")
	private String baseUri;

	@Value("${port}")
	private Integer port;

	@Value("${base.path}")
	private String basePath;

	@Value("${api.rest.endpoint}")
	private String restEndpoint;

	@Value("${json.content.type}")
	private String jsonContentType;

	@Value("${header.app.id}")
	private String headerAppId;
	
	@Value("${rest.body}")
	private String restBody;

	@Value("${xml.content.type}")
	private String xmlContentType;

	/**
	 *
	 * @return baseUri
	 */
	public String getBaseUri() {
		return baseUri;
	}

	/**
	 *
	 * @param baseUri
	 */
	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}

	/**
	 *
	 * @return port
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 *
	 * @param port
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 *
	 * @return basePath
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 *
	 * @param basePath
	 */
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getRestEndpoint() {
		return restEndpoint;
	}

	public void setRestEndpoint(String restEndpoint) {
		this.restEndpoint = restEndpoint;
	}

	/**
	 *
	 * @return jsonContentType
	 */
	public String getjsonContentType() {
		return jsonContentType;
	}

	/**
	 *
	 * @param jsonContentType
	 */
	public void setjsonContentType(String jsonContentType) {
		this.jsonContentType = jsonContentType;
	}

	/**
	 *
	 * @return headerAppId
	 */
	public String getHeaderAppId() {
		return headerAppId;
	}

	/**
	 *
	 * @param headerAppId
	 */
	public void setHeaderAppId(String headerAppId) {
		this.headerAppId = headerAppId;
	}

	/**
	 *
	 * @return xmlContentType
	 */
	public String getXmlContentType() {
		return xmlContentType;
	}

	/**
	 *
	 * @param xmlContentType
	 */
	public void setXmlContentType(String xmlContentType) {
		this.xmlContentType = xmlContentType;
	}

	/**
	 *
	 * @return restBody
	 */
	public String getRestBody() {
		return restBody;
	}

	/**
	 *
	 * @param restBody
	 */
	public void setRestBody(String restBody) {
		this.restBody = restBody;
	}
}