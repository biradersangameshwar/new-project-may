package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.speedwaytech.co.in/testing-02/Frames/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sangam");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='checkbox.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("a")).click();
		
		
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='dropdown-frame.html']"));
		driver.switchTo().frame(frame1);
		 WebElement dd = driver.findElement(By.id("animals"));
		Select s1 = new Select(dd);
		s1.selectByVisibleText("Baby Cat");
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
