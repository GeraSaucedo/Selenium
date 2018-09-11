import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trivago {
	public static void main(String [] KrustierDock) throws InterruptedException {
		String drivePath = ("C:\\Users\\Jerry\\eclipse-workspace\\Selenium\\Files\\chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver", drivePath);
		
		WebDriver driver = new ChromeDriver();
		WebElement element;
		Select select;
		
		try {
			driver.navigate().to("https://www.trivago.com");;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//XPATH 	//*[@type="search"]		"Vancouver"
		element = driver.findElement(By.xpath("//*[@type=\"search\"]"));
		element.sendKeys("Vancouver");
		
		//class 	horus-btn-search__label		click
		element = driver.findElement(By.className("horus-btn-search__label"));
		element.click();
		Thread.sleep(5000);
		
		//xpath 	//span[contains(text(),"Llegada")]		click
		element = driver.findElement(By.xpath("//span[text()=\"Llegada\"]"));
		element.click();
		element.click();
		Thread.sleep(3000);
		
		//cssselect 	tr:nth-child(4) .cal-day-wrap:nth-child(1)		CLICK
		element = driver.findElement(By.cssSelector("tr:nth-child(4) .cal-day-wrap:nth-child(1)"));
		//if(element.isDisplayed()) System.out.println("EL ELEMENTO SI SE MOSTRO");
		//else System.out.println("EL ELEMENTO NUNCA SE MOSTRO");
		element.click();
		Thread.sleep(5000);
		
		//xpath 	span[contains(text(),"Salida")]	 	click
		//element = driver.findElement(By.xpath("span[contains(text(),\"Salida\")]"));
		//element.click();
		//Thread.sleep(1000);
		
		//cssselec 	tr:nth-child(4) .cal-day-wrap:nth-child(7)		click
		element = driver.findElement(By.cssSelector("tr:nth-child(4) .cal-day-wrap:nth-child(7)"));
		element.click();
		Thread.sleep(5000);
		
		//cssselec 	.btn-horus--roomtype		click
		//element = driver.findElement(By.cssSelector(".btn-horus--roomtype"));
		//element.click();
		//Thread.sleep(5000);
		
		//cssselec 	ul li:nth-child(3)			click
		element = driver.findElement(By.cssSelector(".df_overlay ul li:nth-child(3)"));
		element.click();
		Thread.sleep(1000);
		
		//id	select-num-adults-1			dropdown value= 2
		element = driver.findElement(By.id("select-num-adults-1"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(2000);
		
		//id	select-num-children-1		dropdown 	value 2
		element = driver.findElement(By.id("select-num-children-1"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(3000);
		
		//id 	select-ages-children-1-34	value=12
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-ages-children-1-\")])[1]"));
		select = new Select(element);
		select.selectByValue("12");
		
		//id	select-ages-children-1-35	value=11
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-ages-children-1-\")])[2]"));
		select = new Select(element);
		select.selectByValue("11");
		Thread.sleep(1000);
		
		//xpath 	//*[contains(text(),"Añadir habitac")]		click 
		element = driver.findElement(By.xpath("//*[contains(text(),\"Añadir habitac\")]"));
		element.click();
		Thread.sleep(1000);
				
		//id 	select-num-adults-33  dropdown value=2
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-num-adults-\")])[2]"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(1000);
		
		//id 	select-num-children-33	dropdown	value=2
		element = driver.findElement(By.xpath("(//select[contains(@id,\"select-num-children-\")])[2]"));
		select = new Select(element);
		select.selectByValue("2");
		Thread.sleep(3000);
		
		//id 	select-ages-children-33-36	value=13
		element = driver.findElement(By.xpath("(//*[contains(@id,\"select-ages-children-\")])[3]"));
		select = new Select(element);
		select.selectByValue("13");
		
		//id 	select-ages-children-33-37	value 14
		element = driver.findElement(By.xpath("(//*[contains(@id,\"select-ages-children-\")])[4]"));
		select = new Select(element);
		select.selectByValue("14");
		
		//xpath 	//*[text()="Confirmar"]			click
		element = driver.findElement(By.xpath("//*[text()=\"Confirmar\"]"));
		element.click();
		
		//FILTROS
		
		//css .toolbar-list li:nth-child(2,3,4,5) mouseover
		element = driver.findElement(By.xpath("//*[@role=\"slider\"]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, -400, 0);
		Thread.sleep(1000);
		
		
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(2)"));
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(1000);
		
		element =driver.findElement(By.id("hotel-class5"));
		element.click();
		Thread.sleep(5000);
		
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(3)"));
		action.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(2000);
		
		element =driver.findElement(By.xpath("(//*[@name=\"guest-rating\"])[1]"));
		element.click();
		Thread.sleep(2000);
		
		//element = driver.findElement(By.cssSelector(".toolbar-list li:nth-child(4)"));
		//action.moveToElement(element).build().perform();
		//Thread.sleep(1000);
		
		//
		
		element = driver.findElement(By.cssSelector(".toolbar-list__item:nth-child(5)"));
		action.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(1000);
		
		
		element =driver.findElement(By.xpath("//button[text()=\"Wifi gratis\"]"));
		element.click();
		Thread.sleep(1000);
		
		
		
		
	}
}
