package jan14_desired_capabilities_optionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLIssues {

	public static void main(String[] args) {
		/*
		 * How to handle SSL Certificate
		 * How to handle secure application
		 * How to handle insecure certificate
		 * How to handle invalid certificate
		 * How to handle https applications
		 * 
		 * 
		 */
		
		ChromeOptions opt = new ChromeOptions();
		// * How to handle insecure certificate
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.cacert.org/");
		System.out.println("Title is :"+driver.getTitle());
		
		
	}

}
