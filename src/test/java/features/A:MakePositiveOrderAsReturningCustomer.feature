Feature: Placing an order like a returning customer
	As a User I want to place an order as a returning customer - simple, with new address, with new payment method

@P1
Scenario Outline: NEW PAYMENT METHOD - Place an order with random User in <city> as a RC 
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
	And Close final splash
Then Order is placed and we continue test
	And Close RAF Pop Up
	And Add new PM via Menu
	And Select PayPal as a Payment method for RC
	And Use Test PayPal
	And Open Order Status
  And Open Order History
	And Open New Order screen
  And Pick non-default PU timeslot
	And Continue placing the order
	And Confirm order-agreed
Then Order is placed
	

Examples:
    | city    | 
    | Paris   |





@P1
Scenario Outline: NEW ADDRESS - Place an order with random User in <city> as RC 
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
	And Close final splash
Then Order is placed and we continue test
  And Close RAF Pop Up
	And Add New Office Address via Menu 
	And Pick another Address for new order
	And Continue placing the order
	And Confirm Order
Then Order is placed
	

Examples:
    | city    | 
    | London  |
          






@P1
Scenario Outline: SIMPLE Place an order with random User in <city> as a RC
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
	And Close final splash
Then Order is placed and we continue test
	And Close RAF Pop Up
  And Open Order History
	And Open New Order screen
	And Pick non-default PU timeslot
	And Continue placing the order
	And Confirm order-agreed
Then Order is placed
	

Examples:
    | city    | 
    | Berlin  |
    


    