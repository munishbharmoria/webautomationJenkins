package com.ibm.webautomation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/main/resources/features"
				,monochrome = true,
				//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:/webautomation/src/main/resources/reports"},
//glue= {""},
////plugin= {"com.cucumber.listener.ExtentCucumberFormatter:D:\\webautomation-master\\src\\main\\resources\\reports"}
//plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:D\\report.html"},
//monochrome=true,
//plugin = {"pretty", "html:C:\\"},
//plugin = {"pretty", "json:target/reports/json/cucumber.json"},
tags= {
		//"@SkatSmoke",
		"@GmailSmoke"},
plugin = { "pretty", "html:target/reports/html/cucumber-html-reports" }
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
)
/*
@CucumberOptions(
        features ="src/main/resources/features" ,
        //,glue= "seleniumgluecode",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )*/


public class TestRunner {
	 @AfterClass
	    public static void writeExtentReport() {

	        Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
	 }

}
