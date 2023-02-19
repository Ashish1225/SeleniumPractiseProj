package assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) {
		// Open https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html
		//Type to text area and scroll using Actions class method 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");	
		
		Actions action = new Actions(driver);
		WebElement textArea =  driver.findElement(By.xpath("//textarea[text()='textarea']"));
		
		action.scrollToElement(textArea).click().perform();
		textArea.clear();
		textArea.sendKeys("Selenium");
		
		driver.quit();


	}

}
