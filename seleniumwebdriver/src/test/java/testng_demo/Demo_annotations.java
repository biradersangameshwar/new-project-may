package testng_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_annotations {

	@BeforeMethod
	void login() {
		System.out.println("this is login");
	}
	@AfterMethod
	void logout() {
		System.out.println("this is logout");
	}
	@Test
	void updatestatus() {
		System.out.println("Status updated");
	}
	@Test(dependsOnMethods = "updatestatus")
	void deletestatus() {
		System.out.println("Status deleted");
	}
}