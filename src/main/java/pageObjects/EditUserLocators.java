package pageObjects;

import org.openqa.selenium.By;

public interface EditUserLocators {
	
	By edit_Btn=By.xpath(".//*[@id='bEdit']");
	By Firstanme=By.xpath("html/body/div[1]/div/div/form/fieldset/label[1]/input");
	By lastName=By.xpath("html/body/div[1]/div/div/form/fieldset/label[2]/input");
	By startDate=By.xpath("html/body/div[1]/div/div/form/fieldset/label[3]/input");
	By email=By.xpath("//input[@type='email']");
	By update_btn=By.xpath("//*[text()='Update']");
	By userList=By.xpath(".//*[@id='employee-list']/li");
	
	
	
	

}
