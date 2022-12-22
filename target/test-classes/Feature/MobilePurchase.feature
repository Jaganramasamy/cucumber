
@tag
Feature: Feature.Purchase

  @tag1
  Scenario: Mobile
    Given User logs in 
    When searches redmi mobile
    And Click on Mobile
    And Clicks Buy now
    Then Usen proceed for payment
    
   

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
