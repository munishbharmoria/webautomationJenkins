package com.ibm.webautomation.pageobjects;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.webautomation.utils.BaseClass;

public class CredentialPage extends BaseClass {
	
	Logger logger = LogManager.getLogger(CredentialPage.class);
	
	WebDriver driver = getWebDriver();

	public CredentialPage(String pageName) throws Exception {
		populatePageData(pageName);
	}
	public Boolean verifyCredentialPage()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		return driver.findElement(By.id("password")).isDisplayed(); 
	}
	
	public void inputPassword(String pwd)
	{

		logger.debug("Waiting for page load");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		logger.debug("Setting password");
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public void clickOnNextButton() throws Exception
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		//driver.findElement(By.className("RveJvd snByac")).click();
		Thread.sleep(10000);
	}
	
	public Boolean forgotPasswordLinkVisibility()
	{
		return driver.findElement(By.xpath("//span[text()=\"Forgot password?\"]")).isDisplayed();
	}
}
