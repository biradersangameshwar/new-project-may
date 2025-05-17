package selenium_27March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		

	}

}
