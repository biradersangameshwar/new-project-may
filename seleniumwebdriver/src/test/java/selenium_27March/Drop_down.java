package selenium_27March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speedwaytech.co.in/sample.html");
		WebElement  dd = driver.findElement(By.name("city"));
		Thread.sleep(2000);
		System.out.println(dd.getText());
		Thread.sleep(2000);
		Select sc = new Select(dd);
		Thread.sleep(2000);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("3");
		Thread.sleep(2000);
		sc.selectByVisibleText("Delhi");
		
		Thread.sleep(2000);
		driver.close();

	}

}
