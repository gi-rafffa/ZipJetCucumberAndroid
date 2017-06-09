Feature: Make Positive Order in default city - regression check
	I want to make main positive orders like a new customer in all available cities - with all valid data and straightforward flow.


Scenario Outline: Place an order will all default inputs in Berlin
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address <streetaddress>
	And Pick default timeslots and service-class
	And Fill correct default <firstname> <lastname> <phone> <email> and save
	And Save address details
	And Fill correct CC Visa <number> <date> <CVC> and save
	And Confirm Order
	
Then Order is placed

Examples:
    | city   |  streetaddress                           | firstname   | lastname   | phone     | email                 | number           |date|CVC|
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | jax         | Berlishher | 448989497341 | ss88krk9rr@gmail.com  |4111111111111111|08/18|737|



