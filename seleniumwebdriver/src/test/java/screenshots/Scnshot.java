package screenshots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scnshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//full page
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File src =	ts.getScreenshotAs(OutputType.FILE);
	    String trg = ".\\screnshots\\homepage.png";
	    Files.copy(src.toPath(), new File(trg).toPath());
	    Thread.sleep(2000);
	  //  driver.close();
	    
	    //only logo
	  //  TakesScreenshot ts1 = (TakesScreenshot) driver;
	    WebElement ele =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    File src1 = ele.getScreenshotAs(OutputType.FILE);
	    String trg1 = ".\\screnshots\\logo.png";
	    Files.copy(src1.toPath(), new File(trg1).toPath());
	  
	    
	   
	    
	    
         driver.close();
	    
	    
	    
	    
	    

	}

}
