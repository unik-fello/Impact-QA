package Pages;

import org.openqa.selenium.WebDriver;

import Locators.OrderLoc;
import Utils.Log4j;
import Utils.SeleUtils;

public class Order extends SeleUtils {
	public static void doOrder(WebDriver driver) throws InterruptedException 
	{
		waitt(2);

		Log4j.log().info("item found");
		Log4j.log().debug("do order");
		
		scr(driver, 700);					waitt(1);
		OrderLoc.add(driver).click();		waitt(2);
		try {
		OrderLoc.add(driver).click();		waitt(2); } catch(Exception e) { waitt(3); }
		
		try {
		OrderLoc.addToOrd(driver).click();	waitt(3);
		} catch(Exception e) {}
		
		try {
		OrderLoc.cont(driver).click();      waitt(3);} catch(Exception e) { waitt(3); }
		
		OrderLoc.zomato(driver).click();    waitt(.8);
		
	}
}
