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

public class TC02_PurchaseFlow_Buy_More_Than_One_Item {

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
	public void TC02() {
		//Step 1: Go to the login page and login as standard_user
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.ALL_USER_PWD);
		
		//Step 2: Click on "Add to Cart" button of the first item
		inventoryPage.addToCartAndVerifyRemoveButton();
		String firstItemName = inventoryPage.getItemName(0);
		
		//Step 3: Click on "Add to Cart" button of the second item
		inventoryPage.addToCartSecondItem();
		String secondItemName = inventoryPage.getItemName(1);
		
		//Step 4:	Click on the cart button on the upper right side
		inventoryPage.clickShoppingCart();
		Assert.assertTrue(cartPage.verifyCartPageURL(driver.getCurrentUrl()));
		
		//Step 5:	Verify that the Items are properly displayed
		String firstItem_CartPage = cartPage.getItemName(0);
		String secondItem_CartPage = cartPage.getItemName(1);

		Assert.assertEquals(firstItemName, firstItem_CartPage);
		Assert.assertEquals(secondItemName, secondItem_CartPage);
		
		//Step 6:	Click on "Checkout" button
		cartPage.clickShoppingCart();
		Assert.assertTrue(checkOutStepOne.verifyCheckOutStepOnePageURL(driver.getCurrentUrl()));
		
		//Step 7:	Fill first name, last name and Zip Code
		checkOutStepOne.fillRequiredFields("John","Doe","90210");
		
		//Step 8:	Click on "Continue" button
		checkOutStepOne.clickContinue();
		Assert.assertTrue(checkOutStepTwo.verifyCheckOutStepTwoPageURL(driver.getCurrentUrl()));

		//Step 9:	Verify that the Item is on properly displayed
		String firstItem_CheckoutPage = checkOutStepTwo.getItemName(0);
		String secodItem_CheckoutPage = checkOutStepTwo.getItemName(1);

		Assert.assertEquals(firstItemName, firstItem_CheckoutPage);
		Assert.assertEquals(secondItemName, secodItem_CheckoutPage);
		
		//Step 10:	Verify the price total
		Assert.assertTrue(checkOutStepTwo.comparePriceItemwithItemTotal());
		
		//Step 11:	Click on "Finish" button
		checkOutStepTwo.clickFinish();
		
		//Step 12:	Verify the "Thank you for your order!" is displayed
		Assert.assertTrue(checkoutComplete.verifyThankYouMessage());
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_02");
		driver.quit();
	}
}
