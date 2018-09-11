package ClaseUno;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frames_Windows {
	static WebDriver driver;
	
	public static void main(String [] KrustierDock) {
		String driverPath = "C://Selenium//chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		WebElement element;
		Select select;
		Actions action = new Actions(driver);
		
		
		try {
			driver.navigate().to("http://demoqa.com/frames-and-windows/");;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		element = driver.findElement(By.id("ui-id-2"));
		element.click();
		
		element = driver.findElement(By.xpath("//*[text()=\"Open New Seprate Window\"]"));
		element.click();
		
		switchToWindows();
		
		element = driver.findElement(By.cssSelector(".dt-mobile-menu-icon"));
		element.click();
		
	}
	
	public static void switchToWindows() {
		String currentWindow = driver.getWindowHandle(); //obtiene el identificador de la ventana activa
		Set<String> windows = driver.getWindowHandles(); // obtiene las variables de todas las ventanas
		//windows.remove(currentWindow);		// remueve la ventana activa
		
		for(String x: windows) {
			if(x != currentWindow) {
				driver.switchTo().window(x);
			}
		}
		
	}
	
	
}
