package jan_21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void test1() {
		System.out.println("Id of test 1 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 1 is :"+ Thread.currentThread().getName());
		Reporter.log("test 1 executed", true);
	}
	
	@Test
	public void test2() {
		System.out.println("Id of test 2 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 2 is :"+ Thread.currentThread().getName());
		Reporter.log("test 2 executed", true);
	}
	
	
	@Test
	public void test3() {
		System.out.println("Id of test 3 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 3 is :"+ Thread.currentThread().getName());
		Reporter.log("test 3 executed", true);
	}

}
