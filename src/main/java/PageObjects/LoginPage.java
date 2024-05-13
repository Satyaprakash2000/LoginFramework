package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement email;
	
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="pass")
	public WebElement password;
	
	public WebElement password() {
		return password;
	}
	
	@FindBy(id="send2")
	public WebElement loginbtn;
	
	public WebElement loginbtn() {
		return loginbtn;
	}

}
