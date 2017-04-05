@P1
Feature: Make Negative Order in non-served area
	I want to try to make negative orders - with already used email/phone etc
  
@P1
Scenario Outline: Try to place an order with already existed users data in Berlin
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address <streetaddress>
	And Pick default timeslots and service-class
	And Fill already existed <firstname> <lastname> <email> <phone> and save
Then I see button Login
When I press Login
Then I redirected to the start screen

Examples:
    | city   |  streetaddress                           | firstname   | lastname   | phone     | email                | 
    | Berlin |  Prenzlauer Allee 49, 10405, Berlin      | Anna         | Pedakhovskaya |113733  | 113733@example.com  |
    
