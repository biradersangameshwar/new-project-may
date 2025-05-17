package testng;

import org.testng.annotations.Test;

public class Customer {
	@Test
	public void createCustomer() {
		System.out.println("create Customer");
	}
	@Test
	public void editCustomer() {
		System.out.println("edit Customer");
		}
	@Test
	public void deleteCustomer() {
		System.out.println("delete Customer");
	}

}
