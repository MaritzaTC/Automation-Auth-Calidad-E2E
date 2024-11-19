Feature: Login
  As a user
  I want to login
  So that I can access my account


  Background:
    Given the user is on the login page


  Scenario: User logs in with valid credentials
    When the user enters valid credentials
    |email|password|
    |maritza.tabarezc@udea.edu.co|1234|
    Then The user must enter the welcome page


  Scenario: User logs in with invalid credentials
    When the user enters invalid credentials
    |email|password|
    |user@udea.edu.co|1234|
    Then The user must see an error message
    
