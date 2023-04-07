package navigationPages;

import java.util.List;

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
	@FindBy(className = "inventory_item_name")
	private List<WebElement> itemName;
	@FindBy(className = "shopping_cart_link")
	private WebElement shoppingCart;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement addCart2nditemBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement remove2nditemCartBtn;
	
	public boolean addToCartAndVerifyRemoveButton() {
		click(addCartBtn);
		return verifyElementDisplayed(removeCartBtn);
	}
	
	public String getItemName(int positionOnList) {
		return itemName.get(positionOnList).getText();
	}
	
	public void clickShoppingCart(){
		click(shoppingCart);
	}
	
	public boolean addToCartSecondItem() {
		click(addCart2nditemBtn);
		return verifyElementDisplayed(remove2nditemCartBtn);
	}
	public boolean clickRemoveAndVerifyaddToCartButton() {
		click(removeCartBtn);
		return verifyElementDisplayed(addCartBtn);
	}
	
	public boolean verifyInventoryPageURL(String actualURL) {
		return actualURL.contains("inventory.html");
	}
	
}
