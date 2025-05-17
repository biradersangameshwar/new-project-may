package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Qafox {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void steup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	@Test(priority =1)
	public void openapp() {
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		driver.findElement(By.name("email")).sendKeys("birader.sangameshwar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sangam");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
		
	
	@Test(priority=2)
	public void verititle() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Account",title);
		
	}

	@Test(priority=3, dependsOnMethods={"verititle"})
		public void close() {
		driver.close();
	}
	

}
