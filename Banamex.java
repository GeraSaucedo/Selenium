
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Banamex {
	public static void main(String [] KrustierDock) throws InterruptedException {
		WebDriver driver;
		WebElement element;
		Select select;
		JavascriptExecutor js;
		
		//String driverPath = "C://Selenium//chromedriver.exe";
		String driverPath = "C://Selenium//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = ((JavascriptExecutor)driver);
		
		
		try {
			
			driver.navigate().to("https://www.segurosbanamex.com.mx/segurosBanamex/seguro-auto-banamex-contratacion-paso-uno.jsp");
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		// 	ID  vehiculo  	DropD	VALUE=	AUT
		element = driver.findElement(By.id("vehiculo"));
		select = new Select(element);
		select.selectByValue("AUT");
		Thread.sleep(2000);
		
		// 	ID  marca		DropD	VALUE 	PO
		element = driver.findElement(By.id("marca"));
		select = new Select(element);
		select.selectByValue("PO");
		Thread.sleep(2000);
		
		//	ID	modelo		DropD	VALUE= 	2018
		element = driver.findElement(By.id("modelo"));
		select = new Select(element);
		select.selectByValue("2018");
		Thread.sleep(2000);
		
		// 	ID descripcion	DropD	VALUE= 	21
		element = driver.findElement(By.id("descripcion"));
		select = new Select(element);
		select.selectByValue("01");
		Thread.sleep(2000);
		
		//	ID	version		DropD	VALUE= 	0|01
		element = driver.findElement(By.id("version"));
		select = new Select(element);
		select.selectByValue("0|01");
		Thread.sleep(2000);
		
		//	ID	postal		TxtB	25000
		element = driver.findElement(By.id("postal"));
		element.sendKeys("25000");
		Thread.sleep(2000);
		
		// 	ID	numeroCliente	txtb	234234
		element = driver.findElement(By.id("numeroCliente"));
		element.sendKeys("234234");
		Thread.sleep(2000);
		
		//	ID	nombres		txtb	Juan
		element = driver.findElement(By.id("nombres"));
		element.sendKeys("Juan");
		Thread.sleep(2000);
		
		//	ID	apellidoPaterno	txtb	Lopez
		element = driver.findElement(By.id("apellidoPaterno"));
		element.sendKeys("Lopez");
		Thread.sleep(2000);
		
		//	ID	apellidoMaterno	txtb	Perez
		element = driver.findElement(By.id("apellidoMaterno"));
		element.sendKeys("Perez");
		Thread.sleep(2000);
		
		//	ID	correoElectronico	txtb	ok@gmail.com
		element = driver.findElement(By.id("correoElectronico"));
		element.sendKeys("ok@gmail.com");
		Thread.sleep(2000);
		
		//	ID	telefono	txtb	8441231234
		element = driver.findElement(By.id("telefono"));
		element.sendKeys("1232343456");
		Thread.sleep(2000);
		
		//	ID	avisoPrivacidad	click
		element = driver.findElement(By.id("avisoPrivacidad"));
		element.click();
		
		
		
	}
}
