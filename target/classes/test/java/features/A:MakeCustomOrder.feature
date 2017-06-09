@P1
Feature: Make Custom Order	 
	I want to make different positive orders with custom values of PU/DO/comments/SC etc
	
@P1
Scenario Outline: Place an order with non-default SC, PU and DO
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
	And Pick non-default SC
	And Pick non-default PU timeslot
	And Pick non-default DO timeslot
	And Confirm all non-default order parametrs
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
Then Order is placed

Examples:
    | city    |  
    | Berlin  |  
    | London  | 
    | Paris   |
	
@P1
Scenario Outline: Place an order with default SC and non-defaullt PU and DO
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
	And Pick default SC
	And Pick non-default PU timeslot
	And Pick non-default DO timeslot
	And Confirm all non-default order parametrs
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
Then Order is placed

Examples:
    | city    |  
    | Berlin  |  
    | London  | 
    | Paris   |




