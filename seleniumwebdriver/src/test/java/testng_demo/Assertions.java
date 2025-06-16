package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	private static ThreadLocal<WebDriver> driver1 = new ThreadLocal<WebDriver>();
	WebDriver driver;

	
	@BeforeMethod
	void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void orangeHRMlogin() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	void speedwaylogin() throws InterruptedException {
		driver.get("https://speedwaytech.co.in/sample.html");
		Thread.sleep(2000);
		driver.findElement(By.name("uname")).sendKeys("sai");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("sai@123");
		Thread.sleep(2000);
		String actualtitle = "Welcome to SpeedwayTech";
		String expectedtitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@AfterMethod
	void browserclose() {
		driver.close();
	}
	
		
	}
