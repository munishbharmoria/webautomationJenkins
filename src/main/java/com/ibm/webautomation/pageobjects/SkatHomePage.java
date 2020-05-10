package com.ibm.webautomation.pageobjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.webautomation.utils.BaseClass;
public class SkatHomePage extends BaseClass{
	
	Logger logger = LogManager.getLogger(SkatHomePage.class);
	
	WebDriver driver = getWebDriver();

	public SkatHomePage() {
	}
	
	public void clickOnCVRSEnrButton() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("inputButton")));
		element.click();
		
		/*
		 * driver.findElement(By.className("inputButton")).click(); Thread.sleep(5000);
		 */
	}
	
	public void isCVRSEnrButtonVisible() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("inputButton")));
		element.isDisplayed();
		
		/*
		 * driver.findElement(By.className("inputButton")).isDisplayed();
		 * Thread.sleep(5000);
		 */
	}
	
}
