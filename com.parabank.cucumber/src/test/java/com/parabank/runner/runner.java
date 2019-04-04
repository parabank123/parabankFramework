package com.parabank.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Destination"},
		tags ="@Test",
		features = "src/test/resources/features",
		glue = "com/parabank/stepDefinitions",
		dryRun = false
		)




public class runner {
	

}
