package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class atmosol {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\C&G drivers\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
        String store =  driver.getTitle();
        System.out.println("Title of the page:" +store);
        driver.manage().window().maximize();
        Thread.sleep(20);
        
        driver.findElement(By.xpath("//*[text()='Components']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//*[@class='img-responsive']")).click();
        driver.findElement(By.name("option[218]")).click();
        driver.findElement(By.xpath("//input[@value='11']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//input[@value='9']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//input[@value='10']")).click();
        Thread.sleep(20);
        driver.findElement(By.name("option[208]")).sendKeys("Atmosol interview");
        Select list = new Select(driver.findElement(By.id("input-option217")));
        list.selectByValue("3");
        driver.findElement(By.name("quantity")).sendKeys("1");
        driver.findElement(By.id("button-cart")).click();
        
        
       // driver.close();
	}

}
