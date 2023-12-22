Feature: Search

  Scenario: validate search
    Given I am on the next home page

    When I enter "Jeans" as a product

    And I click on search button

    Then I should be able to see "Jeans" as a result title