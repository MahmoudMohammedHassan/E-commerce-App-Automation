@Smoke
Feature: Logged user could add different products to shopping cart

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation2@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: user should be able to add different products to shopping cart
    Given user adds three different products to shopping cart
    When user navigates to shopping cart
    And user is directed to shopping cart page
    And user counts the number of products in his shopping cart
    Then user should find the number of products in his shopping cart matches the number of products he has added