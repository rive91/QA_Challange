package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propieda con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://mercadolibre.com/");

		List<WebElement> countryList = driver.findElements(By.className("ml-site-link"));
		
		System.out.println("Numero de paises es: " + countryList.size());
		
		String primerPais = countryList.get(0).getText();
		System.out.println(primerPais);
		
		String quintoPais = countryList.get(4).getText();
		System.out.println(quintoPais);
		
		for(int i = 0; i < countryList.size();i ++) {
			System.out.println("Los paises son: " + countryList.get(i).getText());
			if(countryList.get(i).getText().contains("Dominicana")) {
				countryList.get(i).click();
				break;
			}
		}
	}

}
