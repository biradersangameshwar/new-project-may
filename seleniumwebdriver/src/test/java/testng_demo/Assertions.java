package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;

	
	@BeforeMethod
	void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void orangeHRMlogin() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	void speedwaylogin() {
		driver.get("https://speedwaytech.co.in/sample.html");
		driver.findElement(By.name("uname")).sendKeys("sai");
		driver.findElement(By.name("pwd")).sendKeys("sai@123");
		String actualtitle = "Welcome to SpeedwayTech";
		String expectedtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@AfterMethod
	void browserclose() {
		driver.close();
	}
	
		
	}
