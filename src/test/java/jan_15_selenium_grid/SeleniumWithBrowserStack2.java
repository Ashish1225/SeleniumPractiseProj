package jan_15_selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowserStack2 {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("osVersion", "10");
		capabilities.setCapability("browserName", "Firefox");
		capabilities.setCapability("browserVersion", "107");
		
		URL seleniumGrid = null;
		try {
			seleniumGrid = new URL("http://ashishsahu_GlJhf2:mcCUNV2U6PDPB5Q2sXaX@hub.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		WebDriver driver = new RemoteWebDriver(seleniumGrid, capabilities);
		
		driver.get("https://learn-automation.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
