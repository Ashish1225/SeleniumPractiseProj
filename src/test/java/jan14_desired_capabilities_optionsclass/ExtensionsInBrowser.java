package jan14_desired_capabilities_optionsclass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsInBrowser {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		
		File src=new File("./plugins/SelectorsHub.crx");

		opt.addExtensions(src);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		//driver.quit();
		
	}


	}
