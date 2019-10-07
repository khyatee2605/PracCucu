@Functionality
Feature: To test multiple login

  @tag1
  Scenario Outline: To test multi user input
    Given User is on home page
    When user enters "<username>" and "<password>"
    Then login successful

    Examples: 
      | username | password             |
      | tomsmith | SuperSecretPassword! |
      | kate     | test02               |
      | ansh     | test256              |
