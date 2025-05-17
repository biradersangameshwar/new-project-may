package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/testing/frames/frames.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("name1")).sendKeys("sangam");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement fram = driver.findElement(By.xpath("//frame[@src='frame3.html']"));
		driver.switchTo().frame(fram);
		driver.findElement(By.name("check")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("rep")).click();
		driver.close();
		
		

	}

}
