Feature: This is used to automate login functionality and verify

  Background: Launch the browser
    Given user launch the browser
    When user opens the url "https://admin-demo.nopcommerce.com/login" in the browser

  Scenario: Validate successful login
    And user enters Email as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When user clik on logout link
    Then Page Title should be "Your store. Login"
    And close the browser

  Scenario: Validate Failure login
    When user enters Email as "admin123@yourstore.com" and password as "admin"
    And click on login button
    Then error message displayed will be
      """
      Login was unsuccessful. Please correct the errors and try again.
      No customer account found
      """
    And close the browser
