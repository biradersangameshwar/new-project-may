package data_drn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logut {

	public static void main(String[] args) throws InterruptedException {
		
		Excel_lib2 xl = new Excel_lib2();
		//String un = xl.getExceldata("Sheet1", 1, 0);
		//String pw = xl.getExceldata("Sheet1", 1, 1);
		//System.out.println(pw);
		//System.out.println(un);
		
		WebDriver driver = new ChromeDriver();
		for(int i=1;i<=3;i++) {
			String un = xl.getExceldata("Sheet1", i, 0);
			String pw = xl.getExceldata("Sheet1", i, 1);
		
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/abc1/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		//driver.close();
		
		
		

	}

}
}
