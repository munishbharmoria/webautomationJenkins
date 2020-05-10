Feature: Validate CVR SEnr page 

Background:
Given skat user is on Home page 

@SkatSmoke
Scenario: LP-01:Verify click on CVR/SEnr button 
	And I click on CVR SEnr button
	And I input CVR SEnr value
	And I click on OK button on CVR SEnr page
	And Is CVR SEnr button visible
