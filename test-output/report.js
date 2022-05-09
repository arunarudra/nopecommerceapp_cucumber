$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch the browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user opens the url \"https://admin-demo.nopcommerce.com/login\" in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_the_url_in_the_browser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Adding new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Customers.user_click_on_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.click_on_add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Customers.user_can_view_add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter all customer details",
  "keyword": "When "
});
formatter.match({
  "location": "Customers.user_enter_all_customer_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can see the confirmation message",
  "keyword": "Then ",
  "doc_string": {
    "value": "×\nThe new customer has been added successfully."
  }
});
formatter.match({
  "location": "Customers.user_can_see_the_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Launch the browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user opens the url \"https://admin-demo.nopcommerce.com/login\" in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_the_url_in_the_browser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search customer by Email ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Customers.user_click_on_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "provide email id in the email id field",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.provide_email_id_in_the_email_id_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "Customers.press_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can see all details respective to the email id",
  "keyword": "Then "
});
formatter.match({
  "location": "Customers.user_can_see_all_details_respective_to_the_email_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});