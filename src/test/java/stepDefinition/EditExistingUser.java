package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.EditUserLocators;
import utilities.BaseTest;
import utilities.ExtentTestManager;

public class EditExistingUser extends BaseTest implements EditUserLocators {

	
	@And("^Select employee$")
	public void select_employee() throws Exception {
		int rowCount = driver.findElements(userList).size();
		for(int i=1; i<=rowCount; i++){
			String id = "/li["+i+"]";
			String name = driver.findElement(By.xpath("//*[@id='employee-list']"+id)).getText();
			if(name.contains(readingValueFromPropertyFile("FirstName"))&&name.contains(readingValueFromPropertyFile("LastName"))){
				WebElement element = driver.findElement(By.xpath("//*[@id='employee-list']"+id));
				/*JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);*/
				Actions actions = new Actions(driver);
				actions.doubleClick(element).perform();
				Thread.sleep(1000);
				break;
			}
		}

	}



	@Given("^edit existing information$")
	public void edit_existing_information() throws Exception {
	   driver.findElement(email).clear();
	   driver.findElement(email).sendKeys(readingValueFromPropertyFile("EditEmail"));
	  
	}

	@Given("^Click on update button$")
	public void click_on_update_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(update_btn).click();
		System.out.println("Update done");
		ExtentTestManager.getTest().log(LogStatus.PASS, "User updated successfull/Pass");

	   
	}
	


	
}
