package batch_129;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_without_using_selectmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://speedwaytech.co.in/sample.html");
		driver.manage().window().maximize();
		WebElement singleselect = driver.findElement(By.name("city"));
		Select sc = new Select(singleselect);
		List<WebElement> city = sc.getOptions();
		
		for(WebElement e : city) {
			if(e.getText().equals("Chennai")) {
				e.click();
				break;
			}
			Thread.sleep(2000);
			
		}
		driver.close();
	}

}
