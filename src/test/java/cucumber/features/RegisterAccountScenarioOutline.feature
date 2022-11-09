Feature: Create a new account in app demo

  Background: Go to page
    Given a user reach the page "http://localhost:8081/register.html"

  @registerAccountOutline
  Scenario Outline: CreateNew Account
    When the user fills the firstname value with <firstname>
    And the user fills the lastname field with <lastname>
    And the user fills the email field with <email>
    And the user fills the password field with <password>
    And the user fills the Repeat password field with <repeatPassword>
    And the user cicks the register account button
    Then the user should be redirected to <expectedUrl>
    Examples:
      | firstname | lastname  | email               | password | repeatPassword | expectedUrl   |
      | "OULINE"  | "OUTLINE" | "OUTLINE@GMAIL.COM" | "PASS"   | "PASS"         |  "login.html" |
      | "OULINE"  | "OUTLINE" | "OUTLINE@GMAIL.COM" | "PASS"   | "PASS"         |  "login2.html" |
