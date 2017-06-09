@P1
Feature: Order cancelation
	As a user I want to cancel order in default city: confirm or decline


@P1
Scenario Outline: Place an order with all default inputs in Berlin and immediately cancel it
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
  And Fill correct Credit Card for <city> and save
	And Confirm Order
  And Close final splash
  And Close RAF Pop Up
  And Open Edit order and cancel it
  Then Order is canceled and I see New Order Screen
 
Examples:
    | city   |        
    | Berlin |  
  
