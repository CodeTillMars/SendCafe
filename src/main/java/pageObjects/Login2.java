package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseTest;

public class Login2 extends BaseTest implements LoginPageLocators{

		
//	@And("^User should be taken to successful homePage$")
//	public void user_should_be_taken_to_successful_homePage() throws Exception {
//		String text=driver.findElement(welcome_txtMsg).getText();
//		assertEquals(text, "Hello Luke");
//		System.out.println("Case successfuly pass user navigated to Home page from login class ");
//	}
	
}
