package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	

	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/child::a[contains(text(),'Sign In')]")
	public WebElement signin;
	
	public WebElement signin() {
		return signin;
	}
	
	@FindBy(xpath="//li/child::a[contains(text(),'Create an Account')]")
	public WebElement CreateAccount;
	
	public WebElement CreateAccount() {
		return CreateAccount;
	}
	

}
