package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class LoginPage extends WrapClass {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Login WebElements
	@FindBy (id = "user-name") 
	private WebElement userNameInput;
	@FindBy (name = "password") 
	private WebElement pwdInput;
	@FindBy (id = "login-button") 
	private WebElement loginBtn;
	@FindBy (xpath = "//h3[@data-test  = 'error']") 
	private WebElement errorBox;
	
	//Login Methods
	
	public void login(String user, String pwd) {
		sendKeys(userNameInput,user);
		sendKeys(pwdInput,pwd);
		click(loginBtn);
	}
	
	public boolean validateLockError() {
		boolean errorDisplayed = errorBox.getText().contains("Sorry, this user has been locked out");
		return errorDisplayed;
	}
}
