package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void intializeBrowser() throws IOException
	{
		if(Utility.fetchProperty("browser").toString().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(Utility.fetchProperty("browser").toString().equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if(Utility.fetchProperty("browser").toString().equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if(Utility.fetchProperty("browser").toString().equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get(Utility.fetchProperty("url").toString());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		
	}

}
