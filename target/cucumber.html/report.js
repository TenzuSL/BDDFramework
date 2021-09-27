$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to internet banking webpage",
  "description": "",
  "id": "login-to-internet-banking-webpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2251822900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login to internet banking",
  "description": "",
  "id": "login-to-internet-banking-webpage;successful-login-to-internet-banking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logins with \"abc\" and pwd \"123\" and clicks login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is navigated to the home page of the internet banking account",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPagestepdefinitions.user_is_in_the_login_page()"
});
formatter.result({
  "duration": 3797733800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 18
    },
    {
      "val": "123",
      "offset": 32
    }
  ],
  "location": "loginPagestepdefinitions.user_logins_with_something_and_pwd_something_and_clicks_login_button(String,String)"
});
formatter.result({
  "duration": 597274700,
  "status": "passed"
});
formatter.match({
  "location": "loginPagestepdefinitions.user_is_navigated_to_the_home_page_of_the_internet_banking_account()"
});
formatter.result({
  "duration": 110400,
  "status": "passed"
});
formatter.after({
  "duration": 811237400,
  "status": "passed"
});
});