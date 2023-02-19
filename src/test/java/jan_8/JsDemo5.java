package jan_8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo5 {
	
	// CLick and type using  JavaScript with web element

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		// type value into disable text field using js
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pass = driver.findElement(By.id("pass"));
		//js.executeScript("document.getElementById('pass').value = 'selenium'");
		
		// with single argument
		js.executeScript("arguments[0].value='selenium'", pass);
		
		// with Multiple argument
		js.executeScript("arguments[0].value=arguments[1]", pass,"TestNG");
		driver.quit();

	}

}
