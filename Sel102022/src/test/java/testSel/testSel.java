package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testSel {
  @Test
  public void f() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propieda con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
