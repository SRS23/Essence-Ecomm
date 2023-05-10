package utilities;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	public static WebDriver driver;
	
	public static WebDriver openBrowser() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			
			driver.get("http://localhost:8080/ecomm/");
			driver.manage().deleteAllCookies();
			
			Dimension dm = new Dimension(678, 912);
			driver.manage().window().setSize(dm);
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String curUrl=DriverInit.driver.getCurrentUrl();
			System.out.println("Current Url is:  "+curUrl);
			driver.manage().window().maximize();
			
			
		}
		return driver;
	}	
	
	public static void closeBrowser() {
		if (driver != null) {
			
			driver.quit();
			driver=null;
		}
	}
}
