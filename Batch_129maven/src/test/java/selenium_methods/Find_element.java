package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	WebElement	ele = driver.findElement(By.xpath("//div[@class='footer content']//a"));
	Thread.sleep(2000);
	System.out.println(ele.getText());
	Thread.sleep(2000);
	driver.findElement(By.linkText("Search Terms")).click();
	}

}
