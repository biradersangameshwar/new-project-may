package keyboard_actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ALT).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.RIGHT).perform();
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
