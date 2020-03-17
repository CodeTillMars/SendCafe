package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseTest {
	
	public static List<WebElement> getTableListElements (WebElement webElement, WebDriver driver){
		List<WebElement> ListOfElements=null;
		try{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<10; i++)
		{
		 js.executeScript("scrollBy(0, 2500)");
		}
		ListOfElements=webElement.findElements(By.tagName("li"));
		System.out.println(ListOfElements);
		
		}
		catch(Exception e){
			String[] e1=e.getMessage().split("}");
				
			
		}
		return ListOfElements;
		
	}
 
	
	
}
