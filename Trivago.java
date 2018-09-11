package ClaseUno;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trivago {
	public static void main(String [] KrustierDock) throws InterruptedException {
		String drivePath = ("C://Selenium//chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver", drivePath);
		
		WebDriver driver = new ChromeDriver();
		WebElement element;
		Select select;
		Actions action = new Actions(driver);
		
		
		try {
			driver.navigate().to("https://www.trivago.com.mx");;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		
		//XPATH 	//*[@type="search"]		"Vancouver"
		element = driver.findElement(By.xpath("//*[@type=\"search\"]"));
		element.sendKeys("Vancouver");
		
		//class 	horus-btn-search__label		click 	[boton buscar]
		element = driver.findElement(By.className("horus-btn-search__label"));
		element.click();
		Thread.sleep(5000);
		
		//xpath 	//span[contains(text(),"Llegada")]		click		[Boton llegada]
		element = driver.findElement(By.xpath("//span[text()=\"Llegada\"]"));
		//element.click();
		//element.click();
		Thread.sleep(3000);
		
		//cssselect 	tr:nth-child(4) .cal-day-wrap:nth-child(1)		CLICK [dia en el calendaio]
		element = driver.findElement(By.cssSelector("tr:nth-child(4) .cal-day-wrap:nth-child(1)"));
		element.click();
		Thread.sleep(5000);
		
		//xpath 	span[contains(text(),"Salida")]	 	click [Boton salida]
		//element = driver.findElement(By.xpath("span[contains(text(),\"Salida\")]"));
		//element.click();
		//Thread.sleep(1000);
		
		//cssselec 	tr:nth-child(4) .cal-day-wrap:nth-child(7)		click [Dia en el calendario]
		element = driver.findElement(By.cssSelector("tr:nth-child(4) .cal-day-wrap:nth-child(7)"));
		element.click();
		Thread.sleep(5000);
		
		//cssselec 	.btn-horus--roomtype		click				[click en boton que despliega seleccion de tipo de habitacion]
		//element = driver.findElement(By.cssSelector(".btn-horus--roomtype"));
		//element.click();
		//Thread.sleep(5000);
		
		//cssselec 	ul li:nth-child(3)			click  [Click en el tipo de habitacion ]
		element = driver.findElement(By.cssSelector(".df_overlay ul li:nth-child(3)"));
		element.click();
		Thread.sleep(1000);
		
		//id	select-num-adults-1			dropdown value= 2 [Seleccionar numero de adultos]
		element = driver.findElement(By.id("select-num-adults-1"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(2000);
		
		//id	select-num-children-1		dropdown 	value 2 [Seleccionar numero de ninios]
		element = driver.findElement(By.id("select-num-children-1"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(3000);
		
		//id 	select-ages-children-1-34	value=12 [Seleccionar edad de ninios]
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-ages-children-1-\")])[1]"));
		select = new Select(element);
		select.selectByValue("12");
		
		//id	select-ages-children-1-35	value=11  [Seleccionar edad de ninios]
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-ages-children-1-\")])[2]"));
		select = new Select(element);
		select.selectByValue("11");
		Thread.sleep(1000);
		
		//xpath 	//*[contains(text(),"Añadir habitac")]		click     [boton aniadir habitacion]
		element = driver.findElement(By.xpath("//*[contains(text(),\"Añadir habitac\")]"));
		element.click();
		Thread.sleep(1000);
				
		//id 	select-num-adults-33  dropdown value=2			[Seleccionar numero de adultos 2da habitacion]
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-num-adults-\")])[2]"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(1000);
		
		//id 	select-num-children-33	dropdown	value=2 [Seleccionar numero de ninios segunda habitacion]
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-num-children-\")])[2]"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(3000);
		
		//id 	select-ages-children-33-36	value=13	[Seleccionar edad ninio 1 2da habitacion]
		element = driver.findElement(By.xpath("(//*[contains(@id,\"select-ages-children-\")])[3]"));
		select = new Select(element);
		select.selectByValue("13");
		
		//id 	select-ages-children-33-37	value 14	[Seleccionar edad ninio 2 2da habitacion]
		element = driver.findElement(By.xpath("(//*[contains(@id,\"select-ages-children-\")])[4]"));
		select = new Select(element);
		select.selectByValue("14");
		
		//xpath 	//*[text()="Confirmar"]			click  [Boton confirmar habitaciones]
		element = driver.findElement(By.xpath("//*[text()=\"Confirmar\"]"));
		element.click();
		Thread.sleep(1000);
		
		//filtros	
		//estrellas
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(2)"));
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(1000);
		//checkbox estrellas hotel
		element =driver.findElement(By.id("hotel-class5"));
		element.click();
		Thread.sleep(5000);
		
		//mouse hover rating
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(3)"));
		action.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(2000);
		
		element =driver.findElement(By.xpath("(//*[@name=\"guest-rating\"])[1]"));
		element.click();
		Thread.sleep(2000);
		
		//mouse hover atracction
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(4)"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
		
		element = driver.findElement(By.id("attractions"));
		select = new Select(element);
		select.selectByVisibleText("Canada Place");
		Thread.sleep(2000);
		
		
		element = driver.findElement(By.xpath("(//*[@role=\"slider\"])[2]"));
		action.dragAndDropBy(element, -150, 0);
		Thread.sleep(3000);
		
		
		//mas filtros el ultimo
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(5)"));
		action.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(1000);
		
		
		element =driver.findElement(By.xpath("//button[text()=\"Wifi gratis\"]"));
		element.click();
		Thread.sleep(3000);
		
		//Drag and drop slider de precios
		//css .toolbar-list li:nth-child(2,3,4,5) mouseover
		element = driver.findElement(By.xpath("//*[@role=\"slider\"]"));
		action.dragAndDropBy(element, -200, 0).build().perform();
		Thread.sleep(1000);
		
		//id mf-select-sortby dropdown visible=Precio y recomendados
		element = driver.findElement(By.id("mf-select-sortby"));
		select = new Select(element);
		select.selectByVisibleText("Precio y recomendados");
		Thread.sleep(2000);
		
		//Seleccionaroferta			xpath 		(//*[@itemprop="makesOffer"])[1]	click
		element = driver.findElement(By.xpath("(//*[@itemprop=\"makesOffer\"])[1]"));
		element.click();
		
	}
}
