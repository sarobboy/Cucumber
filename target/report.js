$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile Purchase",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.scenario({
  "name": "Mobiles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user login to flikart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_login_to_flikart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user choose the mobile and doing payments",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_choose_the_mobile_and_doing_payments()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user receives order confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_receives_order_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});