package testcases;

import org.testng.annotations.Test;

import Base.Base;
import DataGenerators.DataGenerator;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class LoginTest extends Base{
	
	@Test(dataProvider="Static", dataProviderClass=DataGenerator.class)
	public void login(String email, String password) throws InterruptedException
	{
		LandingPage LP = new LandingPage(driver);
		LP.signin().click();
		
		Thread.sleep(3000);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.email().sendKeys(email);
		loginpage.password().sendKeys(password);
		loginpage.loginbtn().click();		
	}
	
	
}
