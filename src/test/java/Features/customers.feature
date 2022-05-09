Feature: Customers

  Background: Launch the browser
    Given user launch the browser
    When user opens the url "https://admin-demo.nopcommerce.com/login" in the browser
    And user enters Email as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"

  Scenario: Adding new customer
    When user click on customers menu
    And click on customers menu item
    And click on Add new button
    Then user can view Add new customer page
    When user enter all customer details
    And click on save button
    Then user can see the confirmation message
      """
      ×
      The new customer has been added successfully.
      """
    And close the browser

  Scenario: Search customer by Email ID
    When user click on customers menu
    And click on customers menu item
    And provide email id in the email id field
    And press search button
    Then user can see all details respective to the email id
    And close the browser
