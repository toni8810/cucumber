$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This is responsible for logging in and out",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9221111278,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct credentials",
  "description": "",
  "id": "loginfeature;login-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User goes to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User attempts to login with the following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "arwol006@gmail.com",
        "passwordInvalid"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userGoesToTheLoginPage()"
});
formatter.result({
  "duration": 9394063967,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userAttemptsToLoginWithTheFollowingCredentials(DataTable)"
});
formatter.result({
  "duration": 2923869153,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userIsLoggedIn()"
});
formatter.result({
  "duration": 614056265,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat steps.LoginSteps.userIsLoggedIn(LoginSteps.java:56)\n\tat ✽.Then User is logged in(src/test/java/feature/Login.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 46036525,
  "status": "passed"
});
});