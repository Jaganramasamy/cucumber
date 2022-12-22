@tag
Feature: Facebook

  Background: launch
    Given signup is selected

  @smoke
  Scenario Outline: Facebook Signup
    Given first name is sent "Peter"
    And last name is sent "Parker"
    When mobile number is sent "<mobilenum>"
    And password is given "jagan6565"
    Then Date of birth is given
    And Gender is selected
    And signup is submited
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    Examples: 
      |mobilenum|
      |9841325999|
      |9841325989|
      |9712389262| 