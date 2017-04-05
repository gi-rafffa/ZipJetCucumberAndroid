Feature: Make Positive Order in default city - regression check
	I want to make main positive orders like a new customer in all available cities - with all valid data and straightforward flow.


Scenario Outline: Place an order will all default inputs in Berlin
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address <streetaddress>
	And Pick default timeslots and service-class
	And Fill correct default <firstname> <lastname> <phone> <email> and save
	And Save address details
	And Fill correct default CC Visa <paymentdata> and save
	And Confirm Order
	
Then Order is placed

Examples:
    | city   |  streetaddress                           | firstname   | lastname   | phone     | email                 | paymentdata           |
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | jMax         | Berlinushher | 4489497341 | ss88kr9rr@gmail.com  |41111111111111110818737|
