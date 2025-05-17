package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customer1 {
	
	@BeforeClass
	public void openbrowser() {
		System.out.println("open browser");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
@Test
public void createcustomer() {
	System.out.println("createcustomer");
}
@Test
public void editcustomer() {
	System.out.println("editcustomer");
}
@Test
public void deletecustomer() {
	System.out.println("deletecustomer");
}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("closebrowser");
	}
	
	
	
	
	
	
}
