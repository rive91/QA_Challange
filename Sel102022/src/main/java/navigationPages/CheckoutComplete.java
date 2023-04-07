package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class CheckoutComplete extends WrapClass{
	
	public CheckoutComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// CheckoutComplete page WebElements
	@FindBy(className = "complete-header")
	private WebElement thankYouLbl;
	
	public boolean verifyThankYouMessage() {
		return thankYouLbl.getText().equalsIgnoreCase("Thank you for your order!");
	}

}
