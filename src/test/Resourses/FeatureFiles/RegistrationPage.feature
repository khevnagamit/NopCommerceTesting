@Register
Feature: As user I want to register so that I can use all the facility available on my account
  Scenario: User should able to register successfully and confirmation should display
    Given user is on register page
    When user enter information
    Then user should be register successfully