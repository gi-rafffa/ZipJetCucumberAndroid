@P1
Feature: Order cancelation
	As a user I want to cancel order in default city: confirm or decline


@P1
Scenario Outline: Place an order with all default inputs in Berlin and immediately cancel it
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address <streetaddress>
	And Pick default timeslots and service-class
	And Fill correct default <firstname> <lastname> <phone> <email> and save
	And Save address details
	And Fill correct default CC Visa <paymentdata> and save
	And Confirm Order
  And Close final splash
  And Close RAF Pop Up
  And Open Edit order and cancel it
  Then Order is canceled and I see New Order Screen
 
Examples:
    | city   |  streetaddress                           | firstname   | lastname   | phone     | email                 | paymentdata           |
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | Max         | Berlinuser | 366467641236231 | m2n498fhn@gmail.com  |41111111111111110818737|
  
