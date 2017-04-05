#Author: your.email@your.domain.com
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
@tag
Feature: Sasha going to automate like God
	I want to use this template for my feature file

@tag1
Scenario Outline: 1
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
And I open Pricelist
Then Pricelist is displayed


Examples:
    | city  |
    | Berlin |  
    | name2 |  

