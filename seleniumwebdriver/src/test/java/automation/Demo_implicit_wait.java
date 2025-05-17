package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Speedwaytech74@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
