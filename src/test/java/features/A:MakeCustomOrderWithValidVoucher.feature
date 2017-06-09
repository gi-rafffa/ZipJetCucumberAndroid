@P1
Feature: Make Custom Order with valid vouchers (fixed for Berlin, percentage for London and item-percentage for Paris)
	I want to make custom positive orders with custom values of PU/DO/comments/SC etc
	
@P1
Scenario Outline: Place an order with non-default SC, PU and DO
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address
	And Apply VALID <type> voucher <voucher> with value <value> valid for <customer> customer
	And Continue placing the order
	And Fill correct random user data and save
	And Save address details	
	And Fill correct Credit Card for <city> and save
	And Confirm Order
Then Order is placed

Examples:
    | city    |  voucher    | type						| value	| customer | city-code											|
    | Berlin  |  PERRPYZ		  | percentage            | 9.94 	| new 		 | gb_london, de_berlin, fr_paris |
#    | London  |  TOFILL     |percentage     |XDGBER
#    | Paris   |  TOFILL     |item-percentage|
#		| Paris   |  TOFILL     |summ-percentage|
