package demo_automation_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo_assertion {
  @Test
  public void Testgoogle() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("speedwaytech",Keys.ENTER);
	  String expectedtitle = "speedwaytech - Google Search";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle,expectedtitle);
	  
	 
	  
  }
}
