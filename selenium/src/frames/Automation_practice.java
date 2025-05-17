package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("name")).sendKeys("Sangameshwar");
		driver.findElement(By.id("email")).sendKeys("birader.sangameshwar@gamil.com");
		driver.findElement(By.id("phone")).sendKeys("8019653677");

	}

}
