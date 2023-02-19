package jan_7_waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

// 3- Wait using WebDriver Wait

public class WaitForAlertUsingFuentWait {
	
	// using Fluent Wait
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		
		// using WebDriver Wait
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.ignoring(WebDriverException.class);
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver wd) {
				WebElement element = wd.findElement(By.xpath("//p[@id='demo']"));
				String text = element.getText();
				
				if(text.contains("WebDriver")) {
					System.out.println("Element Found");
					return element;
				}
				else {
					System.out.println("Current Text is: "+text);
					return null;
				}
				
			}
			
		});
		driver.quit();

	}

}
