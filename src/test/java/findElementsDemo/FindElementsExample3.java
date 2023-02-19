package findElementsDemo;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample3 {
	
	// Using iterator

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		Select month= new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDOptions = month.getOptions();
		
		System.out.println("Size of the Month list :"+allDDOptions.size());
		
		 Iterator<WebElement> itr = allDDOptions.iterator();
		 while(itr.hasNext()) {
			 WebElement ele = itr.next();
			 String value = ele.getText();
			 System.out.println(value);
			 if(value.contains("Apr")){
				
				 System.out.println("Validation Passed");
				 break;
			 }
		 }
		
		driver.quit();

	}

}
