package eql.New_hotelWebApp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestHotelWebApp {
	
private String BROWSER=System.getProperty("browser");
	
	@Test
	
	
	
	public void monPremierTest() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src/main/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
 	
		driver.get("http://192.168.102.190:9999/HotelWebapp/");
		
		WebElement ville = driver.findElement(By.name("ville"));
		
		WebElement bouton_chercher = driver.findElement(By.xpath("//button"));
		
		Select select = new Select(ville);
		
		select.selectByValue("Paris");
		
		bouton_chercher.click();
		
		
		
	}

}
