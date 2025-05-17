package batch_129;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_windhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.manage().window().maximize();
		driver.findElement(By.name("google-register")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr  = windows.iterator();
		while(itr.hasNext()) {
			 String window = itr.next();
			 System.out.println(window);
		}

	}

}
