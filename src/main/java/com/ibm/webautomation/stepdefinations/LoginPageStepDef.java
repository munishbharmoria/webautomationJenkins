package com.ibm.webautomation.stepdefinations;

import static org.junit.Assert.assertTrue;

import com.ibm.webautomation.testmanager.TestManager;
import com.ibm.webautomation.utils.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDef extends PageFactory {
	

    @Given("^Gmail login page is available$")
    public void gmail_login_page_is_available() throws Exception {
    	String appUrl = TestManager.getTestManager().getTestData("gmailappurl").getParamValue("url");
		homePage.launchApplication(appUrl);
    }
  
    @And("^I see login page$")
    public void i_see_login_page() throws Throwable {
    	assertTrue(homePage.signInPage());
    }
    
    @And("^I see user name input box$")
    public void i_see_user_name_input_box() throws Throwable {
    	assertTrue(homePage.signInPage());
    }

    @And("^I see forget email link$")
    public void i_see_forget_email_link() throws Throwable {
    	assertTrue(homePage.forgotEmailLinkVisibility());
    }

    @And("^I see create account link$")
    public void i_see_create_account_link() throws Throwable {
    	assertTrue(homePage.createAccountVisibility());
    }

    @And("^I see next button$")
    public void i_see_next_button() throws Throwable {
    	assertTrue(homePage.nextbuttonVisibility());

    }

    @When("^I input user name (.+)$")
    public void i_input_user_name(String username) throws Throwable {
    	homePage.inputUserName(username);
    }

    @Then("^I click on next button$")
    public void i_click_on_next_button() throws Throwable {
    	homePage.clickNextButton();
    }
}
