package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Dimension;

public class DriversInit {

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.get("http://localhost:8080/ecomm/");
			Dimension dm = new Dimension(999,1234);
			driver.manage().window().setSize(dm);
			
			String CurUrl = driver.getCurrentUrl();
			System.out.println("Current Url: "+CurUrl);
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
