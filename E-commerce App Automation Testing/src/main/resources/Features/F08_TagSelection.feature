@Smoke
Feature: Logged user could select different tags

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation2@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: user should be able to select a tag
    Given user selects a category
    And user is directed to the selected category page
    When user selects a tag
    Then user should be directed to the page of the products tagged with the selected tag

