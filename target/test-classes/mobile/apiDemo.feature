@Regression
Feature: Api Demo Application

  @ValidateText
  Scenario: Get text of button
    Given user gets text of "Accessibility" option
    Then user validates that it is "Accessibility"

  @ValidateCustomViewText
  Scenario: Validate custom view text
    Given user taps on "Accessibility"
    Then user should be able to see "Custom View"

  @ValidateInputBox
  Scenario: Validate input box is displayed
    Given user taps on "Views"
    And user taps on "Animation"
    And user taps on "Shake"
    Then user should be able to see input box

  @ValidateAllTexts
  Scenario: Get texts of All options and validate them
    Given user gets texts of all options and validates them
      | Accessibility |
      | Animation     |
      | App           |
      | Content       |
      | Graphics      |
      | Media         |
      | NFC           |
      | OS            |
      | Preference    |
      | Text          |
      | Views         |

  @ValidateTextWithUIAutomatorAndIndex
  Scenario: Get text of button with ui automator and index
    Given user gets text of "Views" option
    Then user validates that it is "Views"

  @tapToElement
  Scenario: Tap to Graphics and Validate Arcs is visible
    Given user taps on "Graphics"
    Then user validates that "Arcs" is visible

  Scenario: Tap to Animation
    Given user taps on "Animation"
    When user taps on "Custom Evaluator"
    Then user should see Play Button

  @TapAndValidateMessage
  Scenario: Tap to Text option and validate details
    Given user taps on "Text"
    Then user validates options are displayed
      | Linkify | LogTextBox | Marquee |
    And user taps on "LogTextBox"
    And user taps on "ADD"
    And user validates the message is "This is a test"
    And user taps on "DO NOTHING"
#    And user validates there is only one message "This is a test"