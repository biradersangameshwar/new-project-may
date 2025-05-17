package batch_129;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_gettext1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header");
		
		driver.manage().window().maximize();

	}

}
