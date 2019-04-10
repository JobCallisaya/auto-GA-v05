# Login feature review the behavior in thie feature
Feature: Accidentes

  Background: SCA page is loaded
    Given SCA page is loaded

  Scenario: Crear accidentes
    Given click 'Accidentes' button in 'SideMenu'
    Then fill 'Crear Accidente' fields in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form

  Scenario: Editar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    Then click 'EditarAccidente' button in 'Accident' form
    And fill 'Editar Accidente' fields in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form

  Scenario: Borrar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    Then click 'BorrarAccidente' button in 'Accident' form


