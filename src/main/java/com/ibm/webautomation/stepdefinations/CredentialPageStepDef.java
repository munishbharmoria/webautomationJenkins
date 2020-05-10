package com.ibm.webautomation.stepdefinations;

import static org.junit.Assert.assertTrue;

import com.ibm.webautomation.utils.PageFactory;

import cucumber.api.java.en.And;

public class CredentialPageStepDef extends PageFactory{
	
	 @And("^I am on credential page$")
	    public void i_am_on_credential_page() throws Throwable {
	    	credentialPage.verifyCredentialPage();
	    }
	 @And("^I input password (.+)$")
	    public void i_input_password(String pwd) throws Throwable {
	        credentialPage.inputPassword(pwd);
	    }
	 @And("^I see forgot password link$")
	    public void credential_page_is_available() throws Throwable {
		 assertTrue(credentialPage.forgotPasswordLinkVisibility());
	    }
	 
	 @And("^I click on next button to login$")
	    public void click_on_next_button_to_login() throws Throwable {
		 credentialPage.clickOnNextButton();
	    }

}
