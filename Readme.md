# cafetownsend Test suite
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
|     ├── DeleteExistingUserLocators.java
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


## Execution steps:
```bash

Execution steps:
git clone https://github.com/CodeTillMars/SendCafe.git
```

## Latest execution report:
```bash
⇒  nosetests-3.4 -vs --rednose testcases --tc-file config.ini --logging-level WARNING

CASE-001 Given User navigated to cafetownsend website
CASE-002 User enters a valid username ... passed
CASE-003 And User enters a valid Password ... passed
CASE-003 And User clicks on login button
CASE-004 And User should be taken to successful homePage ... passed
CASE-005 And User clicked create button to add new user ... passed
CASE-006 And User entered first name ... passed 
CASE-007 And User entered last name ... passed
CASE-008 And user_entered_date_&_email ... passed
CASE-009 And Click on Add button ... passed
CASE-010 And Select employee ... passed
CASE-011 And edit existing information ... passed
CASE-012 And Click on update button ... passed
CASE-013 And Select employee ... passed
CASE-014 And Delete transaction ... passed
CASE-025 And logout aplication ... passed

======================================================================
1 Scenarios (1 passed)
16 Steps (16 passed)
0m25.773s

```


**Command to execute this test case**
```bash
cd cafeTownsendTesting
export PYTHONPATh='./'
nosetests-3.4 -sv --logging-level=WARNING --rednose --tc-file=config.ini testcases/test_c_edit_delete_employees.py:UpdateEmployeesTestCases.test004_delete_user_from_main_page
```

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
