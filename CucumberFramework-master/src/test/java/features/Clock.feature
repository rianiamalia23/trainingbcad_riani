Feature: Validate function Clock

  @clock
  Scenario: Setting alarm
    Given I open the clock
    When I set alarm
    Then I validate the alarm