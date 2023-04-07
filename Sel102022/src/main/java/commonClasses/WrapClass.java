package commonClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {

	public static void click(WebElement webE) {
		webE.click();
	}

	public static void sendKeys(WebElement webE, String textToSend) {
		webE.sendKeys(textToSend);
	}

	public static boolean verifyElementDisplayed(WebElement webE) {
		return webE.isDisplayed();
	}

	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {

		// Toma el screenshot de la pagina sin formato alguno
		File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
		// Establecer ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";

		FileHandler.createDir(new File(screenshotPath));
		try {
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
