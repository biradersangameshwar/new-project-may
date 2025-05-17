package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_findelement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		 WebElement Ele = driver.findElement(By.xpath("//div[@class='footer content']//a"));
		 
		 System.out.println(Ele.getText());
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Search Trms")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.close();

	}

}
