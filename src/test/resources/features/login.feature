@login
Feature: User should be able to login


  Scenario: Login as a teacher
    Given the user is on the login page
    When the user enters teacher credentials
    Then the user should be able to login

  @student @smoke
  Scenario: Login as a student
    Given the user is on the login page
    When the user enters student credentials
    Then the user should be able to login

  @developer @smoke
  Scenario: Login as a developer
    Given the user is on the login page
    When the user enters developer credentials
    Then the user should be able to login