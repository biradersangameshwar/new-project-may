package testng_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Scrnsht1 {
      WebDriver driver;
      
      @BeforeMethod
      public void setup() {
    	  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
      }
      public void takescrnsht(String filename) throws IOException {
    	  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  Files.copy(screenshot, new File("screenshots/"+filename+".png"));
      }
      
      
      
      @Test
      public void open() throws IOException {
    	  driver.get("https://www.saucedemo.com/");
    	  takescrnsht("login_page");
    	  
      }
}
