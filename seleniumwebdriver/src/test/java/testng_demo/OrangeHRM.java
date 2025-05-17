package testng_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
    @Test(priority=2)
    void log0() throws InterruptedException {
    	Thread.sleep(2000);
		boolean logo =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed.."+logo);
		
	}
    @Test(priority=3)
	void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
    @Test(dependsOnMethods ="login")
	void close() {
		driver.close();
	}
	
	
}