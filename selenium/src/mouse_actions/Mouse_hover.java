package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement cmptmenu = driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
		
		WebElement desktop = driver.findElement(By.xpath("(//a[text()='Desktops '])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(cmptmenu).moveToElement(desktop).click().perform();
		
		
		
	}

}
