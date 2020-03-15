package pageObjects;

import static org.testng.Assert.assertEquals;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import utilities.BaseTest;
import utilities.ExtentTestManager;

public class Login2 extends BaseTest implements LoginPageLocators{

		
	@And("^User should be taken to successful homePage$")
	public void user_should_be_taken_to_successful_homePage() throws Exception {
		String text=driver.findElement(welcome_txtMsg).getText();
		assertEquals(text, "Hello Luke");
		System.out.println("Case successfuly pass user navigated to Home page from login class ");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Case successfuly pass user navigated to Home page from login class ");
	}
}
