package assignment13;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Task1_CreateUserTest extends BaseClass {

	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;

	@Test(priority = 1)
	public void verifyLogoTest() {
		homePage = new HomePage(driver);
		boolean statusOfLogo = homePage.verifyLogo();
		assertTrue(statusOfLogo, "Logo is not displayed");
	}

	@Test(priority = 2)
	public void verifyPractiseLinkTest() {
		boolean statusOfPractiseLink = homePage.verifyPractiseLink();
		assertTrue(statusOfPractiseLink, "Practise Link is not displayed");
	}

	@Test(priority = 3)
	public void clickLogInTest() {
		// loginPage = new LoginPage(driver);
		loginPage = homePage.clickLioginLink();
	}

	@Test(priority = 4)
	public void verifySigInLabelTest() {
		boolean statusOfSignInLabel = loginPage.verifySignInLabel();
		assertTrue(statusOfSignInLabel, "Sign In label is not displayed");
	}

	@Test(priority = 5)
	public void clickOnSignUpLinkAndVerifySignUpLabelTest() {
		registerPage = loginPage.clickOnSignUpLink();
		boolean statusOfSignUpLabel = registerPage.verifySignUpLabel();
		assertTrue(statusOfSignUpLabel, "Sign Up label is not displayed");
	}

	@Test(priority = 6)
	public void createUserTest() {
		loginPage = registerPage.enterRegisterUserCredentials("Arvind", "arvind12@gmail.com", "145678",
				"Machine Learning", "Male", "West Bengal");
		
		boolean statusOfSignInLabel = loginPage.verifySignInLabel();
		assertTrue(statusOfSignInLabel,"Sign In label is not displayed after User created");
		
	}

}
