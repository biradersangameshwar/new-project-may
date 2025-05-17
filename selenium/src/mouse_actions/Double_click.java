package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tecagile.com/double-click-test/");
		
		driver.manage().window().maximize();
		
		WebElement doubleclick = driver.findElement(By.id("darea"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(2000);
		
		act.doubleClick(doubleclick).perform();
		

	}

}
