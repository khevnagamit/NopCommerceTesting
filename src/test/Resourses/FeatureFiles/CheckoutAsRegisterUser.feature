@Register
Feature: As user I want to buy a product
  Scenario: User should able to buy a product
    Given user is loggedin
    When user is on books page
    And select a product
    And user buy that product
    Then user should able to purchase successfully