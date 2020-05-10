Feature: Validate gmail login page 

Background:
Given Gmail login page is available 

@GmailSmoke
Scenario: LP-01:Verify Login page is available 
	And I see login page 
	
@GmailSmoke
Scenario: LP-02:Verify user name input box is available 
	And I see user name input box 

@GmailSmoke	
Scenario: LP-03:Verify forget email link is available 
	And I see forget email link 

@GmailSmoke	
Scenario: LP-04:Verify create account link is available 
	And I see create account link 

@GmailSmoke	
Scenario: LP-05:Verify next button is available 
	And I see next button 

@GmailSmoke
Scenario Outline: :LP-06:Verify user is able to input user name 
	When I input user name <username> 
	Then I click on next button 
	And I am on credential page
	Examples: 
		|username|
		|testuse08031983|