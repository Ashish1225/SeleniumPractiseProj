package jan_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginBtn = By.xpath("//button[contains(text(),'Log in')]");
	
	
	public LoginPage clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
		return new LoginPage(driver);
	}

}
