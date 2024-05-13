package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	public WebDriver driver;
	public CreateAccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	public WebElement firstname;
	
	public WebElement firstname() {
		return firstname;
	}
	
	@FindBy(id="lastname")
	public WebElement lastname;
	
	public WebElement lastname() {
		return firstname;
	}
	
	@FindBy(id="email_address")
	public WebElement email_address;
	
	public WebElement email_address() {
		return email_address;
	}
	
	@FindBy(id="password")
	public WebElement password;
	
	public WebElement password() {
		return password;
	}
	
	@FindBy(id="password-confirmation")
	public WebElement password_confirmation;
	
	public WebElement password_confirmation() {
		return password_confirmation;
	}
	
	@FindBy(xpath="//button[@title=\"Create an Account\"]")
	public WebElement AccountBtn;
	
	public WebElement AccountBtn() {
		return AccountBtn;
	}
	

}
