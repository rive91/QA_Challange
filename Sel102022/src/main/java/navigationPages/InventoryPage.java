package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class InventoryPage extends WrapClass {

	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// inventory WebElements
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addCartBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeCartBtn;
	
	public boolean addToCartAndVerifyRemoveButton() {
		click(addCartBtn);
		return verifyElementDisplayed(removeCartBtn);
	}
}
