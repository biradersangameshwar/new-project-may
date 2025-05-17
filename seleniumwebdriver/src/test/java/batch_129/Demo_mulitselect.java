package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_mulitselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/sample.html");
		WebElement multiselect = driver.findElement(By.name("city-multiple"));
		driver.manage().window().maximize();
		
		Select sc = new Select(multiselect);
		sc.selectByIndex(0);
		Thread.sleep(2000);
		sc.selectByValue("2");
		Thread.sleep(2000);
        sc.selectByVisibleText("Kolkatta");
		Thread.sleep(2000);
        sc.deselectByIndex(0);
		Thread.sleep(2000);
        sc.deselectByValue("2");
		Thread.sleep(2000);
        sc.deselectByVisibleText("Kolkatta");
        Thread.sleep(2000);
        driver.close();
        

	}

}
