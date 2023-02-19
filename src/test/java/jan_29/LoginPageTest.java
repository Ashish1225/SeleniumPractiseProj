package jan_29;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
	

	@Test
	public void validLogin() {
		
		HomePage homePage = new HomePage(driver);
		//homePage.clickOnLoginBtn();
		//LoginPage loginPage = new LoginPage(driver);
		LoginPage loginPage = homePage.clickOnLoginBtn();
		loginPage.loginToApplication("ineuron@ineuron.ai","ineuron");
		assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed(),
				"Sign out button is not displaying");
	}

}
