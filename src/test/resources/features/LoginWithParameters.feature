Feature: Login as different users


  Scenario: Login as student with parameters
    Given the user is on the login page
    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to login and see message "zehra"


  Scenario: Login as teacher with parameters
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login and see message "Eurotech"


