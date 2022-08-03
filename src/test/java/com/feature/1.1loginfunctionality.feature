Feature: Hotel Booking with Adakin Functionality


Scenario: Checking the login functionality
Given User enters the username in username  field
When User enters the password in password  field
And user clicks th login button and navigate to the adackin searching page


Scenario: Search hotel Functionality
When user selects the location from the dropdown
And user selects the hotel from the dropdown
And user selects the Room Type from the dropdown
And user selects the hotel from the dropdown
And user selects the Number of Rooms from the dropdown
And user selects the Check In Date from the Check In field
And user selects the Check Out Date from the Check out Field
And user selects the Adults per Room from the dropdown
And user selects the Children per Room from the dropdown
And user clicks th login button and navigate to the Booked Itinerary

Scenario: Book A hotel Functionality
When User enters the first name in first name field
And User enters the last name in last name field
And User enters the Billing Address in Billing Address Field
And	 User enters the Billing Address in Billing Address Field