package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import pageObjects.LoginPageLocators;
import utilities.BaseTest;
import utilities.ExtentTestManager;

public class Login extends BaseTest implements LoginPageLocators{

	
	@Given("^User navigated to cafetownsend website$")
	 public  void Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(readingValueFromPropertyFile("Host"));
		
		 }
	
	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Exception {
		driver.findElement(userName_TxtBox).sendKeys(readingValueFromPropertyFile("name"));
	    System.out.println("*******User entered the name*******");
	    
	}
	@Given("^User enters a valid Password$")
	public void user_enters_UserName_and_Password() throws Exception {
		driver.findElement(password_txtBox).sendKeys(readingValueFromPropertyFile("pwd"));
	    System.out.println("******User enetred password********");
	    
	}
	@Given("^User clicks on login button$")
	public Login user_clicks_on_login_button() throws Exception {
		driver.findElement(login_Btn).click();
		 System.out.println("*****User clicked submit button*****");
		 return this;
	}

	@Given("^User should be taken to successful homePage$")
	public void user_should_be_taken_to_successful_homePage() throws Exception {
		String text=driver.findElement(welcome_txtMsg).getText();
		assertEquals(text, "Hello Luke");
		System.out.println("**Case successfuly pass user navigated to Home page from login class**");
		ExtentTestManager.startTest("E2E Flow").log(LogStatus.PASS, "Case successfuly pass user navigated to Home page from login class");

	}
	
	
}