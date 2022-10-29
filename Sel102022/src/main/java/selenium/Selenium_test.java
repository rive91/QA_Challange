package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

	public static void main(String[] args) {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propieda con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
