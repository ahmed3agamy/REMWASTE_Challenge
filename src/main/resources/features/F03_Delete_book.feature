Feature: Delete a book from user collection

  Scenario: User deletes a book from their collection

    Given the user is logged in and has a product in his cart
    When the user navigates to cart
    And deletes the product
    Then the product should be removed from the cart
