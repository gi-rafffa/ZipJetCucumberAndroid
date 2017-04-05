@P2
Feature: Make Positive Order using different payment methods - CC (Visa, Master Card, American Express)
	I want to make main positive orders like a new customer in all available cities - with all valid data and straightforward flow.

@P2
Scenario Outline: Place an order in Berlin with correct Visa
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
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | Max         | Berlinuser | 11122288211141331 | max.berjeliingnnn@gmail.com  |41111111111111110818737|
  
@P2
Scenario Outline: Place an order in Berlin with correct Master Card
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
    | London |  346 Fulham Rd, Chelsea, London SW10, UK | John        | Londonuser | 444885557666 | jodhn.lon99don@gmail.com |555544244333311110818737|

  
@P2
Scenario Outline: Place an order in Paris with correct American Express
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
    | Paris  |  149 Rue de Rivoli, 75001 Paris, France  | ClaudeParis | Parisuser  | 777888882999 | claudde.paris@gmkail.com|370000000000002737308/2018|
  
