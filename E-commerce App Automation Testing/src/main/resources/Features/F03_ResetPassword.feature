@Smoke
Feature: user could reset his forgotten password successfully

  Scenario: user could reset his password
    Given user navigates to login page
    And user enters valid email
    And user clicks forgot password?
    When user enters his email in password recovery
    And user clicks the recover button
    Then message of confirmation that an email has been sent is displayed
