# Login feature review the behavior in thie feature
Feature: Login

  Scenario: POSTMAN - GET
    Given Request is configured
    When GET "/headers" is executed
    Then response status should be 200

  Scenario: POSTMAN: POST
    Given Request is configured
    When POST "/post" with body "diplomado testing" is executed
    Then response status should be 200
    And 'responde.data' should be "diplomado testing"
