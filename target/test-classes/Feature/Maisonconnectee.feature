#Author: fetenallagui
Feature: Xiaomi- maison connectee
  Scenario: Check menu on home page
    Given user is on maison connectée page
    When User click on product "Mi Door Window Sensor 2"
    Then user is directed to the product page that contains message "Mi Door Window Sensor 2"