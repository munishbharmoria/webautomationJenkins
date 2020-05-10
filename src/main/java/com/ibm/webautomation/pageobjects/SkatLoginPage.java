package com.ibm.webautomation.pageobjects;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.webautomation.utils.BaseClass;
public class SkatLoginPage extends BaseClass{
	
	Logger logger = LogManager.getLogger(SkatLoginPage.class);
	
	WebDriver driver = getWebDriver();

	public SkatLoginPage() {
	}
	
	public void launchApplication(String appUrl) throws Exception {
		driver.get(appUrl); 
		Thread.sleep(5000);
	}
	
	public Boolean validateLoginPage() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		driver.switchTo().frame("letloen");
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		return element.isDisplayed();
	}
	
	public void inputUserName(String userName)
	{
		driver.switchTo().frame("letloen");
		driver.findElement(By.name("userName")).sendKeys(userName);
	}
	
	public void inputPassword(String password)
	{
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clickOkButton() throws Exception
	{
		driver.findElement(By.id("defaultButton")).click();
		Thread.sleep(5000);
	}
	
}
