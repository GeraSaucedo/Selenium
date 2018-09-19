package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UltimateQA {
	public static void main(String [] KrustierDock) throws InterruptedException
	{
		String driverPath = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//Declare variables
		WebDriver driver;
		WebElement element;
		String [] defaultOptions;
		ChromeOptions options;
		Actions action;
		JavascriptExecutor js;
		
		//Set variables
		defaultOptions = new String[] {"--start-maximized","incognito", "disable-extensions","--disable-notifications"};
		options = new ChromeOptions();
		driver = new ChromeDriver();
		action = new Actions(driver);
		js =  ((JavascriptExecutor)driver);
		
		//set ChromeOptions
		options.addArguments(defaultOptions);
		driver.manage().window().maximize(); //Maximize the browser
		
		
		//Start navigate
		try {
			driver.navigate().to("https://www.ultimateqa.com/automation/");
		}catch(Exception e) { 
			System.out.println("Driver could not open the page \n INFO: \n" + e.getMessage()); 
			driver.quit();
		}
		
		//Big page with many elements
		element = driver.findElement(By.xpath("//a[contains(@href,\"complicated-page\")]"));
		element.click();
		
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1800);
		
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[2]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1800);
			
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[5]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1800);
		
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[8]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1800);
				
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[9]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1800);	
		
		//click button 10
		//mouse hover button 1
		element = driver.findElement(By.xpath("(//*[contains(@class,\"et_pb_button \")])[10]"));
		element.click();
		Thread.sleep(2000);	
		
		//scroll Down
		js.executeScript("window.scrollBy(0,500)");
		
		//click facebook button
		element = driver.findElement(By.xpath("(//a[@title=\"Facebook\"])[1]"));
		element.click();
		Thread.sleep(5000);
		
		//regresar pagina anterior
		//driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//scroll Down
		js.executeScript("window.scrollBy(0,500)");
		
		
		//1er formulario Name
		element = driver.findElement(By.id("et_pb_contact_name_1"));
		element.sendKeys("Krustier Dock");
		
		//1er formulario email
		element = driver.findElement(By.id("et_pb_contact_email_1"));
		element.sendKeys("ok@fakemail.com");
		
		//1er formulario message
		element = driver.findElement(By.id("et_pb_contact_message_1"));
		element.sendKeys("This is a test message");
		
		//capcha label
		element = driver.findElement(By.xpath("(//*[@class=\"et_pb_contact_captcha_question\"])[1]"));
		String captchaText = element.getText().replaceAll("\\s+",""); 
		String[] parts = captchaText.split("\\+");
		
		int captchaValue = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
				
		//captcha txtbox
		element = driver.findElement(By.name("et_pb_contact_captcha_0"));
		element.sendKeys(String.valueOf(captchaValue));
		
		//1st form submit button
		//element = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
		//element.click();
	
		
		
		Thread.sleep(20000);
		driver.quit();
				
		
	}
}
