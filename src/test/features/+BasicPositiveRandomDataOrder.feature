Feature: Make Positive Order in all cities with random user data 
	I want to make main positive orders like a new customer in all available cities - with all random data and straightforward flow.


@P1
Scenario Outline: Place an order with random User in <city> with default CC card per city 
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
Then Order is placed

Examples:
    | city    | 
    | Berlin  |
#    | London  |
#    | Paris   |
