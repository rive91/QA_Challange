package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
	@Test
	public void tc01() {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propieda con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");

		String actualTitile = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		
		Assert.assertEquals(actualTitile, expectedTitle);
	}
}
