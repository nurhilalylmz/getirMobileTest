$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Getir Test Cases",
  "description": "",
  "id": "getir-test-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Case 1",
  "description": "",
  "id": "getir-test-cases;case-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open to the GetirApp",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login by entering username \"hello@getir.com\" password \"hello\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Go to the basket.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Checking for no items in the basket",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Return to the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Go to the \"Atıştırmalık\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"1\" product is added from the \"1\". product",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The status of adding \"1\" of the \"1\". product to the basket is controlled",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "\"1\" product is added from the \"2\". product",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "The status of adding \"1\" of the \"2\". product to the basket is controlled",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Return to the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Go to the \"İçecek\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "\"1\" product is added from the \"1\". product",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The status of adding \"1\" of the \"1\". product to the basket is controlled",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Go to the basket.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "All items in the basket are deleted.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Checking for no items in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.openToTheGetirApp()"
});
formatter.result({
  "duration": 23755517400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello@getir.com",
      "offset": 28
    },
    {
      "val": "hello",
      "offset": 55
    }
  ],
  "location": "StepDefinition.loginByUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 11141221800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goToTheBasket()"
});
formatter.result({
  "duration": 10013965500,
  "error_message": "java.lang.NullPointerException\r\n\tat methods.BaseMethods.findByElement(BaseMethods.java:41)\r\n\tat methods.MainPageMethod.goToBasket(MainPageMethod.java:24)\r\n\tat steps.StepDefinition.goToTheBasket(StepDefinition.java:50)\r\n\tat ✽.Then Go to the basket.(TestCases.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.checkBasketForNoItems()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.returnToHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Atıştırmalık",
      "offset": 11
    }
  ],
  "location": "StepDefinition.goToTheSelectedCategory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 1
    },
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "StepDefinition.addingAmountOfProduct(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    },
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "StepDefinition.controlOfAddingAmountOfProductToTheBasket(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 1
    },
    {
      "val": "2",
      "offset": 31
    }
  ],
  "location": "StepDefinition.addingAmountOfProduct(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    },
    {
      "val": "2",
      "offset": 33
    }
  ],
  "location": "StepDefinition.controlOfAddingAmountOfProductToTheBasket(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.returnToHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "İçecek",
      "offset": 11
    }
  ],
  "location": "StepDefinition.goToTheSelectedCategory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 1
    },
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "StepDefinition.addingAmountOfProduct(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    },
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "StepDefinition.controlOfAddingAmountOfProductToTheBasket(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.goToTheBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.allItemsInTheBasketAreDeleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.checkBasketForNoItems()"
});
formatter.result({
  "status": "skipped"
});
});