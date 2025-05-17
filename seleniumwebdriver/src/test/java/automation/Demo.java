package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void testlogin() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://online.actitime.com/speedwaytech1/login.do");
	  driver.findElement(By.name("username")).sendKeys("speedwaytech74@gmail.com");
	  driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("logoutLink")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed());
	  Thread.sleep(2000);
	  driver.close();
	  }
}
