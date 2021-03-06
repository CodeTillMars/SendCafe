package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseTest {
	
	
	private Properties prop;
	/*log4j implementation*/
	public static final Logger log = Logger.getLogger(BaseTest.class.getName());
	/*Extent report variable*/
	public static ExtentReports extent;
	public static ExtentTest test;
	/*initiate Driver*/
	public static WebDriver driver;
	
	
	
	public String readingValueFromPropertyFile(String variableName) throws IOException {
		prop=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\env.properties");
		prop.load(file);
		String value = prop.getProperty(variableName);		
		return value;	
}
	
	
	

}
	
	
	
