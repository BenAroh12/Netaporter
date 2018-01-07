Feature: Register

  Scenario Outline: As a user I want to Register Successfully
    Given I am on the Home Page
    And I see a Net-A-Porter Logo
    When I click Register Button
    And I see Register now displayed
    And I enter First name in the first name input field
    And I enter Surname in the last name input field
    And I enter user email "<email>" details
    And I enter user confirm email "<email>" details
    And I enter user password "<password>" details
    And I select country
    And I select Day of birth
    And I select Month of birth
    And I click to receive Net-a-Porter offers updates via email
    And I click I am not a robot
    And I click the Register Button
    Then I should be register successfully
    And I see user account name displayed

  Examples:
      |email                   |password     |
      |lotamusomebi@gmail.com  |benedith12   |
