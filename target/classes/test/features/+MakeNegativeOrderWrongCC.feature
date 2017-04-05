Feature: Try to place an order with wrong CC data
	As a User I want to attempt to place an order with wrong CC cards (different errors or non full data)


@P2
Scenario Outline: Place an order with random User in <city> with wrong CC card per city 
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill incorrect Credit Card for <city> and save
	And Confirm Order
Then I redirected to the Payment screen

Examples:
    | city    | 
    | Berlin  |
    | London  |
    | Paris   |
