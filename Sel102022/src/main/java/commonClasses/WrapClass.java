package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webE) {
		webE.click();
	}
	
	public static void sendKeys(WebElement webE , String textToSend) {
		webE.sendKeys(textToSend);
	}
	
	public static boolean verifyElementDisplayed(WebElement webE) {
		return webE.isDisplayed();
	}
}
