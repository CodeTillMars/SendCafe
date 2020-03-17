Feature: Login Action testing
	Existing user should able to login into account using correct credentials
	
	
 Scenario: Login into the account with valid credentials
 		
	  	Given User navigated to cafetownsend website
	  	And User enters a valid username
	  	And User enters a valid Password
		And User clicks on login button
	 	And User should be taken to successful homePage
	 	And User clicked create button to add new user
	 	And User entered first name 
	 	And User entered last name
	 	And user_entered_date_&_email
	 	And Click on Add button
	 	And Select employee 
	 	And edit existing information
	 	And Click on update button
	 	And Select employee
	 	And Delete transaction
	 	And logout aplication


