package com.ibm.webautomation;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.ibm.webautomation.compatibility.PlatformCapabilitiesManager;
import com.ibm.webautomation.testmanager.TestManager;
import com.ibm.webautomation.utils.BaseClass;
import com.ibm.webautomation.webdriver.InitializeWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

// Main to startup automation test
public class Hooks extends BaseClass
{
	
	public Logger logger = LogManager.getLogger(Hooks.class);
	Scenario scenario;
	
	@Before
    public void initializer(Scenario scenario)
    {
		this.scenario = scenario;
        // initialize platform capabilities
		logger.debug("Initializing platform capabilities");
    	PlatformCapabilitiesManager.initPlatformCapabilities();
    	
    	// initialize test data
    	logger.debug("Initializing application data");
        TestManager.initTestData();
        
        // initialize web driver
        logger.debug("Initializing web driver");
        InitializeWebDriver.initializeWebDriver();
        
    }
	
	@After
	public void teardown(Scenario scenario)
	{
		System.out.printf("scenario", scenario);
		if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.embed(screenshot, "image/png"); 
		    }
		InitializeWebDriver.closeWebdriver();
		
		// generate advance report
		cucumberExtendedReport();
	}
	
	public void cucumberExtendedReport()
	{
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setSourceFile("./target/81/cucumber.json");
		//results.executeFeaturesOverviewReport();
		try {
			results.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
