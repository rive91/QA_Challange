package navigationPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class CartPage extends WrapClass{
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Cart page WebElements
	@FindBy(className = "inventory_item_name")
	private List<WebElement> itemName;
	@FindBy(id = "checkout")
	private WebElement checkoutBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeCartBtn;
	@FindBy(id = "continue-shopping")
	private WebElement continueShoppingBtn;
	
	public boolean verifyCartPageURL(String actualURL) {
		return actualURL.contains("cart.html");
	}
	
	public String getItemName(int positionOnList) {
		return itemName.get(positionOnList).getText();
	}
	
	public void clickShoppingCart(){
		click(checkoutBtn);
	}

	public boolean clickRemove(){
		click(removeCartBtn);
		return itemName.size() == 0;
	}
	
	public void clickContinueShopping(){
		click(continueShoppingBtn);
	}

}
