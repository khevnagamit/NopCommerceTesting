@Register
Feature: As user I want to register so that I can refer a product to friend
  Scenario: User should able to register & refer product to friend
    Given user is on register page
    When user enter information
    And user refer product to friend
    And click on sent email
    Then email should sent successfully