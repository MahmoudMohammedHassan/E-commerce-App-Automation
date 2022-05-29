@Smoke
Feature: Create Successful Order

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: Logged user should be able to create a successful order
    Given user navigates to shopping cart
    And user is directed to shopping cart page
    And user checks the terms of service box
    And user clicks the checkout button
    And user is directed to checkout page
    And user selects country
    And user enters city
    And user enters Address 1
    And user enters postal code
    And user enters phone number
    And user enters first continue button
    And user clicks second continue button
    And user clicks third continue button
    And user clicks forth continue button
    And user clicks confirm button
    Then user should be directed to the checkout page and confirmation message is displayed