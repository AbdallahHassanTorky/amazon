Feature: Login
  Scenario: user can login successfully
    Given Navigate to login page
    When Enter email
    And Click on continue button
    And Enter password
    And Click on sign in button
    Then user get home page