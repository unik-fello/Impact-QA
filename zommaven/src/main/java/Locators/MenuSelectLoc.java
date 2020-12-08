package Locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuSelectLoc {
	static WebElement element = null;
	static Actions a = null;

	public static WebElement menuHeader(WebDriver driver) throws Exception {
		a = new Actions(driver);
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='ukj373-1 fmeMBe']/a"));
		Iterator<WebElement> i = l.iterator();
		while (i.hasNext()) {
			element = (WebElement) i.next();
			Thread.sleep(2000);
			a.moveToElement(element).perform();
		}

		return element;

	}

	public static WebElement zomatoDelivery(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Delivery']"));

		return element;

	}

	// div[text()='Dining Out']
	public static WebElement zomatoDining(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Dining Out']"));

		return element;

	}

	public static WebElement zomatoNightlife(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Nightlife']"));

		return element;

	}

	public static WebElement zomatoRating(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Rating: 4.0+']"));

		return element;

	}

	public static WebElement zomatoSafeAndHygine(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Safe and Hygienic']"));

		return element;

	}

	public static WebElement zomatoDeliveryTime(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Delivery Time']"));

		return element;

	}

	public static WebElement zomatoRatingArrow(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Rating']"));

		return element;

	}

	public static WebElement zomatoGreatOffer(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[text()='Great Offers']"));

		return element;

	}

	@SuppressWarnings("rawtypes")
	public static WebElement menuFooterCompany(WebDriver driver) throws Exception {
		a = new Actions(driver);
		List<WebElement> l = driver.findElements(By.xpath("//div[@name='Company']//p"));
		Iterator i = l.iterator();
		while (i.hasNext()) 
		{
			element = (WebElement) i.next();
			Thread.sleep(2000);
			a.moveToElement(element).perform();
		}
		return element;
	}

	public static WebElement zomatoCodeOfConduct(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[text()='Code of Conduct']"));

		return element;

	}

	public static WebElement zomatoHotel(WebDriver driver) {
		element = driver.findElement(By.xpath("//img[@alt='Restaurant Card']"));
		return element;

	}

}
