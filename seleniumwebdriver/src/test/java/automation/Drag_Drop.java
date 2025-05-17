package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
		Actions act = new Actions(driver);
		WebElement srce = driver.findElement(By.id("box1"));
		WebElement targt = driver.findElement(By.id("box101"));
		//Actions act = new Actions(driver);
		act.dragAndDrop(srce, targt).perform();
		
		

	}

}
