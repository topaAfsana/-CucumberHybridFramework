package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import util.ConfigReader;

public class DriverFactory {

	public static WebDriver driver;
	
	public static WebDriver initializeBrowser() {
		Properties prop = ConfigReader.initializeProperties();
		String browserName= prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.driver.chomre", "src/test/resources/Driver/chromeDriver/chromedriver.exe");
			driver = new ChromeDriver();}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();}
		else if(browserName.equals("safari")) {
			driver = new SafariDriver();}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		initializeBrowser();
		return driver;
	}
}
