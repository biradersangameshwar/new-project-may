package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcheckoutportal%2Fenter-checkout.html%3Fie%3DUTF8%26asin%3DB0C788T92F%26buyNow%3D1%26cartCustomerID%3D0%26fromSignIn%3D1%26isBuyBack%3D0%26isGift%3D0%26offeringID%3DrrThovNW2f4eYY%25252Fx4ZiKMEqqzE7133tJfW%25252BgSdYhcKAJk7xItKQCvzAxy8MgaUMwKkM81lvwgqIGfLqCybNKjPYPoIT19yzF8KW01mOzP8USFU7ijOJ2qhIlpEiaT0WYoFTfIqFc7doUAUPsVYq%25252FrP3jd75rmAv7hp5%25252BIf7%25252BvKVq4v1axBP1b24aP%25252B%25252BWyZz8%26quantity%3D1%26sessionID%3D260-9122744-5326646&pageId=amazon_checkout_in&showRmrMe=0&siteState=IMBMsgs.&suppressSignInRadioButtons=0");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8019653677");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		driver.findElement(By.id("ap_password")).sendKeys("Birader@7582");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		

	}

}
