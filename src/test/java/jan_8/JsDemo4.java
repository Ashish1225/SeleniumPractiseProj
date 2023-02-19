package jan_8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo4 {
	
	// Scrolling  JavaScript with web element

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		// type value into disable text field using js
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement textArea = driver.findElement(By.xpath("//textarea[text()='textarea']"));
		
		// Scrolling into view wih JS
		
		js.executeScript("arguments[0].scrollIntoView(true)", textArea);
		textArea.clear();
		textArea.sendKeys("AShish");
		
	}

}
