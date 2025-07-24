Feature: Add a book to user collection

  Scenario: User logs in and adds a book
    Given the user is logged into the Store
    When the user add Sauce Labs Backpack to the cart
    Then verify that the product is added