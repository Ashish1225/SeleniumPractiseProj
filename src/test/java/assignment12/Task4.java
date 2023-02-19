package assignment12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		// OPen url using javascriptExecutor
		String url = "https://ineuron-courses.vercel.app/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location = \'"+url+"\'");
			
	}
}
