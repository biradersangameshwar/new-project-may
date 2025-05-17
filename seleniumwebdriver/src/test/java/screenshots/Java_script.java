package screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class Java_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("login-username")).clear();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("persistent")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('persistent').click()");
		Thread.sleep(2000);
		
		
		driver.close();
		
		

	}

}
