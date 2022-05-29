@Smoke
Feature: Logged user could select different categories

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: User should be able to select a category from home page
    When user hover a category
    And user selects a subcategory
    Then user should be directed to the page of the selected subcategory