/*package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepsDefinition {

 WebDriver driver;
 LoginPage login;

@Given("user is login page")
public void user_is_login_page() {
   driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://www.saucedemo.com/v1/index.html");
}

@When("user enter {string} and {string}")
public void user_enter_and(String username, String password) {
 //  Driver.findElement(By.id("user-name")).sendKeys(username);
   //Driver.findElement(By.id("password")).sendKeys(password);
	login = new  LoginPage(driver);
	login.entrer_username(username);
	login.entrer_password(password);
	
}

@And("click on login button")
public void click_on_login_button() {
  //  driver.findElement(By.id("login-button")).click();
	login.login_boutton();
}

@Then("user is navigated to Home page")
public void user_is_navigated_to_home_page() {
//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "user is navigated to Home page");
login.lbl_display();
}

@And("close the browser")
public void close_the_browser() {
 driver.quit();
}
}*/
