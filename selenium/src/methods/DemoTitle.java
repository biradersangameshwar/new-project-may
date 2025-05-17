package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();		
		
        driver.get("https://demo.actitime.com/login.do");
        
        driver.manage().window().maximize();
        
        String str = driver.getTitle();
        
        System.out.println(str);
        
        String expectedtitle = "actiTIME - Login";
        
        if(expectedtitle.equals(str)) {
        	
        	System.out.println("pass");
        	
        }
        
        else {
        	
        	System.out.println("fail");
        	
        	
        }
		

	}

}
