package webrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.yahoo.com/");
		Navigation nav = driver.navigate();
		nav.back();
		

	}

}
