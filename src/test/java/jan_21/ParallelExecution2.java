package jan_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	
	@Test
	public void test1() {
		System.out.println("Id of test 1 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 1 is :"+ Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/");
		driver.quit();
	}
	
	@Test
	public void test2() {
		System.out.println("Id of test 2 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 2 is :"+ Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	
	@Test
	public void test3() {
		System.out.println("Id of test 3 is :"+ Thread.currentThread().getId());
		System.out.println("Name of test 3 is :"+ Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}

}
