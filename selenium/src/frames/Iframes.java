package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing/frames/frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.name("name1")).sendKeys("sangam");
		
		driver.findElement(By.name("rep")).click();
		
		driver.switchTo().defaultContent();

		WebElement thirdframe = driver.findElement(By.xpath("//frame[@src='frame3.html']"));
		driver.switchTo().frame(thirdframe);
		driver.findElement(By.name("check")).click(); 
	}

}
