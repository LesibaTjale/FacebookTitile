Feature: Facebook Title

  Scenario: Title presence on Facebook home Page
    Given I launch chrome browser
    When I open Facebook homepage
    Then   I verify that the title is present on the page
    And close browser