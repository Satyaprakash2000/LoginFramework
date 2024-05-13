package testcases;

import org.testng.annotations.Test;

import Base.Base;
import DataGenerators.DataGenerator;
import PageObjects.CreateAccountPage;
import PageObjects.LandingPage;

public class RegTest extends Base{
	
	@Test(dataProvider="register", dataProviderClass=DataGenerator.class)
	public void reg(String firstname, String lastname, String email, String password, String passwordconf) throws InterruptedException
	{
		LandingPage landing = new LandingPage(driver);
		landing.CreateAccount().click();
		
		Thread.sleep(3000);
		
		CreateAccountPage account = new CreateAccountPage(driver);
		account.firstname().sendKeys(firstname);
		account.lastname().sendKeys(lastname);
		account.email_address().sendKeys(email);
		account.password_confirmation().sendKeys(password);
		account.password_confirmation().sendKeys(passwordconf);
		account.AccountBtn().click();
		
		
	}
}
