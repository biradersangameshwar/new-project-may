package batch_129;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Ele = driver.findElements(By.xpath("//div[@class='footer content']//a"));
		
		System.out.println("The size of webelement: "+ Ele.size());
		
		List<WebElement> Ele1 = driver.findElements(By.linkText("Search Terms"));
		
		System.out.println("The size of weblelement: "+Ele1.size());
		
		List<WebElement> Ele2 = driver.findElements(By.linkText("Search Trms"));
		
		System.out.println("The size of webelement: "+Ele2.size());
		
		for(WebElement e: Ele) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
