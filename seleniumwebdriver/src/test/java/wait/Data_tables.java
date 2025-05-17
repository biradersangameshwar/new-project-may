package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_tables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/tables");
		int rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println("Total no of rows :"+rows);
		int colm= driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
		System.out.println("Total no of columns :"+colm);
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=colm;c++) {
				String str =driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(str+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
