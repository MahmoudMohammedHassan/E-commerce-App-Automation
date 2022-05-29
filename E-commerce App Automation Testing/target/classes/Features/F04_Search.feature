@Smoke
Feature: user could search for products

  Scenario: user should be able to search for any product using its name
    Given user clicks in search field
    When user search for a product with its name
    And user clicks enter
    Then user could find the available products matching his search
