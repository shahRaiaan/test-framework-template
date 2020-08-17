#Author: raiaan 
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@DemoFeature1
Feature: Demo feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given _1df1 I want to write a step with precondition
    And _1df1 some other precondition
    When _1df1 I complete action
    And _1df1 some other action
    And _1df1 yet another action
    Then _1df1 I validate the outcomes
    And _1df1 check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given _2df1 I want to write a step with <name>
    When _2df1 I check for the <value> in step
    Then _2df1 I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
