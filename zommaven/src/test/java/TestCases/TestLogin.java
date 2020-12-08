package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import EnvVariables.Config;
import Pages.*;
import Utils.*;

public class TestLogin extends SeleUtils
{
	public static WebDriver driver;

	
	@BeforeClass
	public void initBrow()
	{
		System.setProperty("webdriver.chrome.driver", Config.chromePath);
		driver = new ChromeDriver();

		// MAXIMIZING THE SCREEN
		driver.manage().window().maximize();

		// LOGIN TO THE SYSTEM
		driver.navigate().to(Config.url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PropertyConfigurator.configure("Log4j.properties");
	}

	@Test(dataProvider = "testData", dataProviderClass = ExcelUtils.class)
	public void main(String email, String item, String app) throws Exception 
	{
		try
		{
			Login.login(driver, email); // Login

			HomePage.container(driver);
					
			HomePage.accPop(driver);
			
			HomePage.getZomatoApp(driver, app);   

			HomePage.belowContainers(driver); // Containers in the Hompage 
			
			HomePage.searchItem(driver, item); // Searching for a particular Food
			Order.doOrder(driver);

			ExcelUtils.excelWrite(Config.excelPath); 			// Writing Results to the ExcelSheet 
			ExcelUtils.setCellData("Sheet1", "Result", 2, "Pass");

			System.out.println("Success!!!");
			
		}
		catch (Exception e) 
		{
			System.err.println("Failure");
			ExcelUtils.excelWrite(Config.excelPath);
			ExcelUtils.setCellData("Sheet1", "Result", 2, "Fail");
		}
	}

	@org.testng.annotations.AfterClass
	public void closeBrow() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
