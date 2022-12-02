package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_test {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propieda con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		
		//Objetos de login
		WebElement inputUsername = driver.findElement(By.name("username"));
		WebElement inputPassword = driver.findElement(By.name("password"));
		WebElement btnLogIn = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		
		//Thread.sleep(2000);
		//inputUsername.sendKeys("cooltesters102022");
		//Thread.sleep(2000);
		//inputPassword.sendKeys("cooltesters102022");
		//Thread.sleep(2000);
		//btnLogIn.click();
		//Thread.sleep(2000);
		
		//Metodos de navegacion
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().back();
		
		//Metodos del explorador
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		
		String urlDashboard = driver.getCurrentUrl();
		System.out.println("la URL actual es: " + urlDashboard);
		
		//Verificat elemento desplegado en pagina
		boolean homeDisplayed = driver.findElement(By.className("home")).isDisplayed();

		
		if(homeDisplayed) {
			System.out.println("El boton home esta desplegado");
		}

		//Verficat texto
		String textslogan = driver.findElement(By.className("caption")).getText();
		
		boolean messageDisplayed = textslogan.contains("Experince the diferene");
		
		if(messageDisplayed) {
			System.out.println("El nombre del header es el esperado");
		}else {
			System.out.println("Error: el nombre del header no coicide con lo esperado");
		}
		
		//DropDowns
		WebElement adminPageLink = driver.findElement(By.xpath("//*[contains(text(),'Admin Page')]"));
		adminPageLink.click();
		Thread.sleep(2000);
		
		Select drpdwnLoanProvider = new Select(driver.findElement(By.id("loanProvider")));
		drpdwnLoanProvider.selectByVisibleText("Local");
		
	}

}
