@P1
Feature: Order rescheduling
	As a user I want to reschedule order in default city: different cases
  
Scenario Outline: Place an order will all default inputs in London and immediately reschedule DO to the next day
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
  And Close final splash
  And Close RAF Pop Up
  And Open Edit order and reschedule it to the next day 
  Then Order is rescheduled 
  
Examples:
    | city    |  
    | Berlin  | 
#    | London  | 
#    | Paris   | 
    
    
