package keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_ctrlZ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.name("uname"));
		
		textbox.sendKeys("sangam");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("z");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		driver.close();
			

	}

}
