Feature: Login Action testing
	Existing user should able to login into account using correct credentials
	
	
 Scenario: Login into the account with valid credentials
 		
	  	Given User navigated to cafetownsend website
	  	And User enters a valid username
	  	And User enters a valid Password
		When User clicks on login button
	 	And User should be taken to successful homePage
	 	And View employee details
	 	And Click on back button in user details page
	 	And Click on create cutomer button in home page
	 	And Enter user details for adding the user
	 	And Click on Add button
	 	And Select employee 
	 	And Click on edit button in home page
	 	And edit existing information
	 	And Click on update button
	 	And Select employee
	 	And Delete transaction
	 	And logout aplication


