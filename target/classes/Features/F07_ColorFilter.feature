@Smoke
Feature: Logged user could filter with color

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

    Scenario: user should be able to filter items with color
      Given user selects a category that includes colored items
      When user is directed to the page of the selected category
      And user selects a specific color
      Then items are filtered according to the selected color
