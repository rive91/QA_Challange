package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class CheckOutStepOne extends WrapClass{
	
	public CheckOutStepOne(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// CheckOutStepOne page WebElements
	@FindBy(id = "continue")
	private WebElement continueBtn;
	@FindBy(id = "first-name")
	private WebElement firstNameInput;
	@FindBy(id = "last-name")
	private WebElement secondNameInput;
	@FindBy(id = "postal-code")
	private WebElement zipCodeInput;
	@FindBy(id = "cancel")
	private WebElement cancelBtn;

	
	public boolean verifyCheckOutStepOnePageURL(String actualURL) {
		return actualURL.contains("checkout-step-one.html");
	}
	
	public void fillRequiredFields(String firstName, String lastName, String zipCode) {
		sendKeys(firstNameInput,firstName);
		sendKeys(secondNameInput,lastName);
		sendKeys(zipCodeInput,zipCode);
	}
	
	public void clickContinue() {
		click(continueBtn);
	}
	
	public void clickCancel() {
		click(cancelBtn);
	}

}
