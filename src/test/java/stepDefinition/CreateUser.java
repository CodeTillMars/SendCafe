package stepDefinition;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import pageObjects.CreatePageLocators;
import utilities.BaseTest;
import utilities.ExtentTestManager;

public class CreateUser extends BaseTest implements CreatePageLocators{


		@Given("^User clicked create button to add new user$")
		public void user_clicked_create_button_to_add_new_user() throws Exception {
		  driver.findElement(create_Btn).click();
		  System.out.println("*****Create button cliekd , user moved to create new user page*****");
		   
		}
		
		@Given("^User entered first name$")
		public void user_entered_first_name() throws Exception {
		    driver.findElement(Firstanme).sendKeys(readingValueFromPropertyFile("FirstName"));
		   
		}
		
		@Given("^User entered last name$")
		public void user_entered_last_name() throws Exception {
		    driver.findElement(lastName).sendKeys(readingValueFromPropertyFile("LastName"));
		    
		}
		
		@Given("^user_entered_date_&_email$")
		public void user_entered_date___email() throws Exception {
			 driver.findElement(email).sendKeys(readingValueFromPropertyFile("Email"));
			 driver.findElement(startDate).sendKeys(readingValueFromPropertyFile("Date"));
		    
		}
		
		@Given("^Click on Add button$")
		public void click_on_Add_button() throws Exception {
			 driver.findElement(add).click();		
			if ( driver.findElement(create_Btn).isEnabled()) {
				System.out.println("User cretes successfull/Pass");
				ExtentTestManager.getTest().log(LogStatus.PASS, "User cretes successfull/Pass");
			}
			 System.out.println("******user added successfully***********");
		}
	
	
	
}
