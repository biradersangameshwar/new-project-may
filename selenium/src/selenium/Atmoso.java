package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Atmoso {
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void init() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\C&G drivers\\chrome\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://tutorialsninja.com/demo/");
	 driver.manage().window().maximize();
	}
	
      @Test
      public void title() {
      String ttle = driver.getTitle();
      System.out.println("Title =" + ttle);
      Assert.assertEquals(ttle, "Your Store");
      }
      
      @Test
      public void Navgte() {
    	  driver.findElement(By.xpath("//*[text()='Components']")).click();
    	  driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
    	 }
      @Test
      public void purchaseproduct() {
    	//int price = 112;
        //Assert.assertEquals(price, "112");
       driver.findElement(By.xpath("//*[text()='Apple Cinema 30\"']")).click();
       driver.findElement(By.name("option[218]")).click();
       driver.findElement(By.xpath("//input[@value='11']")).click();
       driver.findElement(By.xpath("//input[@value='9']")).click();
       driver.findElement(By.xpath("//input[@value='10']")).click();
       driver.findElement(By.name("option[208]")).sendKeys("Atmosol interview");
       Select list = new Select(driver.findElement(By.id("input-option217")));
       list.selectByValue("3");
       driver.findElement(By.name("quantity")).sendKeys("1");
       driver.findElement(By.id("button-cart")).click();
      }
      
      @AfterMethod
      public void close() {
      driver.close();
    	  
      }
      
    	  
      }
      
      


