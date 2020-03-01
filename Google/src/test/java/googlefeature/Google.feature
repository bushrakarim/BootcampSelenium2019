Feature: Google Home

  Background: Google HomePage
  Given I am at Google HomePage

  Scenario: search at Google
  Given search "mobile"
  Then I close browser

  Scenario Outline: Multiple Search on Google
  Given I search things <things>
  Examples:
  |things|
  |"keyboard"|
  |"monitor"|
  |"mouse"|