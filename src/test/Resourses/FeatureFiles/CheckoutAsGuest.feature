@Register
Feature: As guest user I want to buy a product
  Scenario: Guest user should able to buy a product
    When user is on books page
    And select a product
    And user buy that product as guest
    Then user should able to purchase successfully