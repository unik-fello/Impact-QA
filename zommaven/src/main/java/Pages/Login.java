package Pages;

import org.openqa.selenium.WebDriver;

import Locators.HomeLoc;
import Utils.Log4j;
import Utils.SeleUtils;

public class Login extends SeleUtils
{	
	public static void login(WebDriver driver, String email) throws InterruptedException 
	{
		Log4j.log().debug("start login");
		HomeLoc.loginEle(driver).click();
		HomeLoc.contiEmail(driver).click();
		HomeLoc.enterEmailLoc(driver).sendKeys(email);
		HomeLoc.sendOTPLoc(driver).click();
		waitt(35);
		HomeLoc.getAppLoc(driver).click();
		waitt(5);
		snap(driver, "GetApp");
		driver.navigate().back();		waitt(2);
		HomeLoc.acceptpop(driver).click();
		waitt(2);
	}
}
