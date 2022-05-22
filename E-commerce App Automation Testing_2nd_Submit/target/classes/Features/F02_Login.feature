@Smoke
Feature: user should be able to login to the system

  Scenario: user enters valid email and valid password
    Given user navigates to login page
    When user enters "automation2@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully


  Scenario: user login with invalid email and/or invalid password
    Given user navigates to login page
    When user enters "Invalid@test.com" and "invalidPass"
    And user clicks the login button
    Then user could not login
