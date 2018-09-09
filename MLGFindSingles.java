import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class MLGFindSingles {

	public static void main (String [] Jerry) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jerry\\eclipse-workspace\\Selenium\\Files\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.majorleaguegaming.com/");
	    
		WebElement loginTxtBox = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		WebElement passwordTxtBox = driver.findElement(By.xpath("//*[@id=\"login_password\"]"));
		
		loginTxtBox.sendKeys("");
		passwordTxtBox.sendKeys("");
		passwordTxtBox.submit();
		
		driver.get("http://gamebattles.majorleaguegaming.com/xboxone/gears-of-war-4/team/31423919/edit?v=post_match");	
		driver.get("http://gamebattles.majorleaguegaming.com/account/login?r=http%3A%2F%2Fgamebattles.majorleaguegaming.com%2Fxboxone%2Fgears-of-war-4%2Fteam%2F31423919%2Fedit%3Fv%3Dpost_match");
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		
		Select mapSet = new Select(driver.findElement(By.id("mapset")));
		mapSet.selectByVisibleText("Standard: Execution");
		
		//Select region = new Select(driver.findElement(By.xpath("//*[@id=\"custom-fields\"]/div[4]/select")));
		Select region = new Select(driver.findElement(By.name("fields[53078]")));
		region.selectByVisibleText("North America");
		
		WebElement tuning = driver.findElement(By.id("field_55426_1")); //competitive
		tuning.click(); 
		
		Select mapVariant = new Select(driver.findElement(By.name("fields[53078]")));
		mapVariant.selectByIndex(0); //Forge
		
		//Agree terms and conditions
		//WebElement terms = driver.findElement(By.name("rules"));
		//terms.click();
	         //driver.close();
		
	}
	
	
}
