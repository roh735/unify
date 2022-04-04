@ui
Feature: Unify MainMenu pages verification

  Scenario: User on one the home page should be able to go to menuBTN dropDown menu and find MainMenu pages
    Given User at home page
    When User click following menu:
      |About|
      |Work|
      |People|
      |Careers|
      |Insights|
      |Contact|
    When User clicks on Logo with link to home page
    When User should be able to see footer