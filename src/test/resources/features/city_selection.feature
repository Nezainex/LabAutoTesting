Feature: Change city to Omsk

  Scenario: User selects Omsk city on the medical services page
    Given The page "https://www.invitro.ru/moscow/radiology/" is open
    When The user opens the city selection menu
    And The user selects the option "Select another" to change the city
    And The user selects the letter "O" to display cities starting with "O"
    And The user selects the city "Omsk" from the list
    Then The city "Omsk" is displayed as the currently selected city on the website
