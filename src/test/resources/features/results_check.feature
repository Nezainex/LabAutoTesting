Feature: Results page validation

  Scenario: Verify the header of the results page
    When I navigate to the "Results" page
    Then the page header should be "Введите индивидуальный номер заказа, чтобы посмотреть результаты анализов"

  Scenario: Verify validation for empty fields
    When I navigate to the "Results" page
    And I click the "Find Results" button
    Then the "Код ИНЗ" field should be highlighted
    And the "Дата рождения" field should be highlighted
    And the "Фамилия" field should be highlighted
    And I should see the message "Поля Код ИНЗДата рожденияФамилия обязательны для заполнения"

  Scenario: Verify filled fields
    When I navigate to the "Results" page
    And I enter order details "231231231" "11.12.2000" "тест"
    And I click the "Find Results" button
    Then I verify that the fields are filled correctly
