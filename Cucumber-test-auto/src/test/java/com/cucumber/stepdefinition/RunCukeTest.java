package com.cucumber.stepdefinition;

/**
 * @author Innocent Nwachukwu
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber/features", 
		glue = "com.cucumber.stepdefinition", 
		plugin = { "pretty", "html:target/cucumber",})
public class RunCukeTest {

}
