package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		// driver.findElement(By.xpath("//a[text()='Qafox.com']"));
		
		 
	// full page screenshot	 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File trg = new File(".\\screenshots\\homepage.png");
		 Files.copy(src, trg);
		
	// screenshot of section/portion of the page
		
		 WebElement section = driver.findElement(By.xpath("//a[text()='Qafox.com']"));
		 File src1 = section.getScreenshotAs(OutputType.FILE);
		 File trg1 = new File(".\\screenshots\\featureproducts.png");
		 Files.copy(src1, trg1);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
