package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.findElement(By.name("username")).sendKeys("speedwaytech74@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("Speedway@123");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
