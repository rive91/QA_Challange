package purchaseFlow_Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.GlobalVariables;
import commonClasses.SetupDriver;
import commonClasses.WrapClass;
import navigationPages.CartPage;
import navigationPages.CheckOutStepOne;
import navigationPages.CheckOutStepTwo;
import navigationPages.CheckoutComplete;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;

public class TC05_Click_on_Continue_shopping_on_cart_page {

	// Declarar e Inicializar el webDriver
	WebDriver driver = SetupDriver.setupDriver();

	// Page Objects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	CartPage cartPage = new CartPage(driver);
	CheckOutStepOne checkOutStepOne = new CheckOutStepOne(driver);
	CheckOutStepTwo checkOutStepTwo = new CheckOutStepTwo(driver);
	CheckoutComplete checkoutComplete = new CheckoutComplete(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC05() {
		//Step 1: Go to the login page and login as standard_user
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.ALL_USER_PWD);
		
		//Step 2: Click on "Add to Cart" button of the first item
		inventoryPage.addToCartAndVerifyRemoveButton();
		
		//Step 3:	Click on the cart button on the upper right side
		inventoryPage.clickShoppingCart();
		Assert.assertTrue(cartPage.verifyCartPageURL(driver.getCurrentUrl()));
		
		//Step 4: Click on "Continue shopping" button
		cartPage.clickContinueShopping();
		Assert.assertTrue(inventoryPage.verifyInventoryPageURL(driver.getCurrentUrl()));
		
		
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_05");
		driver.quit();
	}
}
