package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By Txt_username = By.id("user-name");
	By Txt_password = By.id("password");
	By Login_Boutton= By.id("login-button");
	By Lbl_Login = By.xpath("//div[@class='app_logo']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void entrer_username(String username) {
		
		driver.findElement(Txt_username).sendKeys(username);
		
	}
	public void entrer_password(String password) {
		driver.findElement(Txt_password).sendKeys(password);
	}
	public void login_boutton() {
		driver.findElement(Login_Boutton).click();
	}
	public void lbl_display() {
		driver.findElement(Lbl_Login).isDisplayed();
	}
}
