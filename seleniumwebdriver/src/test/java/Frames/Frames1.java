package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing/frames/frames.html");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='name1']")).sendKeys("sangam");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement frame = driver.findElement(By.xpath("//frame[@src='frame3.html']"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.name("check")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("rep")).click();
		
	}

}
