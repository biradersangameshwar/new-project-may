package testng;

import org.testng.annotations.Test;

public class Customer_priority {
	@Test(priority=0)
	public void createcustomer() {
		System.out.println("createcustomer");
	}
	@Test(priority=2)
	public void editcustomer() {
		System.out.println("editcustomer");
	}
@Test(priority=1)
public void deletecustomer() {
	System.out.println("deletecustomer");
}
}
