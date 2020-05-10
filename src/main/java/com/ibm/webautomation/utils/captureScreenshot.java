package com.ibm.webautomation.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot{  
	public static void takeScreenshot(WebDriver driver)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./webautomation/src/main/resources/screenshots"));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}
	
	
	}
