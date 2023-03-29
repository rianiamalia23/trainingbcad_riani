Feature: Post Photos on Feed

  @instagram
  Scenario: Login instagram account
    Given I access the instagram account
    When I input username
    When I input password
    When I login instagram
    When I hit button create post
    When I click the button post
    Then I validate photo on feed
