package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov1 {
	
	@Test(dataProvider = "logindata")
	public void login(String usernam,String passwrd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(usernam);
		driver.findElement(By.id("input-password")).sendKeys(passwrd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		}
	
	@DataProvider(parallel=false)
		public Object[][] logindata(){
			Object[][] getdata = new Object[3][2];
			
			getdata[0][0]="speedwaytech74@gmail.com";
			getdata[0][1]="speedway@123";
			
			getdata[1][0]="speedwaytec74@gmail.com";
			getdata[1][1]="Speedway@123";
			
			getdata[2][0]="speedwaytech74@gmail.com";
			getdata[2][1]="peedway@123";
			return getdata;
			
		}
	}


