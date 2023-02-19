package jan_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class JsDemo6 {
	
	// Droppable using action class-- dragAnddrop

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		Actions action = new Actions(driver);
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement destElement = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(srcElement, destElement).perform();

	}

}
