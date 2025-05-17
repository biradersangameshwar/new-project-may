package keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoKeyboard1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fdesktops");
		
		driver.manage().window().maximize();
		
		WebElement textbox1 = driver.findElement(By.id("FirstName"));
		
		 WebElement textbox2 = driver.findElement(By.id("LastName"));
		 
		 textbox1.sendKeys("sangam");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(textbox1.getAttribute("value").equals(textbox2.getAttribute("value"))) {
			
		System.out.println("test pass");
		
		}
		
		}

	

}
