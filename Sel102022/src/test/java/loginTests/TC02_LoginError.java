package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.GlobalVariables;
import commonClasses.SetupDriver;
import navigationPages.LoginPage;

public class TC02_LoginError {

	// Declarar e Inicializar el webDriver
	WebDriver driver = SetupDriver.setupDriver();

	// Page Objects
	LoginPage loginPage = new LoginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC02() {
		loginPage.login(GlobalVariables.LOCK_USER, GlobalVariables.ALL_USER_PWD);
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
