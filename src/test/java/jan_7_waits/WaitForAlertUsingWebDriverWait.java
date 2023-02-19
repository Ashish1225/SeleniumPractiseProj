package jan_7_waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// 3- Wait using WebDriver Wait

public class WaitForAlertUsingWebDriverWait {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		
		// using WebDriver Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // it will throw TimeOut Exception if time got exceed
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();

	}

}
