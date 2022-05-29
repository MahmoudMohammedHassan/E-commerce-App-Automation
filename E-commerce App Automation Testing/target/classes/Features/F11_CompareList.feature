@Smoke
Feature: Logged user could add different products to compare list

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation2@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: user should be able to add different products to compare list
    Given user adds three different products to compare list
    When user navigates to compare list
    And user is directed to compare list
    Then user should find the names of products in the compare list match that he has selected
