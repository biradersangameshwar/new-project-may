package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		boolean btn = driver.findElement(By.name("btnK")).isDisplayed();
		
		System.out.println(btn);
		
		boolean btn2 = driver.findElement(By.xpath("//a[@role='button']")).isDisplayed();
		
		System.out.println(btn2);
		
		boolean btn3 = driver.findElement(By.xpath("//span[text()='Sign in']")).isDisplayed();
		
		System.out.println(btn3);
		
		driver.close();
		

	}

}
