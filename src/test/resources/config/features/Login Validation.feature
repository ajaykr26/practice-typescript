Feature: Login Validation
  This is description of feature

  @Web
  Scenario: Web Automation
  This is description of web scenario
    Given url 'https://demoqa.com/utilities/weather/city'
    And path '/Hyderabad'
    And method GET
    Then status 200
    Then print response
