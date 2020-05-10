package com.ibm.webautomation.stepdefinations;

import com.ibm.webautomation.testmanager.TestManager;
import com.ibm.webautomation.utils.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SkatHomePageStepDef extends PageFactory{
	

    @Given("^skat user is on Home page$")
    public void skat_user_is_on_home_page() throws Exception {
    	String appUrl = TestManager.getTestManager().getTestData("skatAppUrl").getParamValue("url");
		skatLoginPage.launchApplication(appUrl);
		String userName = TestManager.getTestManager().getTestData("skatLoginCredentials").getParamValue("username");
    	String password = TestManager.getTestManager().getTestData("skatLoginCredentials").getParamValue("password");
    	skatLoginPage.inputUserName(userName);
    	skatLoginPage.inputPassword(password);
    	skatLoginPage.clickOkButton();
    }
    
    @And("^I click on CVR SEnr button$")
    public void click_on_CVR_SEnr_button() throws Exception {
    	skatHomePage.clickOnCVRSEnrButton();
    }
    
    @And("^Is CVR SEnr button visible$")
    public void is_CVR_SEnr_button_visible() throws Exception {
    	skatHomePage.isCVRSEnrButtonVisible();
    }
    
}
