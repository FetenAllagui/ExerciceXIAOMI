#Author: fetenallagui
Feature: Xiaomi home page

  Scenario: Check menu on home page
    Given user is on home page
    When User mouse hover on menu "Smart Home" and click on submenu title "Maison connectée"
    Then user is directed to the submenu page that contains message "Maison Connectée"
