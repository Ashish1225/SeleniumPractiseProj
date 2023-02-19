package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	// Open below application and verify that footer has 4 social media icons

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// create a new List with all social names
		List<String> socialNames = new ArrayList<String>();
		socialNames.add("facebook");
		socialNames.add("twitter");
		socialNames.add("youtube");
		socialNames.add("linkedin");

		System.out.println(socialNames);

		List<WebElement> social_icons = driver
				.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[@href]"));
		System.out.println(social_icons.size());

		// create an empty list and added all value which is coming from list of all
		// href webelement list
		List<String> bl = new ArrayList<String>();

		for (WebElement socialIcon : social_icons) {
			String url = socialIcon.getAttribute("href");
			bl.add(url);
		}

		// create an empty Map of string type
		Map<String, String> m1 = new HashMap<String, String>();

		for (int i = 0; i < socialNames.size(); i++) {
			for (int j = 0; j < bl.size(); j++) {
				if (bl.get(j).contains(socialNames.get(i))) {
					m1.put(socialNames.get(i), bl.get(j));
					break;
				}
			}
		}
		System.out.println(m1);

		driver.quit();
	}

}
