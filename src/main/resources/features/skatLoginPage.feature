Feature: Validate skat login page 

Background:
Given Skat login page is available 

@SkatSmoke
Scenario: LP-01:Verify Skat Login page is available 
	And I see skat login page 
	
@SkatSmoke
Scenario: LP-02:Verify user name input box is available 
	And I see user name input box 

@SkatSmoke
Scenario Outline: :LP-06:Verify user is able login 
	When I input the user name <username> 
	Then I input the password <password>
	Then I click on Ok button 
	Examples: 
		|username|password|
		|MUNISH|Welcome4@ibm|
