package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert confirmationalert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Confirmation Alert Text :"+confirmationalert.getText());
		Thread.sleep(2000);
		confirmationalert.dismiss();
		Thread.sleep(2000);
		driver.close();

	}

}
