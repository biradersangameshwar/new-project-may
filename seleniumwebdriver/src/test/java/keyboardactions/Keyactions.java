package keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https://extendsclass.com/text-compare.html#google_vignette"));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='CodeMirror-scroll'])[1]"));		
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.keyDown(ele,Keys.CONTROL);
		act.sendKeys("a");
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='CodeMirror-scroll'])[2]"));
		act.keyDown(ele1,Keys.CONTROL);
		act.sendKeys("a");
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		//driver.close();

	}

}
