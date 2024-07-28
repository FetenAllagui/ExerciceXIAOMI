#Author: fetenallagui
Feature: Xiaomi Panier
 Scenario: Add product to the cart and check the cart
    Given user is on the product page 
    When User click on add to cart
    And User click on view your cart
    Then user is directed to the cart list that contains message "Mi Door Window Sensor 2"