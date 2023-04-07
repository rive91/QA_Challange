package navigationPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class CheckOutStepTwo extends WrapClass{
	
	public CheckOutStepTwo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// CheckOutStepTwo page WebElements
	@FindBy(id = "finish")
	private WebElement finishBtn;
	@FindBy(id = "first-name")
	private WebElement firstNameInput;
	@FindBy(id = "last-name")
	private WebElement secondNameInput;
	@FindBy(id = "postal-code")
	private WebElement zipCodeInput;
	@FindBy(className = "inventory_item_name")
	private List<WebElement> itemName;
	@FindBy(className = "inventory_item_price")
	private List<WebElement> itemsPrice;
	@FindBy(className = "summary_subtotal_label")
	private WebElement itemTotal;
	
	public boolean verifyCheckOutStepTwoPageURL(String actualURL) {
		return actualURL.contains("checkout-step-two.html");
	}
	
	public void clickFinish() {
		click(finishBtn);
	}
	
	public String getItemName(int positionOnList) {
		return itemName.get(positionOnList).getText();
	}
	
	public boolean comparePriceItemwithItemTotal() {
		Double ListItemActualTotal = 0.0;
		
		for (int i = 0; i < itemsPrice.size(); i++) {
			String itemPrice = itemsPrice.get(i).getText();
			itemPrice = itemPrice.replace("$", "");
			itemPrice = itemPrice.replace("0.0", "");
			ListItemActualTotal = ListItemActualTotal + Double.valueOf(itemPrice);
		}
		
		double subtotal = Double.valueOf(itemTotal.getText().replace("Item total: $", ""));
		return ListItemActualTotal == subtotal;
	}

}
