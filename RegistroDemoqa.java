import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistroDemoqa {
	public static void main(String [] KrustierDock) {
		WebDriver driver;
		WebElement element;
		Select select;
		
		String driverPath = "C://Selenium//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			
			driver.navigate().to("http://demoqa.com/registration/");
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		element = driver.findElement(By.id("name_3_firstname"));
		element.sendKeys("Sucio");
		
		element = driver.findElement(By.id("name_3_lastname"));
		element.sendKeys("Dan");
		
		element = driver.findElement(By.xpath("//*[@value=\"single\"]"));
		element.click();
		
		element = driver.findElement(By.xpath("//*[@value=\"reading\"]"));
		element.click();
		
		//Select Country id=> dropdown_7 Mexico
		element = driver.findElement(By.id("dropdown_7"));
		select = new Select(element);
		select.selectByValue("Mexico");
		
		element = driver.findElement(By.id("mm_date_8"));
		select = new Select(element);
		select.selectByValue("12");
		
		element = driver.findElement(By.id("dd_date_8"));
		select = new Select(element);
		select.selectByValue("31");
		
		element = driver.findElement(By.id("yy_date_8"));
		select = new Select(element);
		select.selectByValue("1995");
		
		element = driver.findElement(By.id("phone_9"));
		element.sendKeys("8441234567");
		
		element = driver.findElement(By.id("username"));
		element.sendKeys("SucioDan");
		
		element = driver.findElement(By.id("email_1"));
		element.sendKeys("SucioDan@hotmail.com");
		
		element = driver.findElement(By.id("description"));
		element.sendKeys("This is a description :)");
		
		element = driver.findElement(By.id("password_2"));
		element.sendKeys("Password123");
		
		element = driver.findElement(By.id("confirm_password_password_2"));
		element.sendKeys("Password123");
		
		element = driver.findElement(By.name("pie_submit"));
		element.click();
		
		//element = driver.findElement(By.xpath("//*[text()=\"Thank you for your registration\"]"));
		try {
			element = driver.findElement(By.xpath("//*[@class=\"piereg_message\"]"));
			System.out.println("PRUEBA EXISTOSA");
			System.out.println(element.getText());
		}catch(Exception e){
			element = driver.findElement(By.xpath("//*[@class=\"piereg_login_error\"]"));
			System.out.println("PRUEBA FALLIDA");
			System.out.println(element.getText());
		}
				
		
		
		
		
		
		
		
	}

}