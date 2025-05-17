package selenium_27March;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    Thread.sleep(3000);
	    org.openqa.selenium.Alert alt = driver.switchTo().alert();
	    System.out.println("Simple alert :"+alt.getText());
	    alt.accept();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    Thread.sleep(3000);
	    Alert alt1 = driver.switchTo().alert();
	    System.out.println("Confirm alert :"+alt1.getText());
	    alt1.accept();
	    WebElement prmt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	    prmt.click();
	    Thread.sleep(3000);
	    //prmt.sendKeys("sangam");
	    Alert alt2 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    System.out.println("Prompt alert :"+ alt2.getText());
	    Thread.sleep(3000);
	    alt2.sendKeys("sangam");
	    Thread.sleep(3000);
	    alt2.dismiss();
	    
	    
	    
	    
	    Thread.sleep(3000);
	    driver.close();
	}

}
