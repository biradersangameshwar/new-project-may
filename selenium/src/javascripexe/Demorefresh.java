package javascripexe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demorefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Navigate method to refresh
		
		driver.navigate().refresh();
		
		//Action class to refresh
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.F5).perform();
		
		//by using javascripexe
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location.reload();");
		

	}

}
