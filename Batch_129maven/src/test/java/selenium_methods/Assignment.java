package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add/Remove Elements")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Add Element']"));
		
		Thread.sleep(2000);
		
		for(int i = 0;i<=5;i++) {
			ele.click();
		}
		
		List<WebElement> ele2 = driver.findElements(By.xpath("//button[text()='Delete']"));
		Thread.sleep(2000);
		
		for(WebElement delete : ele2) {
			delete.click();
		}
		Thread.sleep(2000);
		driver.close();
			}
	
	}

