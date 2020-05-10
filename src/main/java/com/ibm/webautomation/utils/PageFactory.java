package com.ibm.webautomation.utils;

import com.ibm.webautomation.pageobjects.CredentialPage;
import com.ibm.webautomation.pageobjects.HomePage;
import com.ibm.webautomation.pageobjects.SkatCVRSEnrPage;
import com.ibm.webautomation.pageobjects.SkatHomePage;
import com.ibm.webautomation.pageobjects.SkatLoginPage;

public class PageFactory {
	
	private static PageFactory pageFactory = new PageFactory();

    public static PageFactory getPageFactory() {
        return pageFactory;
    }
    
   public SkatLoginPage skatLoginPage = getSkatLoginPage();
   public SkatHomePage skatHomePage = getSkatHomePage();
   public SkatCVRSEnrPage skatCVRSEnrPage = getSkatCVRSEnrPage();
   
   public  HomePage homePage = getHomePage();   
   public CredentialPage credentialPage = getCredentialsPage();
	
	public SkatLoginPage getSkatLoginPage() 
	{
		try {
			skatLoginPage = new SkatLoginPage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return skatLoginPage;
	}
	
	public SkatHomePage getSkatHomePage() 
	{
		try {
			skatHomePage = new SkatHomePage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return skatHomePage;
	}
	
	public SkatCVRSEnrPage getSkatCVRSEnrPage() 
	{
		try {
			skatCVRSEnrPage = new SkatCVRSEnrPage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return skatCVRSEnrPage;
	}
	
	
	public HomePage getHomePage() 
	{
		try {
			homePage = new HomePage("HomePage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homePage;
	}
	
	public CredentialPage getCredentialsPage()
	{
		try {
			credentialPage = new CredentialPage("CredentialPage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return credentialPage;
	}

}
