@P1
Feature: Make Positive Order with payPal payment method
	I want to make positive order with Paypal payment method

@P1
Scenario Outline: Place an order will all default inputs in Berlin
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Select PayPal as a Payment method
	And Use Sandbox PayPal
	And Confirm Order
Then Order is placed

Examples:
    | city   | 
    | Berlin |  
#    | London | 
#    | Paris  |   
  
