Feature: F01_Login | users could login with his accounts

  Scenario: user could login with valid data successfully
    Given user is on the login page
    When write valid User Name and password
    And click on login button
    Then user should login successfully

  Scenario: user could register with invalid user name
    Given user is on the login page
    When write invalid User Name
    And click on login button
    Then user should see Error message

  Scenario: user could register with invalid password

    Given user is on the login page
    When  write invalid password
    And click on login button
    Then user should see Error message

  Scenario: guest user could register with empty data successfully

    Given user is on the login page
    When write empty User Name and password
    And click on login button
    Then user should see Error message