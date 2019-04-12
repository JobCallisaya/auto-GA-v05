# Login feature review the behavior in thie feature
Feature: Accidentes

  Background: SCA page is loaded
    Given SCA page is loaded

  Scenario Outline: Crear accidentes
    Given click 'Accidentes' button in 'SideMenu'
    And fill "<Nombre>" in Nombre field in 'Accident' form
    And fill "<Descripcion>" in Descripcion field in 'Accident' form
    And fill "<Tipo>" in Tipo field in 'Accident' form
    And fill "<Severidad>" in Severidad field in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form
    Then verify 'created accident' has been saved in 'Accidents' table

    Examples:
      | Nombre     | Descripcion  | Tipo          | Severidad |
      | Accidente1 | Descripcion1 | MedioAmbiente | Alta      |

  Scenario Outline: Editar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    Then click 'EditarAccidente' button in 'Accident' form
    And fill "<Nombre>" in Nombre field in 'Accident' form
    And fill "<Descripcion>" in Descripcion field in 'Accident' form
    And fill "<Tipo>" in Tipo field in 'Accident' form
    And fill "<Severidad>" in Severidad field in 'Accident' form
    And click 'GuardarAccidente' button in 'Accident' form
    Then verify 'edited accident' has been saved in 'Accidents' table

    Examples:
      | Nombre               | Descripcion            | Tipo                | Severidad |
      | AccidenteModificado1 | DescripcionModificada1 | AccidenteDePersonal | Baja      |

  Scenario: Borrar accidentes
    Given click 'Accidentes' button in 'SideMenu'
    And click 'BorrarAccidente' button in 'Accident' form
    Then verify 'accident' has been deleted in 'Accidents' table


