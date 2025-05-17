package stepDefination;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageObject.Loginpage1;

public class Stepdef {
	
	
	public WebDriver driver;
	public Loginpage1 loginPg;
	
	//for customers.feature
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginPg = new Loginpage1(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    }

	
	@When("user enter customer infor")
	public void user_enter_customer_infor() throws InterruptedException {
		driver.findElement(By.id("firstname")).sendKeys("Birader");
		Thread.sleep(2000);
		driver.findElement(By.id("lasttname")).sendKeys("Sangam");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Birader@gmail.com");
		WebElement drpdwn = driver.findElement(By.xpath("(//div[@class='control'])[4]"));
		drpdwn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='India (+91)']")).click();
		//Select sc = new Select(drpdwn);
		//sc.selectByValue("91");
		driver.findElement(By.id("Phno")).sendKeys("9034567892");
		Thread.sleep(2000);
		driver.findElement(By.id("Addl1")).sendKeys("kachiguda");
		Thread.sleep(2000);
		driver.findElement(By.id("Addl2")).sendKeys("chappalbazar");
		Thread.sleep(2000);
		driver.findElement(By.id("state")).sendKeys("Telangana");
		Thread.sleep(2000);
		driver.findElement(By.id("postalcode")).sendKeys("500027");
		WebElement drpdwn1 = driver.findElement(By.xpath("(//div[@class='control'])[10]"));
		drpdwn1.click();
		Thread.sleep(2000);
		//Select sc1 = new Select(drpdwn1);
		Thread.sleep(2000);
		//sc1.selectByVisibleText("India");
		driver.findElement(By.xpath("//option[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Date")).sendKeys("02-08-1993");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type ='checkbox']")).click();
		Thread.sleep(2000);
		}

	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@type ='submit']")).click();
		 Thread.sleep(2000);
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Given("user Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver-win64.exe");	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	loginPg = new Loginpage1(driver);
		
	   
	}

	@When("User open URl {string}")
	public void user_open_u_rl(String url) {
		driver.get(url);
	   
	}

	@When("User enter email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String emailAdd, String pwdAdd) {
		 loginPg.enterEmail(emailAdd);
		 loginPg.enterPassword(pwdAdd);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		 loginPg.clickOnLoginBuutton();
		 Thread.sleep(3000);
	   
	}
	
	@Then("page Title Should be {string}")
	public void page_title_should_be(String expectedTitle) throws InterruptedException {
	
		String actualTitle = driver.getTitle();
		Thread.sleep(3000);
		
		
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);//pass
}
		else {
			Assert.assertTrue(false);//fail
		} 
		}
		
	
	
	@When("User Click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		
		Thread.sleep(3000);
		 loginPg.clickOnLogoutBuutton();
	}
	

	

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	   driver.quit();
	}


}*/