package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	private WebElement searchbox;
	
	
	public void enterSearchText(String text) {
		searchbox.sendKeys(text);
	}
	
	
	
	
}
