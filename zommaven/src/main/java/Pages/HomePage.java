package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Locators.HomeLoc;
import Locators.MenuSelectLoc;
import Utils.Log4j;
import Utils.SeleUtils;

public class HomePage extends SeleUtils 
{
	public static void login(WebDriver driver, String email) throws InterruptedException 
	{
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
	
	public static void belowContainers(WebDriver driver) throws InterruptedException
	{

		Log4j.log().debug("search item");
		popCos1(driver);
		popCos2(driver);
		popCos3(driver);
		popCos4(driver);
		popCos5(driver);		
	}
	
	public static void searchItem(WebDriver driver, String item) throws Exception {
		waitt(3);
		HomeLoc.selectLocationLoc(driver).click();
		HomeLoc.searchRestLoc(driver).sendKeys(item);
		HomeLoc.searchRestLoc(driver).click();
		waitt(3); 
		HomeLoc.searchButtonLoc(driver).click();
		menu(driver);
	}

	public static void getZomatoApp(WebDriver driver, String em) throws Exception {

		Log4j.log().info("getzomatoapp done");
		scr(driver, 500);
		HomeLoc.phone(driver).click();
		waitt(2);
		HomeLoc.email(driver).click();
		waitt(2);
		HomeLoc.emailSend(driver).sendKeys(em);
		waitt(2);
		HomeLoc.shareAppLink(driver).click();
		waitt(2);
	}

	public static void accPop(WebDriver driver) throws InterruptedException 
	{

		Log4j.log().debug("start get zomato");
		waitt(2);
		HomeLoc.connaughtPlace(driver).click();
		waitt(0.3);
		snap(driver, "Connaught");
		waitt(0.3);
		driver.navigate().back();
		waitt(0.3);

		hover(driver, HomeLoc.gurgaon(driver));
		waitt(0.3);
		hover(driver, HomeLoc.noida(driver));
		waitt(0.3);
		hover(driver, HomeLoc.rajouri(driver));
		waitt(0.3);
		hover(driver, HomeLoc.saket(driver));
		waitt(0.3);
		hover(driver, HomeLoc.cyberCity(driver));
		waitt(0.3);
		hover(driver, HomeLoc.golfcourse(driver));
		waitt(0.3);
		hover(driver, HomeLoc.dlfPhase4(driver));
		waitt(0.3);
		hover(driver, HomeLoc.delhiUniversity(driver));
		waitt(0.3);
		hover(driver, HomeLoc.indirapuram(driver));
		waitt(0.3);
		hover(driver, HomeLoc.vasantKunj(driver));
		waitt(0.3);
		hover(driver, HomeLoc.greaterKailash1(driver));
		waitt(0.3);
		hover(driver, HomeLoc.chanakyapuri(driver));
		waitt(0.3);
		hover(driver, HomeLoc.rohini(driver));
		waitt(0.3);
		hover(driver, HomeLoc.janpath(driver));
		waitt(0.3);

		scr(driver, 200);
		hover(driver, HomeLoc.hauzkhas(driver));
		waitt(0.3);
		hover(driver, HomeLoc.sector38(driver));
		waitt(0.3);
		hover(driver, HomeLoc.janakpuri(driver));
		waitt(0.3);
		hover(driver, HomeLoc.sector50(driver));
		waitt(0.3);
		hover(driver, HomeLoc.mgRoad(driver));
		waitt(0.3);
		hover(driver, HomeLoc.dlfPhase3(driver));
		waitt(0.3);
		hover(driver, HomeLoc.punjabiBagh(driver));
		waitt(0.3);
		hover(driver, HomeLoc.netajiSubhash(driver));
		waitt(0.3);
		hover(driver, HomeLoc.malviyaNagar(driver));
		waitt(0.3);

		scr(driver, 300);
		hover(driver, HomeLoc.khanMarket(driver));
		waitt(0.3);
		hover(driver, HomeLoc.karolBagh(driver));
		waitt(0.3);
		hover(driver, HomeLoc.nehruPlace(driver));
		waitt(0.3);
		hover(driver, HomeLoc.sohnaRoad(driver));
		waitt(0.3);
		hover(driver, HomeLoc.greaterKailash2(driver));
		waitt(0.3);
		hover(driver, HomeLoc.pitampura(driver));scr(driver, -2200);waitt(2);
	}

	public static void container(WebDriver driver) throws Exception 
	{

		Log4j.log().info("login done");
		waitt(1.5);
		scr(driver, 300);
		waitt(2);

		hover(driver, HomeLoc.orderFoodOnline(driver));
		waitt(2);
		HomeLoc.orderFoodOnline(driver).click();
		waitt(2);

		driver.navigate().back();
		waitt(2);

		hover(driver, HomeLoc.goOutForMeal(driver));
		waitt(2);
		hover(driver, HomeLoc.nightwayClub(driver));
		waitt(2);
		hover(driver, HomeLoc.zomatoPro(driver));

		waitt(2);
		scr(driver, 500);
		waitt(1.5);

		HomeLoc.allDelhiNcr(driver).click();
		waitt(2);
		driver.navigate().back();
		HomeLoc.trendingThisWeek(driver).click();
		waitt(2);
		driver.navigate().back();
		HomeLoc.bestOfDelhiNcr(driver).click();
		waitt(2);
		driver.navigate().back();
		HomeLoc.workFriendlyPlaces(driver).click();
		waitt(4); 
		driver.navigate().back();    waitt(3);
		HomeLoc.forTheFamily(driver).click();
		waitt(4);
		driver.navigate().back();
		scr(driver, 200);
	}

	public static void popCos1(WebDriver driver) throws InterruptedException {

		scr(driver, 3000);

		HomeLoc.pop1(driver).click();
		redir(driver, "hgh");

		List<WebElement> ele = HomeLoc.popCousinL(driver);

		Iterator<WebElement> it = ele.iterator();

		while (it.hasNext()) {
			waitt(.3);
			hover(driver, it.next());

		}
		scr(driver, -3000);
	}

	public static void popCos2(WebDriver driver) throws InterruptedException {

		scr(driver, 3000);
		HomeLoc.pop2(driver).click();
		redir(driver, "hghgk");

		List<WebElement> ele = HomeLoc.popCousin2L(driver);

		Iterator<WebElement> it = ele.iterator();

		while (it.hasNext()) {
			waitt(0.3);
			hover(driver, it.next());

		}

		scr(driver, -3000);
	}

	public static void popCos3(WebDriver driver) throws InterruptedException {

		scr(driver, 3300);
		HomeLoc.pop3(driver).click();
		redir(driver, "hghhhg");

		List<WebElement> ele = HomeLoc.popCousin3L(driver);

		Iterator<WebElement> it = ele.iterator();

		while (it.hasNext()) {
			waitt(0.3);
			hover(driver, it.next());

		}
		scr(driver, -3300);
	}

	public static void popCos4(WebDriver driver) throws InterruptedException {

		scr(driver, 4000);
		HomeLoc.pop4(driver).click();
		redir(driver, "hghgvhv");

		List<WebElement> ele = HomeLoc.popCousin4L(driver);

		Iterator<WebElement> it = ele.iterator();

		while (it.hasNext()) {
			waitt(0.3);
			hover(driver, it.next());

		}
		scr(driver, -4000);
	}

	public static void popCos5(WebDriver driver) throws InterruptedException {

		scr(driver, 5000);
		HomeLoc.pop5(driver).click();

		List<WebElement> ele = HomeLoc.popCousin5L(driver);

		Iterator<WebElement> it = ele.iterator();
		int i = 0;
		while (it.hasNext()) {

			waitt(.3);
			hover(driver, it.next());

			if (i == 16)
				break;

			i++;

		}
		scr(driver, -5000);
	}

	public static void menu(WebDriver driver) throws Exception {
		MenuSelectLoc.menuHeader(driver);
		waitt(0.2);
		MenuSelectLoc.zomatoDining(driver).click();
		waitt(0.2);
		snap(driver, "dining out");
		waitt(0.1);
		MenuSelectLoc.zomatoNightlife(driver).click();
		waitt(0.2);
		snap(driver, "Night life");
		waitt(0.1);
		MenuSelectLoc.zomatoDelivery(driver).click();
		waitt(0.2);
		snap(driver, "Delivery");
		waitt(0.1);
		MenuSelectLoc.zomatoRating(driver).click();
		waitt(0.2);
		scr(driver, 200);
		waitt(0.1);
		snap(driver, "Rating");
		waitt(0.1);
		MenuSelectLoc.zomatoSafeAndHygine(driver).click();
		waitt(0.2);
		scr(driver, 200);
		waitt(0.1);
		snap(driver, "safe and hygiene");
		scr(driver, 200);
		MenuSelectLoc.zomatoHotel(driver).click();
		waitt(0.2);
		snap(driver, "zomatohotel");
		waitt(0.1);

	}

}
