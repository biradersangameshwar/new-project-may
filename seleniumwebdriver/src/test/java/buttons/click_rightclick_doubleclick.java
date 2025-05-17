package buttons;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_rightclick_doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pD03d")).click();
		
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		
		WebElement doubleckick = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
		act.doubleClick(doubleckick).perform();
		
		driver.close();
		
		

	}

}
