package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		Thread.sleep(2000);
		alert.click();
		Thread.sleep(2000);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
