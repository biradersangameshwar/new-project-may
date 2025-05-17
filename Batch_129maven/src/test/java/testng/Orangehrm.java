package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orangehrm {
	WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException {
		 driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(20000);
	}

	@Test(priority=1)
	void testLogo()
	{
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);	
}

	@Test(priority=2)
	void testappurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=3,dependsOnMethods = {"testappurl"})
	void testhomepagetitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void logout() {
		driver.close();
		
	}
	}
	
	