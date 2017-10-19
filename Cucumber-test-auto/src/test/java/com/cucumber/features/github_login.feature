Feature: github login

Scenario:  login with username and password
	Given user is on github homepage
	When user clicks on Sign in button
	Then user is displayed login screen
	