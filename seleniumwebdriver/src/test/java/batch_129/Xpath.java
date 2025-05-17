package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("speedwaytech74@gamil.com");
		
		driver.findElement(By.xpath("//input[contains(@name, 'pwd')]")).sendKeys("Sujeet@123");
		
		

	}

}
