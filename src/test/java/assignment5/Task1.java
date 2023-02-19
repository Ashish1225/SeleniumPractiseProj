package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// Capture the application url and verify url ends with “login”
		
		boolean flag = currentUrl.endsWith("login");
		if(flag) {
			System.out.println("Url is ends with login");
		}
		else {
			System.out.println("Url does not ends with login");
		}
		//Capture the application url and verify url contains “demo”
		boolean flag1 = currentUrl.contains("demo");
		if(flag1) {
			System.out.println("Url contains demo");
		}
		else {
			System.out.println("Url does not contains demo");
		}
		
		//Capture the application title and verify title contains HRM 
		boolean flag2 = currentUrl.contains("HRM");
		if(flag2) {
			System.out.println("Url contains HRM");
		}
		else {
			System.out.println("Url does not contains HRM");
		}
		
		driver.quit();
	}

}
