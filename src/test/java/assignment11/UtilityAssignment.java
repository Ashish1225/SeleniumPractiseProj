package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("");
		waitForElement(driver,By.name(""),10);
		

	}
	
	public static void waitForElement(WebDriver driver,By locator, int timeOut) {
		
		WebElement element = driver.findElement(locator);
		
		for(int i = 0; i<timeOut;i++) {
			try {
				element.isEnabled();
			}catch(Exception e){
				System.out.println("Wating for element to enabled"+e.getMessage());
				waitForSeconds(1);
			}
		}
		
	}
	
	public static void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
