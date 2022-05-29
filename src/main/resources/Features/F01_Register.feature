@Smoke
Feature: user should be able to register with new accounts


  Scenario: user could register with valid data
    Given user navigates to register page
    When user enters Valid Credentials and Password
    And user clicks the register button
    Then user could register successfully

