$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "User Book A Hotel By Using Adactin Website",
  "description": "",
  "id": "user-book-a-hotel-by-using-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login Into The Adactin Application",
  "description": "",
  "id": "user-book-a-hotel-by-using-adactin-website;user-login-into-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@tagName1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter Their Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter Their Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Browser()"
});
formatter.result({
  "duration": 4306101000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Their_Username_In_Username_Field()"
});
formatter.result({
  "duration": 323402400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Their_Password_In_Password_Field()"
});
formatter.result({
  "duration": 159362500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1118156800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "user Search A Hotel",
  "description": "",
  "id": "user-book-a-hotel-by-using-adactin-website;user-search-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user Select A Hotel Location",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Select_A_Hotel_Location()"
});
formatter.result({
  "duration": 336480500,
  "status": "passed"
});
});