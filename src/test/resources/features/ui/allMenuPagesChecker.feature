@ui
Feature: Unify All MainMenu pages verification

  Scenario: User on one the home page should be able to go to menuBTN dropDown menu and find MainMenu pages
    Given User at home page
    Then User clicks menuBTN dropDown, make sure all menu elements displayed