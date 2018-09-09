import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dominos {
	public static void main(String [] KrustierDock) throws InterruptedException {
		WebDriver driver;
		WebElement element;
		Select select;
		
		String driverPath = "C://Selenium//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			
			driver.navigate().to("https://ordena2.dominos.com.mx/location/selectOrderType.php");
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		/*
		 * id 	btnPickUp click
xpath	//*[text()="Aquí quiero recoger mi orden"]	click
xpath 	(//*[contains(@href,"specialtyCatalog.php")])[1] click
xpath 	(//*[text()="›"])[1] 				click
xpath 	//*[@src="/img2.6/flavors/PES.png"]		click
id 	btnAdd2Cart		click
id 	btnCloseUpsellModal	click
class closeTutorialCar		click
id 	linkPayCart		click
		 */
		Thread.sleep(10000);
		
		element = driver.findElement(By.id("btnPickUp"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.id("btnContinue_1"));
		element.click();
		Thread.sleep(10000);
		
		element = driver.findElement(By.xpath("(//*[contains(@href,\"specialtyCatalog.php\")])[1]"));
		element.click();
		Thread.sleep(10000);
		
		element = driver.findElement(By.xpath("(//*[text()=\"›\"])[1]"));
		element.click();
		Thread.sleep(10000);
		
		element = driver.findElement(By.xpath("//*[@src=\"/img2.6/flavors/PES.png\"]"));
		element.click();
		Thread.sleep(10000);
		
		element = driver.findElement(By.id("btnAdd2Cart"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.id("btnCloseUpsellModal"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.className("closeTutorialCar"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.id("linkPayCart"));
		element.click();
		
		
		
		
		
		
		
		
	}
}