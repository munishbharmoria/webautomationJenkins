package com.ibm.webautomation.stepdefinations;

import static org.junit.Assert.assertTrue;

import com.ibm.webautomation.testmanager.TestManager;
import com.ibm.webautomation.utils.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkatLoginPageStepDef extends PageFactory{
	

    @Given("^Skat login page is available$")
    public void skat_login_page_is_available() throws Exception {
    	String appUrl = TestManager.getTestManager().getTestData("skatAppUrl").getParamValue("url");
		skatLoginPage.launchApplication(appUrl);
    }
  
    @And("^I see skat login page$")
    public void i_see_skat__login_page() throws Throwable {
    	assertTrue(skatLoginPage.validateLoginPage());
    }
    
    @When("^I input the user name (.+)$")
    public void i_input_the_user_name(String username) throws Throwable {
    	skatLoginPage.inputUserName(username);
    }
    
    @When("^I input the password (.+)$")
    public void i_input_the_passworde(String password) throws Throwable {
    	skatLoginPage.inputPassword(password);
    }

    @Then("^I click on Ok button$")
    public void i_click_Ok_next_button() throws Throwable {
    	skatLoginPage.clickOkButton();
    }
   /* 
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
    }*/
}
