Feature: Test Rest Endpoint
Description: Test Rest Endpoint

	Scenario Outline: Test Rest Endpoint
		Given ReST Client is setup on Application
		When a request is made to the application with value "<value>"
		Then the application response is successful

		Examples:
			| value                 |
			| Test            		|