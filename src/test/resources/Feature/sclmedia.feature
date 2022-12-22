
@tag
Feature: Instagram
Background: launch
Given launch instagram
Then signup instagram
  @tag1
  #Scenario: Validate Instagram
   #Given pass the details
   #And signup complete
   
   Scenario Outline: sign up
   Given pass the details "<mobilenum>"
   And signup complete
   
   Examples:
   |mobilenum|
   |1234567809|
   |9841355222|
   |9841325999|

  