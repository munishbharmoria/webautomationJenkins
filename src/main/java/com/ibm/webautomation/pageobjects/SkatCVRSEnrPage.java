package com.ibm.webautomation.pageobjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.webautomation.testmanager.TestManager;
import com.ibm.webautomation.utils.BaseClass;
public class SkatCVRSEnrPage extends BaseClass{
	
	Logger logger = LogManager.getLogger(SkatCVRSEnrPage.class);
	
	WebDriver driver = getWebDriver();

	public SkatCVRSEnrPage() {
	}
	
	public void inputCVRSEnrValue() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("senr")));
		String cvrsenr = TestManager.getTestManager().getTestData("CVRSEnrInput").getParamValue("cvrsenr");
		element.sendKeys(cvrsenr);
		
		
		/*
		 * String cvrsenr =
		 * TestManager.getTestManager().getTestData("CVRSEnrInput").getParamValue(
		 * "cvrsenr"); driver.findElement(By.name("senr")).sendKeys(cvrsenr);
		 */
	}
	
	public void clickOkButton() throws Exception
	{
		driver.findElement(By.id("defaultButton")).click();
		Thread.sleep(5000);
	}
	
}
