package automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/testing-02/KeyPresses/?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.ALT).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
