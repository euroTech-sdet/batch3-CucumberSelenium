Feature: DashboardPage Menus

  @wip
  Scenario: User should be able to see the Dashboard menus after logged in as a teacher
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |