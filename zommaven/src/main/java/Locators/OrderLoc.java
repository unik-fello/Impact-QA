package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderLoc 
{
	static WebElement ele;
	public static WebElement add(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Add']"));		
		return ele;
	}
	public static WebElement acc(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Continue']"));		
		return ele;
	}
	public static WebElement cont(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Continue']"));		
		return ele;
	}

	public static WebElement addToOrd(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Add to order']"));		
		return ele;
	}

	public static WebElement edit(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Continue']"));		
		return ele;
	}
	
	public static WebElement conToP(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Confirm and Proceed']"));		
		return ele;
	}

	public static WebElement work(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//span[text()='Confirm and Proceed']"));		
		return ele;
	}
	
	public static WebElement cAdd(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//label[text()='Complete Address *']"));		
		return ele;
	}
	
	public static WebElement home(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//p[text()='Add new address']"));		
		return ele;
	}
	
	public static WebElement saveNP(WebDriver driver)
	{
		ele = driver.findElement(By.xpath("//span[text()='Save and proceed']"));		
		return ele;
	}

	public static WebElement verifyPh(WebDriver driver)
	{
		ele = driver.findElement(By.xpath("//span[text()='Verify your phone']"));
		return ele;
	}
	public static WebElement zomato(WebDriver driver)
	{
		ele = driver.findElement(By.xpath("//img[@alt='Zomato']"));
		return ele;
	}
	
}
