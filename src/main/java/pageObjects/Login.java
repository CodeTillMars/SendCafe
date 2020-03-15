package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilities.BaseTest;

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
		driver.findElement(userName_TxtBox).sendKeys("Luke");
	    System.out.println("print i am method 2");
	    
	}
	@Given("^User enters a valid Password$")
	public void user_enters_UserName_and_Password() throws Exception {
		driver.findElement(password_txtBox).sendKeys("Skywalker");
	    System.out.println("User enetred password ");
	    
	}
	@When("^User clicks on login button$")
	public Login user_clicks_on_login_button() throws Exception {
		driver.findElement(login_Btn).click();
		 System.out.println("User clicked submit button ");
		 return this;
	}

	/*@And("^User should be taken to successful homePage$")
	public void user_should_be_taken_to_successful_homePage() throws Exception {
		String text=driver.findElement(welcome_txtMsg).getText();
		assertEquals(text, "Hello Luke");
		System.out.println("Case successfuly pass user navigated to Home page from login class ");
	}*/
	
/*	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Exception {
		driver.findElement(By.xpath(".//*[@class='main-button']")).getText();
	    
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Exception {
	    if (driver.findElement(By.xpath(".//*[@id='greetings']")) ==null) {
			System.out.println("Case is pass sucssfull");
		}else {
			System.out.println("Case is fail");
		}*/
		
	
	
}
