package javaScriptexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement textbox = driver.findElement(By.name("search"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='iphone'",textbox);
		Thread.sleep(2000);
		js.executeScript("arguments[0].style.border = '3px solid red'",textbox);
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '200%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '50%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%'");
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.close();

	}

}
