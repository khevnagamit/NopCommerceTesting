@Register
Feature:As I am not register user and refer a product to friend so that i should see error message
  Scenario: non-register user should not refer product & see error message
    When user refer product to friend
    And enter his email
    And click on sent email
    Then user should be should see error message