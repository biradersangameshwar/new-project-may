package selenium_27March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://speedwaytech.co.in/testing-02/Frames/");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		driver.switchTo().frame("frame3");
		Thread.sleep(3000);
		driver.findElement(By.id("a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sangam");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("animals"));
		Select sc = new Select(ele);
		Thread.sleep(3000);
		sc.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
