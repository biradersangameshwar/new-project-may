package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("moneyiframe");
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);
		driver.close();
		
		
		
		
	}

}
