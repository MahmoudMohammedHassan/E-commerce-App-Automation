@Smoke
Feature: Logged user could add different products to wishlist

  Background: User login with valid credentials
    Given user navigates to login page
    When user enters "automation@test.com" and "$Passw0rd"
    And user clicks the login button
    Then user could login successfully

  Scenario: user should be able to add different products to wishlist
    Given user adds three different products to wishlist
    When user navigates to wishlist
    And user is directed to wishlist
    And user counts the number of products in his wishlist
    Then user should find the number of products in his wishlist matches the number of products he has added
