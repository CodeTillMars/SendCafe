<b>Cafetownsend Test Suit</b>
<br>
This is a full automation BDD testing framework to cover the main functionality testing for cafetownsend project using selenium and cucmber frameworks. The tesing framework was designed to meet the PageObjects desing pattern.
</br>


<b>Framework Structure:</b>
<br>
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
 

</br>

