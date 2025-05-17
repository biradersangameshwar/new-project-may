package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_get_title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).submit();
		Thread.sleep(2000);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		driver.close();
		
		
		
		

	}

}
