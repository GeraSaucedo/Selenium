import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dominos {
	public static void main(String [] KrustierDock) throws InterruptedException {
		WebDriver driver;
		WebElement element;
		Select select;
		
		//String driverPath = "C://Selenium//chromedriver.exe";
		String driverPath = "C:\\Users\\Jerry\\eclipse-workspace\\Selenium\\Files\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			
			driver.navigate().to("https://ordena2.dominos.com.mx/location/selectOrderType.php");
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		//LLEVAR O IR
		Thread.sleep(5000);
		// id 	btnDelivery  -> click
		element = driver.findElement(By.id("btnDelivery"));
		element.click();
		Thread.sleep(5000);
		
		//MAPA
		//id 	btnContinue		click
		element = driver.findElement(By.id("btnContinue"));
		element.click();
		Thread.sleep(5000);
		
		//FORMULARIO
		//id 	streetName		"Calle de la mañana"
		element = driver.findElement(By.id("streetName"));
		element.clear();
		element.sendKeys("Calle de la maniana");
		
		
		//id 	streetNumber	"444"
		element = driver.findElement(By.id("streetNumber"));
		element.clear();
		element.sendKeys("444");
		
		//id 	deliveryInstructions	"Edificio chido"
		element = driver.findElement(By.id("deliveryInstructions"));
		element.sendKeys("Edificio chido");
		
		//ID 	internalNumber	"SN"
		element = driver.findElement(By.id("internalNumber"));
		element.sendKeys("SN");
		
		//id 	postalCode		"25000"
		element = driver.findElement(By.id("postalCode"));
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("25000");
		Thread.sleep(1000);
		
		//id 	neighborhood	"Colonia del work"
		element = driver.findElement(By.id("neighborhood"));
		element.clear();
		Thread.sleep(2000);
		element.sendKeys("colonia del work");
		Thread.sleep(5000);
		
		//id 	city			"Ciudad"
		//element = driver.findElement(By.id("city"));
		//element.sendKeys("Ciudadela");
		
		//id 	municipality	"Municipio"
		//element = driver.findElement(By.id("municipality"));
		//element.sendKeys("Saltillo");
		
		
		//id	state			"Estado"
		//element = driver.findElement(By.id("state"));
		//element.sendKeys("Coahuila");
		//Thread.sleep(4000);
		
		//id	btnContinue		click
		element = driver.findElement(By.id("btnContinue"));
		element.click();
		Thread.sleep(5000);
		
		//MENU 
		//xpaht (//*[contains(@href,"specialtyCatalog.php")])[2] click
		element = driver.findElement(By.xpath("(//*[contains(@href,\"specialtyCatalog.php\")])[2]"));
		element.click();
		Thread.sleep(5000);
		
		//SELECCIONAR ESPECIALIDAD
		//id 	btn_next_0	click
		element = driver.findElement(By.id("btn_next_0"));
		element.click();
		Thread.sleep(5000);
		
		//xpaht (//*[contains(@src,"PES.png")]) click
		element = driver.findElement(By.xpath("//img[contains(@src,\"PES.png\")]"));
		element.click();
		Thread.sleep(5000);
		
		//PERZONALISAR MASA, ORILLA ETC
		//id 	flavorCode	dropdown value=ORILLA
		element = driver.findElement(By.id("flavorCode"));
		select = new Select(element);
		select.selectByValue("ORILLA");
		Thread.sleep(2000);
		
		//id	sizeCode	dropdown visible=Mediana 30 cm
		element = driver.findElement(By.id("sizeCode"));
		select = new Select(element);
		select.selectByVisibleText("Mediana 30 cm");
		Thread.sleep(2000);
		
		//id 	btnAddQty	click
		element = driver.findElement(By.id("btnAddQty"));
		element.click();
		Thread.sleep(2000);
		
		//id 	btnAdd2Cart	click
		element = driver.findElement(By.id("btnAdd2Cart"));
		element.click();
		Thread.sleep(5000);
		
		//POPOUT SI QUIERES AÑADIR A TU ORDEN
		//xpath 	//button[@aria-label="Close"]	click
		element = driver.findElement(By.xpath("//button[@aria-label=\"Close\"]"));
		element.click();
		Thread.sleep(5000);
		
		//CERRAR FLECHA INDICANDO DONDE ESTA CART
		//class 
		element = driver.findElement(By.className("closeTutorialCar"));
		element.click();
		Thread.sleep(4000);
		
		//id 	linkPayCart click
		element = driver.findElement(By.id("linkPayCart"));
		element.click();
		Thread.sleep(4000);
		
		//id 	firstName	"Juan"
		element = driver.findElement(By.id("firstName"));
		element.sendKeys("Juan");
		Thread.sleep(2000);
		
		//id 	lastName	"Lopez"
		element = driver.findElement(By.id("lastName"));
		element.sendKeys("Lopez");
		Thread.sleep(2000);
		
		//id 	phone	"1234567890"
		element = driver.findElement(By.id("phone"));
		element.sendKeys("1234567890123");
		Thread.sleep(2000);
		
		//id 	extension	"123"
		element = driver.findElement(By.id("extension"));
		element.sendKeys("123");
		Thread.sleep(2000);
		
		//id 	email	"ok@gmail.com"
		element = driver.findElement(By.id("email"));
		element.sendKeys("ok@gmail.com");
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)");
		
		//xpath (//span[@class="box"])[1]	click
		element = driver.findElement(By.xpath("(//span[@class=\"box\"])[1]"));
		element.click();
		Thread.sleep(4000);
		
		//xpath (//span[@class="box"])[2]	click
		element = driver.findElement(By.xpath("(//span[@class=\"box\"])[2]"));
		element.click();
		Thread.sleep(4000);
		
		//xpath (//span[@class="box"])[3]	click
		element = driver.findElement(By.xpath("(//span[@class=\"box\"])[3]"));
		element.click();
		Thread.sleep(2000);
		
		//xpath (//span[@class="box"])[5]	click
		element = driver.findElement(By.xpath("(//span[@class=\"box\"])[5]"));
		element.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}
}