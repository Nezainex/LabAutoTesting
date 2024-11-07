Feature: Checking the response for city codes

  Scenario Outline: Verify the API response for a city
    When I check the API response for the city "<cityCode>"
    Then the response code should be 200 and the "city" field should not be empty

    Examples:
      | cityCode |
      | bajmak   |
      | moscow   |
      | london   |
