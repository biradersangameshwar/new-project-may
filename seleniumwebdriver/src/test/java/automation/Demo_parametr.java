package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_parametr {
  @Test(dataProvider = "logintestdata")
  public void testlogin(String userName,String password ) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://online.actitime.com/speedwaytech1/login.do");
	   driver.findElement(By.id("username")).sendKeys(userName);
	   driver.findElement(By.name("pwd")).sendKeys(password);
	   driver.findElement(By.id("loginButton")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("logoutLink")).click();
	   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed());
	   Thread.sleep(2000);
	   driver.close();
  }
    @DataProvider(name="logintestdata")
    public Object[][] logindata(){
    	Object[][] getdata = new Object[2][2];
    	getdata[0][0] = "speedwaytech74@gmail.com";
    	getdata[0][1] = "Sujeet@123";
    	getdata[1][0] = "speedwaytech74@gmail.com";
    	getdata[1][1] = "Sujee";
    	return getdata; 
    }	
     }
