# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Adidas page is
    Given 'Adidas' page is loaded
    And hover on "hombre" link in header
    And click on 'Futbol' link sub menu
    And get price from "Calzado de Fútbol X 18.3 TF" shoes
    And click on "Calzado de Fútbol X 18.3 TF" link
    And click on "Elige tu talla" dropdown
    And select on "MX 9.5" dropdown item
    And click on "Añadir al carrito" button
    Then verify that quantity is "1"
    And click on 'Ver carrito' button
    And verify "Calzado de Fútbol X 18.3 TF" title is displayed
    And verify price should be "$1,329.00"
    And verify total should be "$1,428.00"

