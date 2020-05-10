$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/skatCVRSEnrPage.feature");
formatter.feature({
  "name": "Validate CVR SEnr page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "skat user is on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SkatHomePageStepDef.skat_user_is_on_home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id letloen\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-MP34U9SM\u0027, ip: \u00279.206.205.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:881)\r\n\tat com.ibm.webautomation.pageobjects.SkatLoginPage.inputUserName(SkatLoginPage.java:39)\r\n\tat com.ibm.webautomation.stepdefinations.SkatHomePageStepDef.skat_user_is_on_home_page(SkatHomePageStepDef.java:18)\r\n\tat ✽.skat user is on Home page(src/main/resources/features/skatCVRSEnrPage.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "LP-01:Verify click on CVR/SEnr button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke2"
    }
  ]
});
formatter.step({
  "name": "I click on CVR SEnr button",
  "keyword": "And "
});
formatter.match({
  "location": "SkatHomePageStepDef.click_on_CVR_SEnr_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input CVR SEnr value",
  "keyword": "And "
});
formatter.match({
  "location": "SkatCVRSEnrPageStepDef.input_CVR_SEnr_value()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on OK button on CVR SEnr page",
  "keyword": "And "
});
formatter.match({
  "location": "SkatCVRSEnrPageStepDef.click_on_OK_button_on_CVR_SEnr_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Is CVR SEnr button visible",
  "keyword": "And "
});
formatter.match({
  "location": "SkatHomePageStepDef.is_CVR_SEnr_button_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});