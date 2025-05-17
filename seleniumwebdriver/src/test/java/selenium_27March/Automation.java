package selenium_27March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='footer content']//a"));
		System.out.println("The size of webelement is :"+ele1.size());
		List<WebElement> ele2 = driver.findElements(By.linkText("Search Terms"));
		System.out.println("The size of webelements is :"+ele2.size());
		for(WebElement e: ele1) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.close();

	}

}
