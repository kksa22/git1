@tag
Feature: login

  @tag1
  Scenario: login with valid credentials
    Given open the browser and enter valid url
    When user enters valid username 
    And user enters valid password
    When click on ok
    Then user should see homepage