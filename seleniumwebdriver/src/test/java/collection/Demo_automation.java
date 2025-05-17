package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo_automation {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?");
		//driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.id("Password")).sendKeys("Password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
