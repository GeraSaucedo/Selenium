
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String [] KrustierDock) {
		
		String driverPath = "C://Selenium//chromedriver.exe";  //RUTA DEL DRIVER
		System.setProperty("webdriver.chrome.driver", driverPath); //Navegador que utilizaremos
		
		//Crear objeto driver
		WebDriver driver = new ChromeDriver();  //Indicamos que driver usaremos(chrome, firefox, etc)
		WebElement element;
		
		//Navigate
		try {
			driver.navigate().to("https://www.google.com"); //escribir la url del protocolo, este se espera a qe cargue toda la pagina para seguir la siguiente accion	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//GET
		//driver.get("https://www.google.com"); // no espera a que cargue todo
		
		//Buscar Hexaware
		element = driver.findElement(By.name("q"));
		element.sendKeys("Hexaware");
		element.sendKeys(Keys.ENTER);
		
		element = driver.findElement(By.partialLinkText("Hexaware - IT, BPO,"));
		element.click();
		
		//driver.quit();
	}
}