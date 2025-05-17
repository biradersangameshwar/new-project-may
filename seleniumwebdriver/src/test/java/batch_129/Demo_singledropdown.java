package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_singledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		WebElement singleselect = driver.findElement(By.name("city"));
		
		Select sc = new Select(singleselect);
		Thread.sleep(2000);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("3");
		Thread.sleep(2000);
		sc.selectByVisibleText("Delhi");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		

	}

}
