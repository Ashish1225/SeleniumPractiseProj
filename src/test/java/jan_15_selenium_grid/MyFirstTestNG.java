package jan_15_selenium_grid;

import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	@Test(description = "My first test")
	public void test1() {
		System.out.println("Test 1 executed..");
	}
	
	@Test(description = "My second test")
	public void test2() {
		System.out.println("Test 2 executed..");
	}
	
	
	@Test(description = "My third test")
	public void test3() {
		System.out.println("Test 3 executed..");
	}

}
