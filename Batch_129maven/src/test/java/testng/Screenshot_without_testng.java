package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot_without_testng {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		}
      @Test
      public void scrnshotforlogin(String filename) throws InterruptedException, IOException
      {
    	  
    	  File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  Files.copy(screenshot1, new File("screenshots/"+filename+".png"));
    	  Thread.sleep(2000);
    	  
    	  }
      @Test
      public void Loginscrnshot() throws InterruptedException, IOException {
    	  driver.get("https://www.saucedemo.com/");
    	  Thread.sleep(2000);
    	  driver.manage().window().fullscreen();
    	  Thread.sleep(2000);
    	  scrnshotforlogin("loginpage");
    	  driver.findElement(By.id("user-name")).sendKeys("sangam");
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("password")).sendKeys("sai123");
    	  Thread.sleep(2000);
    	  driver.findElement(By.name("login-button")).click();
    	  scrnshotforlogin("wrongcredentials");
    	  Thread.sleep(2000);
    	
      }
      @AfterClass
      public void tearDown() {
    	  driver.quit();
    	  
      }
}
