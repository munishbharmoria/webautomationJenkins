package com.ibm.webautomation.webdriver;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.ibm.webautomation.compatibility.PlatformCapabilitiesManager;
import com.ibm.webautomation.compatibility.PlatformCapability;

public class InitializeWebDriver {
	
	public static WebDriver driver = null;

	public static void initializeWebDriver() {
		
			ClassLoader classLoader;
	        String driverFile = "";
	       // WebDriver driver = null;
			try {
				List<PlatformCapability> capabilitiesList   = PlatformCapabilitiesManager.getManager().getPlatformCapabilityList();
				classLoader = Class.forName("com.ibm.webautomation.webdriver.InitializeWebDriver").getClassLoader();
				if(capabilitiesList.get(0).getBrowser().equalsIgnoreCase("chrome")) {
					driverFile = classLoader.getResource("drivers/chromedriver_win32/chromedriver.exe").getFile();
					System.setProperty("webdriver.chrome.driver", driverFile);
					driver = (new PlatformCapability()).getWebDriver();
					
				}
				else if(capabilitiesList.get(0).getBrowser().equalsIgnoreCase("firefox")) {
					//driverFile = classLoader.getResource(WebDriverUtils.firefoxdriver).getFile();
					driverFile = classLoader.getResource("drivers/geckodriver-v0.25.0-win64/geckodriver.exe").getFile();
					System.setProperty("webdriver.firefox.driver", driverFile);
					driver = (new PlatformCapability()).getWebDriver();
				}
				driver.manage().window().maximize();
				
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
	}
	
	public static void closeWebdriver()
	{
		driver.quit();
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

}
