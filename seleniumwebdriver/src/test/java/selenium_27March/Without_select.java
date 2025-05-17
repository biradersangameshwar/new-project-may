package selenium_27March;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Without_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/sample.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.name("city"));
		Thread.sleep(2000);
		Select sc = new Select(ele);
		Thread.sleep(2000);
		List<WebElement> city = sc.getOptions();
		Thread.sleep(2000);
		for (WebElement c : city) {
			if(c.getText().equals("Delhi")) {
				Thread.sleep(2000);
				c.click();
				//break;
			}
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
