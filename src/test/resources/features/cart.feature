Feature: Cart Testing

  Scenario: Adding a product to the cart and comparing the total amount
    Given I remember the price of the product "Glucose (in blood) (Glucose)"
    When I add the product "Glucose (in blood) (Glucose)" to the cart
    And I open the cart
    Then I compare the total amount in the cart with the remembered price
    And I clear the cart
