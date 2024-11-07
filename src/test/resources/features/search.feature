Feature: Search by analysis code

  Scenario Outline: Entering the analysis code in the search field
    When I enter the analysis code "<code>" in the search field
    Then the analysis code "<code>" should be processed correctly

    Examples:
      | code |
      | 1515 |
      | 2023 |
      | 3333 |
