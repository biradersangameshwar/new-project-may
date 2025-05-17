package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.Timeout;

public class Automation_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Sangameshwar");
		driver.findElement(By.id("email")).sendKeys("birader.sangameshwar@gamil.com");
		driver.findElement(By.id("phone")).sendKeys("8019653677");
		driver.findElement(By.id("textarea")).sendKeys("3-3-452 kutbiguda kachiguda hyd 500027");
		driver.findElement(By.xpath("//input[@value='male']")).click();
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		WebElement ele = driver.findElement(By.id("country"));
		Select sel = new Select(ele);
		sel.selectByValue("india");
		WebElement ele1 = driver.findElement(By.id("colors"));
		Select sel1 = new Select(ele1);
		sel1.selectByVisibleText("Green");
		WebElement ele2 = driver.findElement(By.id("animals"));
		Select sel2 = new Select(ele2);
		sel2.selectByIndex(9);
		
		
		


	}

}
