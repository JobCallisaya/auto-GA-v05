# Login feature review the behavior in thie feature
Feature: Accidentes

  Background: SCA page is loaded
    Given SCA page is loaded

  Scenario: Crear accidentes
    Given click 'Accidentes' button in 'SideMenu'
    And fill 'Crear Accidente' fields in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form
    Then verify 'created accident' has been saved in 'Accidents' table

  Scenario: Editar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    Then click 'EditarAccidente' button in 'Accident' form
    And fill 'Editar Accidente' fields in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form
    Then verify 'edited accident' has been saved in 'Accidents' table

  Scenario: Borrar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    And click 'BorrarAccidente' button in 'Accident' form
    Then verify 'accident' has been deleted in 'Accidents' table


