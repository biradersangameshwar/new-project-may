package javaScriptexe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.yahoo.com/");
	//	driver.findElement(By.id("persistent")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('persistent').click()");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		//jse.executeScript("window.location.reload();");
		//jse.executeScript("alert('Hello sangam')");
	
		
		Thread.sleep(2000);
		driver.close();
		

		
		
	}

}
