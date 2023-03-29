Feature: Validate Chrome Function

  @mobile
  Scenario: Searching on Chrome
    Given I hit search box
    When I type the keyword
    Then I validate the search result

