package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/testing-02/Frames/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("singam");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.id("a")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.id("animals"));
		Select sc = new Select(animal);
		sc.selectByValue("babycat");
		driver.close();
		


	}
}
