package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Demo_datapro {
  @Test(dataProvider = "dp")
  public void testlogin(String email, String pwd) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  driver.findElement(By.name("email")).sendKeys(email);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	 driver.findElement(By.xpath("(//a[text()='My Account'])[2]")).click();
	 // System.out.println(title);
	 String actualttle = driver.getTitle();
	 System.out.println(actualttle);
	 String expectedttle = "Account Loin";
     Assert.assertEquals(actualttle, expectedttle, expectedttle);
	 driver.close();
	 
  }

  @DataProvider(name="dp")
  Object[][] logindata() {
    
	  Object data[][]= {
		               {"sai@gmail.com", "hari12"},
			           {"suman@gmail.com", "suman123"},
			           {"birader.sangameshwar@gmailcom" , "sangam"}
	  
    };
	return data;
  }
}
