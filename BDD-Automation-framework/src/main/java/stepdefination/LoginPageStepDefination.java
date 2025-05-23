package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefination {
	WebDriver driver;
	
	/*@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\C&G drivers\\chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		*/
		 
		 @Given("^user should be on login page$")
		 public void user_should_be_on_login_page()  {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\C&G drivers\\chrome\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
		     
		 }

		 @When("^user will enter username$")
		 public void user_will_enter_username() {
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			 
		 }

		 @When("^user will enter password$")
		 public void user_will_enter_password() {
			 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     
		 }

		 @And("^user will click on login button$")
		 public void user_will_click_on_login_button() {
			 driver.findElement(By.id("btnLogin")).click();
		     
		 }

		  
			 
		     
		 

	}


