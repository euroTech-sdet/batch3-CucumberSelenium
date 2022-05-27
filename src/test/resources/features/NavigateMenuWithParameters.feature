
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


  @navigate
  Scenario Outline: User navigate to menu outline "<userType>"
    Given the user is on the login page
    When the user logs in using "<userTYpe>" and "<password>"
    Then the user should be able to login
    And the user navigates to "<menu>" menu
    Then the user should be able to see header as "<Header>"
    Examples:
      | userTYpe           | password   | menu       | Header                                  |
      | eurotech@gmail.com | Test12345! | All Posts  | Posts                                   |
      | eurotech@gmail.com | Test12345! | Developers | Filter Profiles by Skill or by Location |
      | eurotech@gmail.com | Test12345! | My Account | Dashboard                               |
