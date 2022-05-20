@wip
Feature: Teachers should be able to Navigate to Menus
   @123
  Scenario: Navigating to Developers menu
    Given the user is on the login page
    When the user enters teacher credentials
    And the user sees welcome text
    Then the user navigates to Developers menu
    And the user should be able to see the header of the menu

  Scenario: Navigating to All Posts menu
    Given the user is on the login page
    And the user enters teacher credentials
    And the user sees welcome text
    When the user navigates to All Posts menu
    Then the user should be able to see the header of the menu

  @db
  Scenario: Navigating to My Account menu
    Given the user is on the login page
    And the user enters teacher credentials
    And the user sees welcome text
    When the user navigates to My Account menu
    Then the user should be able to see the header of the menu