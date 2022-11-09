Feature: Create a new account in app demo

  Background: Go to page
    Given a user reach the page "http://localhost:8081/register.html"

  @registerAccount
  Scenario: Create New Account
    When the user fills the firstname value with "Swiss"
    And the user fills the lastname field with "Contact"
    And the user fills the email field with "test@test.com"
    And the user fills the password field with "password"
    And the user fills the Repeat password field with "password"
    And the user cicks the register account button
    Then the user should be redirected to "login.html"

  @registerAccount
  Scenario: CreateNew Account
    When the user fills the firstname value with "SwissContact"
    And the user fills the Repeat password field with "password"
    Then the user should be redirected to "login.html"


  @registerAccount
  Scenario: CreateNew Account
    When the user fills the firstname value with "Swiss"
    And the user fills the lastname field with "Contact"
    And the user fills the email field with "test@test.com"
    Then the user should be redirected to "login.html"