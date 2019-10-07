@Functional
Feature: To test login functionality

  @Smoke
  Scenario: To test login on Heroku App
    Given user is on Heroku homepage
     When user enters username and password
    Then login successfully

