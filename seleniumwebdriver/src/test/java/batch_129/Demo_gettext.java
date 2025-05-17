package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bitrix24.in/");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//h1[text()='Bitrix24. Your ultimate workspace.']")).getText();
		
		System.out.println(text);
		
		String actualtext = "Bitrix24. Your ultimate workspace.";
		
		if(actualtext.equals(text)) {
			System.out.println("text is same");
		}
		else {
			System.out.println("text is different");
		}
		driver.close();

	}

}
