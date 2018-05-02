# springboot-restassured

The springboot-restassured project is a Spring Boot microservice, which is used to test specific REST endpoints, using REST Assured with Cucumber.


## Getting Started

The project is structured as a Cucumber test framework, with feature files defining test scenarios (BDD) and Step Definition java classes, to define the Given, When, Then behaviour for the test. It is within these Step Definition classes that the REST Assured framework is utilised to build the REST request and assert against the response. This project also utilised Spring Profiles to ensure that different properties can be set depending on where the project is being run. This provides customisation for properties such as the host and port of the environment the tests are being run against.


## Prerequisites

The setup and running of this project assumes that you have Java, Spring Boot and Framework v4.x, Cucumber, REST Assured and Maven and an IDE (e.g. Eclipse) running.


## Testing

Once the following steps above have been completed you can run the tests in 3 different ways.

1) Eclipse - using the TestRunner class allows you to run all tests in the test folder as a suite. However, before running the tests you will need to do some configuration from right clicking on the TestRunner class, goto Run As... and Run Configuration. From the window ensure you select the jUnit test from the left pane. Then select the Arguments tab and add the following properties within the text area:
	-Dspring.active.profile=dev (Spring profile used when testing locally). Note that the alternative profile is called release and when set it will default the base.uri and port properties to CI environment.
	-Dbase.uri - this needs to be http:// followed by the ip address of your environment
	-Dport - Port number of the application environment

2) Maven - From command line run mvn clean test -Pdev -Dbase.uri=http://xx.xxx.xxx.xxx -Dport=xxxx for example to run the tests.

3) Jenkins - From the Jenkins job select the option to Build with Parameters from the left menu. Once again you will be required to give values for the Spring Profile, host (base.uri) and port before starting the job.
    

## Deployment



## Versioning

0.0.1-SNAPSHOT


## Authors

Michael Reece


## References
