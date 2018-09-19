package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQA {
	public static void main(String [] KrustierDock)
	{
		String driverPath = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		WebElement element;
		
		
		driver.manage().window().maximize(); //Maximize the browser
		
		try {
			driver.navigate().to("https://www.ultimateqa.com/automation/");
		}catch(Exception e) { 
			System.out.println("NO SE PUDO ABRIR EL URL! \n INFO: \n" + e.getMessage()); 
			driver.quit();
		}
		
		//Big page with many elements
		element = driver.findElement(By.xpath("//a[contains(@href,\"complicated-page\")]"));
		element.click();
		
		
		
	}
}
