package ClaseUno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertTest {
	public static void main(String [] KrustierDock) {
		String drivePath = ("C://Selenium//chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver", drivePath);
	
		WebDriver driver = new ChromeDriver();
		WebElement element;
		Select select;
		Actions action = new Actions(driver);
	
	
		try {
			driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		element = driver.findElement(By.xpath("//button[text()=\"Try it\"]"));
		element.click();
		
		//driver.switchTo().defaultContent();
		
		/*Hay 3 tipos de alertas
		 * - la que tiene un ok solamente  [informacion]
		 * - la de aceptar y cancelar   [confirmm]
		 * - la que puedes escribir [como en htaccess]
		 * ALERTIFY JS
			*/
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		//driver.navigate().back();
		//driver.navigate().refresh();
		//driver.navigate().forward();
		//driver.getCurrentUrl();
		//driver.getTitle();
		//driver.getPageSource();
		
		//METODOS DE ELEMENT
		//element.clear();
		//element.getCssValue("border");
		//element.getAttribute("name");
		//element.getLocation();
		//element.getText();
		//element.getSize();
		//element.getTagName();
		
		//element.isDisplayed();
		//element.isEnabled();
		//element.isSelected();
		
		
		
		
		
		
	}
}
