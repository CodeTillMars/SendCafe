package pageObjects;

import org.openqa.selenium.By;


public interface LoginPageLocators {
	
	By userName_TxtBox = By.xpath(".//*[@id='login-form']/fieldset/label[1]/input");
	By password_txtBox = By.xpath(".//*[@id='login-form']/fieldset/label[2]/input");
	By login_Btn = By.xpath(".//*[@id='login-form']/fieldset/button");
	By welcome_txtMsg = By.xpath(".//*[@id='greetings']");
	By logout_Btn= By.xpath(".//*[@ng-click='logout()']");
}
