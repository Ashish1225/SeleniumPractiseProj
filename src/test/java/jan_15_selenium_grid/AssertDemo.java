package jan_15_selenium_grid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void test1() {
		
		Assert.assertEquals(12, 12,"count mismatch");
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(12, 12.0,"count mismatch");
	}
	
	@Test
	public void test3() {
		
		Assert.assertEquals("Selenium for web automation","Selenium for web automation");
	}
	
	@Test
	public void test4() {
		String msg = "Customer id is 12356";
		Assert.assertEquals(msg.contains("Customer"),true);
	}
	
	@Test
	public void test5() {
		String msg = "Customer id is 12356";
		Assert.assertFalse(msg.contains("customer"));
	}

}
