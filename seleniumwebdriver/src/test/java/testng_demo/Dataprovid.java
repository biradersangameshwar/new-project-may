package testng_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovid {
	
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		}
	@Test(dataProvider = "logindata")
	public void TestLogin(String username,String passwrd) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(passwrd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	}
	
	//@AfterMethod 
		public void close() throws InterruptedException {
			Thread.sleep(2000);
		driver.close();
		
	}
	
	@DataProvider(parallel=false)
	public  Object[][] logindata(){
		Object[][] getdata = new Object[3][2];
		
		getdata[0][0]="speedwaytech47@gmail.com";
		getdata[0][1]="speedway@12";
		
		getdata[1][0]="speedwaytech4@gmail.com";
		getdata[1][1]="speedway@123";
		
		getdata[2][0]="speedwaytech74@gmail.com";
		getdata[2][1]="speedway@123";
		
		
		
		return getdata;
			}
	
	

}
