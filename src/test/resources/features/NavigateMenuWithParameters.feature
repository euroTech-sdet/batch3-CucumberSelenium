@navigate
Feature: Navigate to menu with Parameters
  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "Developers" menu
    Then the user should be able to see header as "Filter Profiles by Skill or by Location"

  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "All Posts" menu
    Then the user should be able to see header as "Posts"

  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "My Account" menu
    Then the user should be able to see header as "Dashboard"

