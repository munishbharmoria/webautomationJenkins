package com.ibm.webautomation.stepdefinations;

import com.ibm.webautomation.utils.PageFactory;

import cucumber.api.java.en.And;

public class SkatCVRSEnrPageStepDef extends PageFactory{
	

    @And("^I input CVR SEnr value$")
    public void input_CVR_SEnr_value() throws Throwable {
    	skatCVRSEnrPage.inputCVRSEnrValue();
    }
    
    @And("^I click on OK button on CVR SEnr page$")
    public void click_on_OK_button_on_CVR_SEnr_page() throws Throwable {
    	skatCVRSEnrPage.clickOkButton();
    }
    
}
