package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement Txt_username;
	
	@FindBy(id="password")
	WebElement Txt_password;
	
	@FindBy(id="login-button")
	WebElement Login_Boutton;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement Lbl_Login;
	
	public void enter_username(String username) {
		
		Txt_username.sendKeys(username);
	}
	public void enter_password(String password) {
		Txt_password.sendKeys(password);
	}
	
	public void click_ogin_boutton() {
		Login_Boutton.click();
	}
	public void Lbl_Login_isDisplay() {
		Lbl_Login.isDisplayed();
	}
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
