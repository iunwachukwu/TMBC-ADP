package com.cucumber.stepdefinition;

/**
 * @author Innocent Nwachukwu
 */
import java.net.MalformedURLException;

import com.cucumber.selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginStepDefinitions {
	
	SeleniumFunctions sf = new SeleniumFunctions();
	
	@Given("^user is on github homepage$")
	public void user_is_on_github_homepage() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    sf.createDriver();
	    
	    sf.isHomePageDisplayed();
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    sf.clickSignInLink();
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    sf.isLogInSectionDisplayed();
	    
	    sf.clickSignInButton();
	    
	    //sf.tearDown();
	}



}
