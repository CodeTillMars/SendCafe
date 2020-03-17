package stepDefinition;

import org.openqa.selenium.Alert;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import pageObjects.DeleteExistingUserLocators;
import utilities.BaseTest;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

public class DeleteUser extends BaseTest implements DeleteExistingUserLocators {
	

@Given("^Delete transaction$")
public void delete_transaction() throws Exception {
	driver.findElement(delete_btn).click();
	try {
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		alert.accept();		
	}
	catch(Exception exception) {
		exception.printStackTrace();
	}
	
	
	System.out.println("Delete Done");
	
	
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("^logout aplication$")
public void logout_aplication() throws Exception {
	driver.findElement(logout_btn).click();
	driver.quit();
	ExtentTestManager.getTest().log(LogStatus.PASS, "User deleted successfull/Pass");
	ExtentManager.getInstance().flush();

    // Write code here that turns the phrase above into concrete actions
    
}
	
	
}
