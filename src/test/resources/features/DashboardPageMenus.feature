Feature: DashboardPage Menus


  Scenario: User should be able to see the Dashboard menus after logged in as a teacher
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |


  Scenario: User should be able to see the Dashboard menus after logged in as a student
    Given the user is on the login page
    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: Log in as a specific user
    Given the user is on the login page
    When the user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
    Then the user should be able to login