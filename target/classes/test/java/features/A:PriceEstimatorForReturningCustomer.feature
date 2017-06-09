Feature: Use Price estimator like RC 
	I want to use Price Estimator for search and configuring the basket

@P1
Scenario Outline: Find a default item (shirt)
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
	And Close final splash
	And Close RAF Pop Up
Then Order is placed and we continue test
When I open Price Estimator
	And Search for a Shirt
Then I see Shirt in the search results   

Examples:
    | city    | 
    | Berlin  |
  #  | London  |
  #  | Paris   |



@P2
Scenario Outline: Find a non-existent item - no search results
Given ZipJet, Simulator and Appium are running successfully, notifications are allowed
When I got started and use <city> default address 
	And Pick default timeslots and service-class
	And Fill correct random user data and save
	And Save address details
	And Fill correct Credit Card for <city> and save
	And Confirm Order
	And Close final splash
	And Close RAF Pop Up
Then Order is placed and we continue test
When I open Price Estimator
	And Search for a Foo
Then I see no items in the search results   


Examples:
    | city    | 
    | Berlin  |




  
