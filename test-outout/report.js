$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "E-bay Login Feature",
  "description": "",
  "id": "e-bay-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check Login Functionality",
  "description": "",
  "id": "e-bay-login-feature;check-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check Customer Login Page title valid",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Check Customer Login with valid Data\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Check Customer Login with invalid Data\"\u003cusername1\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "e-bay-login-feature;check-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "username1",
        "password1"
      ],
      "line": 11,
      "id": "e-bay-login-feature;check-login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "abc123",
        "111",
        "222"
      ],
      "line": 12,
      "id": "e-bay-login-feature;check-login-functionality;;2"
    },
    {
      "cells": [
        "def",
        "def123",
        "333",
        "888"
      ],
      "line": 13,
      "id": "e-bay-login-feature;check-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check Login Functionality",
  "description": "",
  "id": "e-bay-login-feature;check-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check Customer Login Page title valid",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Check Customer Login with valid Data\"abc\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Check Customer Login with invalid Data\"111\" and \"222\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTests.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 10516457600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.check_Customer_Login_Page_title()"
});
formatter.result({
  "duration": 10783100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 37
    },
    {
      "val": "abc123",
      "offset": 47
    }
  ],
  "location": "LoginPageTests.check_Customer_Login_with_valid_Data_and(String,String)"
});
formatter.result({
  "duration": 445420500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 39
    },
    {
      "val": "222",
      "offset": 49
    }
  ],
  "location": "LoginPageTests.check_Customer_Login_with_invalid_Data(String,String)"
});
formatter.result({
  "duration": 1411298000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check Login Functionality",
  "description": "",
  "id": "e-bay-login-feature;check-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check Customer Login Page title valid",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Check Customer Login with valid Data\"def\" and \"def123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Check Customer Login with invalid Data\"333\" and \"888\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTests.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8682642300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.check_Customer_Login_Page_title()"
});
formatter.result({
  "duration": 5547200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "def",
      "offset": 37
    },
    {
      "val": "def123",
      "offset": 47
    }
  ],
  "location": "LoginPageTests.check_Customer_Login_with_valid_Data_and(String,String)"
});
formatter.result({
  "duration": 461236300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "333",
      "offset": 39
    },
    {
      "val": "888",
      "offset": 49
    }
  ],
  "location": "LoginPageTests.check_Customer_Login_with_invalid_Data(String,String)"
});
formatter.result({
  "duration": 1489648600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check Login with Data Tables",
  "description": "",
  "id": "e-bay-login-feature;check-login-with-data-tables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is already on data table Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Check Customer Login with valid Data",
  "rows": [
    {
      "cells": [
        "name",
        "passw"
      ],
      "line": 21
    },
    {
      "cells": [
        "Tom",
        "Cruise"
      ],
      "line": 22
    },
    {
      "cells": [
        "Sean",
        "Harry123"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Check Customer Login with invalid Data",
  "rows": [
    {
      "cells": [
        "name1",
        "passw1"
      ],
      "line": 25
    },
    {
      "cells": [
        "a111",
        "a222"
      ],
      "line": 26
    },
    {
      "cells": [
        "a555",
        "a666"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTests.user_is_already_on_data_table_Login_Page()"
});
formatter.result({
  "duration": 7775318400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.check_Customer_Login_with_valid_Data(DataTable)"
});
formatter.result({
  "duration": 1654789400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.check_Customer_Login_with_invalid_Data(DataTable)"
});
formatter.result({
  "duration": 1708632000,
  "status": "passed"
});
});