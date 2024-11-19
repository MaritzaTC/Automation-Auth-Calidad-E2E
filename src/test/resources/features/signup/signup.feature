Feature: Sign up
  I as a new user
  I want to sign up in the system
  So that i can use the system

    Scenario: Sign up with valid data
        Given I am on the sign up page
        When I fill in the sign up form with valid data
      |name|email|password|confirmPassword|
      |John|joh123@gmail.com|123456|123456|
       Then I should see "Registro exitoso!"



