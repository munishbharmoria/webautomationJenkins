$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/gmailCredentialPage.feature");
formatter.feature({
  "name": "Validate gmail credentials page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@credentialPage"
    }
  ]
});
formatter.scenarioOutline({
  "name": "CP-01:Verify user abple to input user name \u0026 password and login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I input user name \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "I am on credential page",
  "keyword": "And "
});
formatter.step({
  "name": "I input password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on next button to login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "testuse08031983",
        "welcome2ibm"
      ]
    }
  ]
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "CP-01:Verify user abple to input user name \u0026 password and login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@credentialPage"
    },
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I input user name testuse08031983",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.i_input_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.i_click_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on credential page",
  "keyword": "And "
});
formatter.match({
  "location": "CredentialPageStepDef.i_am_on_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input password welcome2ibm",
  "keyword": "Then "
});
formatter.match({
  "location": "CredentialPageStepDef.i_input_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on next button to login",
  "keyword": "And "
});
formatter.match({
  "location": "CredentialPageStepDef.click_on_next_button_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/main/resources/features/gmailLoginPage.feature");
formatter.feature({
  "name": "Validate gmail login page",
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LP-01:Verify Login page is available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I see login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.i_see_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LP-02:Verify user name input box is available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I see user name input box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.i_see_user_name_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LP-03:Verify forget email link is available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I see forget email link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.i_see_forget_email_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LP-04:Verify create account link is available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I see create account link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.i_see_create_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LP-05:Verify next button is available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I see next button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.i_see_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": ":LP-06:Verify user is able to input user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I input user name \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "I am on credential page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username"
      ]
    },
    {
      "cells": [
        "testuse08031983"
      ]
    }
  ]
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
  "name": "Gmail login page is available",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.gmail_login_page_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ":LP-06:Verify user is able to input user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GmailSmoke"
    }
  ]
});
formatter.step({
  "name": "I input user name testuse08031983",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.i_input_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.i_click_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on credential page",
  "keyword": "And "
});
formatter.match({
  "location": "CredentialPageStepDef.i_am_on_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});