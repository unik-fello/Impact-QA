package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeLoc 
{
static WebElement element=null;
	

	public static WebElement orderFoodOnline(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Order Food Online']"));
		
		return element;
		
	}
	public static WebElement goOutForMeal(WebDriver driver)
	{
		
		
		element=driver.findElement(By.xpath("//*[text()='Go out for a meal']"));
		
		return element;
		
	}
	public static WebElement nightwayClub(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Nightlife & Clubs']"));
		
		return element;
		
	}
	
	public static WebElement loginEle(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//*[@class='sc-3o0n99-5 bCkRtP' and text()='Login']"));
		return element;
	}
	public static WebElement contiEmail(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//*[@aria-label='Continue with Email']"));
		return element;
	}
	
	public static WebElement enterEmailLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//div[@aria-hidden='false' and @role='dialog']//input[@class='sc-1yzxt5f-9 bbrwhB']"));
		return element;
	}
	
	public static WebElement sendOTPLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 elxuhW sc-kVrTmx dxgcDk']"));
		return element;
	}
	
	public static WebElement getAppLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//a[@href='/mobile']"));
		return element;
	}
	public static WebElement zomatoPro(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Zomato Pro']"));
		
		return element;
		
	}
	public static WebElement trendingThisWeek(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//p[text()='Christmas Specials']"));
	
		return element;
		
	}
	public static WebElement allDelhiNcr(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("(//span[text()='All collections in Delhi NCR'])[1]"));
	
		return element;
		
	}
	public static WebElement bestOfDelhiNcr(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//*[text()='New Year's Specials']"));
	
		return element;
		
	}
	public static WebElement workFriendlyPlaces(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//p[text()='Trending This Week']"));
	
		return element;
		
	}
	public static WebElement forTheFamily(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//p[text()='Best of Delhi NCR']"));
	
		return element;
		
	}
	
	public static WebElement phone(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='djusq7-3 iszoyV']"));
		return element;
	}

	public static WebElement email(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@class='djusq7-3 iszoyV']"));

		return element;

	}

	public static WebElement emailSend(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@class='sc-1yzxt5f-9 bbrwhB']"));

		return element;

	}

	public static WebElement shareAppLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[text()='Share App Link']"));

		return element;

	}
	public static WebElement downloadApp(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='sc-lppgPi jAebGU']/a[@class='sc-16nfz79-0 blTnzu']/div[@class='sc-16nfz79-1 fStFdQ'] "));

		return element;

	}
	public static WebElement getOnGoogle(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='sc-knvRHU eFRdHx']/a[@class='sc-16nfz79-0 blTnzu']/div[@class='sc-16nfz79-1 eWrJHn']"));

		return element;

	}

	public static WebElement selectLocationLoc(WebDriver Driver){
		element = Driver.findElement(By.xpath("//input[@placeholder='Delhi NCR']"));
		return element;
	}
	
	public static WebElement dropLocationLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//p[@class='sc-1hez2tp-0 sc-eopZyb eTHreG']"));
		return element;
	}
	
	public static WebElement searchRestLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		return element;
	}
	
	public static WebElement searchButtonLoc(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//div[@class='sc-iNhVCk GSAgl']"));
		return element;
	}
	
	public static WebElement acceptpop(WebDriver Driver){
		 element = Driver.findElement(By.xpath("//span[text()='Accept']"));
		return element;
	}
	

	static Actions hover = null;

	public static WebElement connaughtPlace(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Connaught Place')]"));

		return element;
	}

	public static WebElement gurgaon(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Sector 29, Gurgaon')]"));

		return element;
	}

	public static WebElement noida(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Sector 18, Noida')]"));

		return element;
	}

	public static WebElement rajouri(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Rajouri Garden')]"));

		return element;
	}

	public static WebElement saket(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Saket')]"));

		return element;
	}

	public static WebElement cyberCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'DLF Cyber City')]"));

		return element;
	}

	public static WebElement golfcourse(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Golf Course Road')]"));

		return element;
	}

	public static WebElement dlfPhase4(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'DLF Phase 4')]"));

		return element;
	}

	public static WebElement delhiUniversity(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Delhi University-GTB Nagar')]"));

		return element;
	}

	public static WebElement indirapuram(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Indirapuram')]"));

		return element;
	}

	public static WebElement vasantKunj(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Vasant Kunj ')]"));

		return element;
	}

	public static WebElement greaterKailash1(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Greater Kailash 1 (GK1)')]"));

		return element;
	}

	public static WebElement chanakyapuri(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Chanakyapuri')]"));

		return element;
	}

	public static WebElement rohini(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(), 'Rohini')]"));

		return element;
	}

	public static WebElement janpath(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Janpath')]"));

		return element;
	}

	public static WebElement hauzkhas(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Hauz Khas Village')]"));

		return element;
	}

	public static WebElement sector38(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Sector 38, Noida')]"));

		return element;
	}

	public static WebElement janakpuri(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(), 'Janakpuri ')]"));

		return element;
	}

	public static WebElement sector50(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Sector 50, Gurgaon')]"));

		return element;
	}

	public static WebElement mgRoad(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'MG Road, Gurgaon')]"));

		return element;
	}

	public static WebElement dlfPhase3(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'DLF Phase 3')]"));

		return element;
	}

	public static WebElement punjabiBagh(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Punjabi Bagh')]"));

		return element;
	}

	public static WebElement netajiSubhash(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Netaji Subhash Place')]"));

		return element;
	}

	public static WebElement malviyaNagar(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Malviya Nagar')]"));

		return element;
	}

	public static WebElement khanMarket(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Khan Market')]"));

		return element;
	}

	public static WebElement karolBagh(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Karol Bagh')]"));

		return element;
	}

	public static WebElement nehruPlace(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Nehru Place ')]"));

		return element;
	}

	public static WebElement sohnaRoad(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Sohna Road')]"));

		return element;
	}

	public static WebElement greaterKailash2(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Greater Kailash 2 (GK2)')]"));

		return element;
	}

	public static WebElement pitampura(WebDriver driver) {
		element = driver.findElement(By.xpath("//h5[contains(text(),'Pitampura')]"));

		return element;
	}
	

	public static List<WebElement> popCousinL(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Popular cuisines near me']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin2L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Popular restaurant types near me']/../div//a"));

		return ele;
	}
	public static List<WebElement> popCousin3L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Top Restaurant Chains']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin4L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Cities We Deliver To']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin5L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//div[@name='Company']/../div//a"));

		return ele;
	}
	
	public static WebElement pop1(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bakery food near me']"));
		return Element;
	}
	
	public static WebElement pop2(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bakeries near me']"));
		return Element;
	}
	
	public static WebElement pop3(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bikanervala']"));
		return Element;
	}
	
	public static WebElement pop4(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Delhi NCR']"));
		return Element;
	}
	
	public static WebElement pop5(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//p[text()='Careers']"));
		return Element;
	}



}
