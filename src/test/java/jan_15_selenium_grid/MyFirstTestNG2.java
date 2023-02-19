package jan_15_selenium_grid;

import org.testng.annotations.Test;

public class MyFirstTestNG2 {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("Login to the application");
	}
	
	@Test(priority = 2)
	public void createAccount() {
		System.out.println("Account created successfully");
	}
	
	
	@Test(priority = 3)
	public void makePayment() {
		System.out.println("Payment done successfully");
	}
	
	@Test(priority = 4)
	public void logout() {
		System.out.println("Logout from application");
	}

}
