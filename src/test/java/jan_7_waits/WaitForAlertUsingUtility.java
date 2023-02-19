package jan_7_waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

// 2- Wait using custom method with Utility class

public class WaitForAlertUsingUtility {
	
	static Alert alert;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		
		// calling custom alert method from helper package
		 alert = Utility.waitForAlert(driver);
		// alert = Utility.waitForAlert(driver, 50);
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();

	}

}
