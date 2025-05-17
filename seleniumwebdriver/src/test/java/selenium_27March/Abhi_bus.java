package selenium_27March;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhi_bus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.abhibus.com/");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
        Thread.sleep(2000);
        ele.sendKeys("mumbai");
        Thread.sleep(2000);
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        ele.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
        ele2.sendKeys("pune");
        Thread.sleep(3000);
        ele2.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        ele2.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        
        
        
        
        
        
        
        driver.close();
		
	}

}
