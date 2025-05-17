package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Halfscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshot\\logo.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
		

	}

}
