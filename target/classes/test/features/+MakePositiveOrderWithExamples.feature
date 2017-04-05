@P1
Feature: Make Positive Order
	I want to make main positive orders like a new customer in all available cities - with all valid data and straightforward flow.

@P1
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
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | Max         | Berlinuser | 111222551111331 | max.berltiinnnn@gmail.com  |41111111111111110818737|
  
@P1
Scenario Outline: Place an order will all default inputs in London
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
    | London |  346 Fulham Rd, Chelsea, London SW10, UK | John        | Londonuser | 4446555666 | johfn.london@gmail.com |41111111111111110818737|

  
@P1
Scenario Outline: Place an order will all default inputs in Paris
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
    | Paris  |  149 Rue de Rivoli, 75001 Paris, France  | ClaudeParis | Parisuser  | 7778838999 | claude.pafris@gmail.com|41111111111111110818737|
  
