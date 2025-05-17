package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_isselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/sample.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		boolean checkbox = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("rep")).click();
		
		Thread.sleep(2000);
		
		boolean checkbox1 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox1);
		
		driver.findElement(By.id("rep")).click();
		
		boolean checkbox2 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox2);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		

	}

}
