package synchronization_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implict_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("speedwaytech74@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("Speedway@123");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.id("logoutLink")).click();

	}

}
