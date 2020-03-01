Feature:LetsKodeIt HomePage

  Background: LetsKodeIt HomePage
    Given I am at LetsKodeIt HomePage


    Scenario: Test PracticeButton
      Given click at practice Button
      Then  close Browser

    Scenario: Test SelectButton
        Given click at Select Button
        Then  close Browser

    Scenario: Test RadioButton
        Given click at Radion Button
        Then close the Browser

    Scenario: Test DropDownButton
      Given click at DropDown Button
      And select benz from dropDownitems
      Then close the browser

    Scenario: Test MultipleSelectButton
      Given click at Multipleslect Button
      Then close the browser

    Scenario: Test checkBoxButton
      Given click at checkBox Button
      Then close the Browser

    Scenario: Test SwitchWindow
      Given click at openNewWindow
      Then Close the opened Window

  Scenario: Test confirm okButton
    Given  click on Confirm button
    And  Accept The Alert
    Then  Close the Browser

  Scenario: Test  Confirm cancelButton
    Given  Cancel The Alert
    Then Close the Browser

  Scenario: Test Mouse Hover
    Given  hover mouse to the webElement
    Then  Close the Browser

  Scenario: Test iFrame
    Given click on the iFrame
    And  search selenium in the iFrameBar
    Then  Close the Browser
