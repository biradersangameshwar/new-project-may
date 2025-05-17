package data_drn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logout2 {

	public static void main(String[] args) throws InterruptedException {
		
		Excel_lib2 xl = new Excel_lib2();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		for(int i=1;i<=7;i++) {
			String un = xl.getExceldata("Sheet2", i, 0);
			String pw = xl.getExceldata("Sheet2", i, 1);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
   
	}

}
}
