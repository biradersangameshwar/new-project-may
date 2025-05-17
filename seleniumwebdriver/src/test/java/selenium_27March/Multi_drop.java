package selenium_27March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://speedwaytech.co.in/sample.html");
		WebElement ele = driver.findElement(By.name("city-multiple"));
		Thread.sleep(2000);
		Select sc = new Select(ele);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("3");
		Thread.sleep(2000);
		sc.selectByVisibleText("Delhi");
		Thread.sleep(2000);
		System.out.println(sc.getAllSelectedOptions());
		
		
		
		driver.close();

	}

}
