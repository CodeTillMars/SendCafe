# Cafetownsend Test Suite
This is a full automation BDD testing framework to cover the main functionality testing for cafetownsend project using **selenium** and **cucumber** frameworks. The tesing framework was designed to meet the **PageObjects** desing pattern.

## Framework Structure:
```
.
├── Test-output
├── driver
├── CucumberFrameWork.iml
├── env.properties
├── pom.xml
├── main
│   ├── pageObject
│     ├── CreatePageLocators.java
│     ├── CommonMethods.java
|     ├── ExtentManager.java
│     └── LoginPageLocators.java
|
|   ├── utilities
│     ├── BaseTest.java
│     ├── CommonMethods.java
│     └── ExtentTestManager.java
└── test
|   ├── cucumberTest
│     ├── TestRunner.java
|
|   ├── featureFiles
│     ├── Login.feature
|
|   ├── stepDefinition
│     ├── CreateUser.java
│     ├── DeleteUser.java
|     ├── EditExistingUser.java
│     └── Login.java
 

```

## Pre-requestes:
Pre-requestes:
Cucumber, Junit, JAVA
chromedriver (tested with ChromeDriver 81.0.4044.20 )


## Execution Steps:
```bash

Execution steps: Clone the project to local machine
git clone https://github.com/CodeTillMars/SendCafe.git


```
## Run Path Image
![](https://github.com/CodeTillMars/SendCafe/blob/master/Run%20image.png)


## Latest Execution Report:
```bash
Feature: Login Action testing
	User must be able to Create user, edit user. delete user after successfuly login into account using correct credentials

  Scenario: Login into the account with valid credentials # C:/Users/pc/Desktop/CucumberFrameWork/src/test/java/featureFiles/Login.feature:5

CASE-001 Given User navigated to cafetownsend website
CASE-002 User enters a valid username ... passed
CASE-003 And User enters a valid Password ... passed
CASE-004 And User clicks on login button
CASE-005 And User should be taken to successful homePage ... passed
CASE-006 And User clicked create button to add new user ... passed
CASE-007 And User entered first name ... passed 
CASE-008 And User entered last name ... passed
CASE-009 And user_entered_date_&_email ... passed
CASE-010 And Click on Add button ... passed
CASE-011 And Select employee ... passed
CASE-012 And edit existing information ... passed
CASE-013 And Click on update button ... passed
CASE-014 And Select employee ... passed
CASE-015 And Delete transaction ... passed
CASE-016 And logout aplication ... passed

======================================================================
1 Scenarios (1 passed)
16 Steps (16 passed)
0m25.773s

```


## Test Execution Report 
![](https://github.com/CodeTillMars/SendCafe/blob/master/runReport.PNG)


## Test Cases:
This test suite support HTML report using extent report.

here is the list of the test cases:

```
        """ CAFEE-001

        * Test login with provider credential.
        **Test Scenario:**
        #. Get login page
        #. Enter the correct username and password
        #. Press on "Login" button
        #. Check that login is done, Should succeed.
        """
    

        """ CAFEE-002

        * Crete new user with valid data.
        **Test Scenario:**
        #. Login to the system
        #. Create a user with valid data, should succeed.
        """


        """ CAFEE-003

        * Edit user with valid data.
        **Test Scenario:**
        #. Login to the system
        #. Create a user with valid data, should succeed.
        #. Edit user with valid data, should succeed.
        """


        """ CAFEE-004

        * Delete user from the edit page.
        **Test Scenario:**
        #. Search User name and double click
        #. Go to the edit page.
        #. Delete user, should succeed.
        """
		
		
		""" CAFEE-005

        * Logout from website.
        **Test Scenario:**
        #. Hit logout button 
        #. Close the browser
        """
```
