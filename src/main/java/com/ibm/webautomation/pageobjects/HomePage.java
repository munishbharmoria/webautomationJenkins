package com.ibm.webautomation.pageobjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.webautomation.utils.BaseClass;

public class HomePage extends BaseClass{
	
	Logger logger = LogManager.getLogger(HomePage.class);
	
	WebDriver driver = getWebDriver();

	public HomePage(String pageName) throws Exception {
		populatePageData(pageName);
	}
	
	@FindBy(id="headingText")
	private WebElement txt_SignInHeader;
	

	public void launchApplication(String appUrl) {
		driver.get(appUrl); 
	}
	
	public Boolean signInPage()
	{
		return driver.findElement(By.id("headingText")).isDisplayed();
	}
	
	public Boolean userNameInputboxVisibility()
	{
		return driver.findElement(By.id("identifierId")).isDisplayed();
	}
	
	public Boolean forgotEmailLinkVisibility()
	{
		return driver.findElement(By.xpath("//div//button[text()=\"Forgot email?\"]")).isDisplayed();
	}
	
	public Boolean createAccountVisibility()
	{
		return driver.findElement(By.xpath("//span[text()=\"Create account\"]")).isDisplayed();
	}
	
	public Boolean nextbuttonVisibility()
	{
		return driver.findElement(By.xpath("//span[text()=\"Next\"]")).isDisplayed();
	}
	
	public void inputUserName(String userName)
	{
		driver.findElement(By.id("identifierId")).sendKeys(userName);
	}
	
	public void clickNextButton() throws Exception
	{
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	}
}
