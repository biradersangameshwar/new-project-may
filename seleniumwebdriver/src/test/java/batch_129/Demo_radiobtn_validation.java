package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_radiobtn_validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://speedwaytech.co.in/sample.html");
        
        driver.manage().window().maximize();
        
       boolean  rdbtn = driver.findElement(By.id("female")).isSelected();
       System.out.println(rdbtn);
       
       Thread.sleep(2000);
       
       driver.findElement(By.id("female")).click();
       
       Thread.sleep(2000);
       
       boolean  rdbtn1 = driver.findElement(By.id("female")).isSelected();
       System.out.println(rdbtn1);
       
       Thread.sleep(2000);
       
       boolean rdbtn2 = driver.findElement(By.id("male")).isSelected();
       System.out.println(rdbtn2);
       
       Thread.sleep(2000);
       
       driver.findElement(By.id("male")).click();
       
       Thread.sleep(2000);
       
       boolean rdbtn3 = driver.findElement(By.id("male")).isSelected();
       System.out.println(rdbtn3);
       
       Thread.sleep(2000);
       
       driver.close();
       
       
       
       
       
       
		
		

	}

}
