package assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {
		// Perform right click on box (if box is present in frame then switch to frame) 
		// open- https://api.jquery.com/contextmenu/ using actions class
		//verify color as yellow after right click
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/contextmenu/");
		
		 
		
		Actions action = new Actions(driver);
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		action.scrollToElement(frame).perform();
		driver.switchTo().frame(frame);
		WebElement box =  driver.findElement(By.xpath("//body//div"));
		String background = box.getCssValue("background");
		
		System.out.println(background);
	
		action.contextClick(box).perform();
		WebElement box1 =  driver.findElement(By.xpath("//div[@class='contextmenu']"));
		String background1= box1.getCssValue("background");
		System.out.println(background1);
		
		if(background1.contains("rgb(255, 255, 0)")) {
			System.out.println("Yellow color after righ click showing");
		}else {
			System.out.println("Yellow color after righ click not showing");
		}
		driver.quit();

	}

}
