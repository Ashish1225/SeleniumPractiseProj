package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title is :"+driver.getTitle());
		
		System.out.println("Url is :"+driver.getCurrentUrl());
		
		driver.close();
		
		

	}

}
