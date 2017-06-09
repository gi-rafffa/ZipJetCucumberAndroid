@P1
Feature: Make Negative Order in non-served area
	I want to try to make negative orders - in non-served areas, with already used email/phone etc
	
@P1
Scenario Outline: Try to place an order in non-served area in Berlin and leave email
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> non-served address <streetaddress>
Then I see non-served page
When I input my email and confirm
Then Non-served screen is displayed

Examples:
    | city   |  streetaddress                           | 
    | Berlin |  Ersteiner Straße 13, 14169, Berlin      | 	
    



	
  
