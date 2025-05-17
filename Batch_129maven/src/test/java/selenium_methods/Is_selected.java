package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://speedwaytech.co.in/sample.html");
		
		WebElement ele  = driver.findElement(By.id("rep"));
		System.out.println(ele);
		Thread.sleep(3000);
		
		 boolean checkbox = ele.isSelected();
		 System.out.println(checkbox);
		 Thread.sleep(3000);
		 
		 ele.click();
		 Thread.sleep(3000);
		 
		boolean checkbox1 = ele.isSelected();
		System.out.println(checkbox1);
		 Thread.sleep(3000);
		 
		 ele.click();
		 Thread.sleep(3000);
		 
		 boolean checkbox2 = ele.isSelected();
		 System.out.println(checkbox2);
		 Thread.sleep(3000);
		 
		WebElement ele1 =  driver.findElement(By.id("female"));
		System.out.println(ele1);
		Thread.sleep(3000);
		
		boolean rdbutton = ele1.isSelected();
		System.out.println(rdbutton);
		Thread.sleep(3000);
		 
		 ele1.click();
		 
		 boolean rdbutton1 = ele1.isSelected();
			System.out.println(rdbutton1);
			Thread.sleep(3000); 
		 
		 WebElement ele3 = driver.findElement(By.id("male"));
		 ele3.click();
			Thread.sleep(3000); 

		 
		 
		 boolean rdbutton2 = ele3.isSelected();
		 System.out.println(rdbutton2);
			Thread.sleep(3000); 

			driver.close();
	}

}
