Feature: As an Engr. Candidate I need to automate http://www.way2automation.com/angularjs-protractor/webtables/
  So I can show my awesome automation skills

  Background:
    Given User should be able to Open a browser

    Scenario: Add a user and validate the user has been added to the table
      When I should click on the Add User Button
      And I should be able fill out the information
      Then I should be able to confirm the user name is in the Table

    Scenario: Delete user User Name: novak and validate user has been delete
      When I should be able to click on delete button
      And I should not be able to see previously created User




