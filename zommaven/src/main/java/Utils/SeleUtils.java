package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SeleUtils 
{
	static Set<String> windows;  			// Dir2MainP.redir(driver, name);
	public static void redir(WebDriver driver, String fiName) throws InterruptedException
	{
		windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String p = it.next();
		driver.switchTo().window(it.next());
		snap(driver, fiName);
		driver.close();
		windows.clear();	Thread.sleep(5000);
		driver.switchTo().window(p);
	}
	
	public static void hover(WebDriver driver, WebElement element) throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
	}
	
	public static void snap(WebDriver driver, String filename ) throws InterruptedException
	{
		Thread.sleep(4000);
		// move to new destination
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File file1 = ts1.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(file1, new File("D:\\Screenshot\\"+filename+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static JavascriptExecutor js=null;
	public static void scr(WebDriver driver, int num) throws InterruptedException
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+num+")");
		Thread.sleep(3000);
	}
	
	public static void waitt(double num) throws InterruptedException
	{
		Thread.sleep((long) num*1000);
	}
	
}
