package assignment5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	
	//Open the below application and verify the capture all href values from social media icons. 
	//Run a loop and verify if any url contains youtube. If youtube found then break the loop

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> social_icons = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		System.out.println(social_icons.size());
		
		List<String> allHref = new ArrayList<String>();
		
		for(WebElement social: social_icons ) {
			String hrefValues = social.getAttribute("href");
			allHref.add(hrefValues);
			
		}
		System.out.println("All href values are captured: "+allHref);
		
		for(String ele:allHref) {
			System.out.println(ele);
			if(ele.contains("youtube")) {
				break;
			}
		}
		driver.quit();
	}

}
