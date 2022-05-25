
Feature: DashboardPage Menus

 Background:
   Given the user is on the login page


  Scenario: User should be able to see the Dashboard menus after logged in as a teacher

    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: User should be able to see the Dashboard menus after logged in as a student

    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: Log in as a specific user

    When the user logs in using following credentials
#    Dilediğinizi yazabilirsiniz, açıklama yapabilirsiniz
      | username | eurotech@gmail.com |
      | password | Test12345!         |
    Then the user should be able to login
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |