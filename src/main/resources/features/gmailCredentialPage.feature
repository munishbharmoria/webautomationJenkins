@credentialPage
Feature: Validate gmail credentials page 

Background:
Given Gmail login page is available 

@GmailSmoke
Scenario Outline: CP-01:Verify user abple to input user name & password and login
	When I input user name <username> 
	Then I click on next button 
	And I am on credential page
	Then I input password <password>
	And I click on next button to login
	Examples: 
		|username|password|
		|testuse08031983|welcome2ibm|