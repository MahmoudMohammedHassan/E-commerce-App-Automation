@Smoke
Feature: Logged user could switch between currencies

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation2@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: Verify that default currency is US Dollar
    Then The price of a product should be displayed in US Dollars

  Scenario: User should be able to switch currency to Euro
    When user selects currency to be Euro
    Then The price of a product should be displayed in Euro


