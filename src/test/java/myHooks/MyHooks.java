package myHooks;



import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	public WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		driver = DriverFactory.initializeBrowser();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Initialized browser");	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
