
Feature: Teachers should be able to Navigate to Menus

  Background:
    Given the user is on the login page
    When the user enters teacher credentials

  Scenario: Navigating to Developers menu

    And the user should be able to login
    Then the user navigates to Developers menu
    And the user should be able to see the header of the menu

  Scenario: Navigating to All Posts menu

    And the user sees welcome text
    Then the user navigates to All Posts menu
    And the user should be able to see the header of the menu

  @db
  Scenario: Navigating to My Account menu

    And the user sees welcome text
    Then the user navigates to My Account menu
    And the user should be able to see the header of the menu