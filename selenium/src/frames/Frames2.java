package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.tagName("input")).sendKeys("har");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement sele = driver.findElement(By.id("animals"));
		
		Select sele2 = new Select(sele);
		
		sele2.selectByIndex(3);

	}

}
