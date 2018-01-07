Feature: Beauty

  Scenario Outline: As a user I want to Register Successfully
    Given I am on the Home Page
    And I see a Net-A-Porter Logo
    When I click Beauty Button
    And I select haircare
    And I click on Shampoo
    And I click purly perfect
    And I click add to shopping bag
    And I click checkout
    And I click on proceed to purchase
    And I enter user email "<email>" details
    And I enter user password "<password>" details
    And I click on Sign in now
    Then I should successfully sign in to my account
    And I click sign out

    Examples:
      |email                   |password     |
      |lotamusomebi@gmail.com  |benedith12   |