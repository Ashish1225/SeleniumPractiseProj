package jan_7_waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1- Wait using custom method

public class WaitForAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		
		// custom way to handle
		Alert alert = null;
		for(int i =0;i<15;i++) {
			try {
			alert = driver.switchTo().alert();
			break;
			}
			catch (NoAlertPresentException e) {
				System.out.println("No Alert found - Waiting for ALert");
				Thread.sleep(1000);
			}
		}		
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();

	}

}
